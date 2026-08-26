package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda87;

public final class LivePlayer$$ExternalSyntheticLambda15 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public LivePlayer$$ExternalSyntheticLambda15(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                livePlayer.getClass();
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    int i = livePlayer.currentAccount;
                    MessagesController.getInstance(i).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i).putChats(groupparticipants.chats, false);
                    if (livePlayer.instance != null) {
                        UserConfig.getInstance(i).getClientUserId();
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            int[] iArr = (int[]) this.f$1;
                            if (i2 >= iArr.length) {
                                livePlayer.instance.onMediaDescriptionAvailable(this.f$2, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                            } else {
                                int i3 = iArr[i2];
                                ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                                int size = arrayList2.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i4);
                                    i4++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i3) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i3));
                                    }
                                    break;
                                }
                                i2++;
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((ConferenceCall) this.f$0).lambda$requestLastBlock$3(this.f$2, (Runnable) this.f$1, tLObject, tL_error);
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    ((MessagesController) this.f$0).putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i5 = 0; i5 < tL_contacts_found.chats.size(); i5++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i5);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.id != this.f$2 && ChatObject.isBoostSupported(chat)) {
                            arrayList3.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(3, (SelectorBottomSheet$$ExternalSyntheticLambda3) this.f$1, arrayList3));
                }
                break;
            case 3:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda87(starsController, tLObject, this.f$2, (Utilities.Callback) this.f$1, 0));
                break;
            default:
                StarsController.PendingPaidReactions pendingPaidReactions = (StarsController.PendingPaidReactions) this.f$0;
                pendingPaidReactions.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(pendingPaidReactions, tLObject, (MessagesController) this.f$1, tL_error, this.f$2, 14));
                break;
        }
    }

    public LivePlayer$$ExternalSyntheticLambda15(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }
}
