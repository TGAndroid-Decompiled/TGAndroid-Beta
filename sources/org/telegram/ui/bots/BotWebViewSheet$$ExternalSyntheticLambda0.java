package org.telegram.ui.bots;

import android.app.Activity;
import android.graphics.Paint;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotWebViewSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda0(BotWebViewSheet botWebViewSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$49();
                break;
            case 1:
                BotWebViewSheet botWebViewSheet = this.f$0;
                if (!botWebViewSheet.dismissed && botWebViewSheet.queryId != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputUser(botWebViewSheet.botId);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.peerId);
                    tL_messages_prolongWebView.query_id = botWebViewSheet.queryId;
                    tL_messages_prolongWebView.silent = false;
                    if (botWebViewSheet.replyToMsgId != 0) {
                        TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(botWebViewSheet.currentAccount).createReplyInput(botWebViewSheet.replyToMsgId);
                        tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
                        if (botWebViewSheet.monoforumTopicId != 0) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.monoforumTopicId);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (botWebViewSheet.monoforumTopicId != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.monoforumTopicId);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(botWebViewSheet.currentAccount).sendRequest(tL_messages_prolongWebView, new BotWebViewSheet$$ExternalSyntheticLambda7(botWebViewSheet, 3));
                    break;
                }
                break;
            case 2:
                this.f$0.updateFullscreenLayout();
                break;
            case 3:
                this.f$0.swipeContainer.requestLayout();
                break;
            case 4:
                BotWebViewSheet botWebViewSheet2 = this.f$0;
                if (!botWebViewSheet2.webViewContainer.onBackPressed()) {
                    botWebViewSheet2.onCheckDismissByUser();
                }
                break;
            case 5:
                BotWebViewSheet botWebViewSheet3 = this.f$0;
                botWebViewSheet3.forceExpnaded = true;
                botWebViewSheet3.dismiss$1(true);
                break;
            case 6:
                this.f$0.openOptions();
                break;
            case 7:
                BotWebViewSheet botWebViewSheet4 = this.f$0;
                BotWebViewSheet.AnonymousClass1 anonymousClass1 = botWebViewSheet4.swipeContainer;
                float swipeOffsetY = anonymousClass1.getSwipeOffsetY();
                Paint paint = botWebViewSheet4.dimPaint;
                if (swipeOffsetY > 0.0f) {
                    paint.setAlpha((int) ((1.0f - MathUtils.clamp(anonymousClass1.getSwipeOffsetY() / anonymousClass1.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                botWebViewSheet4.windowView.invalidate();
                botWebViewSheet4.webViewContainer.invalidateViewPortHeight(false, false);
                if (botWebViewSheet4.springAnimation != null) {
                    float f = (1.0f - (Math.min(anonymousClass1.getTopActionBarOffsetY(), anonymousClass1.getTranslationY() - anonymousClass1.getTopActionBarOffsetY()) / anonymousClass1.getTopActionBarOffsetY()) > 0.5f ? 1 : 0) * 100.0f;
                    SpringAnimation springAnimation = botWebViewSheet4.springAnimation;
                    SpringForce springForce = springAnimation.mSpring;
                    if (((float) springForce.mFinalPosition) != f) {
                        springForce.mFinalPosition = f;
                        springAnimation.start();
                    }
                }
                if (botWebViewSheet4.fullscreen) {
                    int i = botWebViewSheet4.insets.bottom;
                } else {
                    Math.max(0.0f, anonymousClass1.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                invalidateViewPortHeight(true, false);
                break;
            case 9:
                BotWebViewSheet botWebViewSheet5 = this.f$0;
                Activity activity = botWebViewSheet5.parentActivity;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).presentFragment(ChatActivity.of(botWebViewSheet5.botId));
                }
                botWebViewSheet5.dismiss$1(true);
                break;
            case 10:
                BotWebViewSheet.AnonymousClass2 anonymousClass2 = this.f$0.webViewContainer;
                anonymousClass2.getClass();
                anonymousClass2.lastClickMs = System.currentTimeMillis();
                anonymousClass2.notifyEvent("settings_button_pressed", null);
                break;
            case 11:
                BotWebViewSheet botWebViewSheet6 = this.f$0;
                BotWebViewSheet.AnonymousClass2 anonymousClass3 = botWebViewSheet6.webViewContainer;
                if (anonymousClass3.getWebView() != null) {
                    anonymousClass3.getWebView().animate().cancel();
                    anonymousClass3.getWebView().animate().alpha(0.0f).start();
                }
                BotWebViewSheet.AnonymousClass7 anonymousClass7 = botWebViewSheet6.progressView;
                anonymousClass7.setLoadProgress(0.0f);
                anonymousClass7.setAlpha(1.0f);
                anonymousClass7.setVisibility(0);
                anonymousClass3.setBotUser(MessagesController.getInstance(botWebViewSheet6.currentAccount).getUser(Long.valueOf(botWebViewSheet6.botId)));
                anonymousClass3.loadFlickerAndSettingsItem(botWebViewSheet6.currentAccount, botWebViewSheet6.botId);
                NotificationCenter.getInstance(anonymousClass3.currentAccount).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda5(anonymousClass3, 2));
                break;
            case 12:
                BotWebViewSheet botWebViewSheet7 = this.f$0;
                MediaDataController.getInstance(botWebViewSheet7.currentAccount).installShortcut(botWebViewSheet7.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 13:
                Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 14:
                BotWebViewSheet botWebViewSheet8 = this.f$0;
                ReportBottomSheet.open(botWebViewSheet8.currentAccount, botWebViewSheet8.getContext(), botWebViewSheet8.botId, false, false, new ArrayList(), new BulletinFactory(new Bulletin.BulletinWindow(botWebViewSheet8.getContext(), null).container, botWebViewSheet8.resourcesProvider), null, new byte[0], null, null);
                break;
            case 15:
                BotWebViewSheet botWebViewSheet9 = this.f$0;
                BotWebViewSheet.deleteBot(botWebViewSheet9.currentAccount, botWebViewSheet9.botId, new BotWebViewSheet$$ExternalSyntheticLambda0(botWebViewSheet9, 16));
                break;
            case 16:
                this.f$0.dismiss$1(false);
                break;
            default:
                this.f$0.dismiss$1(false);
                break;
        }
    }
}
