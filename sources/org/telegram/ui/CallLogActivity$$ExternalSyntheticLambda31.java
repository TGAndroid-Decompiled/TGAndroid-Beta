package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class CallLogActivity$$ExternalSyntheticLambda31 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public CallLogActivity$$ExternalSyntheticLambda31(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.f$0;
                callLogActivity.getClass();
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    callLogActivity.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z = this.f$1;
                        tL_messages_deletePhoneCallHistory.revoke = z;
                        callLogActivity.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new CallLogActivity$$ExternalSyntheticLambda31(0, callLogActivity, z));
                    }
                }
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$updateTimerProc$156(this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f$0).lambda$acknowledgeCall$13(this.f$1, tLObject, tL_error);
                break;
            case 3:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(chatMessageCellDelegate, tLObject, this.f$1, 9));
                break;
            case 4:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda49(chatEditActivity, 3));
                } else {
                    chatEditActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(13, chatEditActivity, this.f$1));
                }
                break;
            case 5:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                chatEditTypeActivity.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(chatEditTypeActivity, tL_error, tLObject, this.f$1, 7));
                break;
            case 6:
                PermanentLinkBottomSheet permanentLinkBottomSheet = (PermanentLinkBottomSheet) this.f$0;
                permanentLinkBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(permanentLinkBottomSheet, tL_error, tLObject, this.f$1));
                break;
            case 7:
                GroupInviteActivity groupInviteActivity = (GroupInviteActivity) this.f$0;
                groupInviteActivity.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(groupInviteActivity, tL_error, tLObject, this.f$1, 18));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15((PassportActivity.AnonymousClass8) this.f$0, tL_error, tLObject, this.f$1, 20));
                break;
            case 9:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(paymentFormActivity, tL_error, tLObject, this.f$1, 22));
                break;
            case 10:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                photoPickerActivity.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(photoPickerActivity, tLObject, this.f$1, 28));
                }
                break;
            case 11:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(searchAdapter, tLObject, this.f$1, 8));
                break;
            case 12:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.f$0;
                twoStepVerificationSetupActivity.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(twoStepVerificationSetupActivity, tL_error, tLObject, this.f$1, 26));
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f$0;
                wallpapersListActivity.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(wallpapersListActivity, tLObject, this.f$1, 10));
                break;
        }
    }
}
