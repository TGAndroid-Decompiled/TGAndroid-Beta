package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.zzcv;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;

public final class PopupSwipeBackLayout extends FrameLayout {
    public int currentForegroundIndex;
    public final zzcv detector;
    public ValueAnimator foregroundAnimator;
    public int foregroundColor;
    public final Paint foregroundPaint;
    public final Rect hitRect;
    public boolean isAnimationInProgress;
    public boolean isProcessingSwipe;
    public boolean isSwipeBackDisallowed;
    public boolean isSwipeDisallowed;
    public int lastHeightReported;
    public float lastToProgress;
    public float lastTransitionProgress;
    public final Path mPath;
    public final RectF mRect;
    public final AnimationNotificationsLocker notificationsLocker;
    public Runnable onForegroundOpen;
    public IntCallback onHeightUpdateListener;
    public final ArrayList onSwipeBackProgressListeners;
    public final Paint overlayPaint;
    public float overrideForegroundHeight;
    public final SparseIntArray overrideHeightIndex;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean stickToRight;
    public float toProgress;
    public float transitionProgress;

    public final class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        public final int $r8$classId;
        public final ViewGroup this$0;
        public final int val$touchSlop;

        public AnonymousClass1(ViewGroup viewGroup, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = viewGroup;
            this.val$touchSlop = i;
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    return true;
                case 1:
                    CustomPhoneKeyboardView customPhoneKeyboardView = (CustomPhoneKeyboardView) this.this$0;
                    boolean z = customPhoneKeyboardView.postedLongClick;
                    CustomPhoneKeyboardView$$ExternalSyntheticLambda0 customPhoneKeyboardView$$ExternalSyntheticLambda0 = customPhoneKeyboardView.detectLongClick;
                    if (z) {
                        customPhoneKeyboardView.removeCallbacks(customPhoneKeyboardView$$ExternalSyntheticLambda0);
                    }
                    customPhoneKeyboardView.postedLongClick = true;
                    customPhoneKeyboardView.postDelayed(customPhoneKeyboardView$$ExternalSyntheticLambda0, 200L);
                    customPhoneKeyboardView.onBackButton.run();
                    return true;
                default:
                    return super.onDown(motionEvent);
            }
        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            BotWebViewContainer.MyWebView myWebView;
            switch (this.$r8$classId) {
                case 0:
                    PopupSwipeBackLayout popupSwipeBackLayout = (PopupSwipeBackLayout) this.this$0;
                    if (!popupSwipeBackLayout.isAnimationInProgress && !popupSwipeBackLayout.isSwipeDisallowed && f >= 600.0f) {
                        popupSwipeBackLayout.isProcessingSwipe = false;
                        popupSwipeBackLayout.isSwipeDisallowed = false;
                        popupSwipeBackLayout.animateToState(0.0f, f / 6000.0f);
                    }
                    return false;
                case 1:
                default:
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                case 2:
                    ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.this$0;
                    if (webViewSwipeContainer.isSwipeDisallowed || !webViewSwipeContainer.allowSwipes) {
                        return false;
                    }
                    if (webViewSwipeContainer.fullsize && !webViewSwipeContainer.allowFullSizeSwipe) {
                        return false;
                    }
                    if (webViewSwipeContainer.shouldWaitWebViewScroll && !webViewSwipeContainer.allowingScroll(false)) {
                        return false;
                    }
                    float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                    float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                    if (f2 >= AndroidUtilities.dp(650.0f) && ((fDistance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((myWebView = webViewSwipeContainer.webView) == null || myWebView.getScrollY() == 0))) {
                        webViewSwipeContainer.flingInProgress = true;
                        float f3 = webViewSwipeContainer.swipeOffsetY;
                        int i = webViewSwipeContainer.swipeStickyRange;
                        if (f3 < i && !webViewSwipeContainer.fullsize) {
                            webViewSwipeContainer.stickTo(0.0f, false, null);
                        } else if (webViewSwipeContainer.fullsize && webViewSwipeContainer.allowFullSizeSwipe && (webViewSwipeContainer.drawnSwipeOffsetY == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || (f3 <= (-i) && f2 < AndroidUtilities.dp(1200.0f)))) {
                            webViewSwipeContainer.stickTo((-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, false, null);
                        } else {
                            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate delegate = webViewSwipeContainer.delegate;
                            if (delegate != null) {
                                delegate.onDismiss(false);
                            }
                        }
                    } else {
                        if (f2 > -700.0f) {
                            return false;
                        }
                        float f4 = webViewSwipeContainer.swipeOffsetY;
                        float f5 = (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY;
                        if (f4 <= f5) {
                            return false;
                        }
                        webViewSwipeContainer.flingInProgress = true;
                        webViewSwipeContainer.stickTo(f5, false, null);
                    }
                    return true;
            }
        }

        @Override
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            MotionEvent motionEvent3;
            float f3;
            BotWebViewContainer.MyWebView myWebView;
            float fClamp;
            float f4;
            BotWebViewContainer.MyWebView myWebView2;
            float scrollY;
            BotWebViewContainer.MyWebView myWebView3;
            switch (this.$r8$classId) {
                case 0:
                    PopupSwipeBackLayout popupSwipeBackLayout = (PopupSwipeBackLayout) this.this$0;
                    if (popupSwipeBackLayout.isProcessingSwipe || popupSwipeBackLayout.isSwipeDisallowed) {
                        motionEvent3 = motionEvent2;
                    } else {
                        if (popupSwipeBackLayout.isSwipeBackDisallowed || popupSwipeBackLayout.transitionProgress != 1.0f || f > (-this.val$touchSlop) || Math.abs(f) < Math.abs(1.5f * f2)) {
                            motionEvent3 = motionEvent2;
                        } else {
                            motionEvent3 = motionEvent2;
                            if (!popupSwipeBackLayout.isDisallowedView(motionEvent3, popupSwipeBackLayout.getChildAt(popupSwipeBackLayout.transitionProgress > 0.5f ? 1 : 0))) {
                                popupSwipeBackLayout.isProcessingSwipe = true;
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i = 0; i < popupSwipeBackLayout.getChildCount(); i++) {
                                    popupSwipeBackLayout.getChildAt(i).dispatchTouchEvent(motionEventObtain);
                                }
                                motionEventObtain.recycle();
                            }
                        }
                        popupSwipeBackLayout.isSwipeDisallowed = true;
                    }
                    if (popupSwipeBackLayout.isProcessingSwipe) {
                        popupSwipeBackLayout.toProgress = -1.0f;
                        popupSwipeBackLayout.transitionProgress = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / popupSwipeBackLayout.getWidth()));
                        popupSwipeBackLayout.invalidateTransforms(true);
                    }
                    return popupSwipeBackLayout.isProcessingSwipe;
                case 1:
                    CustomPhoneKeyboardView customPhoneKeyboardView = (CustomPhoneKeyboardView) this.this$0;
                    if (customPhoneKeyboardView.postedLongClick || customPhoneKeyboardView.runningLongClick) {
                        float fAbs = Math.abs(f);
                        float f5 = this.val$touchSlop;
                        if (fAbs >= f5 || Math.abs(f2) >= f5) {
                            customPhoneKeyboardView.postedLongClick = false;
                            customPhoneKeyboardView.runningLongClick = false;
                            customPhoneKeyboardView.removeCallbacks(customPhoneKeyboardView.detectLongClick);
                            customPhoneKeyboardView.removeCallbacks(customPhoneKeyboardView.onBackButton);
                        }
                    }
                    return false;
                default:
                    ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.this$0;
                    if (webViewSwipeContainer.scrolledOut) {
                        f3 = f2;
                    } else {
                        float f6 = webViewSwipeContainer.sy + f2;
                        webViewSwipeContainer.sy = f6;
                        float fAbs2 = Math.abs(f6);
                        float f7 = webViewSwipeContainer.minscroll;
                        if (fAbs2 > f7) {
                            webViewSwipeContainer.scrolledOut = true;
                            float f8 = webViewSwipeContainer.sy;
                            f3 = f8 > 0.0f ? f8 - f7 : f8 + f7;
                        } else {
                            f3 = 0.0f;
                        }
                    }
                    if (!webViewSwipeContainer.isScrolling && !webViewSwipeContainer.isSwipeDisallowed && webViewSwipeContainer.allowSwipes) {
                        if (!webViewSwipeContainer.shouldWaitWebViewScroll || webViewSwipeContainer.swipeOffsetY != (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || webViewSwipeContainer.allowingScroll(false)) {
                            if (((Boolean) webViewSwipeContainer.isKeyboardVisible.provide(null)).booleanValue() && webViewSwipeContainer.swipeOffsetY == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                webViewSwipeContainer.isSwipeDisallowed = true;
                            } else {
                                float fAbs3 = Math.abs(f3);
                                float f9 = this.val$touchSlop;
                                if (fAbs3 < f9 || Math.abs(f3) * 1.5f < Math.abs(f) || (webViewSwipeContainer.swipeOffsetY == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY && (myWebView3 = webViewSwipeContainer.webView) != null && (f3 >= 0.0f || myWebView3.getScrollY() != 0))) {
                                    BotWebViewContainer.MyWebView myWebView4 = webViewSwipeContainer.webView;
                                    if (myWebView4 != null) {
                                        if (myWebView4.canScrollHorizontally(f >= 0.0f ? 1 : -1)) {
                                            webViewSwipeContainer.isSwipeDisallowed = true;
                                        } else if (Math.abs(f) >= f9) {
                                            webViewSwipeContainer.isSwipeDisallowed = true;
                                        }
                                    } else if (Math.abs(f) >= f9 && Math.abs(f) * 1.5f >= Math.abs(f3)) {
                                        webViewSwipeContainer.isSwipeDisallowed = true;
                                    }
                                } else {
                                    webViewSwipeContainer.isScrolling = true;
                                    MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                    for (int i2 = 0; i2 < webViewSwipeContainer.getChildCount(); i2++) {
                                        webViewSwipeContainer.getChildAt(i2).dispatchTouchEvent(motionEventObtain2);
                                    }
                                    motionEventObtain2.recycle();
                                }
                            }
                            if (webViewSwipeContainer.isScrolling) {
                                if (f3 < 0.0f) {
                                    f4 = webViewSwipeContainer.swipeOffsetY;
                                    if (f4 > (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                        webViewSwipeContainer.swipeOffsetY = f4 - f3;
                                    } else {
                                        scrollY = myWebView2.getScrollY() + f3;
                                        BotWebViewContainer.MyWebView myWebView5 = webViewSwipeContainer.webView;
                                        myWebView5.setScrollY((int) MathUtils.clamp(scrollY, 0.0f, Math.max(myWebView5.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                        if (scrollY < 0.0f) {
                                            webViewSwipeContainer.swipeOffsetY -= scrollY;
                                        }
                                    }
                                } else if (f3 > 0.0f) {
                                    float f10 = webViewSwipeContainer.swipeOffsetY - f3;
                                    webViewSwipeContainer.swipeOffsetY = f10;
                                    myWebView = webViewSwipeContainer.webView;
                                    if (myWebView != null) {
                                        float scrollY2 = myWebView.getScrollY() - ((webViewSwipeContainer.swipeOffsetY + webViewSwipeContainer.offsetY) - webViewSwipeContainer.topActionBarOffsetY);
                                        BotWebViewContainer.MyWebView myWebView6 = webViewSwipeContainer.webView;
                                        myWebView6.setScrollY((int) MathUtils.clamp(scrollY2, 0.0f, Math.max(myWebView6.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                    }
                                }
                                fClamp = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                                webViewSwipeContainer.swipeOffsetY = fClamp;
                                if (webViewSwipeContainer.fullsize) {
                                    webViewSwipeContainer.swipeOffsetY = Math.min(fClamp, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                                }
                                webViewSwipeContainer.invalidateTranslation();
                            }
                        } else if (webViewSwipeContainer.isScrolling) {
                            if (f3 < 0.0f) {
                                f4 = webViewSwipeContainer.swipeOffsetY;
                                if (f4 > (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                    webViewSwipeContainer.swipeOffsetY = f4 - f3;
                                } else {
                                    scrollY = myWebView2.getScrollY() + f3;
                                    BotWebViewContainer.MyWebView myWebView7 = webViewSwipeContainer.webView;
                                    myWebView7.setScrollY((int) MathUtils.clamp(scrollY, 0.0f, Math.max(myWebView7.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                    if (scrollY < 0.0f) {
                                        webViewSwipeContainer.swipeOffsetY -= scrollY;
                                    }
                                }
                            } else if (f3 > 0.0f) {
                                float f11 = webViewSwipeContainer.swipeOffsetY - f3;
                                webViewSwipeContainer.swipeOffsetY = f11;
                                myWebView = webViewSwipeContainer.webView;
                                if (myWebView != null) {
                                    float scrollY3 = myWebView.getScrollY() - ((webViewSwipeContainer.swipeOffsetY + webViewSwipeContainer.offsetY) - webViewSwipeContainer.topActionBarOffsetY);
                                    BotWebViewContainer.MyWebView myWebView8 = webViewSwipeContainer.webView;
                                    myWebView8.setScrollY((int) MathUtils.clamp(scrollY3, 0.0f, Math.max(myWebView8.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                }
                            }
                            fClamp = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                            webViewSwipeContainer.swipeOffsetY = fClamp;
                            if (webViewSwipeContainer.fullsize) {
                                webViewSwipeContainer.swipeOffsetY = Math.min(fClamp, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                            }
                            webViewSwipeContainer.invalidateTranslation();
                        }
                    } else if (webViewSwipeContainer.isScrolling) {
                        if (f3 < 0.0f) {
                            f4 = webViewSwipeContainer.swipeOffsetY;
                            if (f4 > (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY && (myWebView2 = webViewSwipeContainer.webView) != null) {
                                scrollY = myWebView2.getScrollY() + f3;
                                BotWebViewContainer.MyWebView myWebView9 = webViewSwipeContainer.webView;
                                myWebView9.setScrollY((int) MathUtils.clamp(scrollY, 0.0f, Math.max(myWebView9.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                if (scrollY < 0.0f) {
                                    webViewSwipeContainer.swipeOffsetY -= scrollY;
                                }
                            } else {
                                webViewSwipeContainer.swipeOffsetY = f4 - f3;
                            }
                        } else if (f3 > 0.0f) {
                            float f12 = webViewSwipeContainer.swipeOffsetY - f3;
                            webViewSwipeContainer.swipeOffsetY = f12;
                            myWebView = webViewSwipeContainer.webView;
                            if (myWebView != null && f12 < (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                float scrollY4 = myWebView.getScrollY() - ((webViewSwipeContainer.swipeOffsetY + webViewSwipeContainer.offsetY) - webViewSwipeContainer.topActionBarOffsetY);
                                BotWebViewContainer.MyWebView myWebView10 = webViewSwipeContainer.webView;
                                myWebView10.setScrollY((int) MathUtils.clamp(scrollY4, 0.0f, Math.max(myWebView10.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                            }
                        }
                        fClamp = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                        webViewSwipeContainer.swipeOffsetY = fClamp;
                        if (webViewSwipeContainer.fullsize && !webViewSwipeContainer.allowFullSizeSwipe) {
                            webViewSwipeContainer.swipeOffsetY = Math.min(fClamp, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                        }
                        webViewSwipeContainer.invalidateTranslation();
                    }
                    return true;
            }
        }
    }

    public interface IntCallback {
    }

    public interface OnSwipeBackProgressListener {
        void onSwipeBackProgress(float f, float f2);
    }

    public PopupSwipeBackLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.overrideHeightIndex = new SparseIntArray();
        this.toProgress = -1.0f;
        Paint paint = new Paint(1);
        this.overlayPaint = paint;
        this.foregroundPaint = new Paint();
        this.foregroundColor = 0;
        this.mPath = new Path();
        this.mRect = new RectF();
        this.onSwipeBackProgressListeners = new ArrayList();
        this.currentForegroundIndex = -1;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.lastHeightReported = -1;
        this.hitRect = new Rect();
        this.resourcesProvider = resourcesProvider;
        this.detector = new zzcv(context, new AnonymousClass1(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        paint.setColor(-16777216);
    }

    public final void addOnSwipeBackProgressListener(ChatActivity.AnonymousClass118 anonymousClass118) {
        this.onSwipeBackProgressListeners.add(anonymousClass118);
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        invalidateTransforms(true);
    }

    public final void animateToState(float f, float f2) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.transitionProgress, f).setDuration((long) (Math.max(0.5f, Math.abs(this.transitionProgress - f) - Math.min(0.2f, f2)) * 300.0f));
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.notificationsLocker.lock();
        duration.addUpdateListener(new PopupSwipeBackLayout$$ExternalSyntheticLambda0(this, 0));
        duration.addListener(new SlideIntChooseView.AnonymousClass3(this, f, 5));
        duration.start();
    }

    public final void closeForeground(boolean z) {
        if (this.isAnimationInProgress) {
            return;
        }
        if (z) {
            animateToState(0.0f, 0.0f);
            return;
        }
        this.currentForegroundIndex = -1;
        this.transitionProgress = 0.0f;
        invalidateTransforms(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        float top = childAt.getTop();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        int i = this.currentForegroundIndex;
        if (i != -1 && i < getChildCount()) {
            View childAt2 = getChildAt(this.currentForegroundIndex);
            float top2 = childAt2.getTop();
            float measuredWidth2 = childAt2.getMeasuredWidth();
            float measuredHeight2 = this.overrideForegroundHeight;
            if (measuredHeight2 == 0.0f) {
                measuredHeight2 = childAt2.getMeasuredHeight();
            }
            if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                top = AndroidUtilities.lerp(top, top2, this.transitionProgress);
                measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.transitionProgress);
                measuredHeight = AndroidUtilities.lerp(measuredHeight, measuredHeight2, this.transitionProgress);
            }
        }
        int iSave = canvas.save();
        Path path = this.mPath;
        path.rewind();
        int iDp = AndroidUtilities.dp(12.0f);
        boolean z = this.stickToRight;
        RectF rectF = this.mRect;
        if (z) {
            rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
        } else {
            rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
        }
        float f = iDp;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
        if (this.onHeightUpdateListener == null || this.lastHeightReported == rectF.height()) {
            return;
        }
        IntCallback intCallback = this.onHeightUpdateListener;
        int iHeight = (int) rectF.height();
        this.lastHeightReported = iHeight;
        BaseFragment[] baseFragmentArr = (BaseFragment[]) ((VideoEditTextureView$$ExternalSyntheticLambda1) intCallback).f$0;
        BaseFragment baseFragment = baseFragmentArr[0];
        if (baseFragment == null || baseFragment.getFragmentView() == null || !baseFragmentArr[0].isInPreviewMode()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = baseFragmentArr[0].getFragmentView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + iHeight;
            baseFragmentArr[0].getFragmentView().setLayoutParams(layoutParams);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction() & 255;
        if (this.isAnimationInProgress) {
            z = true;
        } else if (((GestureDetector) this.detector.zza).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            z = this.isProcessingSwipe;
        } else {
            if (this.isProcessingSwipe) {
                this.isProcessingSwipe = false;
                this.isSwipeDisallowed = false;
                animateToState(this.transitionProgress >= 0.5f ? 1.0f : 0.0f, 0.0f);
            } else if (this.isSwipeDisallowed) {
                this.isProcessingSwipe = false;
                this.isSwipeDisallowed = false;
            }
            z = false;
        }
        if (!z) {
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.mRect;
            if (rectF != null) {
                rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
            if (actionMasked == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                callOnClick();
                return true;
            }
            int i = this.currentForegroundIndex;
            if (i < 0 || i >= getChildCount()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(this.currentForegroundIndex);
            if (this.transitionProgress > 0.5f) {
                childAt = childAt2;
            }
            boolean zDispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
            if ((zDispatchTouchEvent || actionMasked != 0) && !zDispatchTouchEvent && !onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        int iIndexOfChild = indexOfChild(view);
        int iSave = canvas.save();
        if (iIndexOfChild != 0) {
            int i = this.foregroundColor;
            Paint paint = this.foregroundPaint;
            if (i == 0) {
                paint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
            } else {
                paint.setColor(i);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), paint);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (iIndexOfChild == 0) {
            Paint paint2 = this.overlayPaint;
            paint2.setAlpha((int) (this.transitionProgress * 64.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void invalidateTransforms(boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (this.lastToProgress != this.toProgress || this.lastTransitionProgress != this.transitionProgress) {
            ArrayList arrayList = this.onSwipeBackProgressListeners;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((OnSwipeBackProgressListener) arrayList.get(i)).onSwipeBackProgress(this.toProgress, this.transitionProgress);
                }
            }
            this.lastToProgress = this.toProgress;
            this.lastTransitionProgress = this.transitionProgress;
        }
        View childAt = getChildAt(0);
        int i2 = this.currentForegroundIndex;
        View childAt2 = (i2 < 0 || i2 >= getChildCount()) ? null : getChildAt(this.currentForegroundIndex);
        childAt.setTranslationX((-this.transitionProgress) * getWidth() * 0.5f);
        float f = ((1.0f - this.transitionProgress) * 0.05f) + 0.95f;
        childAt.setScaleX(f);
        childAt.setScaleY(f);
        if (childAt2 != null) {
            childAt2.setTranslationX((1.0f - this.transitionProgress) * getWidth());
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt3 = getChildAt(i3);
            if (i3 == 0) {
                if (this.transitionProgress == 1.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.transitionProgress != 1.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else if (i3 == this.currentForegroundIndex) {
                if (this.transitionProgress == 0.0f && childAt3.getVisibility() != 4) {
                    childAt3.setVisibility(4);
                }
                if (this.transitionProgress != 0.0f && childAt3.getVisibility() != 0) {
                    childAt3.setVisibility(0);
                }
            } else {
                childAt3.setVisibility(4);
            }
        }
        float measuredWidth2 = childAt.getMeasuredWidth();
        float measuredHeight2 = childAt.getMeasuredHeight();
        if (childAt2 != null) {
            measuredWidth = childAt2.getMeasuredWidth();
            measuredHeight = this.overrideForegroundHeight;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt2.getMeasuredHeight();
            }
        } else {
            measuredWidth = 0.0f;
            measuredHeight = 0.0f;
        }
        if (childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) getParent();
        float f2 = this.transitionProgress;
        float f3 = ((measuredWidth - measuredWidth2) * f2) + measuredWidth2;
        float fM = DiffUtil.m(measuredHeight, measuredHeight2, f2, measuredHeight2);
        float paddingRight = f3 + actionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindowLayout.getPaddingLeft();
        float paddingBottom = fM + actionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindowLayout.getPaddingTop();
        actionBarPopupWindowLayout.updateAnimation = false;
        actionBarPopupWindowLayout.setBackScaleX(paddingRight / actionBarPopupWindowLayout.getMeasuredWidth());
        if (z) {
            actionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, paddingBottom / actionBarPopupWindowLayout.getMeasuredHeight()));
        }
        actionBarPopupWindowLayout.updateAnimation = true;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt4 = getChildAt(i4);
            childAt4.setPivotX(0.0f);
            childAt4.setPivotY(0.0f);
        }
        invalidate();
    }

    public final boolean isDisallowedView(MotionEvent motionEvent, View view) {
        Rect rect = this.hitRect;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof ActionBarMenuSlider))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (isDisallowedView(motionEvent, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.stickToRight) {
                    int i6 = i3 - i;
                    int i7 = i4 - i2;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), i7 - childAt.getMeasuredHeight(), i6, i7);
                } else {
                    int i8 = i4 - i2;
                    childAt.layout(0, i8 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i8);
                }
            } else if (this.stickToRight) {
                int i9 = i3 - i;
                childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateTransforms(true);
    }

    public final void openForeground(int i) {
        if (this.isAnimationInProgress) {
            return;
        }
        this.currentForegroundIndex = i;
        this.overrideForegroundHeight = this.overrideHeightIndex.get(i);
        animateToState(1.0f, 0.0f);
    }

    public void setForegroundColor(int i) {
        this.foregroundColor = i;
    }

    public final void setNewForegroundHeight(int i, int i2, boolean z) {
        this.overrideHeightIndex.put(i, i2);
        int i3 = this.currentForegroundIndex;
        if (i == i3 && i3 >= 0 && i3 < getChildCount()) {
            ValueAnimator valueAnimator = this.foregroundAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.foregroundAnimator = null;
            }
            if (!z) {
                this.overrideForegroundHeight = i2;
                invalidateTransforms(true);
                return;
            }
            View childAt = getChildAt(this.currentForegroundIndex);
            float measuredHeight = this.overrideForegroundHeight;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt.getMeasuredHeight();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(measuredHeight, i2).setDuration(240L);
            duration.setInterpolator(Easings.easeInOutQuad);
            duration.addUpdateListener(new PopupSwipeBackLayout$$ExternalSyntheticLambda0(this, 1));
            this.isAnimationInProgress = true;
            duration.addListener(new ItemOptions.AnonymousClass3(this, 16));
            duration.start();
            this.foregroundAnimator = duration;
        }
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.onForegroundOpen = runnable;
    }

    public void setOnHeightUpdateListener(IntCallback intCallback) {
        this.onHeightUpdateListener = intCallback;
    }

    public void setStickToRight(boolean z) {
        this.stickToRight = z;
    }

    public void setSwipeBackDisallowed(boolean z) {
        this.isSwipeBackDisallowed = z;
    }
}
