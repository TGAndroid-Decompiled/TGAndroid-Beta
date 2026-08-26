package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda104;

public final class ProfileActivity$$ExternalSyntheticLambda114 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final Object f$5;

    public ProfileActivity$$ExternalSyntheticLambda114(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = arrayList3;
        this.f$5 = delayedMessage;
        this.f$4 = z;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                final ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f$1;
                final TLRPC.User user = (TLRPC.User) this.f$2;
                final TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f$3;
                final boolean z = this.f$4;
                if (channelParticipant != null) {
                    final int iIntValue = num.intValue();
                    final boolean[] zArr = new boolean[1];
                    ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(user.id, profileActivity.chatId, channelParticipant.admin_rights, profileActivity.currentChat.default_banned_rights, channelParticipant.banned_rights, channelParticipant.rank, iIntValue) {
                        public final boolean[] val$needShowBulletin;
                        public final TLRPC.User val$user;

                        public AnonymousClass36(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, final int iIntValue2) {
                            super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, iIntValue2, true, false, null);
                            zArr = zArr;
                            user = user;
                        }

                        @Override
                        public final void onTransitionAnimationEnd(boolean z2, boolean z3) {
                            if (!z2 && z3 && zArr[0]) {
                                ProfileActivity profileActivity2 = ProfileActivity.this;
                                if (BulletinFactory.canShowBulletin(profileActivity2)) {
                                    BulletinFactory.createPromoteToAdminBulletin(profileActivity2, user.first_name).show();
                                }
                            }
                        }
                    };
                    chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                        public final int val$action;
                        public final boolean val$editingAdmin;
                        public final boolean[] val$needShowBulletin;
                        public final TLRPC.ChatParticipant val$participant;

                        public AnonymousClass37() {
                            i = iIntValue2;
                            chatParticipant = chatParticipant;
                            z = z;
                            zArr = zArr;
                        }

                        @Override
                        public final void didChangeOwner(TLRPC.User user2) {
                            ProfileActivity profileActivity2 = ProfileActivity.this;
                            profileActivity2.undoView.showWithAction(-profileActivity2.chatId, profileActivity2.currentChat.megagroup ? 10 : 9, user2, (Object) null, (Runnable) null, (Runnable) null);
                        }

                        @Override
                        public final void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
                            TLRPC.ChatFull chatFull;
                            boolean z2;
                            TLRPC.ChatParticipant chatParticipant2 = chatParticipant;
                            ProfileActivity profileActivity2 = ProfileActivity.this;
                            int i2 = i;
                            if (i2 == 0) {
                                if (chatParticipant2 instanceof TLRPC.TL_chatChannelParticipant) {
                                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant2;
                                    if (i == 1) {
                                        TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                                        tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                                        tL_channelParticipantAdmin.flags |= 4;
                                    } else {
                                        tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                                    }
                                    tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity2.getUserConfig().getClientUserId();
                                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                                    TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
                                    channelParticipant2.peer.user_id = chatParticipant2.user_id;
                                    channelParticipant2.date = chatParticipant2.date;
                                    channelParticipant2.banned_rights = tL_chatBannedRights;
                                    channelParticipant2.admin_rights = tL_chatAdminRights;
                                    channelParticipant2.rank = str;
                                } else if (chatParticipant2 != null) {
                                    TLRPC.ChatParticipant tL_chatParticipantAdmin = i == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                                    tL_chatParticipantAdmin.user_id = chatParticipant2.user_id;
                                    tL_chatParticipantAdmin.date = chatParticipant2.date;
                                    tL_chatParticipantAdmin.inviter_id = chatParticipant2.inviter_id;
                                    int iIndexOf = profileActivity2.chatInfo.participants.participants.indexOf(chatParticipant2);
                                    if (iIndexOf >= 0) {
                                        profileActivity2.chatInfo.participants.participants.set(iIndexOf, tL_chatParticipantAdmin);
                                    }
                                }
                                if (i != 1 || z) {
                                    return;
                                }
                                zArr[0] = true;
                                return;
                            }
                            if (i2 == 1 && i == 0 && profileActivity2.currentChat.megagroup && (chatFull = profileActivity2.chatInfo) != null && chatFull.participants != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= profileActivity2.chatInfo.participants.participants.size()) {
                                        z2 = false;
                                        break;
                                    } else {
                                        if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity2.chatInfo.participants.participants.get(i3)).channelParticipant.peer) == chatParticipant2.user_id) {
                                            TLRPC.ChatFull chatFull2 = profileActivity2.chatInfo;
                                            chatFull2.participants_count--;
                                            chatFull2.participants.participants.remove(i3);
                                            z2 = true;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                TLRPC.ChatFull chatFull3 = profileActivity2.chatInfo;
                                if (chatFull3 != null && chatFull3.participants != null) {
                                    for (int i4 = 0; i4 < profileActivity2.chatInfo.participants.participants.size(); i4++) {
                                        if (profileActivity2.chatInfo.participants.participants.get(i4).user_id == chatParticipant2.user_id) {
                                            profileActivity2.chatInfo.participants.participants.remove(i4);
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z2) {
                                    profileActivity2.updateOnlineCount(true);
                                    profileActivity2.updateRowsIds();
                                    profileActivity2.listAdapter.mObservable.notifyChanged();
                                }
                            }
                        }
                    };
                    profileActivity.presentFragment(chatRightsEditActivity);
                } else {
                    final int iIntValue2 = num.intValue();
                    final boolean[] zArr2 = new boolean[1];
                    ChatRightsEditActivity chatRightsEditActivity2 = new ChatRightsEditActivity(user.id, profileActivity.chatId, null, profileActivity.currentChat.default_banned_rights, null, (String) this.f$5, iIntValue2) {
                        public final boolean[] val$needShowBulletin;
                        public final TLRPC.User val$user;

                        public AnonymousClass36(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, final int iIntValue3) {
                            super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, iIntValue3, true, false, null);
                            zArr = zArr2;
                            user = user;
                        }

                        @Override
                        public final void onTransitionAnimationEnd(boolean z2, boolean z3) {
                            if (!z2 && z3 && zArr[0]) {
                                ProfileActivity profileActivity2 = ProfileActivity.this;
                                if (BulletinFactory.canShowBulletin(profileActivity2)) {
                                    BulletinFactory.createPromoteToAdminBulletin(profileActivity2, user.first_name).show();
                                }
                            }
                        }
                    };
                    chatRightsEditActivity2.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                        public final int val$action;
                        public final boolean val$editingAdmin;
                        public final boolean[] val$needShowBulletin;
                        public final TLRPC.ChatParticipant val$participant;

                        public AnonymousClass37() {
                            i = iIntValue3;
                            chatParticipant = chatParticipant;
                            z = z;
                            zArr = zArr2;
                        }

                        @Override
                        public final void didChangeOwner(TLRPC.User user2) {
                            ProfileActivity profileActivity2 = ProfileActivity.this;
                            profileActivity2.undoView.showWithAction(-profileActivity2.chatId, profileActivity2.currentChat.megagroup ? 10 : 9, user2, (Object) null, (Runnable) null, (Runnable) null);
                        }

                        @Override
                        public final void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
                            TLRPC.ChatFull chatFull;
                            boolean z2;
                            TLRPC.ChatParticipant chatParticipant2 = chatParticipant;
                            ProfileActivity profileActivity2 = ProfileActivity.this;
                            int i2 = i;
                            if (i2 == 0) {
                                if (chatParticipant2 instanceof TLRPC.TL_chatChannelParticipant) {
                                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant2;
                                    if (i == 1) {
                                        TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                                        tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                                        tL_channelParticipantAdmin.flags |= 4;
                                    } else {
                                        tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                                    }
                                    tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity2.getUserConfig().getClientUserId();
                                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                                    TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
                                    channelParticipant2.peer.user_id = chatParticipant2.user_id;
                                    channelParticipant2.date = chatParticipant2.date;
                                    channelParticipant2.banned_rights = tL_chatBannedRights;
                                    channelParticipant2.admin_rights = tL_chatAdminRights;
                                    channelParticipant2.rank = str;
                                } else if (chatParticipant2 != null) {
                                    TLRPC.ChatParticipant tL_chatParticipantAdmin = i == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                                    tL_chatParticipantAdmin.user_id = chatParticipant2.user_id;
                                    tL_chatParticipantAdmin.date = chatParticipant2.date;
                                    tL_chatParticipantAdmin.inviter_id = chatParticipant2.inviter_id;
                                    int iIndexOf = profileActivity2.chatInfo.participants.participants.indexOf(chatParticipant2);
                                    if (iIndexOf >= 0) {
                                        profileActivity2.chatInfo.participants.participants.set(iIndexOf, tL_chatParticipantAdmin);
                                    }
                                }
                                if (i != 1 || z) {
                                    return;
                                }
                                zArr[0] = true;
                                return;
                            }
                            if (i2 == 1 && i == 0 && profileActivity2.currentChat.megagroup && (chatFull = profileActivity2.chatInfo) != null && chatFull.participants != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= profileActivity2.chatInfo.participants.participants.size()) {
                                        z2 = false;
                                        break;
                                    } else {
                                        if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity2.chatInfo.participants.participants.get(i3)).channelParticipant.peer) == chatParticipant2.user_id) {
                                            TLRPC.ChatFull chatFull2 = profileActivity2.chatInfo;
                                            chatFull2.participants_count--;
                                            chatFull2.participants.participants.remove(i3);
                                            z2 = true;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                TLRPC.ChatFull chatFull3 = profileActivity2.chatInfo;
                                if (chatFull3 != null && chatFull3.participants != null) {
                                    for (int i4 = 0; i4 < profileActivity2.chatInfo.participants.participants.size(); i4++) {
                                        if (profileActivity2.chatInfo.participants.participants.get(i4).user_id == chatParticipant2.user_id) {
                                            profileActivity2.chatInfo.participants.participants.remove(i4);
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z2) {
                                    profileActivity2.updateOnlineCount(true);
                                    profileActivity2.updateRowsIds();
                                    profileActivity2.listAdapter.mObservable.notifyChanged();
                                }
                            }
                        }
                    };
                    profileActivity.presentFragment(chatRightsEditActivity2);
                }
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequestMulti$64((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (SendMessagesHelper.DelayedMessage) this.f$5, this.f$4, (TLObject) obj);
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                int i = selectAnimatedEmojiDialog.currentAccount;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$1;
                boolean z2 = this.f$4;
                String str = (String) this.f$5;
                if (z2) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i).getStickerSets(5);
                    for (int i2 = 0; i2 < stickerSets.size(); i2++) {
                        if (stickerSets.get(i2).documents != null && (arrayList2 = stickerSets.get(i2).documents) != null) {
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i3), null);
                                long j = arrayList2.get(i3).id;
                                if (strFindAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j)) && str.contains(strFindAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i).getFeaturedEmojiSets();
                    for (int i4 = 0; i4 < featuredEmojiSets.size(); i4++) {
                        if ((featuredEmojiSets.get(i4) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i4)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i4)).documents) != null) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                String strFindAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i5), null);
                                long j2 = arrayList.get(i5).id;
                                if (strFindAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j2)) && str.contains(strFindAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j2));
                                }
                            }
                        }
                    }
                    runnable.run();
                } else {
                    MediaDataController.getInstance(i).getEmojiSuggestions(SelectAnimatedEmojiDialog.lastSearchKeyboardLanguage, str, false, new StarsController$$ExternalSyntheticLambda104(selectAnimatedEmojiDialog, linkedHashSet, (HashMap) this.f$2, (ArrayList) this.f$3, runnable), null, true, selectAnimatedEmojiDialog.type == 3, false, 30);
                }
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda114(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z, String str) {
        this.f$0 = profileActivity;
        this.f$1 = channelParticipant;
        this.f$2 = user;
        this.f$3 = chatParticipant;
        this.f$4 = z;
        this.f$5 = str;
    }

    public ProfileActivity$$ExternalSyntheticLambda114(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, boolean z, LinkedHashSet linkedHashSet, String str, HashMap map, ArrayList arrayList) {
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$4 = z;
        this.f$1 = linkedHashSet;
        this.f$5 = str;
        this.f$2 = map;
        this.f$3 = arrayList;
    }
}
