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
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Stories.SelfStoryViewsView;
public abstract class SelfStoriesPreviewView extends View {
    boolean checkScroll;
    int childPadding;
    GestureDetector gestureDetector;
    GradientDrawable gradientDrawable;
    ArrayList<ImageHolder> imageReceiversTmp;
    public int imagesFromH;
    public int imagesFromW;
    public int imagesFromY;
    private boolean isAttachedToWindow;
    private int lastClosestPosition;
    ArrayList<ImageHolder> lastDrawnImageReceivers;
    float maxScroll;
    float minScroll;
    float progressToOpen;
    ValueAnimator scrollAnimator;
    private int scrollToPositionInLayout;
    float scrollX;
    Scroller scroller;
    ArrayList<SelfStoryViewsView.StoryItemInternal> storyItems;
    private float textWidth;
    float topPadding;
    private int viewH;
    private int viewW;

    public void onCenteredImageTap() {
    }

    public void onClosestPositionChanged(int i) {
    }

    abstract void onDragging();

    public SelfStoriesPreviewView(Context context) {
        super(context);
        this.scrollToPositionInLayout = -1;
        this.storyItems = new ArrayList<>();
        this.imageReceiversTmp = new ArrayList<>();
        this.lastDrawnImageReceivers = new ArrayList<>();
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
                    ImageHolder imageHolder = SelfStoriesPreviewView.this.lastDrawnImageReceivers.get(i);
                    if (SelfStoriesPreviewView.this.lastDrawnImageReceivers.get(i).receiver.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
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
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.viewH = dp;
        int i3 = (int) ((dp / 16.0f) * 9.0f);
        this.viewW = i3;
        float dp2 = i3 - AndroidUtilities.dp(8.0f);
        this.topPadding = ((AndroidUtilities.dp(180.0f) - this.viewH) / 2.0f) + AndroidUtilities.dp(20.0f);
        updateScrollParams();
        if (this.scrollToPositionInLayout >= 0 && getMeasuredWidth() > 0) {
            this.lastClosestPosition = -1;
            scrollToPosition(this.scrollToPositionInLayout, false, false);
            this.scrollToPositionInLayout = -1;
        }
        if (this.textWidth != dp2) {
            this.textWidth = dp2;
            for (int i4 = 0; i4 < this.lastDrawnImageReceivers.size(); i4++) {
                this.lastDrawnImageReceivers.get(i4).onBind(this.lastDrawnImageReceivers.get(i4).position);
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
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        super.onDraw(canvas);
        if (this.scroller.computeScrollOffset()) {
            this.scrollX = this.scroller.getCurrX();
            invalidate();
            this.checkScroll = true;
        } else if (this.checkScroll) {
            scrollToClosest();
        }
        float f6 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.imageReceiversTmp.clear();
        this.imageReceiversTmp.addAll(this.lastDrawnImageReceivers);
        this.lastDrawnImageReceivers.clear();
        float f7 = 2.14748365E9f;
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        while (i3 < this.storyItems.size()) {
            int i5 = this.viewW;
            float f8 = (-this.scrollX) + ((this.childPadding + i5) * i3);
            float f9 = ((i5 / f6) + f8) - measuredWidth;
            float abs = Math.abs(f9);
            if (abs < this.viewW) {
                f = 1.0f - (Math.abs(f9) / this.viewW);
                f2 = (0.2f * f) + 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            if (i4 == i2 || abs < f7) {
                i4 = i3;
                f7 = abs;
            }
            if (f9 < 0.0f) {
                f3 = f8 - ((this.viewW * 0.1f) * (1.0f - f));
            } else {
                f3 = f8 + (this.viewW * 0.1f * (1.0f - f));
            }
            if (f3 > getMeasuredWidth() || this.viewW + f3 < 0.0f) {
                f4 = measuredWidth;
                f5 = f7;
            } else {
                ImageHolder findOrCreateImageReceiver = findOrCreateImageReceiver(i3, this.imageReceiversTmp);
                int i6 = this.viewW;
                float f10 = i6 * f2;
                int i7 = this.viewH;
                float f11 = i7 * f2;
                float f12 = f3 - ((f10 - i6) / f6);
                float f13 = this.topPadding - ((f11 - i7) / f6);
                if (this.progressToOpen == 0.0f || i3 == (i = this.lastClosestPosition)) {
                    f4 = measuredWidth;
                    f5 = f7;
                    findOrCreateImageReceiver.receiver.setImageCoords(f12, f13, f10, f11);
                } else {
                    f4 = measuredWidth;
                    f5 = f7;
                    findOrCreateImageReceiver.receiver.setImageCoords(AndroidUtilities.lerp((i3 - i) * getMeasuredWidth(), f12, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromY, f13, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromW, f10, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromH, f11, this.progressToOpen));
                }
                if (this.progressToOpen == 1.0f || i3 != this.lastClosestPosition) {
                    findOrCreateImageReceiver.receiver.draw(canvas);
                    if (findOrCreateImageReceiver.layout != null) {
                        int i8 = (int) (((f * 0.3f) + 0.7f) * 255.0f);
                        this.gradientDrawable.setAlpha(i8);
                        this.gradientDrawable.setBounds((int) findOrCreateImageReceiver.receiver.getImageX(), (int) (findOrCreateImageReceiver.receiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) findOrCreateImageReceiver.receiver.getImageX2(), ((int) findOrCreateImageReceiver.receiver.getImageY2()) + 2);
                        this.gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(findOrCreateImageReceiver.receiver.getCenterX() - (this.textWidth / 2.0f), (findOrCreateImageReceiver.receiver.getImageY2() - AndroidUtilities.dp(8.0f)) - findOrCreateImageReceiver.layout.getHeight());
                        findOrCreateImageReceiver.paint.setAlpha(i8);
                        findOrCreateImageReceiver.layout.draw(canvas);
                        canvas.restore();
                        this.lastDrawnImageReceivers.add(findOrCreateImageReceiver);
                    }
                }
                this.lastDrawnImageReceivers.add(findOrCreateImageReceiver);
            }
            i3++;
            measuredWidth = f4;
            f7 = f5;
            f6 = 2.0f;
            i2 = -1;
        }
        if (this.scrollAnimator == null && this.lastClosestPosition != i4) {
            this.lastClosestPosition = i4;
            onClosestPositionChanged(i4);
        }
        for (int i9 = 0; i9 < this.imageReceiversTmp.size(); i9++) {
            this.imageReceiversTmp.get(i9).onDetach();
        }
        this.imageReceiversTmp.clear();
    }

    private void scrollToClosest() {
        int i = this.lastClosestPosition;
        if (i >= 0) {
            scrollToPosition(i, true, true);
        }
    }

    private ImageHolder findOrCreateImageReceiver(int i, ArrayList<ImageHolder> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2).position == i) {
                return arrayList.remove(i2);
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
                int i2 = this.viewW;
                this.scrollX = ((-getMeasuredWidth()) / 2.0f) + (i2 / 2.0f) + ((i2 + this.childPadding) * i);
                invalidate();
                return;
            }
            int i3 = this.viewW;
            float f = ((-getMeasuredWidth()) / 2.0f) + (i3 / 2.0f) + ((i3 + this.childPadding) * i);
            float f2 = this.scrollX;
            if (f == f2) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.scrollAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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

    public void setItems(ArrayList<SelfStoryViewsView.StoryItemInternal> arrayList, int i) {
        this.storyItems.clear();
        this.storyItems.addAll(arrayList);
        updateScrollParams();
        if (getMeasuredHeight() > 0) {
            scrollToPosition(i, false, false);
        } else {
            this.scrollToPositionInLayout = i;
        }
        for (int i2 = 0; i2 < this.lastDrawnImageReceivers.size(); i2++) {
            this.lastDrawnImageReceivers.get(i2).onBind(this.lastDrawnImageReceivers.get(i2).position);
        }
    }

    public int getClosestPosition() {
        return this.lastClosestPosition;
    }

    public ImageHolder getCenteredImageReciever() {
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            if (this.lastDrawnImageReceivers.get(i).position == this.lastClosestPosition) {
                return this.lastDrawnImageReceivers.get(i);
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
        int i2 = this.viewW;
        float f3 = ((-getMeasuredWidth()) / 2.0f) + (i2 / 2.0f) + ((i2 + this.childPadding) * i);
        if (f > 0.0f) {
            int i3 = this.viewW;
            f2 = ((-getMeasuredWidth()) / 2.0f) + (i3 / 2.0f) + ((i3 + this.childPadding) * (i + 1));
        } else {
            int i4 = this.viewW;
            f2 = ((-getMeasuredWidth()) / 2.0f) + (i4 / 2.0f) + ((i4 + this.childPadding) * (i - 1));
            f = -f;
        }
        if (f == 0.0f) {
            this.scrollX = f3;
        } else {
            this.scrollX = AndroidUtilities.lerp(f3, f2, f);
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
            this.storyItem = SelfStoriesPreviewView.this.storyItems.get(i);
            if (SelfStoriesPreviewView.this.isAttachedToWindow) {
                this.receiver.onAttachedToWindow();
            }
            SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
            TL_stories$StoryItem tL_stories$StoryItem = storyItemInternal.storyItem;
            if (tL_stories$StoryItem != null) {
                StoriesUtilities.setImage(this.receiver, tL_stories$StoryItem);
            } else {
                StoriesUtilities.setImage(this.receiver, storyItemInternal.uploadingStory);
            }
            updateLayout();
        }

        private void updateLayout() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories$StoryItem tL_stories$StoryItem = this.storyItem.storyItem;
            if (tL_stories$StoryItem != null) {
                SelfStoriesPreviewView.this.formatCounterText(spannableStringBuilder, tL_stories$StoryItem.views, false);
            }
            if (spannableStringBuilder.length() != 0) {
                StaticLayout createStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, this.paint, (int) (SelfStoriesPreviewView.this.textWidth + 1.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 1);
                this.layout = createStaticLayout;
                if (createStaticLayout.getLineCount() > 1) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
                    SelfStoriesPreviewView.this.formatCounterText(spannableStringBuilder2, this.storyItem.storyItem.views, true);
                    this.layout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, this.paint, (int) (SelfStoriesPreviewView.this.textWidth + 1.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, null, Integer.MAX_VALUE, 2);
                    return;
                }
                return;
            }
            this.layout = null;
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

    public void formatCounterText(SpannableStringBuilder spannableStringBuilder, TL_stories$StoryViews tL_stories$StoryViews, boolean z) {
        int i = tL_stories$StoryViews == null ? 0 : tL_stories$StoryViews.views_count;
        if (i > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_views), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i, 0));
            if (tL_stories$StoryViews == null || tL_stories$StoryViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_like_filled), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(tL_stories$StoryViews.reactions_count, 0));
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
            this.lastDrawnImageReceivers.get(i).onDetach();
        }
        this.lastDrawnImageReceivers.clear();
    }

    public void update() {
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            this.lastDrawnImageReceivers.get(i).update();
        }
    }
}
