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
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.android.billingclient.api.zzcv;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import java.util.ArrayList;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.PipVideoOverlay$4$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda25;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

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
        public SpringAnimation springAnimation;

        public WebProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            SimpleFloatPropertyCompat simpleFloatPropertyCompat = new SimpleFloatPropertyCompat(new TopicsFragment$$ExternalSyntheticLambda25(5), new TopicsFragment$$ExternalSyntheticLambda25(6));
            simpleFloatPropertyCompat.multiplier = 100.0f;
            this.LOAD_PROGRESS_PROPERTY = simpleFloatPropertyCompat;
            Paint paint = new Paint(1);
            this.bluePaint = paint;
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
        public static final SimpleFloatPropertyCompat SWIPE_OFFSET_Y = new SimpleFloatPropertyCompat(new TopicsFragment$$ExternalSyntheticLambda25(7), new TopicsFragment$$ExternalSyntheticLambda25(8));
        public boolean allowFullSizeSwipe;
        public boolean allowSwipes;
        public boolean allowedScrollX;
        public boolean allowedScrollY;
        public Delegate delegate;
        public float drawnSwipeOffsetY;
        public boolean flingInProgress;
        public boolean fullsize;
        public final zzcv gestureDetector;
        public GenericProvider isKeyboardVisible;
        public boolean isScrolling;
        public boolean isSwipeDisallowed;
        public boolean isSwipeOffsetAnimationDisallowed;
        public final float minscroll;
        public float offsetY;
        public SpringAnimation offsetYAnimator;
        public boolean opened;
        public float pendingOffsetY;
        public float pendingSwipeOffsetY;
        public long pressDownTime;
        public float pressDownX;
        public float pressDownY;
        public Object renderNode;
        public SpringAnimation scrollAnimator;
        public Runnable scrollEndListener;
        public Runnable scrollListener;
        public boolean scrolledOut;
        public boolean shouldWaitWebViewScroll;
        public final boolean stickToEdges;
        public float swipeOffsetY;
        public int swipeStickyRange;
        public float sy;
        public float topActionBarOffsetY;
        public BotWebViewContainer.MyWebView webView;

        public interface Delegate {
            void onDismiss(boolean z);
        }

        public WebViewSwipeContainer(Context context) {
            super(context);
            this.topActionBarOffsetY = ActionBar.getCurrentActionBarHeight();
            this.offsetY = 0.0f;
            this.pendingOffsetY = -1.0f;
            this.pendingSwipeOffsetY = -2.1474836E9f;
            this.isKeyboardVisible = new TopicsFragment$$ExternalSyntheticLambda25(9);
            this.allowSwipes = true;
            this.sy = 0.0f;
            this.scrolledOut = false;
            this.minscroll = AndroidUtilities.dp(60.0f);
            this.stickToEdges = true;
            this.gestureDetector = new zzcv(context, new PopupSwipeBackLayout.AnonymousClass1(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            Point point = AndroidUtilities.displaySize;
            this.swipeStickyRange = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
        }

        public final void allowThisScroll(boolean z, boolean z2) {
            this.allowedScrollX = z;
            this.allowedScrollY = z2;
        }

        public final boolean allowingScroll(boolean z) {
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView == null || !myWebView.injectedJS) {
                return true;
            }
            if (z) {
                return this.allowedScrollX;
            }
            return this.allowedScrollY;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
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
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
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
                boolean zOnTouchEvent = ((GestureDetector) this.gestureDetector.zza).onTouchEvent(motionEventObtain);
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
                            boolean z2 = this.stickToEdges;
                            if (f <= f2) {
                                if (z2) {
                                    stickTo((-this.offsetY) + this.topActionBarOffsetY, false, null);
                                }
                            } else if (f <= f2 || f > i) {
                                float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.pressDownX, this.pressDownY);
                                long eventTime = motionEvent.getEventTime() - this.pressDownTime;
                                if (this.delegate != null && (eventTime > 250 || fDistance > AndroidUtilities.dp(200.0f))) {
                                    this.delegate.onDismiss(!z);
                                } else if (z2) {
                                    stickTo((-this.offsetY) + this.topActionBarOffsetY, false, null);
                                }
                            } else if (z2) {
                                stickTo(0.0f, false, null);
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
                this.renderNode = PhotoViewer$$ExternalSyntheticApiModelOutline3.m$6();
            }
            return this.renderNode;
        }

        public float getSwipeOffsetY() {
            return this.swipeOffsetY;
        }

        public float getTopActionBarOffsetY() {
            return this.topActionBarOffsetY;
        }

        public final void invalidateTranslation() {
            Bulletin.Layout layout;
            setTranslationY(Math.max(this.topActionBarOffsetY, this.offsetY + this.swipeOffsetY));
            int i = 13;
            AndroidUtilities.cancelRunOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, i));
            AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, i));
            Runnable runnable = this.scrollListener;
            if (runnable != null) {
                runnable.run();
            }
            Bulletin bulletin = Bulletin.visibleBulletin;
            if (bulletin == null || (layout = bulletin.layout) == null) {
                return;
            }
            layout.updatePosition();
        }

        public final boolean isSwipeInProgress() {
            return this.isScrolling;
        }

        @Override
        public final void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            Point point = AndroidUtilities.displaySize;
            this.swipeStickyRange = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
        }

        @Override
        public final void requestDisallowInterceptTouchEvent(boolean z) {
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
                    stickTo(0.0f, false, null);
                } else if (this.opened) {
                    stickTo(getTopActionBarOffsetY() + (-getOffsetY()), false, null);
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
            SpringAnimation springAnimation3 = new SpringAnimation(new FloatValueHolder(f2));
            zzlt.m(f, 1400.0f, 1.0f, springAnimation3);
            springAnimation3.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f4, float f5) {
                    ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.f$0;
                    webViewSwipeContainer.offsetY = f4;
                    float f6 = f3;
                    float f7 = f2;
                    float f8 = f6 == 0.0f ? 1.0f : (f4 - f7) / f6;
                    if (z) {
                        webViewSwipeContainer.swipeOffsetY = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY - (Math.max(0.0f, f6) * f8), (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                    }
                    SpringAnimation springAnimation4 = webViewSwipeContainer.scrollAnimator;
                    if (springAnimation4 != null) {
                        SpringForce springForce = springAnimation4.mSpring;
                        float f9 = (float) springForce.mFinalPosition;
                        float f10 = webViewSwipeContainer.topActionBarOffsetY;
                        if (f9 == (-f7) + f10) {
                            springForce.mFinalPosition = (-f) + f10;
                        }
                    }
                    webViewSwipeContainer.invalidateTranslation();
                }
            });
            springAnimation3.addEndListener(new PipVideoOverlay$4$$ExternalSyntheticLambda0(this, f, 2));
            this.offsetYAnimator = springAnimation3;
            springAnimation3.start();
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

        public final void stickTo(float f, boolean z, Runnable runnable) {
            SpringAnimation springAnimation;
            if (this.fullsize && !z) {
                f = (-getOffsetY()) + getTopActionBarOffsetY();
            }
            if (this.swipeOffsetY == f || ((springAnimation = this.scrollAnimator) != null && ((float) springAnimation.mSpring.mFinalPosition) == f)) {
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.scrollEndListener;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            this.pendingSwipeOffsetY = f;
            SpringAnimation springAnimation2 = this.offsetYAnimator;
            if (springAnimation2 != null) {
                springAnimation2.cancel();
            }
            SpringAnimation springAnimation3 = this.scrollAnimator;
            if (springAnimation3 != null) {
                springAnimation3.cancel();
            }
            SpringAnimation springAnimation4 = new SpringAnimation(this, SWIPE_OFFSET_Y, f);
            zzlt.m(f, 1200.0f, 1.0f, springAnimation4);
            springAnimation4.addEndListener(new PasscodeView$$ExternalSyntheticLambda15(4, this, runnable));
            this.scrollAnimator = springAnimation4;
            springAnimation4.start();
        }
    }

    public ChatAttachAlertBotWebViewLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
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
        ?? r11 = new BotWebViewContainer(context, resourcesProvider, Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) {
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
        this.webViewContainer = r11;
        ?? r0 = new WebViewSwipeContainer(context) {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ChatAttachAlertBotWebViewLayout.this.measureOffsetY, 1073741824));
            }
        };
        this.swipeContainer = r0;
        r0.addView(r11, LayoutHelper.createFrame(-1.0f, -1));
        r0.setScrollListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 3));
        r0.setScrollEndListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 4));
        r0.setDelegate(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(this));
        r0.setIsKeyboardVisible(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(this));
        addView((View) r0, LayoutHelper.createFrame(-1.0f, -1));
        WebProgressView webProgressView = new WebProgressView(context, resourcesProvider);
        this.progressView = webProgressView;
        addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
        r11.setWebViewProgressListener(new ChatActivity$$ExternalSyntheticLambda211(this, 16));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.webViewResultSent;
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (i != i3) {
            if (i == NotificationCenter.didSetNewTheme) {
                anonymousClass1.flickerDrawable.setColors(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider), 153);
                return;
            }
            return;
        }
        if (this.queryId == ((Long) objArr[0]).longValue()) {
            anonymousClass1.destroyWebView();
            this.needReload = true;
            this.parentAlert.lambda$showGiftOfferSheet$15();
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
        String name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = name;
        alertDialog.message = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        builder.setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        alertDialog.show();
        ((TextView) alertDialog.getButton(-1)).setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        return false;
    }

    @Override
    public final void onDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = actionBarMenuItem.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.linearLayout.removeAllViews();
        }
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
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.setFocusable(false);
        chatAttachAlert.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void onHide() {
        this.otherItem.setVisibility(8);
        this.isBotButtonAvailable = false;
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        boolean z = anonymousClass1.isBackButtonVisible;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!z) {
            AndroidUtilities.updateImageViewImageAnimated(chatAttachAlert.actionBar.getBackButton(), R.drawable.ic_ab_back);
        }
        chatAttachAlert.actionBar.setBackground(null);
        if (anonymousClass1.hasUserPermissions) {
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
        int i2 = R.id.menu_open_bot;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (i == i2) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.botId);
            chatAttachAlert.baseFragment.presentFragment(new ChatActivity(bundle));
            chatAttachAlert.lambda$showGiftOfferSheet$15();
            return;
        }
        int i3 = 0;
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
            anonymousClass1.loadFlickerAndSettingsItem(this.currentAccount, this.botId);
            NotificationCenter.getInstance(anonymousClass1.currentAccount).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda5(anonymousClass1, 2));
            return;
        }
        if (i == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i3 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i3);
                i3++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.botId) {
                    chatAttachAlert.onLongClickBotButton(tL_attachMenuBot2, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
                    return;
                }
            }
            return;
        }
        if (i == R.id.menu_settings) {
            anonymousClass1.getClass();
            anonymousClass1.lastClickMs = System.currentTimeMillis();
            anonymousClass1.notifyEvent("settings_button_pressed", null);
        } else {
            if (i == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.currentAccount).installShortcut(this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i == R.id.menu_tos_bot) {
                Browser.openUrl(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i == R.id.menu_report_bot) {
                int i4 = this.currentAccount;
                Context context = getContext();
                BulletinFactory bulletinFactory = new BulletinFactory(new Bulletin.BulletinWindow(getContext(), null).container, this.resourcesProvider);
                long j = this.botId;
                int i5 = ReportBottomSheet.$r8$clinit;
                ReportBottomSheet.open(i4, context, j, false, false, new ArrayList(), bulletinFactory, null, new byte[0], null, null);
            }
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
    public final void onPanTransitionStart(int i, boolean z) {
        if (z) {
            AnonymousClass1 anonymousClass1 = this.webViewContainer;
            anonymousClass1.setViewPortByMeasureSuppressed(true);
            AnonymousClass2 anonymousClass2 = this.swipeContainer;
            float topActionBarOffsetY = anonymousClass2.getTopActionBarOffsetY() + (-anonymousClass2.getOffsetY());
            boolean z2 = false;
            if (anonymousClass2.getSwipeOffsetY() != topActionBarOffsetY) {
                anonymousClass2.stickTo(topActionBarOffsetY, false, null);
                z2 = true;
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
                this.webViewScrollAnimator.addUpdateListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda10(this, 0));
                this.webViewScrollAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i2, 15));
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
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.actionBar.setTitle(userName);
        setSwipeOffsetY(0.0f);
        AnonymousClass1 anonymousClass1 = this.webViewContainer;
        if (anonymousClass1.getWebView() != null) {
            anonymousClass1.getWebView().scrollTo(0, 0);
        }
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if (baseFragment != null) {
            anonymousClass1.setParentActivity(baseFragment.getParentActivity());
        }
        this.otherItem.setVisibility(0);
        if (anonymousClass1.isBackButtonVisible) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(chatAttachAlert.actionBar.getBackButton(), R.drawable.ic_close_white);
    }

    @Override
    public final void onShown() {
        if (this.webViewContainer.isPageLoaded) {
            requestEnableKeyboard();
        }
        setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 0));
    }

    public final void requestEnableKeyboard() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).contentView.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(chatAttachAlert.baseFragment.getFragmentView());
            AndroidUtilities.runOnUIThread(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(this, 1), 250L);
        } else {
            chatAttachAlert.getWindow().setSoftInputMode(20);
            setFocusable(true);
            chatAttachAlert.setFocusable(true);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void scrollToTop() {
        AnonymousClass2 anonymousClass2 = this.swipeContainer;
        anonymousClass2.stickTo(anonymousClass2.getTopActionBarOffsetY() + (-anonymousClass2.getOffsetY()), false, null);
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
}
