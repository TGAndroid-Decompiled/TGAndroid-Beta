package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class DialogsActivity$50$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public DialogsActivity$50$$ExternalSyntheticLambda2(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.AnonymousClass50 anonymousClass50 = (DialogsActivity.AnonymousClass50) this.f$0;
                anonymousClass50.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(anonymousClass50, tL_error, tLObject, (String) this.f$1, this.f$2, 17));
                break;
            case 1:
                SearchAdapterHelper searchAdapterHelper = (SearchAdapterHelper) this.f$0;
                searchAdapterHelper.getClass();
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    searchAdapterHelper.lastFoundChannel = ((String) this.f$1).toLowerCase();
                    int i = searchAdapterHelper.currentAccount;
                    MessagesController.getInstance(i).putUsers(tL_channels_channelParticipants.users, false);
                    MessagesController.getInstance(i).putChats(tL_channels_channelParticipants.chats, false);
                    ArrayList arrayList = searchAdapterHelper.groupSearch;
                    arrayList.clear();
                    LongSparseArray longSparseArray = searchAdapterHelper.groupSearchMap;
                    longSparseArray.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long clientUserId = UserConfig.getInstance(i).getClientUserId();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i2);
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        if (this.f$2 || peerId != clientUserId) {
                            longSparseArray.put(channelParticipant, peerId);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                }
                break;
            case 2:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(channelMonetizationLayout, tL_error, tLObject, (TwoStepVerificationActivity) this.f$1, this.f$2, 11));
                break;
            case 3:
                StickersAlert.AnonymousClass1 anonymousClass1 = (StickersAlert.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(anonymousClass1, tLObject, this.f$2, (AlertDialog) this.f$1, 15));
                break;
            case 4:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(groupCallActivity, tLObject, (TLRPC.ChatFull) this.f$1, this.f$2, 16));
                break;
            case 5:
                ManageLinksActivity manageLinksActivity = (ManageLinksActivity) this.f$0;
                manageLinksActivity.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() <= 0 || (tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f$1) == null) {
                        tL_chatInviteExported = null;
                    } else {
                        for (int i3 = 0; i3 < tL_messages_exportedChatInvites.invites.size(); i3++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i3)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i3);
                            }
                        }
                        tL_chatInviteExported = null;
                    }
                } else {
                    tL_chatInviteExported = null;
                }
                AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda5(manageLinksActivity, tL_chatInviteExported, tL_error, tLObject, this.f$2, 0));
                break;
            case 6:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488((Object) paymentFormActivity, (Object) tL_error, this.f$2, (Object) tLObject, this.f$1, 19));
                break;
            case 7:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(giftsList, (int[]) this.f$1, tLObject, this.f$2, 23));
                break;
            default:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(gifAdapter, tLObject, (String) this.f$1, this.f$2, 24));
                break;
        }
    }

    public DialogsActivity$50$$ExternalSyntheticLambda2(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = obj2;
    }
}
