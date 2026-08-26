package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda2(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onDonePressed(true);
                break;
            case 1:
                ChatRightsEditActivity chatRightsEditActivity = this.f$0;
                chatRightsEditActivity.setLoading(true);
                ChatRightsEditActivity$$ExternalSyntheticLambda7 chatRightsEditActivity$$ExternalSyntheticLambda7 = new ChatRightsEditActivity$$ExternalSyntheticLambda7(chatRightsEditActivity, 1);
                if (chatRightsEditActivity.asAdmin || chatRightsEditActivity.initialAsAdmin) {
                    chatRightsEditActivity.getMessagesController().setUserAdminRole(chatRightsEditActivity.currentChat.id, chatRightsEditActivity.currentUser, chatRightsEditActivity.asAdmin ? chatRightsEditActivity.adminRights : ChatRightsEditActivity.emptyAdminRights(false), chatRightsEditActivity.currentRank, false, chatRightsEditActivity, chatRightsEditActivity.isAddingNew, chatRightsEditActivity.asAdmin, chatRightsEditActivity.botHash, chatRightsEditActivity$$ExternalSyntheticLambda7, new ChatRightsEditActivity$$ExternalSyntheticLambda2(chatRightsEditActivity, 3));
                } else {
                    chatRightsEditActivity.getMessagesController().addUserToChat(chatRightsEditActivity.currentChat.id, chatRightsEditActivity.currentUser, 0, chatRightsEditActivity.botHash, chatRightsEditActivity, true, chatRightsEditActivity$$ExternalSyntheticLambda7, new ChatRightsEditActivity$$ExternalSyntheticLambda2(chatRightsEditActivity, 2));
                }
                break;
            case 2:
            case 3:
            default:
                this.f$0.lambda$checkDiscard$31(alertDialog, i);
                break;
            case 4:
                ChatRightsEditActivity chatRightsEditActivity2 = this.f$0;
                chatRightsEditActivity2.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                ChatActivity$$ExternalSyntheticLambda189 chatActivity$$ExternalSyntheticLambda189 = new ChatActivity$$ExternalSyntheticLambda189(10, chatRightsEditActivity2, twoStepVerificationActivity);
                twoStepVerificationActivity.delegateType = 0;
                twoStepVerificationActivity.delegate = chatActivity$$ExternalSyntheticLambda189;
                chatRightsEditActivity2.presentFragment(twoStepVerificationActivity);
                break;
            case 5:
                ChatRightsEditActivity chatRightsEditActivity3 = this.f$0;
                chatRightsEditActivity3.getClass();
                chatRightsEditActivity3.presentFragment(new TwoStepVerificationSetupActivity(6, null));
                break;
        }
    }

    @Override
    public void run(long j) {
        this.f$0.lambda$onDonePressed$21(j);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.setLoading(false);
                return true;
            case 3:
                this.f$0.setLoading(false);
                return true;
            default:
                return this.f$0.lambda$onDonePressed$24(tL_error);
        }
    }
}
