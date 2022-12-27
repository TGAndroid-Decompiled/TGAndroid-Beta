package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.ChatListItemAnimator;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.BotWebViewContainer;
import org.telegram.p009ui.Components.BotWebViewMenuContainer;
import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.PaymentFormActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_prolongWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestWebView;
import org.telegram.tgnet.TLRPC$TL_payments_paymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_paymentReceipt;
import org.telegram.tgnet.TLRPC$TL_webViewResultUrl;
import org.telegram.tgnet.TLRPC$User;

public class BotWebViewMenuContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final SimpleFloatPropertyCompat<BotWebViewMenuContainer> ACTION_BAR_TRANSITION_PROGRESS_VALUE = new SimpleFloatPropertyCompat("actionBarTransitionProgress", BotWebViewMenuContainer$$ExternalSyntheticLambda21.INSTANCE, BotWebViewMenuContainer$$ExternalSyntheticLambda22.INSTANCE).setMultiplier(100.0f);
    private C1133ActionBar.ActionBarMenuOnItemClick actionBarOnItemClick;
    private Paint actionBarPaint;
    private float actionBarTransitionProgress;
    private Paint backgroundPaint;
    private long botId;
    private ActionBarMenuItem botMenuItem;
    private String botUrl;
    private SpringAnimation botWebViewButtonAnimator;
    private boolean botWebViewButtonWasVisible;
    private int currentAccount;
    private Paint dimPaint;
    private boolean dismissed;
    private Runnable globalOnDismissListener;
    private boolean ignoreLayout;
    private boolean ignoreMeasure;
    private boolean isLoaded;
    private Paint linePaint;
    private boolean needCloseConfirmation;
    private int overrideActionBarBackground;
    private float overrideActionBarBackgroundProgress;
    private boolean overrideBackgroundColor;
    private ChatActivityEnterView parentEnterView;
    private Runnable pollRunnable;
    private ChatAttachAlertBotWebViewLayout.WebProgressView progressView;
    private long queryId;
    private MessageObject savedEditMessageObject;
    private Editable savedEditText;
    private MessageObject savedReplyMessageObject;
    private ActionBarMenuSubItem settingsItem;
    private SpringAnimation springAnimation;
    private ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
    private Boolean wasLightStatusBar;
    private BotWebViewContainer webViewContainer;
    private BotWebViewContainer.Delegate webViewDelegate;
    private ValueAnimator webViewScrollAnimator;

    public static void lambda$static$1(BotWebViewMenuContainer botWebViewMenuContainer, float f) {
        botWebViewMenuContainer.actionBarTransitionProgress = f;
        botWebViewMenuContainer.invalidate();
        botWebViewMenuContainer.invalidateActionBar();
    }

    public void lambda$new$4() {
        if (this.dismissed) {
            return;
        }
        TLRPC$TL_messages_prolongWebView tLRPC$TL_messages_prolongWebView = new TLRPC$TL_messages_prolongWebView();
        tLRPC$TL_messages_prolongWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
        tLRPC$TL_messages_prolongWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
        tLRPC$TL_messages_prolongWebView.query_id = this.queryId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_prolongWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewMenuContainer.this.lambda$new$3(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$3(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$2(tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$2(TLRPC$TL_error tLRPC$TL_error) {
        if (this.dismissed) {
            return;
        }
        if (tLRPC$TL_error != null) {
            dismiss();
        } else {
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    public BotWebViewMenuContainer(Context context, final ChatActivityEnterView chatActivityEnterView) {
        super(context);
        this.dimPaint = new Paint();
        this.backgroundPaint = new Paint(1);
        this.actionBarPaint = new Paint(1);
        this.linePaint = new Paint();
        this.pollRunnable = new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$4();
            }
        };
        this.parentEnterView = chatActivityEnterView;
        final C1133ActionBar actionBar = chatActivityEnterView.getParentFragment().getActionBar();
        ActionBarMenuItem addItem = actionBar.createMenu().addItem(1000, C1072R.C1073drawable.ic_ab_other);
        this.botMenuItem = addItem;
        addItem.setVisibility(8);
        this.botMenuItem.addSubItem(C1072R.C1074id.menu_reload_page, C1072R.C1073drawable.msg_retry, LocaleController.getString(C1072R.string.BotWebViewReloadPage));
        this.actionBarOnItemClick = actionBar.getActionBarMenuOnItemClick();
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(context, chatActivityEnterView.getParentFragment().getResourceProvider(), getColor("windowBackgroundWhite"));
        this.webViewContainer = botWebViewContainer;
        C18491 c18491 = new C18491(chatActivityEnterView, actionBar);
        this.webViewDelegate = c18491;
        botWebViewContainer.setDelegate(c18491);
        this.linePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.linePaint.setStrokeWidth(AndroidUtilities.m35dp(4.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.dimPaint.setColor(1073741824);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(context) {
            @Override
            protected void onMeasure(int r5, int r6) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BotWebViewMenuContainer.C18502.onMeasure(int, int):void");
            }

            @Override
            public void requestLayout() {
                if (BotWebViewMenuContainer.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.swipeContainer = webViewSwipeContainer;
        webViewSwipeContainer.setScrollListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$5(actionBar);
            }
        });
        this.swipeContainer.setScrollEndListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$6();
            }
        });
        this.swipeContainer.addView(this.webViewContainer);
        this.swipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() {
            @Override
            public final void onDismiss() {
                BotWebViewMenuContainer.this.lambda$new$7();
            }
        });
        this.swipeContainer.setTopActionBarOffsetY((C1133ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.m35dp(24.0f));
        this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
        this.swipeContainer.setIsKeyboardVisible(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Boolean lambda$new$8;
                lambda$new$8 = BotWebViewMenuContainer.lambda$new$8(ChatActivityEnterView.this, (Void) obj);
                return lambda$new$8;
            }
        });
        addView(this.swipeContainer, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 24.0f, 0.0f, 0.0f));
        ChatAttachAlertBotWebViewLayout.WebProgressView webProgressView = new ChatAttachAlertBotWebViewLayout.WebProgressView(context, chatActivityEnterView.getParentFragment().getResourceProvider());
        this.progressView = webProgressView;
        addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 5.0f));
        this.webViewContainer.setWebViewProgressListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                BotWebViewMenuContainer.this.lambda$new$10((Float) obj);
            }
        });
        setWillNotDraw(false);
    }

    public class C18491 implements BotWebViewContainer.Delegate {
        final C1133ActionBar val$actionBar;
        final ChatActivityEnterView val$parentEnterView;

        @Override
        public boolean isClipboardAvailable() {
            return BotWebViewContainer.Delegate.CC.$default$isClipboardAvailable(this);
        }

        @Override
        public void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.CC.$default$onSendWebViewData(this, str);
        }

        @Override
        public void onWebAppReady() {
            BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
        }

        C18491(ChatActivityEnterView chatActivityEnterView, C1133ActionBar c1133ActionBar) {
            BotWebViewMenuContainer.this = r1;
            this.val$parentEnterView = chatActivityEnterView;
            this.val$actionBar = c1133ActionBar;
        }

        @Override
        public void onCloseRequested(Runnable runnable) {
            BotWebViewMenuContainer.this.dismiss(runnable);
        }

        @Override
        public void onWebAppSetupClosingBehavior(boolean z) {
            BotWebViewMenuContainer.this.needCloseConfirmation = z;
        }

        @Override
        public void onWebAppSetActionBarColor(String str) {
            final int i = BotWebViewMenuContainer.this.overrideActionBarBackground;
            final int color = BotWebViewMenuContainer.this.getColor(str);
            if (i == 0) {
                BotWebViewMenuContainer.this.overrideActionBarBackground = color;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.C18491.this.lambda$onWebAppSetActionBarColor$0(i, color, valueAnimator);
                }
            });
            duration.start();
        }

        public void lambda$onWebAppSetActionBarColor$0(int i, int i2, ValueAnimator valueAnimator) {
            if (i != 0) {
                BotWebViewMenuContainer.this.overrideActionBarBackground = ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            } else {
                BotWebViewMenuContainer.this.overrideActionBarBackgroundProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
            BotWebViewMenuContainer.this.actionBarPaint.setColor(BotWebViewMenuContainer.this.overrideActionBarBackground);
            BotWebViewMenuContainer.this.invalidateActionBar();
        }

        @Override
        public void onWebAppSetBackgroundColor(final int i) {
            BotWebViewMenuContainer.this.overrideBackgroundColor = true;
            final int color = BotWebViewMenuContainer.this.backgroundPaint.getColor();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.C18491.this.lambda$onWebAppSetBackgroundColor$1(color, i, valueAnimator);
                }
            });
            duration.start();
        }

        public void lambda$onWebAppSetBackgroundColor$1(int i, int i2, ValueAnimator valueAnimator) {
            BotWebViewMenuContainer.this.backgroundPaint.setColor(ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            BotWebViewMenuContainer.this.invalidate();
        }

        @Override
        public void onWebAppExpand() {
            if (BotWebViewMenuContainer.this.swipeContainer.isSwipeInProgress()) {
                return;
            }
            BotWebViewMenuContainer.this.swipeContainer.stickTo((-BotWebViewMenuContainer.this.swipeContainer.getOffsetY()) + BotWebViewMenuContainer.this.swipeContainer.getTopActionBarOffsetY());
        }

        @Override
        public void onWebAppOpenInvoice(final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            ChatActivity parentFragment = this.val$parentEnterView.getParentFragment();
            if (tLObject instanceof TLRPC$TL_payments_paymentForm) {
                TLRPC$TL_payments_paymentForm tLRPC$TL_payments_paymentForm = (TLRPC$TL_payments_paymentForm) tLObject;
                MessagesController.getInstance(BotWebViewMenuContainer.this.currentAccount).putUsers(tLRPC$TL_payments_paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(tLRPC$TL_payments_paymentForm, str, parentFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC$TL_payments_paymentReceipt ? new PaymentFormActivity((TLRPC$TL_payments_paymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                    @Override
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        BotWebViewMenuContainer.C18491.this.lambda$onWebAppOpenInvoice$2(str, invoiceStatus);
                    }
                });
                parentFragment.presentFragment(paymentFormActivity);
            }
        }

        public void lambda$onWebAppOpenInvoice$2(String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
            BotWebViewMenuContainer.this.webViewContainer.onInvoiceStatusUpdate(str, invoiceStatus.name().toLowerCase(Locale.ROOT));
        }

        @Override
        public void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3) {
            ChatActivityBotWebViewButton botWebViewButton = this.val$parentEnterView.getBotWebViewButton();
            botWebViewButton.setupButtonParams(z2, str, i, i2, z3);
            botWebViewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotWebViewMenuContainer.C18491.this.lambda$onSetupMainButton$3(view);
                }
            });
            if (z != BotWebViewMenuContainer.this.botWebViewButtonWasVisible) {
                BotWebViewMenuContainer.this.animateBotButton(z);
            }
        }

        public void lambda$onSetupMainButton$3(View view) {
            BotWebViewMenuContainer.this.webViewContainer.onMainButtonPressed();
        }

        @Override
        public void onSetBackButtonVisible(boolean z) {
            if (BotWebViewMenuContainer.this.actionBarTransitionProgress == 1.0f) {
                if (z) {
                    AndroidUtilities.updateImageViewImageAnimated(this.val$actionBar.getBackButton(), this.val$actionBar.getBackButtonDrawable());
                } else {
                    AndroidUtilities.updateImageViewImageAnimated(this.val$actionBar.getBackButton(), C1072R.C1073drawable.ic_close_white);
                }
            }
        }
    }

    public void lambda$new$5(C1133ActionBar c1133ActionBar) {
        if (this.swipeContainer.getSwipeOffsetY() > 0.0f) {
            this.dimPaint.setAlpha((int) ((1.0f - (Math.min(this.swipeContainer.getSwipeOffsetY(), this.swipeContainer.getHeight()) / this.swipeContainer.getHeight())) * 64.0f));
        } else {
            this.dimPaint.setAlpha(64);
        }
        invalidate();
        this.webViewContainer.invalidateViewPortHeight();
        if (this.springAnimation != null) {
            float f = ((getVisibility() == 0 ? 1.0f - (Math.min(this.swipeContainer.getTopActionBarOffsetY(), this.swipeContainer.getTranslationY() - this.swipeContainer.getTopActionBarOffsetY()) / this.swipeContainer.getTopActionBarOffsetY()) : 0.0f) > 0.5f ? 1 : 0) * 100.0f;
            if (this.springAnimation.getSpring().getFinalPosition() != f) {
                this.springAnimation.getSpring().setFinalPosition(f);
                this.springAnimation.start();
                if (!this.webViewContainer.isBackButtonVisible()) {
                    if (f == 100.0f) {
                        AndroidUtilities.updateImageViewImageAnimated(c1133ActionBar.getBackButton(), C1072R.C1073drawable.ic_close_white);
                    } else {
                        AndroidUtilities.updateImageViewImageAnimated(c1133ActionBar.getBackButton(), c1133ActionBar.getBackButtonDrawable());
                    }
                }
            }
        }
        System.currentTimeMillis();
    }

    public void lambda$new$6() {
        this.webViewContainer.invalidateViewPortHeight(true);
    }

    public void lambda$new$7() {
        if (onCheckDismissByUser()) {
            return;
        }
        this.swipeContainer.stickTo(0.0f);
    }

    public static Boolean lambda$new$8(ChatActivityEnterView chatActivityEnterView, Void r1) {
        return Boolean.valueOf(chatActivityEnterView.getSizeNotifierLayout().getKeyboardHeight() >= AndroidUtilities.m35dp(20.0f));
    }

    public void lambda$new$10(Float f) {
        this.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.this.lambda$new$9(valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewMenuContainer.this.progressView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    public void lambda$new$9(ValueAnimator valueAnimator) {
        this.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void invalidateActionBar() {
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        if (parentFragment == null || getVisibility() != 0) {
            return;
        }
        ChatAvatarContainer avatarContainer = parentFragment.getAvatarContainer();
        int blendARGB = ColorUtils.blendARGB(getColor(avatarContainer.getLastSubtitleColorKey() == null ? "actionBarDefaultSubtitle" : avatarContainer.getLastSubtitleColorKey()), getColor("windowBackgroundWhiteGrayText"), this.actionBarTransitionProgress);
        C1133ActionBar actionBar = parentFragment.getActionBar();
        actionBar.setBackgroundColor(ColorUtils.blendARGB(getColor("actionBarDefault"), getColor("windowBackgroundWhite"), this.actionBarTransitionProgress));
        actionBar.setItemsColor(ColorUtils.blendARGB(getColor("actionBarDefaultIcon"), getColor("windowBackgroundWhiteBlackText"), this.actionBarTransitionProgress), false);
        actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(getColor("actionBarDefaultSelector"), getColor("actionBarWhiteSelector"), this.actionBarTransitionProgress), false);
        actionBar.setSubtitleColor(blendARGB);
        ChatAvatarContainer avatarContainer2 = parentFragment.getAvatarContainer();
        avatarContainer2.getTitleTextView().setTextColor(ColorUtils.blendARGB(getColor("actionBarDefaultTitle"), getColor("windowBackgroundWhiteBlackText"), this.actionBarTransitionProgress));
        avatarContainer2.getSubtitleTextView().setTextColor(blendARGB);
        avatarContainer2.setOverrideSubtitleColor(this.actionBarTransitionProgress == 0.0f ? null : Integer.valueOf(blendARGB));
        updateLightStatusBar();
    }

    public boolean onBackPressed() {
        if (this.webViewContainer.onBackPressed()) {
            return true;
        }
        if (getVisibility() == 0) {
            onCheckDismissByUser();
            return true;
        }
        return false;
    }

    public boolean onCheckDismissByUser() {
        if (this.needCloseConfirmation) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(C1072R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(C1072R.string.BotWebViewCloseAnyway), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BotWebViewMenuContainer.this.lambda$onCheckDismissByUser$11(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(C1072R.string.Cancel), null).create();
            create.show();
            ((TextView) create.getButton(-1)).setTextColor(getColor("dialogTextRed"));
            return false;
        }
        dismiss();
        return true;
    }

    public void lambda$onCheckDismissByUser$11(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public void animateBotButton(final boolean z) {
        final ChatActivityBotWebViewButton botWebViewButton = this.parentEnterView.getBotWebViewButton();
        SpringAnimation springAnimation = this.botWebViewButtonAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.botWebViewButtonAnimator = null;
        }
        botWebViewButton.setProgress(z ? 0.0f : 1.0f);
        if (z) {
            botWebViewButton.setVisibility(0);
        }
        SimpleFloatPropertyCompat<ChatActivityBotWebViewButton> simpleFloatPropertyCompat = ChatActivityBotWebViewButton.PROGRESS_PROPERTY;
        SpringAnimation addEndListener = new SpringAnimation(botWebViewButton, simpleFloatPropertyCompat).setSpring(new SpringForce((z ? 1.0f : 0.0f) * simpleFloatPropertyCompat.getMultiplier()).setStiffness(z ? 600.0f : 750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                BotWebViewMenuContainer.this.lambda$animateBotButton$12(dynamicAnimation, f, f2);
            }
        }).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                BotWebViewMenuContainer.this.lambda$animateBotButton$13(z, botWebViewButton, dynamicAnimation, z2, f, f2);
            }
        });
        this.botWebViewButtonAnimator = addEndListener;
        addEndListener.start();
        this.botWebViewButtonWasVisible = z;
    }

    public void lambda$animateBotButton$12(DynamicAnimation dynamicAnimation, float f, float f2) {
        float multiplier = f / ChatActivityBotWebViewButton.PROGRESS_PROPERTY.getMultiplier();
        this.parentEnterView.setBotWebViewButtonOffsetX(AndroidUtilities.m35dp(64.0f) * multiplier);
        this.parentEnterView.setComposeShadowAlpha(1.0f - multiplier);
    }

    public void lambda$animateBotButton$13(boolean z, ChatActivityBotWebViewButton chatActivityBotWebViewButton, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (!z) {
            chatActivityBotWebViewButton.setVisibility(8);
        }
        if (this.botWebViewButtonAnimator == dynamicAnimation) {
            this.botWebViewButtonAnimator = null;
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.springAnimation == null) {
            this.springAnimation = new SpringAnimation(this, ACTION_BAR_TRANSITION_PROGRESS_VALUE).setSpring(new SpringForce().setStiffness(1200.0f).setDampingRatio(1.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    BotWebViewMenuContainer.this.lambda$onAttachedToWindow$14(dynamicAnimation, z, f, f2);
                }
            });
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    public void lambda$onAttachedToWindow$14(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        ChatAvatarContainer avatarContainer = parentFragment.getAvatarContainer();
        avatarContainer.setClickable(f == 0.0f);
        avatarContainer.getAvatarImageView().setClickable(f == 0.0f);
        C1133ActionBar actionBar = parentFragment.getActionBar();
        if (f == 100.0f && this.parentEnterView.hasBotWebView()) {
            parentFragment.showHeaderItem(false);
            this.botMenuItem.setVisibility(0);
            actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        if (BotWebViewMenuContainer.this.webViewContainer.onBackPressed()) {
                            return;
                        }
                        BotWebViewMenuContainer.this.onCheckDismissByUser();
                    } else if (i == C1072R.C1074id.menu_reload_page) {
                        if (BotWebViewMenuContainer.this.webViewContainer.getWebView() != null) {
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().animate().cancel();
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().animate().alpha(0.0f).start();
                        }
                        BotWebViewMenuContainer.this.isLoaded = false;
                        BotWebViewMenuContainer.this.progressView.setLoadProgress(0.0f);
                        BotWebViewMenuContainer.this.progressView.setAlpha(1.0f);
                        BotWebViewMenuContainer.this.progressView.setVisibility(0);
                        BotWebViewMenuContainer.this.webViewContainer.setBotUser(MessagesController.getInstance(BotWebViewMenuContainer.this.currentAccount).getUser(Long.valueOf(BotWebViewMenuContainer.this.botId)));
                        BotWebViewMenuContainer.this.webViewContainer.loadFlickerAndSettingsItem(BotWebViewMenuContainer.this.currentAccount, BotWebViewMenuContainer.this.botId, BotWebViewMenuContainer.this.settingsItem);
                        BotWebViewMenuContainer.this.webViewContainer.reload();
                    } else if (i == C1072R.C1074id.menu_settings) {
                        BotWebViewMenuContainer.this.webViewContainer.onSettingsButtonPressed();
                    }
                }
            });
            return;
        }
        parentFragment.showHeaderItem(true);
        this.botMenuItem.setVisibility(8);
        actionBar.setActionBarMenuOnItemClick(this.actionBarOnItemClick);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.springAnimation = null;
        }
        this.actionBarTransitionProgress = 0.0f;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.ignoreMeasure) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onPanTransitionStart(boolean z, int i) {
        boolean z2;
        if (z) {
            float topActionBarOffsetY = (-this.swipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY();
            if (this.swipeContainer.getSwipeOffsetY() != topActionBarOffsetY) {
                this.swipeContainer.stickTo(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int measureKeyboardHeight = this.parentEnterView.getSizeNotifierLayout().measureKeyboardHeight() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.ignoreMeasure = true;
            if (z2) {
                return;
            }
            ValueAnimator valueAnimator = this.webViewScrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.webViewScrollAnimator = null;
            }
            if (this.webViewContainer.getWebView() != null) {
                int scrollY = this.webViewContainer.getWebView().getScrollY();
                final int i2 = (measureKeyboardHeight - i) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                this.webViewScrollAnimator = duration;
                duration.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                this.webViewScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BotWebViewMenuContainer.this.lambda$onPanTransitionStart$15(valueAnimator2);
                    }
                });
                this.webViewScrollAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (BotWebViewMenuContainer.this.webViewContainer.getWebView() != null) {
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().setScrollY(i2);
                        }
                        if (animator == BotWebViewMenuContainer.this.webViewScrollAnimator) {
                            BotWebViewMenuContainer.this.webViewScrollAnimator = null;
                        }
                    }
                });
                this.webViewScrollAnimator.start();
            }
        }
    }

    public void lambda$onPanTransitionStart$15(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.webViewContainer.getWebView() != null) {
            this.webViewContainer.getWebView().setScrollY(intValue);
        }
    }

    public void onPanTransitionEnd() {
        this.ignoreMeasure = false;
        requestLayout();
    }

    private void updateLightStatusBar() {
        boolean z = true;
        z = (ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) < 0.9d || this.actionBarTransitionProgress < 0.85f) ? false : false;
        Boolean bool = this.wasLightStatusBar;
        if (bool == null || bool.booleanValue() != z) {
            this.wasLightStatusBar = Boolean.valueOf(z);
            if (Build.VERSION.SDK_INT >= 23) {
                int systemUiVisibility = getSystemUiVisibility();
                setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.overrideBackgroundColor) {
            this.backgroundPaint.setColor(getColor("windowBackgroundWhite"));
        }
        if (this.overrideActionBarBackgroundProgress == 0.0f) {
            this.actionBarPaint.setColor(getColor("windowBackgroundWhite"));
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRect(rectF, this.dimPaint);
        float m35dp = AndroidUtilities.m35dp(16.0f) * (1.0f - this.actionBarTransitionProgress);
        rectF.set(0.0f, AndroidUtilities.lerp(this.swipeContainer.getTranslationY(), 0.0f, this.actionBarTransitionProgress), getWidth(), this.swipeContainer.getTranslationY() + AndroidUtilities.m35dp(24.0f) + m35dp);
        canvas.drawRoundRect(rectF, m35dp, m35dp, this.actionBarPaint);
        rectF.set(0.0f, this.swipeContainer.getTranslationY() + AndroidUtilities.m35dp(24.0f), getWidth(), getHeight() + m35dp);
        canvas.drawRect(rectF, this.backgroundPaint);
    }

    @Override
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() <= AndroidUtilities.lerp(this.swipeContainer.getTranslationY() + AndroidUtilities.m35dp(24.0f), 0.0f, this.actionBarTransitionProgress)) {
            onCheckDismissByUser();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.linePaint.setColor(getColor("key_sheet_scrollUp"));
        Paint paint = this.linePaint;
        paint.setAlpha((int) (paint.getAlpha() * (1.0f - (Math.min(0.5f, this.actionBarTransitionProgress) / 0.5f))));
        canvas.save();
        float f = 1.0f - this.actionBarTransitionProgress;
        float lerp = AndroidUtilities.lerp(this.swipeContainer.getTranslationY(), AndroidUtilities.statusBarHeight + (C1133ActionBar.getCurrentActionBarHeight() / 2.0f), this.actionBarTransitionProgress) + AndroidUtilities.m35dp(12.0f);
        canvas.scale(f, f, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.m35dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.m35dp(16.0f), lerp, this.linePaint);
        canvas.restore();
    }

    public void show(int i, long j, String str) {
        this.dismissed = false;
        if (this.currentAccount != i || this.botId != j || !Objects.equals(this.botUrl, str)) {
            this.isLoaded = false;
        }
        this.currentAccount = i;
        this.botId = j;
        this.botUrl = str;
        this.savedEditText = this.parentEnterView.getEditField().getText();
        this.parentEnterView.getEditField().setText((CharSequence) null);
        this.savedReplyMessageObject = this.parentEnterView.getReplyingMessageObject();
        this.savedEditMessageObject = this.parentEnterView.getEditingMessageObject();
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        if (parentFragment != null) {
            parentFragment.hideFieldPanel(true);
        }
        if (!this.isLoaded) {
            loadWebView();
        }
        setVisibility(0);
        setAlpha(0.0f);
        addOnLayoutChangeListener(new View$OnLayoutChangeListenerC18546());
    }

    public class View$OnLayoutChangeListenerC18546 implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC18546() {
            BotWebViewMenuContainer.this = r1;
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            BotWebViewMenuContainer.this.swipeContainer.setSwipeOffsetY(BotWebViewMenuContainer.this.swipeContainer.getHeight());
            BotWebViewMenuContainer.this.setAlpha(1.0f);
            new SpringAnimation(BotWebViewMenuContainer.this.swipeContainer, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.SWIPE_OFFSET_Y, 0.0f).setSpring(new SpringForce(0.0f).setDampingRatio(0.75f).setStiffness(500.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    BotWebViewMenuContainer.View$OnLayoutChangeListenerC18546.this.lambda$onLayoutChange$0(dynamicAnimation, z, f, f2);
                }
            }).start();
        }

        public void lambda$onLayoutChange$0(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            BotWebViewMenuContainer.this.webViewContainer.restoreButtonData();
            BotWebViewMenuContainer.this.webViewContainer.invalidateViewPortHeight(true);
        }
    }

    private void loadWebView() {
        this.progressView.setLoadProgress(0.0f);
        this.progressView.setAlpha(1.0f);
        this.progressView.setVisibility(0);
        this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
        TLRPC$TL_messages_requestWebView tLRPC$TL_messages_requestWebView = new TLRPC$TL_messages_requestWebView();
        tLRPC$TL_messages_requestWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
        tLRPC$TL_messages_requestWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
        tLRPC$TL_messages_requestWebView.platform = "android";
        tLRPC$TL_messages_requestWebView.url = this.botUrl;
        tLRPC$TL_messages_requestWebView.flags |= 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", getColor("windowBackgroundWhite"));
            jSONObject.put("secondary_bg_color", getColor("windowBackgroundGray"));
            jSONObject.put("text_color", getColor("windowBackgroundWhiteBlackText"));
            jSONObject.put("hint_color", getColor("windowBackgroundWhiteHintText"));
            jSONObject.put("link_color", getColor("windowBackgroundWhiteLinkText"));
            jSONObject.put("button_color", getColor("featuredStickers_addButton"));
            jSONObject.put("button_text_color", getColor("featuredStickers_buttonText"));
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_messages_requestWebView.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = jSONObject.toString();
            tLRPC$TL_messages_requestWebView.flags |= 4;
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        tLRPC$TL_messages_requestWebView.from_bot_menu = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewMenuContainer.this.lambda$loadWebView$17(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadWebView$17(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$loadWebView$16(tLObject);
            }
        });
    }

    public void lambda$loadWebView$16(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_webViewResultUrl) {
            this.isLoaded = true;
            TLRPC$TL_webViewResultUrl tLRPC$TL_webViewResultUrl = (TLRPC$TL_webViewResultUrl) tLObject;
            this.queryId = tLRPC$TL_webViewResultUrl.query_id;
            this.webViewContainer.loadUrl(this.currentAccount, tLRPC$TL_webViewResultUrl.url);
            this.swipeContainer.setWebView(this.webViewContainer.getWebView());
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    public int getColor(String str) {
        Integer valueOf;
        Theme.ResourcesProvider resourceProvider = this.parentEnterView.getParentFragment().getResourceProvider();
        if (resourceProvider != null) {
            valueOf = resourceProvider.getColor(str);
        } else {
            valueOf = Integer.valueOf(Theme.getColor(str));
        }
        return valueOf != null ? valueOf.intValue() : Theme.getColor(str);
    }

    public void setOnDismissGlobalListener(Runnable runnable) {
        this.globalOnDismissListener = runnable;
    }

    public void dismiss() {
        dismiss(null);
    }

    public void dismiss(final Runnable runnable) {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webViewSwipeContainer.stickTo(webViewSwipeContainer.getHeight() + this.parentEnterView.getSizeNotifierLayout().measureKeyboardHeight(), new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$dismiss$18(runnable);
            }
        });
    }

    public void lambda$dismiss$18(Runnable runnable) {
        onDismiss();
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.globalOnDismissListener;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void onDismiss() {
        setVisibility(8);
        this.needCloseConfirmation = false;
        this.overrideActionBarBackground = 0;
        this.overrideActionBarBackgroundProgress = 0.0f;
        this.actionBarPaint.setColor(getColor("windowBackgroundWhite"));
        this.webViewContainer.destroyWebView();
        this.swipeContainer.removeView(this.webViewContainer);
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(getContext(), this.parentEnterView.getParentFragment().getResourceProvider(), getColor("windowBackgroundWhite"));
        this.webViewContainer = botWebViewContainer;
        botWebViewContainer.setDelegate(this.webViewDelegate);
        this.webViewContainer.setWebViewProgressListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                BotWebViewMenuContainer.this.lambda$onDismiss$20((Float) obj);
            }
        });
        this.swipeContainer.addView(this.webViewContainer);
        this.isLoaded = false;
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        boolean z = this.botWebViewButtonWasVisible;
        if (z) {
            this.botWebViewButtonWasVisible = false;
            animateBotButton(false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewMenuContainer.this.lambda$onDismiss$21();
            }
        }, z ? 200L : 0L);
    }

    public void lambda$onDismiss$20(Float f) {
        this.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.this.lambda$onDismiss$19(valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewMenuContainer.this.progressView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    public void lambda$onDismiss$19(ValueAnimator valueAnimator) {
        this.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$onDismiss$21() {
        if (this.savedEditText != null) {
            this.parentEnterView.getEditField().setText(this.savedEditText);
            this.savedEditText = null;
        }
        if (this.savedReplyMessageObject != null) {
            ChatActivity parentFragment = this.parentEnterView.getParentFragment();
            if (parentFragment != null) {
                parentFragment.showFieldPanelForReply(this.savedReplyMessageObject);
            }
            this.savedReplyMessageObject = null;
        }
        if (this.savedEditMessageObject != null) {
            ChatActivity parentFragment2 = this.parentEnterView.getParentFragment();
            if (parentFragment2 != null) {
                parentFragment2.showFieldPanelForEdit(true, this.savedEditMessageObject);
            }
            this.savedEditMessageObject = null;
        }
    }

    public boolean hasSavedText() {
        return (this.savedEditText == null && this.savedReplyMessageObject == null && this.savedEditMessageObject == null) ? false : true;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                dismiss();
            }
        } else if (i == NotificationCenter.didSetNewTheme) {
            this.webViewContainer.updateFlickerBackgroundColor(getColor("windowBackgroundWhite"));
            invalidate();
            invalidateActionBar();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewMenuContainer.this.invalidateActionBar();
                }
            }, 300L);
        }
    }
}
