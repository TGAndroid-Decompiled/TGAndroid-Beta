package org.telegram.ui.bots;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$21$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticApiModelOutline1;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda100;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda92;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;

public final class ChatAttachAlertBotWebViewLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ActionBarMenuSubItem addToHomeScreenItem;
    public long botId;
    public int currentAccount;
    public int customActionBarBackground;
    public int customBackground;
    public boolean destroyed;
    public boolean hasCustomActionBarBackground;
    public boolean hasCustomBackground;
    public boolean ignoreLayout;
    public boolean ignoreMeasure;
    public boolean isBotButtonAvailable;
    public int measureOffsetY;
    public long monoforumTopicId;
    public boolean needCloseConfirmation;
    public boolean needReload;
    public final ActionBarMenuItem otherItem;
    public long peerId;
    public final ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0 pollRunnable;
    public final WebProgressView progressView;
    public long queryId;
    public int replyToMsgId;
    public final ActionBarMenuSubItem settingsItem;
    public String startCommand;
    public final AnonymousClass2 swipeContainer;
    public final AnonymousClass1 webViewContainer;
    public ValueAnimator webViewScrollAnimator;

    public class WebProgressView extends View {
        public final SimpleFloatPropertyCompat LOAD_PROGRESS_PROPERTY;
        public final Paint bluePaint;
        public float loadProgress;
        public final Theme.ResourcesProvider resourcesProvider;
        public SpringAnimation springAnimation;

        public WebProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.LOAD_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("loadProgress", new BotWebViewSheet$$ExternalSyntheticLambda2(13), new BotWebViewSheet$$ExternalSyntheticLambda2(14)).setMultiplier(100.0f);
            Paint paint = new Paint(1);
            this.bluePaint = paint;
            this.resourcesProvider = resourcesProvider;
            paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
        }

        @Override
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.loadProgress > 0.0f) {
                float height = getHeight();
                Paint paint = this.bluePaint;
                float strokeWidth = height - (paint.getStrokeWidth() / 2.0f);
                canvas.drawLine(0.0f, strokeWidth, getWidth() * this.loadProgress, strokeWidth, paint);
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            SpringAnimation springAnimation = new SpringAnimation(this, this.LOAD_PROGRESS_PROPERTY);
            SpringForce springForce = new SpringForce();
            springForce.setStiffness(400.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation.mSpring = springForce;
            this.springAnimation = springAnimation;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.springAnimation.cancel();
            this.springAnimation = null;
        }

        public void setLoadProgress(float f) {
            this.loadProgress = f;
            invalidate();
        }

        public void setLoadProgressAnimated(float f) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation == null) {
                setLoadProgress(f);
                return;
            }
            springAnimation.mSpring.mFinalPosition = f * 100.0f;
            springAnimation.start();
        }
    }

    public abstract class WebViewSwipeContainer extends FrameLayout {
        public static final SimpleFloatPropertyCompat<WebViewSwipeContainer> SWIPE_OFFSET_Y = new SimpleFloatPropertyCompat<>("swipeOffsetY", new BotWebViewSheet$$ExternalSyntheticLambda2(15), new BotWebViewSheet$$ExternalSyntheticLambda2(16));
        private boolean allowFullSizeSwipe;
        private boolean allowSwipes;
        public boolean allowedScrollX;
        public boolean allowedScrollY;
        private Delegate delegate;
        private float drawnSwipeOffsetY;
        private boolean flingInProgress;
        private boolean fullsize;
        private final GestureDetectorCompat gestureDetector;
        private GenericProvider<Void, Boolean> isKeyboardVisible;
        public boolean isScrolling;
        private boolean isSwipeDisallowed;
        private boolean isSwipeOffsetAnimationDisallowed;
        private final float minscroll;
        public float offsetY;
        private SpringAnimation offsetYAnimator;
        public boolean opened;
        private float pendingOffsetY;
        private float pendingSwipeOffsetY;
        private long pressDownTime;
        private float pressDownX;
        private float pressDownY;
        private Object renderNode;
        private SpringAnimation scrollAnimator;
        private Runnable scrollEndListener;
        private Runnable scrollListener;
        private boolean scrolledOut;
        public boolean shouldWaitWebViewScroll;
        public boolean stickToEdges;
        private float swipeOffsetY;
        private int swipeStickyRange;
        private float sy;
        public float topActionBarOffsetY;
        private BotWebViewContainer.MyWebView webView;

        public interface Delegate {
            void onDismiss(boolean z);
        }

        public WebViewSwipeContainer(Context context) {
            super(context);
            this.topActionBarOffsetY = ActionBar.getCurrentActionBarHeight();
            this.offsetY = 0.0f;
            this.pendingOffsetY = -1.0f;
            this.pendingSwipeOffsetY = -2.1474836E9f;
            this.isKeyboardVisible = new BotWebViewSheet$$ExternalSyntheticLambda2(17);
            this.allowSwipes = true;
            this.sy = 0.0f;
            this.scrolledOut = false;
            this.minscroll = AndroidUtilities.dp(60.0f);
            this.stickToEdges = true;
            final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    WebViewSwipeContainer webViewSwipeContainer = WebViewSwipeContainer.this;
                    if (!webViewSwipeContainer.isSwipeDisallowed && webViewSwipeContainer.allowSwipes && ((!webViewSwipeContainer.fullsize || webViewSwipeContainer.allowFullSizeSwipe) && (!webViewSwipeContainer.shouldWaitWebViewScroll || webViewSwipeContainer.allowingScroll(false)))) {
                        float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                        float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                        if (f2 >= AndroidUtilities.dp(650.0f) && ((fDistance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && (webViewSwipeContainer.webView == null || webViewSwipeContainer.webView.getScrollY() == 0))) {
                            webViewSwipeContainer.flingInProgress = true;
                            if (webViewSwipeContainer.swipeOffsetY < webViewSwipeContainer.swipeStickyRange && !webViewSwipeContainer.fullsize) {
                                webViewSwipeContainer.stickTo(0.0f);
                                return true;
                            }
                            if (webViewSwipeContainer.fullsize && webViewSwipeContainer.allowFullSizeSwipe && (webViewSwipeContainer.drawnSwipeOffsetY == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || (webViewSwipeContainer.swipeOffsetY <= (-webViewSwipeContainer.swipeStickyRange) && f2 < AndroidUtilities.dp(1200.0f)))) {
                                webViewSwipeContainer.stickTo((-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                                return true;
                            }
                            if (webViewSwipeContainer.delegate != null) {
                                webViewSwipeContainer.delegate.onDismiss(false);
                            }
                            return true;
                        }
                        if (f2 <= -700.0f && webViewSwipeContainer.swipeOffsetY > (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                            webViewSwipeContainer.flingInProgress = true;
                            webViewSwipeContainer.stickTo((-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    WebViewSwipeContainer webViewSwipeContainer = WebViewSwipeContainer.this;
                    float fAccess$1500 = WebViewSwipeContainer.access$1500(webViewSwipeContainer, f2);
                    if (!webViewSwipeContainer.isScrolling && !webViewSwipeContainer.isSwipeDisallowed && webViewSwipeContainer.allowSwipes) {
                        if (!webViewSwipeContainer.shouldWaitWebViewScroll || webViewSwipeContainer.swipeOffsetY != (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || webViewSwipeContainer.allowingScroll(false)) {
                            if (((Boolean) webViewSwipeContainer.isKeyboardVisible.provide(null)).booleanValue() && webViewSwipeContainer.swipeOffsetY == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                webViewSwipeContainer.isSwipeDisallowed = true;
                            } else {
                                float fAbs = Math.abs(fAccess$1500);
                                float f3 = scaledTouchSlop;
                                if (fAbs >= f3 && Math.abs(fAccess$1500) * 1.5f >= Math.abs(f) && (webViewSwipeContainer.swipeOffsetY != (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || webViewSwipeContainer.webView == null || (fAccess$1500 < 0.0f && webViewSwipeContainer.webView.getScrollY() == 0))) {
                                    webViewSwipeContainer.isScrolling = true;
                                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                    for (int i = 0; i < webViewSwipeContainer.getChildCount(); i++) {
                                        webViewSwipeContainer.getChildAt(i).dispatchTouchEvent(motionEventObtain);
                                    }
                                    motionEventObtain.recycle();
                                    return true;
                                }
                                if (webViewSwipeContainer.webView != null) {
                                    if (webViewSwipeContainer.webView.canScrollHorizontally(f >= 0.0f ? 1 : -1)) {
                                        webViewSwipeContainer.isSwipeDisallowed = true;
                                    } else if (Math.abs(f) >= f3 && Math.abs(f) * 1.5f >= Math.abs(fAccess$1500)) {
                                        webViewSwipeContainer.isSwipeDisallowed = true;
                                    }
                                } else if (Math.abs(f) >= f3) {
                                    webViewSwipeContainer.isSwipeDisallowed = true;
                                }
                            }
                        }
                    }
                    if (webViewSwipeContainer.isScrolling) {
                        if (fAccess$1500 < 0.0f) {
                            if (webViewSwipeContainer.swipeOffsetY <= (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY && webViewSwipeContainer.webView != null) {
                                float scrollY = webViewSwipeContainer.webView.getScrollY() + fAccess$1500;
                                webViewSwipeContainer.webView.setScrollY((int) MathUtils.clamp(scrollY, 0.0f, Math.max(webViewSwipeContainer.webView.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                                if (scrollY < 0.0f) {
                                    WebViewSwipeContainer.access$1124(webViewSwipeContainer, scrollY);
                                }
                            } else {
                                WebViewSwipeContainer.access$1124(webViewSwipeContainer, fAccess$1500);
                            }
                        } else if (fAccess$1500 > 0.0f) {
                            WebViewSwipeContainer.access$1124(webViewSwipeContainer, fAccess$1500);
                            if (webViewSwipeContainer.webView != null && webViewSwipeContainer.swipeOffsetY < (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                webViewSwipeContainer.webView.setScrollY((int) MathUtils.clamp(webViewSwipeContainer.webView.getScrollY() - ((webViewSwipeContainer.swipeOffsetY + webViewSwipeContainer.offsetY) - webViewSwipeContainer.topActionBarOffsetY), 0.0f, Math.max(webViewSwipeContainer.webView.getContentHeight(), webViewSwipeContainer.webView.getHeight()) - webViewSwipeContainer.topActionBarOffsetY));
                            }
                        }
                        webViewSwipeContainer.swipeOffsetY = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                        if (webViewSwipeContainer.fullsize && !webViewSwipeContainer.allowFullSizeSwipe) {
                            webViewSwipeContainer.swipeOffsetY = Math.min(webViewSwipeContainer.swipeOffsetY, (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                        }
                        webViewSwipeContainer.invalidateTranslation();
                    }
                    return true;
                }
            });
            Point point = AndroidUtilities.displaySize;
            this.swipeStickyRange = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
        }

        public static float access$1124(WebViewSwipeContainer webViewSwipeContainer, float f) {
            float f2 = webViewSwipeContainer.swipeOffsetY - f;
            webViewSwipeContainer.swipeOffsetY = f2;
            return f2;
        }

        public static float access$1500(WebViewSwipeContainer webViewSwipeContainer, float f) {
            if (webViewSwipeContainer.scrolledOut) {
                return f;
            }
            float f2 = webViewSwipeContainer.sy + f;
            webViewSwipeContainer.sy = f2;
            float fAbs = Math.abs(f2);
            float f3 = webViewSwipeContainer.minscroll;
            if (fAbs <= f3) {
                return 0.0f;
            }
            webViewSwipeContainer.scrolledOut = true;
            float f4 = webViewSwipeContainer.sy;
            return f4 > 0.0f ? f4 - f3 : f4 + f3;
        }

        public void allowThisScroll(boolean z, boolean z2) {
            this.allowedScrollX = z;
            this.allowedScrollY = z2;
        }

        public boolean allowingScroll(boolean z) {
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView == null || !myWebView.injectedJS) {
                return true;
            }
            if (z) {
                return this.allowedScrollX;
            }
            return this.allowedScrollY;
        }

        public void cancelStickTo() {
            SpringAnimation springAnimation = this.offsetYAnimator;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = this.scrollAnimator;
            if (springAnimation2 != null) {
                springAnimation2.cancel();
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Canvas canvasBeginRecording;
            if (!canvas.isHardwareAccelerated()) {
                super.dispatchDraw(canvas);
                return;
            }
            Object obj = this.renderNode;
            if (obj != null) {
                RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj);
                renderNodeM.setPosition(0, 0, getWidth(), getHeight());
                canvasBeginRecording = renderNodeM.beginRecording();
            } else {
                canvasBeginRecording = canvas;
            }
            super.dispatchDraw(canvasBeginRecording);
            Object obj2 = this.renderNode;
            if (obj2 != null) {
                RenderNode renderNodeM2 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj2);
                renderNodeM2.endRecording();
                canvas.drawRenderNode(renderNodeM2);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!this.isScrolling || motionEvent.getActionIndex() == 0) {
                if (motionEvent.getAction() == 0) {
                    this.pressDownTime = motionEvent.getEventTime();
                    this.pressDownX = motionEvent.getX();
                    this.pressDownY = motionEvent.getY();
                    this.scrolledOut = false;
                    this.sy = 0.0f;
                    if (this.shouldWaitWebViewScroll) {
                        this.allowedScrollX = false;
                        this.allowedScrollY = false;
                    }
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int actionIndex = motionEvent.getActionIndex();
                if (Build.VERSION.SDK_INT >= 29) {
                    motionEventObtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
                } else {
                    motionEventObtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
                }
                boolean zOnTouchEvent = this.gestureDetector.mDetector.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    boolean z = this.isScrolling;
                    this.isSwipeDisallowed = false;
                    this.isScrolling = false;
                    if (!this.fullsize || this.allowFullSizeSwipe) {
                        if (this.flingInProgress) {
                            this.flingInProgress = false;
                        } else if (this.allowSwipes && (!this.shouldWaitWebViewScroll || (this.swipeOffsetY != (-this.offsetY) + this.topActionBarOffsetY && allowingScroll(false)))) {
                            float f = this.swipeOffsetY;
                            int i = this.swipeStickyRange;
                            float f2 = -i;
                            if (f <= f2) {
                                if (this.stickToEdges) {
                                    stickTo((-this.offsetY) + this.topActionBarOffsetY);
                                }
                            } else if (f <= f2 || f > i) {
                                float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.pressDownX, this.pressDownY);
                                long eventTime = motionEvent.getEventTime() - this.pressDownTime;
                                if (this.delegate != null && (eventTime > 250 || fDistance > AndroidUtilities.dp(200.0f))) {
                                    this.delegate.onDismiss(!z);
                                } else if (this.stickToEdges) {
                                    stickTo((-this.offsetY) + this.topActionBarOffsetY);
                                }
                            } else if (this.stickToEdges) {
                                stickTo(0.0f);
                            }
                        }
                    }
                }
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if ((!zDispatchTouchEvent && !zOnTouchEvent && motionEvent.getAction() == 0) || zDispatchTouchEvent || zOnTouchEvent) {
                    return true;
                }
            }
            return false;
        }

        public float getOffsetY() {
            return this.offsetY;
        }

        public Object getRenderNode() {
            if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
                this.renderNode = PhotoViewer$$ExternalSyntheticApiModelOutline1.m$5();
            }
            return this.renderNode;
        }

        public float getSwipeOffsetY() {
            return this.swipeOffsetY;
        }

        public float getTopActionBarOffsetY() {
            return this.topActionBarOffsetY;
        }

        public void invalidateTranslation() {
            setTranslationY(Math.max(this.topActionBarOffsetY, this.offsetY + this.swipeOffsetY));
            int i = 25;
            AndroidUtilities.cancelRunOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, i));
            AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, i));
            Runnable runnable = this.scrollListener;
            if (runnable != null) {
                runnable.run();
            }
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().updatePosition();
            }
        }

        public boolean isAllowedSwipes() {
            return this.allowSwipes;
        }

        public boolean isFullSize() {
            return this.fullsize;
        }

        public boolean isSwipeInProgress() {
            return this.isScrolling;
        }

        public final void lambda$setOffsetY$1(float f, float f2, boolean z, float f3, DynamicAnimation dynamicAnimation, float f4, float f5) {
            this.offsetY = f4;
            float f6 = f == 0.0f ? 1.0f : (f4 - f2) / f;
            if (z) {
                this.swipeOffsetY = MathUtils.clamp(this.swipeOffsetY - (Math.max(0.0f, f) * f6), (-this.offsetY) + this.topActionBarOffsetY, (getHeight() - this.offsetY) + this.topActionBarOffsetY);
            }
            SpringAnimation springAnimation = this.scrollAnimator;
            if (springAnimation != null) {
                SpringForce springForce = springAnimation.mSpring;
                float f7 = (float) springForce.mFinalPosition;
                float f8 = this.topActionBarOffsetY;
                if (f7 == (-f2) + f8) {
                    springForce.mFinalPosition = (-f3) + f8;
                }
            }
            invalidateTranslation();
        }

        public final void lambda$setOffsetY$2(float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
            this.offsetYAnimator = null;
            if (z) {
                this.pendingOffsetY = f;
            } else {
                this.offsetY = f;
                invalidateTranslation();
            }
        }

        public final void lambda$stickTo$3(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == this.scrollAnimator) {
                this.scrollAnimator = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.scrollEndListener;
                if (runnable2 != null) {
                    runnable2.run();
                }
                float f3 = this.pendingOffsetY;
                if (f3 != -1.0f) {
                    boolean z2 = this.isSwipeOffsetAnimationDisallowed;
                    this.isSwipeOffsetAnimationDisallowed = true;
                    setOffsetY(f3);
                    this.pendingOffsetY = -1.0f;
                    this.isSwipeOffsetAnimationDisallowed = z2;
                }
                this.pendingSwipeOffsetY = -2.1474836E9f;
            }
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            Point point = AndroidUtilities.displaySize;
            this.swipeStickyRange = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            if (z) {
                this.isSwipeDisallowed = true;
                this.isScrolling = false;
            }
        }

        public void setAllowFullSizeSwipe(boolean z) {
            this.allowFullSizeSwipe = z;
        }

        public void setAllowSwipes(boolean z) {
            if (this.allowSwipes != z) {
                this.allowSwipes = z;
            }
        }

        public void setDelegate(Delegate delegate) {
            this.delegate = delegate;
        }

        public void setForceOffsetY(float f) {
            this.offsetY = f;
            invalidateTranslation();
        }

        public void setFullSize(boolean z) {
            if (this.fullsize != z) {
                this.fullsize = z;
                if (!z) {
                    stickTo(0.0f);
                } else if (this.opened) {
                    stickTo(getTopActionBarOffsetY() + (-getOffsetY()));
                }
            }
        }

        public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
            this.isKeyboardVisible = genericProvider;
        }

        public void setOffsetY(final float f) {
            if (this.pendingSwipeOffsetY != -2.1474836E9f) {
                this.pendingOffsetY = f;
                return;
            }
            SpringAnimation springAnimation = this.offsetYAnimator;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            final float f2 = this.offsetY;
            final float f3 = f - f2;
            final boolean z = Math.abs((this.swipeOffsetY + f2) - this.topActionBarOffsetY) <= ((float) AndroidUtilities.dp(1.0f));
            if (this.isSwipeOffsetAnimationDisallowed) {
                this.offsetY = f;
                if (z) {
                    this.swipeOffsetY = MathUtils.clamp(this.swipeOffsetY - Math.max(0.0f, f3), (-this.offsetY) + this.topActionBarOffsetY, (getHeight() - this.offsetY) + this.topActionBarOffsetY);
                }
                invalidateTranslation();
                return;
            }
            SpringAnimation springAnimation2 = this.offsetYAnimator;
            if (springAnimation2 != null) {
                springAnimation2.cancel();
            }
            SpringAnimation springAnimationM = ChatActivity$21$$ExternalSyntheticOutline0.m(f, 1400.0f, 1.0f, new SpringAnimation(new FloatValueHolder(f2)));
            springAnimationM.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f4, float f5) {
                    this.f$0.lambda$setOffsetY$1(f3, f2, z, f, dynamicAnimation, f4, f5);
                }
            });
            springAnimationM.addEndListener(new StoryRecorder$$ExternalSyntheticLambda92(this, f, 1));
            this.offsetYAnimator = springAnimationM;
            springAnimationM.start();
        }

        public void setScrollEndListener(Runnable runnable) {
            this.scrollEndListener = runnable;
        }

        public void setScrollListener(Runnable runnable) {
            this.scrollListener = runnable;
        }

        public void setShouldWaitWebViewScroll(boolean z) {
            this.shouldWaitWebViewScroll = z;
        }

        public void setSwipeOffsetAnimationDisallowed(boolean z) {
            this.isSwipeOffsetAnimationDisallowed = z;
        }

        public void setSwipeOffsetY(float f) {
            this.swipeOffsetY = f;
            invalidateTranslation();
        }

        public void setTopActionBarOffsetY(float f) {
            this.topActionBarOffsetY = f;
            invalidateTranslation();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
        }

        public void setWebView(BotWebViewContainer.MyWebView myWebView) {
            this.webView = myWebView;
        }

        public void stickTo(float f) {
            stickTo(f, null);
        }

        public final void updateDrawn() {
            this.drawnSwipeOffsetY = this.swipeOffsetY;
        }

        public void stickTo(float f, Runnable runnable) {
            stickTo(f, false, runnable);
        }

        public void stickTo(float f, boolean z, final Runnable runnable) {
            SpringAnimation springAnimation;
            if (this.fullsize && !z) {
                f = (-getOffsetY()) + getTopActionBarOffsetY();
            }
            if (this.swipeOffsetY != f && ((springAnimation = this.scrollAnimator) == null || ((float) springAnimation.mSpring.mFinalPosition) != f)) {
                this.pendingSwipeOffsetY = f;
                SpringAnimation springAnimation2 = this.offsetYAnimator;
                if (springAnimation2 != null) {
                    springAnimation2.cancel();
                }
                SpringAnimation springAnimation3 = this.scrollAnimator;
                if (springAnimation3 != null) {
                    springAnimation3.cancel();
                }
                SpringAnimation springAnimationM = ChatActivity$21$$ExternalSyntheticOutline0.m(f, 1200.0f, 1.0f, new SpringAnimation(this, SWIPE_OFFSET_Y, f));
                springAnimationM.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                        this.f$0.lambda$stickTo$3(runnable, dynamicAnimation, z2, f2, f3);
                    }
                });
                this.scrollAnimator = springAnimationM;
                springAnimationM.start();
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.scrollEndListener;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    public ChatAttachAlertBotWebViewLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.pollRunnable = new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 2);
        ActionBarMenuItem actionBarMenuItemAddItem = this.parentAlert.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.addSubItem(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = actionBarMenuItemAddItem.addSubItem(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
        this.settingsItem = actionBarMenuSubItemAddSubItem;
        actionBarMenuSubItemAddSubItem.setVisibility(8);
        actionBarMenuItemAddItem.addSubItem(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = actionBarMenuItemAddItem.addSubItem(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
        this.addToHomeScreenItem = actionBarMenuSubItemAddSubItem2;
        actionBarMenuSubItemAddSubItem2.setVisibility(8);
        actionBarMenuItemAddItem.addSubItem(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
        actionBarMenuItemAddItem.addSubItem(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
        actionBarMenuItemAddItem.addSubItem(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
        ?? r9 = new BotWebViewContainer(context, resourcesProvider, getThemedColor(Theme.key_dialogBackground)) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = ChatAttachAlertBotWebViewLayout.this;
                    if (!chatAttachAlertBotWebViewLayout.isBotButtonAvailable) {
                        chatAttachAlertBotWebViewLayout.isBotButtonAvailable = true;
                        chatAttachAlertBotWebViewLayout.webViewContainer.restoreButtonData();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                setWebView(myWebView);
            }
        };
        this.webViewContainer = r9;
        ?? r0 = new WebViewSwipeContainer(context) {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ChatAttachAlertBotWebViewLayout.this.measureOffsetY, 1073741824));
            }
        };
        this.swipeContainer = r0;
        r0.addView(r9, LayoutHelper.createFrame(-1, -1.0f));
        r0.setScrollListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 3));
        r0.setScrollEndListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 4));
        r0.setDelegate(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda2(this));
        r0.setIsKeyboardVisible(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda2(this));
        addView((View) r0, LayoutHelper.createFrame(-1, -1.0f));
        WebProgressView webProgressView = new WebProgressView(context, resourcesProvider);
        this.progressView = webProgressView;
        addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
        r9.setWebViewProgressListener(new SendGiftSheet$$ExternalSyntheticLambda12(this, 5));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.webViewResultSent;
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (i != i3) {
            if (i == NotificationCenter.didSetNewTheme) {
                anonymousClass1.updateFlickerBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            }
        } else {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                anonymousClass1.destroyWebView();
                this.needReload = true;
                this.parentAlert.lambda$showGiftOfferSheet$15();
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        AnonymousClass2 anonymousClass2 = this.swipeContainer;
        return (int) (anonymousClass2.getOffsetY() + anonymousClass2.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.customActionBarBackground;
    }

    @Override
    public int getCustomBackground() {
        return this.customBackground;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) getOffsetY();
    }

    public String getStartCommand() {
        return this.startCommand;
    }

    public BotWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override
    public final boolean hasCustomActionBarBackground() {
        return this.hasCustomActionBarBackground;
    }

    @Override
    public final boolean hasCustomBackground() {
        return this.hasCustomBackground;
    }

    public final void lambda$new$0(TLRPC.TL_error tL_error) {
        if (this.destroyed) {
            return;
        }
        if (tL_error != null) {
            this.parentAlert.lambda$showGiftOfferSheet$15();
        } else {
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    public final void lambda$new$3$2$2() {
        this.parentAlert.updateLayout(this, true, 0);
        invalidateViewPortHeight();
        System.currentTimeMillis();
    }

    public final Boolean lambda$new$6() {
        return Boolean.valueOf(this.parentAlert.sizeNotifierFrameLayout.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }

    public final void lambda$onCheckDismissByUser$9() {
        this.parentAlert.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$showJustAddedBulletin$14(String str) {
        BulletinFactory.of(this.parentAlert.getContainer(), this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(str)).setDuration(5000).show(true);
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final boolean onBackPressed() {
        if (onBackPressed()) {
            return true;
        }
        onCheckDismissByUser();
        return true;
    }

    public final boolean onCheckDismissByUser() {
        if (!this.needCloseConfirmation) {
            this.parentAlert.lambda$showGiftOfferSheet$15();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), 0, null).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda2(this)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        alertDialogCreate.show();
        ((TextView) alertDialogCreate.getButton(-1)).setTextColor(getThemedColor(Theme.key_text_RedBold));
        return false;
    }

    @Override
    public final void onDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        actionBarMenuItem.removeAllSubItems();
        actionBarMenuCreateMenu.removeView(actionBarMenuItem);
        destroyWebView();
        this.destroyed = true;
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
    }

    @Override
    public final boolean onDismissWithTouchOutside() {
        onCheckDismissByUser();
        return false;
    }

    @Override
    public final void onHidden() {
        super.onHidden();
        this.parentAlert.setFocusable(false);
        this.parentAlert.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void onHide() {
        super.onHide();
        this.otherItem.setVisibility(8);
        this.isBotButtonAvailable = false;
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (!anonymousClass1.isBackButtonVisible()) {
            AndroidUtilities.updateImageViewImageAnimated(this.parentAlert.actionBar.getBackButton(), R.drawable.ic_ab_back);
        }
        this.parentAlert.actionBar.setBackground(null);
        if (anonymousClass1.hasUserPermissions()) {
            anonymousClass1.destroyWebView();
            this.needReload = true;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.ignoreMeasure) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public final void onMenuItemClick(int i) {
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (i == -1) {
            if (anonymousClass1.onBackPressed()) {
                return;
            }
            onCheckDismissByUser();
            return;
        }
        if (i == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.botId);
            this.parentAlert.baseFragment.presentFragment(new ChatActivity(bundle));
            this.parentAlert.lambda$showGiftOfferSheet$15();
            return;
        }
        int i2 = 0;
        if (i == R.id.menu_reload_page) {
            if (anonymousClass1.getWebView() != null) {
                anonymousClass1.getWebView().animate().cancel();
                anonymousClass1.getWebView().animate().alpha(0.0f).start();
            }
            WebProgressView webProgressView = this.progressView;
            webProgressView.setLoadProgress(0.0f);
            webProgressView.setAlpha(1.0f);
            webProgressView.setVisibility(0);
            anonymousClass1.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
            anonymousClass1.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
            anonymousClass1.reload();
            return;
        }
        if (i == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.botId) {
                    this.parentAlert.onLongClickBotButton(tL_attachMenuBot2, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
                    return;
                }
            }
            return;
        }
        if (i == R.id.menu_settings) {
            anonymousClass1.onSettingsButtonPressed();
            return;
        }
        if (i == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.currentAccount).installShortcut(this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i == R.id.menu_tos_bot) {
            Browser.openUrl(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i == R.id.menu_report_bot) {
            ReportBottomSheet.openChat(this.currentAccount, getContext(), BulletinFactory.of(Bulletin.BulletinWindow.make(getContext()), this.resourcesProvider), this.botId);
        }
    }

    @Override
    public final void onPanTransitionEnd() {
        this.ignoreMeasure = false;
        setSwipeOffsetAnimationDisallowed(false);
        setViewPortByMeasureSuppressed(false);
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void onPanTransitionStart(boolean z, int i) {
        boolean z2;
        if (z) {
            AnonymousClass1 anonymousClass1 = this.webViewContainer;
            anonymousClass1.setViewPortByMeasureSuppressed(true);
            AnonymousClass2 anonymousClass2 = this.swipeContainer;
            float topActionBarOffsetY = anonymousClass2.getTopActionBarOffsetY() + (-anonymousClass2.getOffsetY());
            if (anonymousClass2.getSwipeOffsetY() != topActionBarOffsetY) {
                anonymousClass2.stickTo(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int iMeasureKeyboardHeight = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.ignoreMeasure = true;
            anonymousClass2.setSwipeOffsetAnimationDisallowed(true);
            if (z2) {
                return;
            }
            ValueAnimator valueAnimator = this.webViewScrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.webViewScrollAnimator = null;
            }
            if (anonymousClass1.getWebView() != null) {
                int scrollY = anonymousClass1.getWebView().getScrollY();
                int i2 = (iMeasureKeyboardHeight - i) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                this.webViewScrollAnimator = duration;
                duration.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                this.webViewScrollAnimator.addUpdateListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(this, 0));
                this.webViewScrollAnimator.addListener(new RichMediaCell.AnonymousClass3(this, i2, 3));
                this.webViewScrollAnimator.start();
            }
        }
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int i3;
        if (AndroidUtilities.isTablet()) {
            i3 = (i2 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
            } else {
                i3 = (i2 / 5) * 2;
            }
        }
        this.parentAlert.setAllowNestedScroll(true);
        if (i3 < 0) {
            i3 = 0;
        }
        AnonymousClass2 anonymousClass2 = this.swipeContainer;
        float f = i3;
        if (anonymousClass2.getOffsetY() != f) {
            this.ignoreLayout = true;
            anonymousClass2.setOffsetY(f);
            this.ignoreLayout = false;
        }
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.parentAlert.actionBar.setTitle(userName);
        setSwipeOffsetY(0.0f);
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (anonymousClass1.getWebView() != null) {
            anonymousClass1.getWebView().scrollTo(0, 0);
        }
        if (this.parentAlert.getBaseFragment() != null) {
            anonymousClass1.setParentActivity(this.parentAlert.getBaseFragment().getParentActivity());
        }
        this.otherItem.setVisibility(0);
        if (anonymousClass1.isBackButtonVisible()) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this.parentAlert.actionBar.getBackButton(), R.drawable.ic_close_white);
    }

    @Override
    public final void onShown() {
        if (isPageLoaded()) {
            requestEnableKeyboard();
        }
        setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 0));
    }

    public final void requestEnableKeyboard() {
        BaseFragment baseFragment = this.parentAlert.getBaseFragment();
        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).contentView.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(this.parentAlert.baseFragment.getFragmentView());
            AndroidUtilities.runOnUIThread(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 1), 250L);
        } else {
            this.parentAlert.getWindow().setSoftInputMode(20);
            setFocusable(true);
            this.parentAlert.setFocusable(true);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void requestWebView(int i, long j, long j2, int i2, String str, long j3) {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        this.currentAccount = i;
        this.peerId = j;
        this.botId = j2;
        this.replyToMsgId = i2;
        this.monoforumTopicId = j3;
        this.startCommand = str;
        ActionBarMenuSubItem actionBarMenuSubItem = this.addToHomeScreenItem;
        if (actionBarMenuSubItem != null) {
            if (MediaDataController.getInstance(i).canCreateAttachedMenuBotShortcut(j2)) {
                actionBarMenuSubItem.setVisibility(0);
            } else {
                actionBarMenuSubItem.setVisibility(8);
            }
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j2));
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        anonymousClass1.setBotUser(user);
        anonymousClass1.loadFlickerAndSettingsItem(i, j2, this.settingsItem);
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView.peer = MessagesController.getInstance(i).getInputPeer(j);
        tL_messages_requestWebView.bot = MessagesController.getInstance(i).getInputUser(j2);
        tL_messages_requestWebView.silent = false;
        tL_messages_requestWebView.platform = "android";
        if (j < 0 && (chatFull = MessagesController.getInstance(i).getChatFull(-j)) != null && (peer = chatFull.default_send_as) != null) {
            tL_messages_requestWebView.send_as = MessagesController.getInstance(i).getInputPeer(peer);
            tL_messages_requestWebView.flags |= 8192;
        }
        if (str != null) {
            tL_messages_requestWebView.start_param = str;
            tL_messages_requestWebView.flags |= 8;
        }
        if (i2 != 0) {
            TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(i).createReplyInput(i2);
            tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
            if (j3 != 0) {
                inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(i).getInputPeer(j3);
                tL_messages_requestWebView.reply_to.flags |= 32;
            }
            tL_messages_requestWebView.flags |= 1;
        } else if (j3 != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i).getInputPeer(j3);
            tL_messages_requestWebView.flags |= 1;
        }
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_messages_requestWebView.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_messages_requestWebView.flags |= 4;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_requestWebView, new StarGiftSheet$$ExternalSyntheticLambda100(this, i, 5));
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void scrollToTop() {
        AnonymousClass2 anonymousClass2 = this.swipeContainer;
        anonymousClass2.stickTo(anonymousClass2.getTopActionBarOffsetY() + (-anonymousClass2.getOffsetY()));
    }

    public void setAllowSwipes(boolean z) {
        setAllowSwipes(z);
    }

    public void setCustomActionBarBackground(int i) {
        this.hasCustomActionBarBackground = true;
        this.customActionBarBackground = i;
    }

    public void setCustomBackground(int i) {
        this.customBackground = i;
        this.hasCustomBackground = true;
    }

    public void setDelegate(BotWebViewContainer.Delegate delegate) {
        setDelegate(delegate);
    }

    public void setMeasureOffsetY(int i) {
        this.measureOffsetY = i;
        requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z) {
        this.needCloseConfirmation = z;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override
    public final boolean shouldHideBottomButtons() {
        return false;
    }
}
