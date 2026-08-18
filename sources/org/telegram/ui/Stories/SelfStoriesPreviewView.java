package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.StaticLayoutEx;

public abstract class SelfStoriesPreviewView extends View {
    boolean checkScroll;
    int childPadding;
    GestureDetector gestureDetector;
    GradientDrawable gradientDrawable;
    ArrayList imageReceiversTmp;
    public int imagesFromH;
    public int imagesFromW;
    public int imagesFromY;
    private boolean isAttachedToWindow;
    private int lastClosestPosition;
    ArrayList lastDrawnImageReceivers;
    float maxScroll;
    float minScroll;
    float progressToOpen;
    ValueAnimator scrollAnimator;
    private int scrollToPositionInLayout;
    float scrollX;
    Scroller scroller;
    ArrayList storyItems;
    private float textWidth;
    float topPadding;
    private int viewH;
    private int viewW;

    public abstract void onCenteredImageTap();

    public void onClosestPositionChanged(int i) {
    }

    abstract void onDragging();

    public SelfStoriesPreviewView(Context context) {
        super(context);
        this.scrollToPositionInLayout = -1;
        this.storyItems = new ArrayList();
        this.imageReceiversTmp = new ArrayList();
        this.lastDrawnImageReceivers = new ArrayList();
        this.gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                SelfStoriesPreviewView.this.scroller.abortAnimation();
                ValueAnimator valueAnimator = SelfStoriesPreviewView.this.scrollAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    SelfStoriesPreviewView.this.scrollAnimator.cancel();
                    SelfStoriesPreviewView.this.scrollAnimator = null;
                }
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                selfStoriesPreviewView.checkScroll = false;
                selfStoriesPreviewView.onDragging();
                return true;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                for (int i = 0; i < SelfStoriesPreviewView.this.lastDrawnImageReceivers.size(); i++) {
                    ImageHolder imageHolder = (ImageHolder) SelfStoriesPreviewView.this.lastDrawnImageReceivers.get(i);
                    if (((ImageHolder) SelfStoriesPreviewView.this.lastDrawnImageReceivers.get(i)).receiver.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i2 = SelfStoriesPreviewView.this.lastClosestPosition;
                        int i3 = imageHolder.position;
                        if (i2 != i3) {
                            SelfStoriesPreviewView.this.scrollToPosition(i3, true, false);
                        } else {
                            SelfStoriesPreviewView.this.onCenteredImageTap();
                        }
                    }
                }
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                selfStoriesPreviewView.scroller.fling((int) selfStoriesPreviewView.scrollX, 0, (int) (-f), 0, (int) selfStoriesPreviewView.minScroll, (int) selfStoriesPreviewView.maxScroll, 0, 0);
                SelfStoriesPreviewView.this.invalidate();
                return false;
            }
        });
        this.scroller = new Scroller(context, new OvershootInterpolator());
        this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 160)});
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.childPadding = AndroidUtilities.dp(8.0f);
        int iDp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.viewH = iDp;
        int i3 = (int) ((iDp / 16.0f) * 9.0f);
        this.viewW = i3;
        float fDp = i3 - AndroidUtilities.dp(8.0f);
        this.topPadding = ((AndroidUtilities.dp(180.0f) - this.viewH) / 2.0f) + AndroidUtilities.dp(20.0f);
        updateScrollParams();
        if (this.scrollToPositionInLayout >= 0 && getMeasuredWidth() > 0) {
            this.lastClosestPosition = -1;
            scrollToPosition(this.scrollToPositionInLayout, false, false);
            this.scrollToPositionInLayout = -1;
        }
        if (this.textWidth != fDp) {
            this.textWidth = fDp;
            for (int i4 = 0; i4 < this.lastDrawnImageReceivers.size(); i4++) {
                ((ImageHolder) this.lastDrawnImageReceivers.get(i4)).onBind(((ImageHolder) this.lastDrawnImageReceivers.get(i4)).position);
            }
        }
    }

    private void updateScrollParams() {
        int measuredWidth = getMeasuredWidth();
        int i = this.viewW;
        this.minScroll = (-(measuredWidth - i)) / 2.0f;
        this.maxScroll = ((((i + this.childPadding) * this.storyItems.size()) - this.childPadding) - getMeasuredWidth()) + ((getMeasuredWidth() - this.viewW) / 2.0f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float fAbs;
        float f;
        float f2;
        int i;
        super.onDraw(canvas);
        if (this.scroller.computeScrollOffset()) {
            this.scrollX = this.scroller.getCurrX();
            invalidate();
            this.checkScroll = true;
        } else if (this.checkScroll) {
            scrollToClosest();
        }
        float f3 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.imageReceiversTmp.clear();
        this.imageReceiversTmp.addAll(this.lastDrawnImageReceivers);
        this.lastDrawnImageReceivers.clear();
        int i2 = -1;
        float f4 = 2.1474836E9f;
        int i3 = 0;
        int i4 = -1;
        while (i3 < this.storyItems.size()) {
            float f5 = -this.scrollX;
            int i5 = this.viewW;
            float f6 = f5 + ((this.childPadding + i5) * i3);
            float f7 = ((i5 / f3) + f6) - measuredWidth;
            float fAbs2 = Math.abs(f7);
            if (fAbs2 < this.viewW) {
                fAbs = 1.0f - (Math.abs(f7) / this.viewW);
                f = (0.2f * fAbs) + 1.0f;
            } else {
                fAbs = 0.0f;
                f = 1.0f;
            }
            if (i4 == i2 || fAbs2 < f4) {
                i4 = i3;
                f4 = fAbs2;
            }
            if (f7 < 0.0f) {
                f2 = f6 - ((this.viewW * 0.1f) * (1.0f - fAbs));
            } else {
                f2 = f6 + (this.viewW * 0.1f * (1.0f - fAbs));
            }
            if (f2 > getMeasuredWidth() || this.viewW + f2 < 0.0f) {
                measuredWidth = measuredWidth;
                f4 = f4;
            } else {
                ImageHolder imageHolderFindOrCreateImageReceiver = findOrCreateImageReceiver(i3, this.imageReceiversTmp);
                float f8 = this.viewW;
                float f9 = f8 * f;
                float f10 = this.viewH;
                float f11 = f * f10;
                float f12 = f2 - ((f9 - f8) / f3);
                float f13 = this.topPadding - ((f11 - f10) / f3);
                if (this.progressToOpen == 0.0f || i3 == (i = this.lastClosestPosition)) {
                    imageHolderFindOrCreateImageReceiver.receiver.setImageCoords(f12, f13, f9, f11);
                } else {
                    imageHolderFindOrCreateImageReceiver.receiver.setImageCoords(AndroidUtilities.lerp((i3 - i) * getMeasuredWidth(), f12, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromY, f13, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromW, f9, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromH, f11, this.progressToOpen));
                }
                if (this.progressToOpen == 1.0f || i3 != this.lastClosestPosition) {
                    imageHolderFindOrCreateImageReceiver.receiver.draw(canvas);
                    if (imageHolderFindOrCreateImageReceiver.layout != null) {
                        int i6 = (int) (((fAbs * 0.3f) + 0.7f) * 255.0f);
                        this.gradientDrawable.setAlpha(i6);
                        this.gradientDrawable.setBounds((int) imageHolderFindOrCreateImageReceiver.receiver.getImageX(), (int) (imageHolderFindOrCreateImageReceiver.receiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageHolderFindOrCreateImageReceiver.receiver.getImageX2(), ((int) imageHolderFindOrCreateImageReceiver.receiver.getImageY2()) + 2);
                        this.gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageHolderFindOrCreateImageReceiver.receiver.getCenterX() - (this.textWidth / 2.0f), (imageHolderFindOrCreateImageReceiver.receiver.getImageY2() - AndroidUtilities.dp(8.0f)) - imageHolderFindOrCreateImageReceiver.layout.getHeight());
                        imageHolderFindOrCreateImageReceiver.paint.setAlpha(i6);
                        imageHolderFindOrCreateImageReceiver.layout.draw(canvas);
                        canvas.restore();
                    }
                }
                this.lastDrawnImageReceivers.add(imageHolderFindOrCreateImageReceiver);
            }
            i3++;
            measuredWidth = measuredWidth;
            f4 = f4;
            f3 = 2.0f;
            i2 = -1;
        }
        if (this.scrollAnimator == null && this.lastClosestPosition != i4) {
            this.lastClosestPosition = i4;
            onClosestPositionChanged(i4);
        }
        for (int i7 = 0; i7 < this.imageReceiversTmp.size(); i7++) {
            ((ImageHolder) this.imageReceiversTmp.get(i7)).onDetach();
        }
        this.imageReceiversTmp.clear();
    }

    private void scrollToClosest() {
        int i = this.lastClosestPosition;
        if (i >= 0) {
            scrollToPosition(i, true, true);
        }
    }

    private ImageHolder findOrCreateImageReceiver(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((ImageHolder) arrayList.get(i2)).position == i) {
                return (ImageHolder) arrayList.remove(i2);
            }
        }
        ImageHolder imageHolder = new ImageHolder();
        imageHolder.onBind(i);
        imageHolder.position = i;
        return imageHolder;
    }

    public void scrollToPosition(int i, boolean z, boolean z2) {
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
                this.scrollX = f + (i2 / 2.0f) + ((i2 + this.childPadding) * i);
                invalidate();
                return;
            }
            float f2 = (-getMeasuredWidth()) / 2.0f;
            int i3 = this.viewW;
            float f3 = f2 + (i3 / 2.0f) + ((i3 + this.childPadding) * i);
            float f4 = this.scrollX;
            if (f3 == f4) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f3);
            this.scrollAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfStoriesPreviewView.this.scrollX = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    SelfStoriesPreviewView.this.invalidate();
                }
            });
            this.scrollAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SelfStoriesPreviewView.this.scrollAnimator = null;
                }
            });
            this.scrollAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.scrollAnimator.setDuration(200L);
            this.scrollAnimator.start();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.gestureDetector.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.scroller.isFinished()) {
            scrollToClosest();
        }
        return true;
    }

    public void setItems(ArrayList arrayList, int i) {
        this.storyItems.clear();
        this.storyItems.addAll(arrayList);
        updateScrollParams();
        if (getMeasuredHeight() > 0) {
            scrollToPosition(i, false, false);
        } else {
            this.scrollToPositionInLayout = i;
        }
        for (int i2 = 0; i2 < this.lastDrawnImageReceivers.size(); i2++) {
            ((ImageHolder) this.lastDrawnImageReceivers.get(i2)).onBind(((ImageHolder) this.lastDrawnImageReceivers.get(i2)).position);
        }
    }

    public int getClosestPosition() {
        return this.lastClosestPosition;
    }

    public ImageHolder getCenteredImageReciever() {
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            if (((ImageHolder) this.lastDrawnImageReceivers.get(i)).position == this.lastClosestPosition) {
                return (ImageHolder) this.lastDrawnImageReceivers.get(i);
            }
        }
        return null;
    }

    public void abortScroll() {
        this.scroller.abortAnimation();
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.scrollAnimator = null;
        }
        scrollToPosition(this.lastClosestPosition, false, true);
    }

    public float getFinalHeight() {
        return AndroidUtilities.dp(180.0f);
    }

    public void setProgressToOpen(float f) {
        if (this.progressToOpen == f) {
            return;
        }
        this.progressToOpen = f;
        invalidate();
    }

    public void scrollToPositionWithOffset(int i, float f) {
        float f2;
        this.scroller.abortAnimation();
        if (Math.abs(f) > 1.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.scrollAnimator = null;
        }
        float f3 = (-getMeasuredWidth()) / 2.0f;
        int i2 = this.viewW;
        float f4 = f3 + (i2 / 2.0f) + ((i2 + this.childPadding) * i);
        if (f > 0.0f) {
            float f5 = (-getMeasuredWidth()) / 2.0f;
            int i3 = this.viewW;
            f2 = f5 + (i3 / 2.0f) + ((i3 + this.childPadding) * (i + 1));
        } else {
            float f6 = (-getMeasuredWidth()) / 2.0f;
            int i4 = this.viewW;
            f2 = f6 + (i4 / 2.0f) + ((i4 + this.childPadding) * (i - 1));
            f = -f;
        }
        if (f == 0.0f) {
            this.scrollX = f4;
        } else {
            this.scrollX = AndroidUtilities.lerp(f4, f2, f);
        }
        this.checkScroll = false;
        invalidate();
    }

    public class ImageHolder {
        StaticLayout layout;
        TextPaint paint = new TextPaint(1);
        int position;
        ImageReceiver receiver;
        SelfStoryViewsView.StoryItemInternal storyItem;

        public ImageHolder() {
            this.receiver = new ImageReceiver(SelfStoriesPreviewView.this);
            this.receiver.setAllowLoadingOnAttachedOnly(true);
            this.receiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            this.paint.setColor(-1);
            this.paint.setTextSize(AndroidUtilities.dp(13.0f));
        }

        void onBind(int i) {
            if (i < 0 || i >= SelfStoriesPreviewView.this.storyItems.size()) {
                return;
            }
            this.storyItem = (SelfStoryViewsView.StoryItemInternal) SelfStoriesPreviewView.this.storyItems.get(i);
            if (SelfStoriesPreviewView.this.isAttachedToWindow) {
                this.receiver.onAttachedToWindow();
            }
            SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
            TL_stories.StoryItem storyItem = storyItemInternal.storyItem;
            if (storyItem != null) {
                StoriesUtilities.setImage(this.receiver, storyItem);
            } else {
                StoriesUtilities.setImage(this.receiver, storyItemInternal.uploadingStory);
            }
            updateLayout();
        }

        private void updateLayout() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.StoryItem storyItem = this.storyItem.storyItem;
            if (storyItem != null) {
                SelfStoriesPreviewView.this.formatCounterText(spannableStringBuilder, storyItem.views, false);
            }
            if (spannableStringBuilder.length() == 0) {
                this.layout = null;
                return;
            }
            TextPaint textPaint = this.paint;
            int i = (int) (SelfStoriesPreviewView.this.textWidth + 1.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, i, alignment, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 1);
            this.layout = staticLayoutCreateStaticLayout;
            if (staticLayoutCreateStaticLayout.getLineCount() > 1) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
                SelfStoriesPreviewView.this.formatCounterText(spannableStringBuilder2, this.storyItem.storyItem.views, true);
                this.layout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, this.paint, (int) (SelfStoriesPreviewView.this.textWidth + 1.0f), alignment, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 2);
            }
        }

        void onDetach() {
            this.receiver.onDetachedFromWindow();
        }

        public void draw(Canvas canvas, float f, float f2, int i, int i2, int i3, int i4) {
            this.receiver.setImageCoords(i, i2, i3, i4);
            this.receiver.setAlpha(f);
            this.receiver.draw(canvas);
            this.receiver.setAlpha(1.0f);
            if (this.layout != null) {
                int i5 = (int) (f * 255.0f);
                this.paint.setAlpha(i5);
                SelfStoriesPreviewView.this.gradientDrawable.setAlpha(i5);
                SelfStoriesPreviewView.this.gradientDrawable.setBounds((int) this.receiver.getImageX(), (int) (this.receiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f2)), (int) this.receiver.getImageX2(), ((int) this.receiver.getImageY2()) + 2);
                SelfStoriesPreviewView.this.gradientDrawable.draw(canvas);
                canvas.save();
                canvas.scale(f2, f2, this.receiver.getCenterX(), this.receiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f2));
                canvas.translate(this.receiver.getCenterX() - (SelfStoriesPreviewView.this.textWidth / 2.0f), (this.receiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f2)) - this.layout.getHeight());
                this.layout.draw(canvas);
                canvas.restore();
            }
        }

        public void update() {
            updateLayout();
        }
    }

    public void formatCounterText(SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z) {
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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            ((ImageHolder) this.lastDrawnImageReceivers.get(i)).onDetach();
        }
        this.lastDrawnImageReceivers.clear();
    }

    public void update() {
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            ((ImageHolder) this.lastDrawnImageReceivers.get(i)).update();
        }
    }
}
