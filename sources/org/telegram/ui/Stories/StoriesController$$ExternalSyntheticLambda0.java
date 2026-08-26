package org.telegram.ui.Stories;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda8;

public final class StoriesController$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final StoriesController f$0;

    public StoriesController$$ExternalSyntheticLambda0(StoriesController storiesController, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesController;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                StoriesController storiesController = this.f$0;
                storiesController.getClass();
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    MessagesController.getInstance(storiesController.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda9(storiesController, 0));
                    break;
                }
                break;
            case 1:
                StoriesController storiesController2 = this.f$0;
                storiesController2.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(storiesController2, tLObject, tL_error, 4));
                break;
            case 2:
                final StoriesController storiesController3 = this.f$0;
                storiesController3.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                StoriesController storiesController4 = storiesController3;
                                storiesController4.getClass();
                                TLObject tLObject2 = tLObject;
                                boolean z = tLObject2 instanceof TLRPC.TL_contacts_blocked;
                                HashSet hashSet = storiesController4.blocklist;
                                int i2 = storiesController4.currentAccount;
                                if (z) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i2).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i2).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    storiesController4.blocklistCount = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    storiesController4.blocklistFull = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i2).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i2).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i4);
                                        i4++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    storiesController4.blocklistCount = tL_contacts_blockedSlice.count;
                                    storiesController4.blocklistFull = hashSet.size() >= storiesController4.blocklistCount;
                                }
                                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                storiesController4.blocklistLoading = false;
                                storiesController4.lastBlocklistRequested = System.currentTimeMillis();
                                break;
                            default:
                                StoriesController storiesController5 = storiesController3;
                                ArrayList arrayList3 = storiesController5.sendAs;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                boolean z2 = tLObject3 instanceof TLRPC.TL_messages_chats;
                                int i5 = storiesController5.currentAccount;
                                if (z2) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i5).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i6 = 0;
                                    while (i6 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i6);
                                        i6++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                storiesController5.loadingSendAs = false;
                                storiesController5.loadedSendAs = true;
                                NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                final StoriesController storiesController4 = this.f$0;
                storiesController4.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                StoriesController storiesController5 = storiesController4;
                                storiesController5.getClass();
                                TLObject tLObject2 = tLObject;
                                boolean z = tLObject2 instanceof TLRPC.TL_contacts_blocked;
                                HashSet hashSet = storiesController5.blocklist;
                                int i3 = storiesController5.currentAccount;
                                if (z) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i3).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i3).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i4 = 0;
                                    while (i4 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i4);
                                        i4++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    storiesController5.blocklistCount = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    storiesController5.blocklistFull = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i3).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i3).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i5);
                                        i5++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    storiesController5.blocklistCount = tL_contacts_blockedSlice.count;
                                    storiesController5.blocklistFull = hashSet.size() >= storiesController5.blocklistCount;
                                }
                                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                storiesController5.blocklistLoading = false;
                                storiesController5.lastBlocklistRequested = System.currentTimeMillis();
                                break;
                            default:
                                StoriesController storiesController6 = storiesController4;
                                ArrayList arrayList3 = storiesController6.sendAs;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                boolean z2 = tLObject3 instanceof TLRPC.TL_messages_chats;
                                int i6 = storiesController6.currentAccount;
                                if (z2) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i6).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i7 = 0;
                                    while (i7 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i7);
                                        i7++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                storiesController6.loadingSendAs = false;
                                storiesController6.loadedSendAs = true;
                                NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 4:
                StoriesController storiesController5 = this.f$0;
                storiesController5.getClass();
                AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda9(storiesController5, 1));
                break;
            default:
                StoriesController storiesController6 = this.f$0;
                storiesController6.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda9(storiesController6, 1));
                }
                break;
        }
    }
}
