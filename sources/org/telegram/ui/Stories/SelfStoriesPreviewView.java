package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.SelfStoryViewsView;
public abstract class SelfStoriesPreviewView extends View {
    boolean checkScroll;
    int childPadding;
    GestureDetector gestureDetector;
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
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.childPadding = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.viewH = dp;
        this.viewW = (int) ((dp / 16.0f) * 9.0f);
        this.topPadding = ((AndroidUtilities.dp(180.0f) - this.viewH) / 2.0f) + AndroidUtilities.dp(20.0f);
        updateScrollParams();
        if (this.scrollToPositionInLayout < 0 || getMeasuredWidth() <= 0) {
            return;
        }
        this.lastClosestPosition = -1;
        scrollToPosition(this.scrollToPositionInLayout, false, false);
        this.scrollToPositionInLayout = -1;
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
        int i;
        super.onDraw(canvas);
        if (this.scroller.computeScrollOffset()) {
            this.scrollX = this.scroller.getCurrX();
            invalidate();
            this.checkScroll = true;
        } else if (this.checkScroll) {
            scrollToClosest();
        }
        float f4 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.imageReceiversTmp.clear();
        this.imageReceiversTmp.addAll(this.lastDrawnImageReceivers);
        this.lastDrawnImageReceivers.clear();
        float f5 = 2.14748365E9f;
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        while (i3 < this.storyItems.size()) {
            int i5 = this.viewW;
            float f6 = (-this.scrollX) + ((this.childPadding + i5) * i3);
            float f7 = ((i5 / f4) + f6) - measuredWidth;
            float abs = Math.abs(f7);
            if (abs < this.viewW) {
                f = 1.0f - (Math.abs(f7) / this.viewW);
                f2 = (0.2f * f) + 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            if (i4 == i2 || abs < f5) {
                i4 = i3;
                f5 = abs;
            }
            if (f7 < 0.0f) {
                f3 = f6 - ((this.viewW * 0.1f) * (1.0f - f));
            } else {
                f3 = f6 + (this.viewW * 0.1f * (1.0f - f));
            }
            if (f3 <= getMeasuredWidth() && this.viewW + f3 >= 0.0f) {
                ImageHolder findOrCreateImageReceiver = findOrCreateImageReceiver(i3, this.imageReceiversTmp);
                int i6 = this.viewW;
                float f8 = i6 * f2;
                int i7 = this.viewH;
                float f9 = i7 * f2;
                float f10 = f3 - ((f8 - i6) / f4);
                float f11 = this.topPadding - ((f9 - i7) / f4);
                if (this.progressToOpen == 0.0f || i3 == (i = this.lastClosestPosition)) {
                    findOrCreateImageReceiver.receiver.setImageCoords(f10, f11, f8, f9);
                } else {
                    findOrCreateImageReceiver.receiver.setImageCoords(AndroidUtilities.lerp((i3 - i) * getMeasuredWidth(), f10, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromY, f11, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromW, f8, this.progressToOpen), AndroidUtilities.lerp(this.imagesFromH, f9, this.progressToOpen));
                }
                if (this.progressToOpen == 1.0f || i3 != this.lastClosestPosition) {
                    findOrCreateImageReceiver.receiver.draw(canvas);
                }
                this.lastDrawnImageReceivers.add(findOrCreateImageReceiver);
            }
            i3++;
            f4 = 2.0f;
            i2 = -1;
        }
        if (this.scrollAnimator == null && this.lastClosestPosition != i4) {
            this.lastClosestPosition = i4;
            onClosestPositionChanged(i4);
        }
        for (int i8 = 0; i8 < this.imageReceiversTmp.size(); i8++) {
            this.imageReceiversTmp.get(i8).onDetach();
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
    }

    public int getClosestPosition() {
        return this.lastClosestPosition;
    }

    public ImageReceiver getCenteredImageReciever() {
        for (int i = 0; i < this.lastDrawnImageReceivers.size(); i++) {
            if (this.lastDrawnImageReceivers.get(i).position == this.lastClosestPosition) {
                return this.lastDrawnImageReceivers.get(i).receiver;
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
        int position;
        ImageReceiver receiver;

        public ImageHolder() {
            ImageReceiver imageReceiver = new ImageReceiver(SelfStoriesPreviewView.this);
            this.receiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.receiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        }

        void onBind(int i) {
            SelfStoryViewsView.StoryItemInternal storyItemInternal = SelfStoriesPreviewView.this.storyItems.get(i);
            if (SelfStoriesPreviewView.this.isAttachedToWindow) {
                this.receiver.onAttachedToWindow();
            }
            TLRPC$StoryItem tLRPC$StoryItem = storyItemInternal.storyItem;
            if (tLRPC$StoryItem != null) {
                StoriesUtilities.setImage(this.receiver, tLRPC$StoryItem);
            } else {
                StoriesUtilities.setImage(this.receiver, storyItemInternal.uploadingStory);
            }
        }

        void onDetach() {
            this.receiver.onDetachedFromWindow();
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
}
