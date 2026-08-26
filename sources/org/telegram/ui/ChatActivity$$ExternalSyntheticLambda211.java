package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.BotWebViewSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda10;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class ChatActivity$$ExternalSyntheticLambda211 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda211(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i = 1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ReactedUsersListView) obj2).setSeenUsers((List) obj);
                break;
            case 1:
                ((DialogsAdapter) obj2).parentFragment.setContactsAlpha(((Float) obj).floatValue());
                break;
            case 2:
                Float f = (Float) obj;
                ArticleViewer.PageLayout pageLayout = (ArticleViewer.PageLayout) obj2;
                ArticleViewer articleViewer = ArticleViewer.this;
                if (pageLayout == articleViewer.pages[0]) {
                    if (articleViewer.actionBar.lineProgressView.getCurrentProgress() > f.floatValue()) {
                        articleViewer.actionBar.lineProgressView.setProgress(0.0f, false);
                    }
                    articleViewer.actionBar.lineProgressView.setProgress(f.floatValue(), true);
                }
                break;
            case 3:
                TLRPC.User user = (TLRPC.User) obj;
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                ChatUsersActivity.DiffCallback diffCallbackSaveState = chatUsersActivity.saveState();
                ArrayList arrayList = chatUsersActivity.participants;
                LongSparseArray longSparseArray = chatUsersActivity.contactsMap;
                ArrayList arrayList2 = (longSparseArray == null || longSparseArray.size() == 0) ? arrayList : chatUsersActivity.contacts;
                if (longSparseArray == null || longSparseArray.size() == 0) {
                    longSparseArray = chatUsersActivity.participantsMap;
                }
                if (longSparseArray.get(user.id) == null) {
                    if (ChatObject.isChannel(chatUsersActivity.currentChat)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = chatUsersActivity.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = chatUsersActivity.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        longSparseArray.put(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = chatUsersActivity.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        longSparseArray.put(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(8));
                }
                chatUsersActivity.updateListAnimated(diffCallbackSaveState);
                break;
            case 4:
                Float f2 = (Float) obj;
                Bulletin bulletin = (Bulletin) obj2;
                Bulletin.Delegate delegate = bulletin.currentDelegate;
                if (delegate != null) {
                    Bulletin.Layout layout = bulletin.layout;
                    if (!layout.top) {
                        delegate.onBottomOffsetChange(layout.getHeight() - f2.floatValue());
                    }
                }
                break;
            case 5:
                ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = ((ChatAttachAlert) obj2).delegate;
                if (chatAttachViewDelegate != null) {
                    chatAttachViewDelegate.onWallpaperSelected(obj);
                }
                break;
            case 6:
                ((ColorPickerBottomSheet.PipetteDelegate) obj2).onColorSelected(((Integer) obj).intValue());
                break;
            case 7:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) obj2;
                sendGiftSheet.getClass();
                if (((BillingResult) obj).zza == 0) {
                    AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 2));
                }
                break;
            case 8:
                int i2 = ((BillingResult) obj).zza;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(16, (PollItemMenu$$ExternalSyntheticLambda14) obj2, i2 != 0 ? BillingController.getResponseCodeString(i2) : null));
                break;
            case 9:
                if (((BillingResult) obj).zza == 0) {
                    AndroidUtilities.runOnUIThread((MessageSendPreview$15$$ExternalSyntheticLambda0) obj2);
                }
                break;
            case 10:
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 11:
                TLRPC.User user2 = (TLRPC.User) obj;
                int i3 = 0;
                while (true) {
                    ProfileActivity profileActivity = (ProfileActivity) obj2;
                    if (i3 < profileActivity.chatInfo.participants.participants.size()) {
                        if (profileActivity.chatInfo.participants.participants.get(i3).user_id == user2.id) {
                            profileActivity.chatInfo.participants.participants.remove(i3);
                            profileActivity.updateListAnimated(true, false);
                        } else {
                            i3++;
                        }
                    }
                    break;
                }
                break;
            case 12:
                View view = ((ProxyListActivity) obj2).listView.getChildViewHolder((View) obj).itemView;
                if (view instanceof ProxyListActivity.TextDetailProxyCell) {
                    ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) view;
                    textDetailProxyCell.setChecked(textDetailProxyCell.currentInfo == SharedConfig.currentProxy);
                    textDetailProxyCell.updateStatus();
                }
                break;
            case 13:
                int i4 = ((BillingResult) obj).zza;
                boolean z = i4 == 0;
                String responseCodeString = z ? null : BillingController.getResponseCodeString(i4);
                FileLog.d("StarsController.buy onResult " + z + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((Utilities.Callback2) obj2, z, responseCodeString, 4));
                break;
            case 14:
                ((StoryRecorder.AnonymousClass24) obj2).lambda$new$8$1((Integer) obj);
                break;
            case 15:
                Float f3 = (Float) obj;
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) obj2;
                botWebViewSheet.getClass();
                botWebViewSheet.progressView.setLoadProgressAnimated(f3.floatValue());
                if (f3.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration.addUpdateListener(new BotWebViewSheet$$ExternalSyntheticLambda12(botWebViewSheet, 1));
                    duration.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(botWebViewSheet, 13));
                    duration.start();
                }
                break;
            default:
                Float f4 = (Float) obj;
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj2;
                chatAttachAlertBotWebViewLayout.progressView.setLoadProgressAnimated(f4.floatValue());
                if (f4.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration2.addUpdateListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda10(chatAttachAlertBotWebViewLayout, i));
                    duration2.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(chatAttachAlertBotWebViewLayout, 14));
                    duration2.start();
                    chatAttachAlertBotWebViewLayout.requestEnableKeyboard();
                }
                break;
        }
    }
}
