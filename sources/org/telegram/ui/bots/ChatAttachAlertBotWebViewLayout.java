package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import androidx.core.util.Consumer;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;

public class ChatAttachAlertBotWebViewLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private ActionBarMenuSubItem addToHomeScreenItem;
    private long botId;
    private int currentAccount;
    private int customActionBarBackground;
    private int customBackground;
    private boolean destroyed;
    private boolean hasCustomActionBarBackground;
    private boolean hasCustomBackground;
    private boolean ignoreLayout;
    private boolean ignoreMeasure;
    private boolean isBotButtonAvailable;
    private long lastSwipeTime;
    private int measureOffsetY;
    private long monoforumTopicId;
    private boolean needCloseConfirmation;
    private boolean needReload;
    private ActionBarMenuItem otherItem;
    private long peerId;
    private Runnable pollRunnable;
    private WebProgressView progressView;
    private long queryId;
    private int replyToMsgId;
    public ActionBarMenuSubItem settingsItem;
    private boolean silent;
    private String startCommand;
    private WebViewSwipeContainer swipeContainer;
    private BotWebViewContainer webViewContainer;
    private ValueAnimator webViewScrollAnimator;

    @Override
    public int needsActionBar() {
        return 1;
    }

    @Override
    public boolean shouldHideBottomButtons() {
        return false;
    }

    public static void $r8$lambda$Dcy2_aW3m8aiuhd3tfIXxEM3BwA(final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout) {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        if (chatAttachAlertBotWebViewLayout.destroyed) {
            return;
        }
        TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
        tL_messages_prolongWebView.bot = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputUser(chatAttachAlertBotWebViewLayout.botId);
        tL_messages_prolongWebView.peer = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.peerId);
        tL_messages_prolongWebView.query_id = chatAttachAlertBotWebViewLayout.queryId;
        tL_messages_prolongWebView.silent = chatAttachAlertBotWebViewLayout.silent;
        if (chatAttachAlertBotWebViewLayout.replyToMsgId != 0) {
            TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).createReplyInput(chatAttachAlertBotWebViewLayout.replyToMsgId);
            tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
            if (chatAttachAlertBotWebViewLayout.monoforumTopicId != 0) {
                inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.monoforumTopicId);
                tL_messages_prolongWebView.reply_to.flags |= 32;
            }
            tL_messages_prolongWebView.flags |= 1;
        } else if (chatAttachAlertBotWebViewLayout.monoforumTopicId != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.monoforumTopicId);
            tL_messages_prolongWebView.flags |= 1;
        }
        if (chatAttachAlertBotWebViewLayout.peerId < 0 && (chatFull = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getChatFull(-chatAttachAlertBotWebViewLayout.peerId)) != null && (peer = chatFull.default_send_as) != null) {
            tL_messages_prolongWebView.send_as = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(peer);
            tL_messages_prolongWebView.flags |= 8192;
        }
        ConnectionsManager.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).sendRequest(tL_messages_prolongWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$sMzTVjr0xt0tktVWbhAWhmQFc0I(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$sMzTVjr0xt0tktVWbhAWhmQFc0I(final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, TLObject tLObject, final TLRPC.TL_error tL_error) {
        chatAttachAlertBotWebViewLayout.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$WYs0Xp5KYxtKiPcXYdqg4zuPyrI(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$WYs0Xp5KYxtKiPcXYdqg4zuPyrI(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, TLRPC.TL_error tL_error) {
        if (chatAttachAlertBotWebViewLayout.destroyed) {
            return;
        }
        if (tL_error != null) {
            chatAttachAlertBotWebViewLayout.parentAlert.dismiss();
        } else {
            AndroidUtilities.runOnUIThread(chatAttachAlertBotWebViewLayout.pollRunnable, 60000L);
        }
    }

    @Override
    public void onMenuItemClick(int i) {
        if (i == -1) {
            if (this.webViewContainer.onBackPressed()) {
                return;
            }
            onCheckDismissByUser();
            return;
        }
        if (i == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.botId);
            this.parentAlert.baseFragment.presentFragment(new ChatActivity(bundle));
            this.parentAlert.dismiss();
            return;
        }
        int i2 = 0;
        if (i == R.id.menu_reload_page) {
            if (this.webViewContainer.getWebView() != null) {
                this.webViewContainer.getWebView().animate().cancel();
                this.webViewContainer.getWebView().animate().alpha(0.0f).start();
            }
            this.progressView.setLoadProgress(0.0f);
            this.progressView.setAlpha(1.0f);
            this.progressView.setVisibility(0);
            this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
            this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
            this.webViewContainer.reload();
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
            this.webViewContainer.onSettingsButtonPressed();
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

    public ChatAttachAlertBotWebViewLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.pollRunnable = new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$Dcy2_aW3m8aiuhd3tfIXxEM3BwA(this.f$0);
            }
        };
        ActionBarMenuItem actionBarMenuItemAddItem = this.parentAlert.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.addSubItem(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = this.otherItem.addSubItem(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
        this.settingsItem = actionBarMenuSubItemAddSubItem;
        actionBarMenuSubItemAddSubItem.setVisibility(8);
        this.otherItem.addSubItem(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = this.otherItem.addSubItem(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
        this.addToHomeScreenItem = actionBarMenuSubItemAddSubItem2;
        actionBarMenuSubItemAddSubItem2.setVisibility(8);
        this.otherItem.addSubItem(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
        this.otherItem.addSubItem(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
        this.otherItem.addSubItem(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
        this.webViewContainer = new BotWebViewContainer(context, resourcesProvider, getThemedColor(Theme.key_dialogBackground), true) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !ChatAttachAlertBotWebViewLayout.this.isBotButtonAvailable) {
                    ChatAttachAlertBotWebViewLayout.this.isBotButtonAvailable = true;
                    ChatAttachAlertBotWebViewLayout.this.webViewContainer.restoreButtonData();
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                super.onWebViewCreated(myWebView);
                ChatAttachAlertBotWebViewLayout.this.swipeContainer.setWebView(myWebView);
            }
        };
        WebViewSwipeContainer webViewSwipeContainer = new WebViewSwipeContainer(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ChatAttachAlertBotWebViewLayout.this.measureOffsetY, 1073741824));
            }
        };
        this.swipeContainer = webViewSwipeContainer;
        webViewSwipeContainer.addView(this.webViewContainer, LayoutHelper.createFrame(-1, -1.0f));
        this.swipeContainer.setScrollListener(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$gIemrNU9CNCGUEkpQxJhZyP6vWo(this.f$0);
            }
        });
        this.swipeContainer.setScrollEndListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.webViewContainer.invalidateViewPortHeight(true);
            }
        });
        this.swipeContainer.setDelegate(new WebViewSwipeContainer.Delegate() {
            @Override
            public final void onDismiss(boolean z) {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$AgocBWNml0KvU_oiBV_eWXAj0qk(this.f$0, z);
            }
        });
        this.swipeContainer.setIsKeyboardVisible(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return Boolean.valueOf(this.f$0.parentAlert.sizeNotifierFrameLayout.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
            }
        });
        addView(this.swipeContainer, LayoutHelper.createFrame(-1, -1.0f));
        WebProgressView webProgressView = new WebProgressView(context, resourcesProvider);
        this.progressView = webProgressView;
        addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
        this.webViewContainer.setWebViewProgressListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatAttachAlertBotWebViewLayout.m4859$r8$lambda$y1Y_eVs0sEScJhLXoWfR4fsy8Y(this.f$0, (Float) obj);
            }
        });
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    public static void $r8$lambda$gIemrNU9CNCGUEkpQxJhZyP6vWo(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout) {
        chatAttachAlertBotWebViewLayout.parentAlert.updateLayout(chatAttachAlertBotWebViewLayout, true, 0);
        chatAttachAlertBotWebViewLayout.webViewContainer.invalidateViewPortHeight();
        chatAttachAlertBotWebViewLayout.lastSwipeTime = System.currentTimeMillis();
    }

    public static void $r8$lambda$AgocBWNml0KvU_oiBV_eWXAj0qk(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, boolean z) {
        if (chatAttachAlertBotWebViewLayout.onCheckDismissByUser()) {
            return;
        }
        chatAttachAlertBotWebViewLayout.swipeContainer.stickTo(0.0f);
    }

    public static void m4859$r8$lambda$y1Y_eVs0sEScJhLXoWfR4fsy8Y(final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, Float f) {
        chatAttachAlertBotWebViewLayout.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertBotWebViewLayout.this.progressView.setVisibility(8);
                }
            });
            duration.start();
            chatAttachAlertBotWebViewLayout.requestEnableKeyboard();
        }
    }

    public void setNeedCloseConfirmation(boolean z) {
        this.needCloseConfirmation = z;
    }

    public void setAllowSwipes(boolean z) {
        this.swipeContainer.setAllowSwipes(z);
    }

    @Override
    public boolean onDismissWithTouchOutside() {
        onCheckDismissByUser();
        return false;
    }

    public boolean onCheckDismissByUser() {
        if (this.needCloseConfirmation) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.parentAlert.dismiss();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            alertDialogCreate.show();
            ((TextView) alertDialogCreate.getButton(-1)).setTextColor(getThemedColor(Theme.key_text_RedBold));
            return false;
        }
        this.parentAlert.dismiss();
        return true;
    }

    public void setCustomBackground(int i) {
        this.customBackground = i;
        this.hasCustomBackground = true;
    }

    @Override
    public boolean hasCustomBackground() {
        return this.hasCustomBackground;
    }

    @Override
    public int getCustomBackground() {
        return this.customBackground;
    }

    @Override
    public boolean hasCustomActionBarBackground() {
        return this.hasCustomActionBarBackground;
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.customActionBarBackground;
    }

    public void setCustomActionBarBackground(int i) {
        this.hasCustomActionBarBackground = true;
        this.customActionBarBackground = i;
    }

    public boolean canExpandByRequest() {
        return !this.swipeContainer.isSwipeInProgress();
    }

    public void setMeasureOffsetY(int i) {
        this.measureOffsetY = i;
        this.swipeContainer.requestLayout();
    }

    public void disallowSwipeOffsetAnimation() {
        this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.ignoreMeasure) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public void onPanTransitionStart(boolean z, int i) {
        boolean z2;
        if (z) {
            this.webViewContainer.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = (-this.swipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY();
            if (this.swipeContainer.getSwipeOffsetY() != topActionBarOffsetY) {
                this.swipeContainer.stickTo(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int iMeasureKeyboardHeight = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.ignoreMeasure = true;
            this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
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
                final int i2 = (iMeasureKeyboardHeight - i) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                this.webViewScrollAnimator = duration;
                duration.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                this.webViewScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ChatAttachAlertBotWebViewLayout.$r8$lambda$ch5NgLmQjgdZBJJhkqOKyxtjRHg(this.f$0, valueAnimator2);
                    }
                });
                this.webViewScrollAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (ChatAttachAlertBotWebViewLayout.this.webViewContainer.getWebView() != null) {
                            ChatAttachAlertBotWebViewLayout.this.webViewContainer.getWebView().setScrollY(i2);
                        }
                        if (animator == ChatAttachAlertBotWebViewLayout.this.webViewScrollAnimator) {
                            ChatAttachAlertBotWebViewLayout.this.webViewScrollAnimator = null;
                        }
                    }
                });
                this.webViewScrollAnimator.start();
            }
        }
    }

    public static void $r8$lambda$ch5NgLmQjgdZBJJhkqOKyxtjRHg(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, ValueAnimator valueAnimator) {
        chatAttachAlertBotWebViewLayout.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (chatAttachAlertBotWebViewLayout.webViewContainer.getWebView() != null) {
            chatAttachAlertBotWebViewLayout.webViewContainer.getWebView().setScrollY(iIntValue);
        }
    }

    @Override
    public void onPanTransitionEnd() {
        this.ignoreMeasure = false;
        this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
        this.webViewContainer.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.parentAlert.actionBar.setTitle(userName);
        this.swipeContainer.setSwipeOffsetY(0.0f);
        if (this.webViewContainer.getWebView() != null) {
            this.webViewContainer.getWebView().scrollTo(0, 0);
        }
        if (this.parentAlert.getBaseFragment() != null) {
            this.webViewContainer.setParentActivity(this.parentAlert.getBaseFragment().getParentActivity());
        }
        this.otherItem.setVisibility(0);
        if (this.webViewContainer.isBackButtonVisible()) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this.parentAlert.actionBar.getBackButton(), R.drawable.ic_close_white);
    }

    @Override
    public void onShown() {
        if (this.webViewContainer.isPageLoaded()) {
            requestEnableKeyboard();
        }
        this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.webViewContainer.restoreButtonData();
            }
        });
    }

    public void requestEnableKeyboard() {
        BaseFragment baseFragment = this.parentAlert.getBaseFragment();
        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).contentView.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(this.parentAlert.baseFragment.getFragmentView());
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.requestEnableKeyboard();
                }
            }, 250L);
        } else {
            this.parentAlert.getWindow().setSoftInputMode(20);
            setFocusable(true);
            this.parentAlert.setFocusable(true);
        }
    }

    @Override
    public void onHidden() {
        super.onHidden();
        this.parentAlert.setFocusable(false);
        this.parentAlert.getWindow().setSoftInputMode(48);
    }

    @Override
    public int getCurrentItemTop() {
        return (int) (this.swipeContainer.getSwipeOffsetY() + this.swipeContainer.getOffsetY());
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public String getStartCommand() {
        return this.startCommand;
    }

    public void requestWebView(final int i, long j, long j2, boolean z, int i2, String str, long j3) {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        this.currentAccount = i;
        this.peerId = j;
        this.botId = j2;
        this.silent = z;
        this.replyToMsgId = i2;
        this.monoforumTopicId = j3;
        this.startCommand = str;
        if (this.addToHomeScreenItem != null) {
            if (MediaDataController.getInstance(i).canCreateAttachedMenuBotShortcut(j2)) {
                this.addToHomeScreenItem.setVisibility(0);
            } else {
                this.addToHomeScreenItem.setVisibility(8);
            }
        }
        this.webViewContainer.setBotUser(MessagesController.getInstance(i).getUser(Long.valueOf(j2)));
        this.webViewContainer.loadFlickerAndSettingsItem(i, j2, this.settingsItem);
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView.peer = MessagesController.getInstance(i).getInputPeer(j);
        tL_messages_requestWebView.bot = MessagesController.getInstance(i).getInputUser(j2);
        tL_messages_requestWebView.silent = z;
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
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_messages_requestWebView.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_messages_requestWebView.flags |= 4;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_requestWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$WPgeZCK_RXwecO6d6f_qtJ4dOM0(this.f$0, i, tLObject, tL_error);
            }
        });
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.webViewResultSent);
    }

    public static void $r8$lambda$WPgeZCK_RXwecO6d6f_qtJ4dOM0(final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        chatAttachAlertBotWebViewLayout.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertBotWebViewLayout.$r8$lambda$X2GZYsFuC4NS93sPq3YpiG1X9zs(this.f$0, tLObject, i);
            }
        });
    }

    public static void $r8$lambda$X2GZYsFuC4NS93sPq3YpiG1X9zs(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, TLObject tLObject, int i) {
        chatAttachAlertBotWebViewLayout.getClass();
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            chatAttachAlertBotWebViewLayout.queryId = tL_webViewResultUrl.query_id;
            if (tL_webViewResultUrl.same_origin) {
                chatAttachAlertBotWebViewLayout.webViewContainer.setTrustedOrigin(tL_webViewResultUrl.url);
            }
            chatAttachAlertBotWebViewLayout.webViewContainer.loadUrl(i, tL_webViewResultUrl.url);
            AndroidUtilities.runOnUIThread(chatAttachAlertBotWebViewLayout.pollRunnable);
        }
    }

    @Override
    public void onDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        this.otherItem.removeAllSubItems();
        actionBarMenuCreateMenu.removeView(this.otherItem);
        this.webViewContainer.destroyWebView();
        this.destroyed = true;
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
    }

    @Override
    public void onHide() {
        super.onHide();
        this.otherItem.setVisibility(8);
        this.isBotButtonAvailable = false;
        if (!this.webViewContainer.isBackButtonVisible()) {
            AndroidUtilities.updateImageViewImageAnimated(this.parentAlert.actionBar.getBackButton(), R.drawable.ic_ab_back);
        }
        this.parentAlert.actionBar.setBackground(null);
        if (this.webViewContainer.hasUserPermissions()) {
            this.webViewContainer.destroyWebView();
            this.needReload = true;
        }
    }

    public boolean needReload() {
        if (!this.needReload) {
            return false;
        }
        this.needReload = false;
        return true;
    }

    @Override
    public int getListTopPadding() {
        return (int) this.swipeContainer.getOffsetY();
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void onPreMeasure(int i, int i2) {
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
        float f = i3;
        if (this.swipeContainer.getOffsetY() != f) {
            this.ignoreLayout = true;
            this.swipeContainer.setOffsetY(f);
            this.ignoreLayout = false;
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return ((int) this.swipeContainer.getTopActionBarOffsetY()) + AndroidUtilities.dp(12.0f);
    }

    @Override
    public boolean onBackPressed() {
        if (this.webViewContainer.onBackPressed()) {
            return true;
        }
        onCheckDismissByUser();
        return true;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void scrollToTop() {
        WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webViewSwipeContainer.stickTo((-webViewSwipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
    }

    public BotWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    public void setDelegate(BotWebViewContainer.Delegate delegate) {
        this.webViewContainer.setDelegate(delegate);
    }

    public boolean isBotButtonAvailable() {
        return this.isBotButtonAvailable;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                this.webViewContainer.destroyWebView();
                this.needReload = true;
                this.parentAlert.dismiss();
                return;
            }
            return;
        }
        if (i == NotificationCenter.didSetNewTheme) {
            this.webViewContainer.updateFlickerBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        }
    }

    public void showJustAddedBulletin() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        final String string;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                i++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != this.botId);
        if (tL_attachMenuBot == null) {
            return;
        }
        boolean z = tL_attachMenuBot.show_in_side_menu;
        if (z && tL_attachMenuBot.show_in_attach_menu) {
            string = LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name);
        } else if (z) {
            string = LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name);
        } else {
            string = LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.f$0;
                BulletinFactory.of(chatAttachAlertBotWebViewLayout.parentAlert.getContainer(), chatAttachAlertBotWebViewLayout.resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(string)).setDuration(5000).show(true);
            }
        }, 200L);
    }

    public static class WebViewSwipeContainer extends FrameLayout {
        public static final SimpleFloatPropertyCompat SWIPE_OFFSET_Y = new SimpleFloatPropertyCompat("swipeOffsetY", new SimpleFloatPropertyCompat.Getter() {
            @Override
            public final float get(Object obj) {
                return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
            }
        }, new SimpleFloatPropertyCompat.Setter() {
            @Override
            public final void set(Object obj, float f) {
                ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).setSwipeOffsetY(f);
            }
        });
        private boolean allowFullSizeSwipe;
        private boolean allowSwipes;
        public boolean allowedScrollX;
        public boolean allowedScrollY;
        private Delegate delegate;
        private float drawnSwipeOffsetY;
        private boolean flingInProgress;
        private boolean fullsize;
        private final GestureDetectorCompat gestureDetector;
        private GenericProvider isKeyboardVisible;
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

        static float access$1124(WebViewSwipeContainer webViewSwipeContainer, float f) {
            float f2 = webViewSwipeContainer.swipeOffsetY - f;
            webViewSwipeContainer.swipeOffsetY = f2;
            return f2;
        }

        public Object getRenderNode() {
            if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
                this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("WebViewSwipeContainer");
            }
            return this.renderNode;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            Canvas canvasBeginRecording;
            if (canvas.isHardwareAccelerated()) {
                Object obj = this.renderNode;
                if (obj != null) {
                    RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj);
                    renderNodeM.setPosition(0, 0, getWidth(), getHeight());
                    canvasBeginRecording = renderNodeM.beginRecording();
                } else {
                    canvasBeginRecording = canvas;
                }
                super.dispatchDraw(canvasBeginRecording);
                Object obj2 = this.renderNode;
                if (obj2 != null) {
                    RenderNode renderNodeM2 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj2);
                    renderNodeM2.endRecording();
                    canvas.drawRenderNode(renderNodeM2);
                    return;
                }
                return;
            }
            super.dispatchDraw(canvas);
        }

        public void setFullSize(boolean z) {
            if (this.fullsize != z) {
                this.fullsize = z;
                if (z) {
                    if (this.opened) {
                        stickTo((-getOffsetY()) + getTopActionBarOffsetY());
                        return;
                    }
                    return;
                }
                stickTo(0.0f);
            }
        }

        public boolean isFullSize() {
            return this.fullsize;
        }

        public void setAllowFullSizeSwipe(boolean z) {
            this.allowFullSizeSwipe = z;
        }

        public void setAllowSwipes(boolean z) {
            if (this.allowSwipes != z) {
                this.allowSwipes = z;
            }
        }

        public boolean isAllowedSwipes() {
            return this.allowSwipes;
        }

        public void setShouldWaitWebViewScroll(boolean z) {
            this.shouldWaitWebViewScroll = z;
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

        public WebViewSwipeContainer(Context context) {
            super(context);
            this.topActionBarOffsetY = ActionBar.getCurrentActionBarHeight();
            this.offsetY = 0.0f;
            this.pendingOffsetY = -1.0f;
            this.pendingSwipeOffsetY = -2.1474836E9f;
            this.isKeyboardVisible = new GenericProvider() {
                @Override
                public final Object provide(Object obj) {
                    return Boolean.FALSE;
                }
            };
            this.allowSwipes = true;
            this.sy = 0.0f;
            this.scrolledOut = false;
            this.minscroll = AndroidUtilities.dp(60.0f);
            this.stickToEdges = true;
            final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (!WebViewSwipeContainer.this.isSwipeDisallowed && WebViewSwipeContainer.this.allowSwipes && (!WebViewSwipeContainer.this.fullsize || WebViewSwipeContainer.this.allowFullSizeSwipe)) {
                        WebViewSwipeContainer webViewSwipeContainer = WebViewSwipeContainer.this;
                        if (!webViewSwipeContainer.shouldWaitWebViewScroll || webViewSwipeContainer.allowingScroll(false)) {
                            float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                            float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                            if (f2 >= AndroidUtilities.dp(650.0f) && ((fDistance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && (WebViewSwipeContainer.this.webView == null || WebViewSwipeContainer.this.webView.getScrollY() == 0))) {
                                WebViewSwipeContainer.this.flingInProgress = true;
                                if (WebViewSwipeContainer.this.swipeOffsetY >= WebViewSwipeContainer.this.swipeStickyRange || WebViewSwipeContainer.this.fullsize) {
                                    if (!WebViewSwipeContainer.this.fullsize || !WebViewSwipeContainer.this.allowFullSizeSwipe) {
                                        if (WebViewSwipeContainer.this.delegate != null) {
                                            WebViewSwipeContainer.this.delegate.onDismiss(false);
                                        }
                                    } else {
                                        float f3 = WebViewSwipeContainer.this.drawnSwipeOffsetY;
                                        WebViewSwipeContainer webViewSwipeContainer2 = WebViewSwipeContainer.this;
                                        if (f3 != (-webViewSwipeContainer2.offsetY) + webViewSwipeContainer2.topActionBarOffsetY && (webViewSwipeContainer2.swipeOffsetY > (-WebViewSwipeContainer.this.swipeStickyRange) || f2 >= AndroidUtilities.dp(1200.0f))) {
                                            if (WebViewSwipeContainer.this.delegate != null) {
                                                WebViewSwipeContainer.this.delegate.onDismiss(false);
                                            }
                                        } else {
                                            WebViewSwipeContainer webViewSwipeContainer3 = WebViewSwipeContainer.this;
                                            webViewSwipeContainer3.stickTo((-webViewSwipeContainer3.offsetY) + webViewSwipeContainer3.topActionBarOffsetY);
                                        }
                                    }
                                } else {
                                    WebViewSwipeContainer.this.stickTo(0.0f);
                                }
                                return true;
                            }
                            if (f2 <= -700.0f) {
                                float f4 = WebViewSwipeContainer.this.swipeOffsetY;
                                WebViewSwipeContainer webViewSwipeContainer4 = WebViewSwipeContainer.this;
                                if (f4 > (-webViewSwipeContainer4.offsetY) + webViewSwipeContainer4.topActionBarOffsetY) {
                                    webViewSwipeContainer4.flingInProgress = true;
                                    WebViewSwipeContainer webViewSwipeContainer5 = WebViewSwipeContainer.this;
                                    webViewSwipeContainer5.stickTo((-webViewSwipeContainer5.offsetY) + webViewSwipeContainer5.topActionBarOffsetY);
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }

                @Override
                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    BotWebViewContainer.MyWebView myWebView;
                    int i;
                    float f3;
                    WebViewSwipeContainer webViewSwipeContainer;
                    MotionEvent motionEventObtain;
                    float f4;
                    WebViewSwipeContainer webViewSwipeContainer2;
                    float fCap = WebViewSwipeContainer.this.cap(f2);
                    WebViewSwipeContainer webViewSwipeContainer3 = WebViewSwipeContainer.this;
                    if (!webViewSwipeContainer3.isScrolling && !webViewSwipeContainer3.isSwipeDisallowed && WebViewSwipeContainer.this.allowSwipes) {
                        WebViewSwipeContainer webViewSwipeContainer4 = WebViewSwipeContainer.this;
                        if (webViewSwipeContainer4.shouldWaitWebViewScroll) {
                            float f5 = webViewSwipeContainer4.swipeOffsetY;
                            WebViewSwipeContainer webViewSwipeContainer5 = WebViewSwipeContainer.this;
                            if (f5 != (-webViewSwipeContainer5.offsetY) + webViewSwipeContainer5.topActionBarOffsetY || webViewSwipeContainer5.allowingScroll(false)) {
                                if (((Boolean) WebViewSwipeContainer.this.isKeyboardVisible.provide(null)).booleanValue()) {
                                    f4 = WebViewSwipeContainer.this.swipeOffsetY;
                                    webViewSwipeContainer2 = WebViewSwipeContainer.this;
                                    if (f4 == (-webViewSwipeContainer2.offsetY) + webViewSwipeContainer2.topActionBarOffsetY) {
                                        webViewSwipeContainer2.isSwipeDisallowed = true;
                                    } else {
                                        if (Math.abs(fCap) >= scaledTouchSlop && Math.abs(fCap) * 1.5f >= Math.abs(f)) {
                                            f3 = WebViewSwipeContainer.this.swipeOffsetY;
                                            webViewSwipeContainer = WebViewSwipeContainer.this;
                                            if (f3 == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY || webViewSwipeContainer.webView == null || (fCap < 0.0f && WebViewSwipeContainer.this.webView.getScrollY() == 0)) {
                                                WebViewSwipeContainer.this.isScrolling = true;
                                                motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                                for (int i2 = 0; i2 < WebViewSwipeContainer.this.getChildCount(); i2++) {
                                                    WebViewSwipeContainer.this.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                                                }
                                                motionEventObtain.recycle();
                                                return true;
                                            }
                                        }
                                        if (WebViewSwipeContainer.this.webView != null) {
                                            myWebView = WebViewSwipeContainer.this.webView;
                                            if (f >= 0.0f) {
                                                i = 1;
                                            } else {
                                                i = -1;
                                            }
                                            if (!myWebView.canScrollHorizontally(i)) {
                                                WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                            } else if (Math.abs(f) >= scaledTouchSlop && Math.abs(f) * 1.5f >= Math.abs(fCap)) {
                                                WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                            }
                                        } else if (Math.abs(f) >= scaledTouchSlop) {
                                            WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                        }
                                    }
                                } else {
                                    if (Math.abs(fCap) >= scaledTouchSlop) {
                                        f3 = WebViewSwipeContainer.this.swipeOffsetY;
                                        webViewSwipeContainer = WebViewSwipeContainer.this;
                                        if (f3 == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                        }
                                        WebViewSwipeContainer.this.isScrolling = true;
                                        motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                        while (i2 < WebViewSwipeContainer.this.getChildCount()) {
                                            WebViewSwipeContainer.this.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        return true;
                                    }
                                    if (WebViewSwipeContainer.this.webView != null) {
                                        myWebView = WebViewSwipeContainer.this.webView;
                                        if (f >= 0.0f) {
                                            i = 1;
                                        } else {
                                            i = -1;
                                        }
                                        if (!myWebView.canScrollHorizontally(i)) {
                                            WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                        } else if (Math.abs(f) >= scaledTouchSlop) {
                                            WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                        }
                                    } else if (Math.abs(f) >= scaledTouchSlop) {
                                        WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                    }
                                }
                            }
                        } else if (((Boolean) WebViewSwipeContainer.this.isKeyboardVisible.provide(null)).booleanValue()) {
                            f4 = WebViewSwipeContainer.this.swipeOffsetY;
                            webViewSwipeContainer2 = WebViewSwipeContainer.this;
                            if (f4 == (-webViewSwipeContainer2.offsetY) + webViewSwipeContainer2.topActionBarOffsetY) {
                                webViewSwipeContainer2.isSwipeDisallowed = true;
                            } else {
                                if (Math.abs(fCap) >= scaledTouchSlop) {
                                    f3 = WebViewSwipeContainer.this.swipeOffsetY;
                                    webViewSwipeContainer = WebViewSwipeContainer.this;
                                    if (f3 == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                    }
                                    WebViewSwipeContainer.this.isScrolling = true;
                                    motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                    while (i2 < WebViewSwipeContainer.this.getChildCount()) {
                                        WebViewSwipeContainer.this.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                                    }
                                    motionEventObtain.recycle();
                                    return true;
                                }
                                if (WebViewSwipeContainer.this.webView != null) {
                                    myWebView = WebViewSwipeContainer.this.webView;
                                    if (f >= 0.0f) {
                                        i = 1;
                                    } else {
                                        i = -1;
                                    }
                                    if (!myWebView.canScrollHorizontally(i)) {
                                        WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                    } else if (Math.abs(f) >= scaledTouchSlop) {
                                        WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                    }
                                } else if (Math.abs(f) >= scaledTouchSlop) {
                                    WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                }
                            }
                        } else {
                            if (Math.abs(fCap) >= scaledTouchSlop) {
                                f3 = WebViewSwipeContainer.this.swipeOffsetY;
                                webViewSwipeContainer = WebViewSwipeContainer.this;
                                if (f3 == (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY) {
                                }
                                WebViewSwipeContainer.this.isScrolling = true;
                                motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                while (i2 < WebViewSwipeContainer.this.getChildCount()) {
                                    WebViewSwipeContainer.this.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                                }
                                motionEventObtain.recycle();
                                return true;
                            }
                            if (WebViewSwipeContainer.this.webView != null) {
                                myWebView = WebViewSwipeContainer.this.webView;
                                if (f >= 0.0f) {
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                                if (!myWebView.canScrollHorizontally(i)) {
                                    WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                } else if (Math.abs(f) >= scaledTouchSlop) {
                                    WebViewSwipeContainer.this.isSwipeDisallowed = true;
                                }
                            } else if (Math.abs(f) >= scaledTouchSlop) {
                                WebViewSwipeContainer.this.isSwipeDisallowed = true;
                            }
                        }
                    }
                    WebViewSwipeContainer webViewSwipeContainer6 = WebViewSwipeContainer.this;
                    if (webViewSwipeContainer6.isScrolling) {
                        if (fCap < 0.0f) {
                            float f6 = webViewSwipeContainer6.swipeOffsetY;
                            WebViewSwipeContainer webViewSwipeContainer7 = WebViewSwipeContainer.this;
                            if (f6 <= (-webViewSwipeContainer7.offsetY) + webViewSwipeContainer7.topActionBarOffsetY) {
                                if (webViewSwipeContainer7.webView != null) {
                                    float scrollY = WebViewSwipeContainer.this.webView.getScrollY() + fCap;
                                    WebViewSwipeContainer.this.webView.setScrollY((int) MathUtils.clamp(scrollY, 0.0f, Math.max(WebViewSwipeContainer.this.webView.getContentHeight(), WebViewSwipeContainer.this.webView.getHeight()) - WebViewSwipeContainer.this.topActionBarOffsetY));
                                    if (scrollY < 0.0f) {
                                        WebViewSwipeContainer.access$1124(WebViewSwipeContainer.this, scrollY);
                                    }
                                } else {
                                    WebViewSwipeContainer.access$1124(WebViewSwipeContainer.this, fCap);
                                }
                            } else {
                                WebViewSwipeContainer.access$1124(webViewSwipeContainer7, fCap);
                            }
                        } else if (fCap > 0.0f) {
                            WebViewSwipeContainer.access$1124(webViewSwipeContainer6, fCap);
                            if (WebViewSwipeContainer.this.webView != null) {
                                float f7 = WebViewSwipeContainer.this.swipeOffsetY;
                                WebViewSwipeContainer webViewSwipeContainer8 = WebViewSwipeContainer.this;
                                if (f7 < (-webViewSwipeContainer8.offsetY) + webViewSwipeContainer8.topActionBarOffsetY) {
                                    float scrollY2 = webViewSwipeContainer8.webView.getScrollY();
                                    float f8 = WebViewSwipeContainer.this.swipeOffsetY;
                                    WebViewSwipeContainer webViewSwipeContainer9 = WebViewSwipeContainer.this;
                                    webViewSwipeContainer9.webView.setScrollY((int) MathUtils.clamp(scrollY2 - ((f8 + webViewSwipeContainer9.offsetY) - webViewSwipeContainer9.topActionBarOffsetY), 0.0f, Math.max(WebViewSwipeContainer.this.webView.getContentHeight(), WebViewSwipeContainer.this.webView.getHeight()) - WebViewSwipeContainer.this.topActionBarOffsetY));
                                }
                            }
                        }
                        WebViewSwipeContainer webViewSwipeContainer10 = WebViewSwipeContainer.this;
                        float f9 = webViewSwipeContainer10.swipeOffsetY;
                        WebViewSwipeContainer webViewSwipeContainer11 = WebViewSwipeContainer.this;
                        float f10 = (-webViewSwipeContainer11.offsetY) + webViewSwipeContainer11.topActionBarOffsetY;
                        float height = webViewSwipeContainer11.getHeight();
                        WebViewSwipeContainer webViewSwipeContainer12 = WebViewSwipeContainer.this;
                        webViewSwipeContainer10.swipeOffsetY = MathUtils.clamp(f9, f10, (height - webViewSwipeContainer12.offsetY) + webViewSwipeContainer12.topActionBarOffsetY);
                        if (WebViewSwipeContainer.this.fullsize && !WebViewSwipeContainer.this.allowFullSizeSwipe) {
                            WebViewSwipeContainer webViewSwipeContainer13 = WebViewSwipeContainer.this;
                            float f11 = webViewSwipeContainer13.swipeOffsetY;
                            WebViewSwipeContainer webViewSwipeContainer14 = WebViewSwipeContainer.this;
                            webViewSwipeContainer13.swipeOffsetY = Math.min(f11, (-webViewSwipeContainer14.offsetY) + webViewSwipeContainer14.topActionBarOffsetY);
                        }
                        WebViewSwipeContainer.this.invalidateTranslation();
                    }
                    return true;
                }
            });
            updateStickyRange();
        }

        public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
            this.isKeyboardVisible = genericProvider;
        }

        @Override
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            updateStickyRange();
        }

        private void updateStickyRange() {
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

        public void setSwipeOffsetAnimationDisallowed(boolean z) {
            this.isSwipeOffsetAnimationDisallowed = z;
        }

        public void setScrollListener(Runnable runnable) {
            this.scrollListener = runnable;
        }

        public void setScrollEndListener(Runnable runnable) {
            this.scrollEndListener = runnable;
        }

        public void setWebView(BotWebViewContainer.MyWebView myWebView) {
            this.webView = myWebView;
        }

        public void setTopActionBarOffsetY(float f) {
            this.topActionBarOffsetY = f;
            invalidateTranslation();
        }

        public void setSwipeOffsetY(float f) {
            this.swipeOffsetY = f;
            invalidateTranslation();
        }

        public void setForceOffsetY(float f) {
            this.offsetY = f;
            invalidateTranslation();
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
            if (!this.isSwipeOffsetAnimationDisallowed) {
                SpringAnimation springAnimation2 = this.offsetYAnimator;
                if (springAnimation2 != null) {
                    springAnimation2.cancel();
                }
                SpringAnimation springAnimation3 = (SpringAnimation) ((SpringAnimation) new SpringAnimation(new FloatValueHolder(f2)).setSpring(new SpringForce(f).setStiffness(1400.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f4, float f5) {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.$r8$lambda$g1JOQzJEh9RyL4VWRwCMhGETa0k(this.f$0, f3, f2, z, f, dynamicAnimation, f4, f5);
                    }
                })).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f4, float f5) {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.$r8$lambda$6viteKFkECquAWYbCDaIQQ1f7Qw(this.f$0, f, dynamicAnimation, z2, f4, f5);
                    }
                });
                this.offsetYAnimator = springAnimation3;
                springAnimation3.start();
                return;
            }
            this.offsetY = f;
            if (z) {
                this.swipeOffsetY = MathUtils.clamp(this.swipeOffsetY - Math.max(0.0f, f3), (-this.offsetY) + this.topActionBarOffsetY, (getHeight() - this.offsetY) + this.topActionBarOffsetY);
            }
            invalidateTranslation();
        }

        public static void $r8$lambda$g1JOQzJEh9RyL4VWRwCMhGETa0k(WebViewSwipeContainer webViewSwipeContainer, float f, float f2, boolean z, float f3, DynamicAnimation dynamicAnimation, float f4, float f5) {
            webViewSwipeContainer.offsetY = f4;
            float f6 = f == 0.0f ? 1.0f : (f4 - f2) / f;
            if (z) {
                webViewSwipeContainer.swipeOffsetY = MathUtils.clamp(webViewSwipeContainer.swipeOffsetY - (f6 * Math.max(0.0f, f)), (-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY, (webViewSwipeContainer.getHeight() - webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
            }
            SpringAnimation springAnimation = webViewSwipeContainer.scrollAnimator;
            if (springAnimation != null && springAnimation.getSpring().getFinalPosition() == (-f2) + webViewSwipeContainer.topActionBarOffsetY) {
                webViewSwipeContainer.scrollAnimator.getSpring().setFinalPosition((-f3) + webViewSwipeContainer.topActionBarOffsetY);
            }
            webViewSwipeContainer.invalidateTranslation();
        }

        public static void $r8$lambda$6viteKFkECquAWYbCDaIQQ1f7Qw(WebViewSwipeContainer webViewSwipeContainer, float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
            webViewSwipeContainer.offsetYAnimator = null;
            if (!z) {
                webViewSwipeContainer.offsetY = f;
                webViewSwipeContainer.invalidateTranslation();
            } else {
                webViewSwipeContainer.pendingOffsetY = f;
            }
        }

        public void updateDrawn() {
            this.drawnSwipeOffsetY = this.swipeOffsetY;
        }

        public void invalidateTranslation() {
            setTranslationY(Math.max(this.topActionBarOffsetY, this.offsetY + this.swipeOffsetY));
            AndroidUtilities.cancelRunOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateDrawn();
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateDrawn();
                }
            });
            Runnable runnable = this.scrollListener;
            if (runnable != null) {
                runnable.run();
            }
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().updatePosition();
            }
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
        }

        public float getTopActionBarOffsetY() {
            return this.topActionBarOffsetY;
        }

        public float getOffsetY() {
            return this.offsetY;
        }

        public float getSwipeOffsetY() {
            return this.swipeOffsetY;
        }

        public void setDelegate(Delegate delegate) {
            this.delegate = delegate;
        }

        public float cap(float f) {
            if (this.scrolledOut) {
                return f;
            }
            float f2 = this.sy + f;
            this.sy = f2;
            float fAbs = Math.abs(f2);
            float f3 = this.minscroll;
            if (fAbs <= f3) {
                return 0.0f;
            }
            this.scrolledOut = true;
            float f4 = this.sy;
            return f4 > 0.0f ? f4 - f3 : f4 + f3;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (this.isScrolling && motionEvent.getActionIndex() != 0) {
                return false;
            }
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
            boolean zOnTouchEvent = this.gestureDetector.onTouchEvent(motionEventObtain);
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
                        } else if (f > f2 && f <= i) {
                            if (this.stickToEdges) {
                                stickTo(0.0f);
                            }
                        } else {
                            float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.pressDownX, this.pressDownY);
                            long eventTime = motionEvent.getEventTime() - this.pressDownTime;
                            if (this.delegate != null && (eventTime > 250 || fDistance > AndroidUtilities.dp(200.0f))) {
                                this.delegate.onDismiss(!z);
                            } else if (this.stickToEdges) {
                                stickTo((-this.offsetY) + this.topActionBarOffsetY);
                            }
                        }
                    }
                }
            }
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            return !(zDispatchTouchEvent || zOnTouchEvent || motionEvent.getAction() != 0) || zDispatchTouchEvent || zOnTouchEvent;
        }

        public void stickTo(float f) {
            stickTo(f, null);
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

        public void stickTo(float f, Runnable runnable) {
            stickTo(f, false, runnable);
        }

        public void stickTo(float f, boolean z, final Runnable runnable) {
            SpringAnimation springAnimation;
            if (this.fullsize && !z) {
                f = (-getOffsetY()) + getTopActionBarOffsetY();
            }
            if (this.swipeOffsetY == f || ((springAnimation = this.scrollAnimator) != null && springAnimation.getSpring().getFinalPosition() == f)) {
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
            SpringAnimation springAnimation4 = (SpringAnimation) new SpringAnimation(this, SWIPE_OFFSET_Y, f).setSpring(new SpringForce(f).setStiffness(1200.0f).setDampingRatio(1.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                    ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.m4862$r8$lambda$RFLKsJBn6QUcFP7fK2NFPdORog(this.f$0, runnable, dynamicAnimation, z2, f2, f3);
                }
            });
            this.scrollAnimator = springAnimation4;
            springAnimation4.start();
        }

        public static void m4862$r8$lambda$RFLKsJBn6QUcFP7fK2NFPdORog(WebViewSwipeContainer webViewSwipeContainer, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == webViewSwipeContainer.scrollAnimator) {
                webViewSwipeContainer.scrollAnimator = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = webViewSwipeContainer.scrollEndListener;
                if (runnable2 != null) {
                    runnable2.run();
                }
                float f3 = webViewSwipeContainer.pendingOffsetY;
                if (f3 != -1.0f) {
                    boolean z2 = webViewSwipeContainer.isSwipeOffsetAnimationDisallowed;
                    webViewSwipeContainer.isSwipeOffsetAnimationDisallowed = true;
                    webViewSwipeContainer.setOffsetY(f3);
                    webViewSwipeContainer.pendingOffsetY = -1.0f;
                    webViewSwipeContainer.isSwipeOffsetAnimationDisallowed = z2;
                }
                webViewSwipeContainer.pendingSwipeOffsetY = -2.1474836E9f;
            }
        }

        public boolean isSwipeInProgress() {
            return this.isScrolling;
        }
    }

    public static class WebProgressView extends View {
        private final SimpleFloatPropertyCompat LOAD_PROGRESS_PROPERTY;
        private Paint bluePaint;
        private float loadProgress;
        private Theme.ResourcesProvider resourcesProvider;
        private SpringAnimation springAnimation;

        public WebProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.LOAD_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("loadProgress", new SimpleFloatPropertyCompat.Getter() {
                @Override
                public final float get(Object obj) {
                    return ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).loadProgress;
                }
            }, new SimpleFloatPropertyCompat.Setter() {
                @Override
                public final void set(Object obj, float f) {
                    ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).setLoadProgress(f);
                }
            }).setMultiplier(100.0f);
            Paint paint = new Paint(1);
            this.bluePaint = paint;
            this.resourcesProvider = resourcesProvider;
            paint.setColor(getThemedColor(Theme.key_featuredStickers_addButton));
            this.bluePaint.setStyle(Paint.Style.STROKE);
            this.bluePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.bluePaint.setStrokeCap(Paint.Cap.ROUND);
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.springAnimation = new SpringAnimation(this, this.LOAD_PROGRESS_PROPERTY).setSpring(new SpringForce().setStiffness(400.0f).setDampingRatio(1.0f));
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.springAnimation.cancel();
            this.springAnimation = null;
        }

        public void setLoadProgressAnimated(float f) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation == null) {
                setLoadProgress(f);
            } else {
                springAnimation.getSpring().setFinalPosition(f * 100.0f);
                this.springAnimation.start();
            }
        }

        public void setLoadProgress(float f) {
            this.loadProgress = f;
            invalidate();
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.loadProgress > 0.0f) {
                float height = getHeight() - (this.bluePaint.getStrokeWidth() / 2.0f);
                canvas.drawLine(0.0f, height, getWidth() * this.loadProgress, height, this.bluePaint);
            }
        }
    }
}
