package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.StackBarChartView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.StaticLayoutEx;

public abstract class SelfStoriesPreviewView extends View {
    public boolean checkScroll;
    public int childPadding;
    public final GestureDetector gestureDetector;
    public final GradientDrawable gradientDrawable;
    public final ArrayList imageReceiversTmp;
    public int imagesFromH;
    public int imagesFromW;
    public int imagesFromY;
    public boolean isAttachedToWindow;
    public int lastClosestPosition;
    public final ArrayList lastDrawnImageReceivers;
    public float maxScroll;
    public float minScroll;
    public float progressToOpen;
    public ValueAnimator scrollAnimator;
    public int scrollToPositionInLayout;
    public float scrollX;
    public final Scroller scroller;
    public final ArrayList storyItems;
    public float textWidth;
    public float topPadding;
    public int viewH;
    public int viewW;

    public final class ImageHolder {
        public StaticLayout layout;
        public final TextPaint paint;
        public int position;
        public final ImageReceiver receiver;
        public SelfStoryViewsView.StoryItemInternal storyItem;

        public ImageHolder() {
            ImageReceiver imageReceiver = new ImageReceiver(SelfStoriesPreviewView.this);
            this.receiver = imageReceiver;
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        }

        public final void onBind(int i) {
            if (i >= 0) {
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                ArrayList arrayList = selfStoriesPreviewView.storyItems;
                if (i >= arrayList.size()) {
                    return;
                }
                this.storyItem = (SelfStoryViewsView.StoryItemInternal) arrayList.get(i);
                boolean z = selfStoriesPreviewView.isAttachedToWindow;
                ImageReceiver imageReceiver = this.receiver;
                if (z) {
                    imageReceiver.onAttachedToWindow();
                }
                SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
                TL_stories.StoryItem storyItem = storyItemInternal.storyItem;
                if (storyItem != null) {
                    StoriesUtilities.setImage(imageReceiver, storyItem);
                } else {
                    StoriesController.UploadingStory uploadingStory = storyItemInternal.uploadingStory;
                    GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
                    if (uploadingStory.entry.isVideo) {
                        imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.firstFramePath), "320_180", null, null, null, 0L, null, null, 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.path), "320_180", null, null, null, 0L, null, null, 0);
                    }
                }
                updateLayout();
            }
        }

        public final void updateLayout() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.StoryItem storyItem = this.storyItem.storyItem;
            SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
            if (storyItem != null) {
                SelfStoriesPreviewView.access$200(spannableStringBuilder, storyItem.views, false);
            }
            if (spannableStringBuilder.length() == 0) {
                this.layout = null;
                return;
            }
            TextPaint textPaint = this.paint;
            int i = (int) (selfStoriesPreviewView.textWidth + 1.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, i, alignment, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 1);
            this.layout = staticLayoutCreateStaticLayout;
            if (staticLayoutCreateStaticLayout.getLineCount() > 1) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
                SelfStoriesPreviewView.access$200(spannableStringBuilder2, this.storyItem.storyItem.views, true);
                this.layout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, textPaint, (int) (selfStoriesPreviewView.textWidth + 1.0f), alignment, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 2);
            }
        }
    }

    public SelfStoriesPreviewView(Context context) {
        super(context);
        this.scrollToPositionInLayout = -1;
        this.storyItems = new ArrayList();
        this.imageReceiversTmp = new ArrayList();
        this.lastDrawnImageReceivers = new ArrayList();
        this.gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() {
            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                selfStoriesPreviewView.scroller.abortAnimation();
                ValueAnimator valueAnimator = selfStoriesPreviewView.scrollAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    selfStoriesPreviewView.scrollAnimator.cancel();
                    selfStoriesPreviewView.scrollAnimator = null;
                }
                selfStoriesPreviewView.checkScroll = false;
                ((SelfStoryViewsView.AnonymousClass1) selfStoriesPreviewView).this$0.listenPager = false;
                return true;
            }

            @Override
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                selfStoriesPreviewView.scroller.fling((int) selfStoriesPreviewView.scrollX, 0, (int) (-f), 0, (int) selfStoriesPreviewView.minScroll, (int) selfStoriesPreviewView.maxScroll, 0, 0);
                selfStoriesPreviewView.invalidate();
                return false;
            }

            @Override
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                float f3 = selfStoriesPreviewView.scrollX + f;
                selfStoriesPreviewView.scrollX = f3;
                float f4 = selfStoriesPreviewView.minScroll;
                if (f3 < f4) {
                    selfStoriesPreviewView.scrollX = f4;
                }
                float f5 = selfStoriesPreviewView.scrollX;
                float f6 = selfStoriesPreviewView.maxScroll;
                if (f5 > f6) {
                    selfStoriesPreviewView.scrollX = f6;
                }
                selfStoriesPreviewView.invalidate();
                return false;
            }

            @Override
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                int i = 0;
                while (true) {
                    SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                    if (i >= selfStoriesPreviewView.lastDrawnImageReceivers.size()) {
                        return false;
                    }
                    ImageHolder imageHolder = (ImageHolder) selfStoriesPreviewView.lastDrawnImageReceivers.get(i);
                    if (((ImageHolder) selfStoriesPreviewView.lastDrawnImageReceivers.get(i)).receiver.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i2 = selfStoriesPreviewView.lastClosestPosition;
                        int i3 = imageHolder.position;
                        if (i2 != i3) {
                            selfStoriesPreviewView.scrollToPosition(i3, true, false);
                        } else {
                            ((SelfStoryViewsView.AnonymousClass1) selfStoriesPreviewView).val$storyViewer.cancelSwipeToViews(false);
                        }
                    }
                    i++;
                }
            }
        });
        this.scroller = new Scroller(context, new OvershootInterpolator());
        this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 160)});
    }

    public static void access$200(SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z) {
        int i = storyViews == null ? 0 : storyViews.views_count;
        if (i > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_views), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_like_filled), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
        }
    }

    public ImageHolder getCenteredImageReciever() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.lastDrawnImageReceivers;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((ImageHolder) arrayList.get(i)).position == this.lastClosestPosition) {
                return (ImageHolder) arrayList.get(i);
            }
            i++;
        }
    }

    public int getClosestPosition() {
        return this.lastClosestPosition;
    }

    public float getFinalHeight() {
        return AndroidUtilities.dp(180.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
    }

    public abstract void onClosestPositionChanged(int i);

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.isAttachedToWindow = false;
        while (true) {
            ArrayList arrayList = this.lastDrawnImageReceivers;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((ImageHolder) arrayList.get(i)).receiver.onDetachedFromWindow();
                i++;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float fAbs;
        float f2;
        ImageHolder imageHolder;
        float f3;
        int i2;
        super.onDraw(canvas);
        Scroller scroller = this.scroller;
        if (scroller.computeScrollOffset()) {
            this.scrollX = scroller.getCurrX();
            invalidate();
            this.checkScroll = true;
        } else if (this.checkScroll && (i = this.lastClosestPosition) >= 0) {
            scrollToPosition(i, true, true);
        }
        float f4 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        ArrayList arrayList = this.imageReceiversTmp;
        arrayList.clear();
        ArrayList arrayList2 = this.lastDrawnImageReceivers;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i3 = -1;
        float f5 = 2.1474836E9f;
        int i4 = 0;
        int i5 = -1;
        while (i4 < this.storyItems.size()) {
            float f6 = -this.scrollX;
            int i6 = this.viewW;
            float f7 = f6 + ((this.childPadding + i6) * i4);
            float f8 = ((i6 / f4) + f7) - measuredWidth;
            float fAbs2 = Math.abs(f8);
            if (fAbs2 < this.viewW) {
                f = 0.0f;
                fAbs = 1.0f - (Math.abs(f8) / this.viewW);
                f2 = (0.2f * fAbs) + 1.0f;
            } else {
                f = 0.0f;
                fAbs = 0.0f;
                f2 = 1.0f;
            }
            if (i5 == i3 || fAbs2 < f5) {
                i5 = i4;
                f5 = fAbs2;
            }
            float fM = f8 < f ? BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fAbs, this.viewW * 0.1f, f7) : DiffUtil.m(1.0f, fAbs, this.viewW * 0.1f, f7);
            if (fM > getMeasuredWidth() || this.viewW + fM < f) {
                measuredWidth = measuredWidth;
                f5 = f5;
                i5 = i5;
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        imageHolder = new ImageHolder();
                        imageHolder.onBind(i4);
                        imageHolder.position = i4;
                        break;
                    } else {
                        if (((ImageHolder) arrayList.get(i7)).position == i4) {
                            imageHolder = (ImageHolder) arrayList.remove(i7);
                            break;
                        }
                        i7++;
                    }
                }
                float f9 = this.viewW;
                float f10 = f9 * f2;
                float f11 = this.viewH;
                float f12 = f2 * f11;
                float fM2 = ImageReceiver$$ExternalSyntheticOutline1.m(f10, f9, f4, fM);
                float fM3 = ImageReceiver$$ExternalSyntheticOutline1.m(f12, f11, f4, this.topPadding);
                if (this.progressToOpen == f || i4 == (i2 = this.lastClosestPosition)) {
                    f3 = 2.0f;
                    imageHolder.receiver.setImageCoords(fM2, fM3, f10, f12);
                } else {
                    f3 = 2.0f;
                    imageHolder.receiver.setImageCoords(AndroidUtilities.lerp((i4 - i2) * getMeasuredWidth(), fM2, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromY, fM3, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromW, f10, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromH, f12, this.progressToOpen));
                }
                if (this.progressToOpen == 1.0f || i4 != this.lastClosestPosition) {
                    imageHolder.receiver.draw(canvas);
                    if (imageHolder.layout != null) {
                        GradientDrawable gradientDrawable = this.gradientDrawable;
                        int i8 = (int) (((fAbs * 0.3f) + 0.7f) * 255.0f);
                        gradientDrawable.setAlpha(i8);
                        ImageReceiver imageReceiver = imageHolder.receiver;
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.textWidth / f3), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - imageHolder.layout.getHeight());
                        imageHolder.paint.setAlpha(i8);
                        imageHolder.layout.draw(canvas);
                        canvas.restore();
                    }
                }
                arrayList2.add(imageHolder);
            }
            i4++;
            measuredWidth = measuredWidth;
            f5 = f5;
            i5 = i5;
            f4 = 2.0f;
            i3 = -1;
        }
        if (this.scrollAnimator == null && this.lastClosestPosition != i5) {
            this.lastClosestPosition = i5;
            onClosestPositionChanged(i5);
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((ImageHolder) arrayList.get(i9)).receiver.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.childPadding = AndroidUtilities.dp(8.0f);
        int iDp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.viewH = iDp;
        int i3 = (int) ((iDp / 16.0f) * 9.0f);
        this.viewW = i3;
        float fDp = i3 - AndroidUtilities.dp(8.0f);
        this.topPadding = ((AndroidUtilities.dp(180.0f) - this.viewH) / 2.0f) + AndroidUtilities.dp(20.0f);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.viewW;
        this.minScroll = (-(measuredWidth - i4)) / 2.0f;
        this.maxScroll = ((getMeasuredWidth() - this.viewW) / 2.0f) + (((this.storyItems.size() * (i4 + this.childPadding)) - this.childPadding) - getMeasuredWidth());
        int i5 = 0;
        if (this.scrollToPositionInLayout >= 0 && getMeasuredWidth() > 0) {
            this.lastClosestPosition = -1;
            scrollToPosition(this.scrollToPositionInLayout, false, false);
            this.scrollToPositionInLayout = -1;
        }
        if (this.textWidth == fDp) {
            return;
        }
        this.textWidth = fDp;
        while (true) {
            ArrayList arrayList = this.lastDrawnImageReceivers;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((ImageHolder) arrayList.get(i5)).onBind(((ImageHolder) arrayList.get(i5)).position);
            i5++;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        this.gestureDetector.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.scroller.isFinished() && (i = this.lastClosestPosition) >= 0) {
            scrollToPosition(i, true, true);
        }
        return true;
    }

    public final void scrollToPosition(int i, boolean z, boolean z2) {
        if ((this.lastClosestPosition != i || z2) && getMeasuredHeight() > 0) {
            if (this.lastClosestPosition != i) {
                this.lastClosestPosition = i;
                onClosestPositionChanged(i);
            }
            this.scroller.abortAnimation();
            this.checkScroll = false;
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scrollAnimator.cancel();
                this.scrollAnimator = null;
            }
            if (!z) {
                float f = (-getMeasuredWidth()) / 2.0f;
                int i2 = this.viewW;
                this.scrollX = (i2 / 2.0f) + f + ((i2 + this.childPadding) * i);
                invalidate();
                return;
            }
            float f2 = (-getMeasuredWidth()) / 2.0f;
            int i3 = this.viewW;
            float f3 = (i3 / 2.0f) + f2 + ((i3 + this.childPadding) * i);
            float f4 = this.scrollX;
            if (f3 == f4) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f3);
            this.scrollAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new StackBarChartView.AnonymousClass1(this, 4));
            this.scrollAnimator.addListener(new BaseChartView.AnonymousClass4(this, 23));
            this.scrollAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.scrollAnimator.setDuration(200L);
            this.scrollAnimator.start();
        }
    }

    public void setProgressToOpen(float f) {
        if (this.progressToOpen == f) {
            return;
        }
        this.progressToOpen = f;
        invalidate();
    }
}
