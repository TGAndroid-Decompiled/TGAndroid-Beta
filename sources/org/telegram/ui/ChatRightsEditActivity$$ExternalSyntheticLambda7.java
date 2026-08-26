package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda7(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public final void run() {
        ChatRightsEditActivity chatRightsEditActivity = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                chatRightsEditActivity.onDonePressed(false);
                break;
            case 1:
                ChatRightsEditActivity.ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = chatRightsEditActivity.delegate;
                if (chatRightsEditActivityDelegate != null) {
                    chatRightsEditActivityDelegate.didSetRights(0, chatRightsEditActivity.asAdmin ? chatRightsEditActivity.adminRights : null, null, chatRightsEditActivity.currentRank);
                }
                Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                bundleM.putLong("chat_id", chatRightsEditActivity.currentChat.id);
                if (chatRightsEditActivity.getMessagesController().checkCanOpenChat(bundleM, chatRightsEditActivity)) {
                    ChatActivity chatActivity = new ChatActivity(bundleM);
                    chatRightsEditActivity.presentFragment(chatActivity, true);
                    if (BulletinFactory.canShowBulletin(chatActivity)) {
                        TLRPC.User user = chatRightsEditActivity.currentUser;
                        boolean z = chatRightsEditActivity.isAddingNew;
                        if (z && chatRightsEditActivity.asAdmin) {
                            String str = user.first_name;
                            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(chatActivity.getParentActivity(), chatActivity.themeDelegate);
                            lottieLayout.setAnimation(R.raw.ic_admin, 32, 32, "Shield");
                            lottieLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            Bulletin.make(chatActivity, lottieLayout, 1500).show();
                            break;
                        } else if (!z && !chatRightsEditActivity.initialAsAdmin && chatRightsEditActivity.asAdmin) {
                            BulletinFactory.createPromoteToAdminBulletin(chatActivity, user.first_name).show();
                            break;
                        }
                    }
                } else {
                    chatRightsEditActivity.setLoading(false);
                    break;
                }
                break;
            default:
                if (chatRightsEditActivity.hasGuardBotToSet) {
                    long j = chatRightsEditActivity.guardBotIdToSet;
                    AlertDialog[] alertDialogArr = {new AlertDialog(chatRightsEditActivity.getParentActivity(), 3, null)};
                    chatRightsEditActivity.getMessagesController().toggleChatJoinRequest(chatRightsEditActivity.chatId, j, true, false, true, new ChatActivity$$ExternalSyntheticLambda337(alertDialogArr, 2), new ChatActivity$$ExternalSyntheticLambda337(alertDialogArr, 3));
                    alertDialogArr[0].showDelayed(300L);
                }
                ChatRightsEditActivity.ChatRightsEditActivityDelegate chatRightsEditActivityDelegate2 = chatRightsEditActivity.delegate;
                if (chatRightsEditActivityDelegate2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chatRightsEditActivity.adminRights;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!chatRightsEditActivity.isForum || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!chatRightsEditActivity.isChannel || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i = 0;
                    }
                    chatRightsEditActivityDelegate2.didSetRights(i, tL_chatAdminRights, chatRightsEditActivity.bannedRights, chatRightsEditActivity.currentRank);
                    chatRightsEditActivity.finishFragment();
                }
                break;
        }
    }
}
