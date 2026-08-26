package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.ReactedHeaderView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer;

public final class LaunchActivity$$ExternalSyntheticLambda51 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public LaunchActivity$$ExternalSyntheticLambda51(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j = this.f$1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda121(tLObject, (MessagesController) obj2, this.f$1, (LinkManager$$ExternalSyntheticLambda21) obj, 0));
                break;
            case 1:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f$1, (Runnable) obj, tLObject, tL_error);
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    ((MessagesController) obj2).putChats(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_contacts_found.chats.size(); i++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i);
                        TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(chat);
                        if (chat.id != j && ChatObject.isBoostSupported(chat)) {
                            arrayList.add(inputPeer);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(22, (SelectorBottomSheet$$ExternalSyntheticLambda3) obj, arrayList));
                }
                break;
            case 3:
                final ReactedHeaderView reactedHeaderView = (ReactedHeaderView) obj2;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList4.get(i2);
                        i2++;
                        if (obj3 instanceof Long) {
                            Long l = (Long) obj3;
                            if (j != l.longValue()) {
                                arrayList2.add(l);
                                arrayList3.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j2 = tL_readParticipantDate.user_id;
                            int i3 = tL_readParticipantDate.date;
                            if (j != j2) {
                                arrayList2.add(Long.valueOf(j2));
                                arrayList3.add(Integer.valueOf(i3));
                            }
                        }
                    }
                    arrayList2.add(Long.valueOf(j));
                    arrayList3.add(0);
                    final ArrayList arrayList5 = new ArrayList();
                    final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = new ShareAlert$$ExternalSyntheticLambda29(5, reactedHeaderView, arrayList5);
                    TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                    boolean zIsChannel = ChatObject.isChannel(chat2);
                    int i4 = reactedHeaderView.currentAccount;
                    if (zIsChannel) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = MessagesController.getInstance(i4).chatReadMarkSizeThreshold;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = MessagesController.getInstance(i4).getInputChannel(chat2.id);
                        final int i5 = 0;
                        ConnectionsManager.getInstance(i4).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i5) {
                                    case 0:
                                        final ReactedHeaderView reactedHeaderView2 = reactedHeaderView;
                                        final ArrayList arrayList6 = arrayList2;
                                        final ArrayList arrayList7 = arrayList5;
                                        final ArrayList arrayList8 = arrayList3;
                                        final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = shareAlert$$ExternalSyntheticLambda29;
                                        final int i6 = 0;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i6) {
                                                    case 0:
                                                        ReactedHeaderView reactedHeaderView3 = reactedHeaderView2;
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i7 = 0; i7 < tL_channels_channelParticipants.users.size(); i7++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i7);
                                                                MessagesController.getInstance(reactedHeaderView3.currentAccount).putUser(user, false);
                                                                int iIndexOf = arrayList6.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList7.add(new ReactedHeaderView.UserSeen(((Integer) arrayList8.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda210.run();
                                                        break;
                                                    default:
                                                        ReactedHeaderView reactedHeaderView4 = reactedHeaderView2;
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i8 = 0; i8 < tL_messages_chatFull.users.size(); i8++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i8);
                                                                MessagesController.getInstance(reactedHeaderView4.currentAccount).putUser(user2, false);
                                                                int iIndexOf2 = arrayList6.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList7.add(new ReactedHeaderView.UserSeen(((Integer) arrayList8.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda210.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final ReactedHeaderView reactedHeaderView3 = reactedHeaderView;
                                        final ArrayList arrayList9 = arrayList2;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ArrayList arrayList11 = arrayList3;
                                        final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda211 = shareAlert$$ExternalSyntheticLambda29;
                                        final int i7 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i7) {
                                                    case 0:
                                                        ReactedHeaderView reactedHeaderView4 = reactedHeaderView3;
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i8 = 0; i8 < tL_channels_channelParticipants.users.size(); i8++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i8);
                                                                MessagesController.getInstance(reactedHeaderView4.currentAccount).putUser(user, false);
                                                                int iIndexOf = arrayList9.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList10.add(new ReactedHeaderView.UserSeen(((Integer) arrayList11.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda211.run();
                                                        break;
                                                    default:
                                                        ReactedHeaderView reactedHeaderView5 = reactedHeaderView3;
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i9 = 0; i9 < tL_messages_chatFull.users.size(); i9++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i9);
                                                                MessagesController.getInstance(reactedHeaderView5.currentAccount).putUser(user2, false);
                                                                int iIndexOf2 = arrayList9.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList10.add(new ReactedHeaderView.UserSeen(((Integer) arrayList11.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda211.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat2.id;
                        final int i6 = 1;
                        ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i6) {
                                    case 0:
                                        final ReactedHeaderView reactedHeaderView2 = reactedHeaderView;
                                        final ArrayList arrayList6 = arrayList2;
                                        final ArrayList arrayList7 = arrayList5;
                                        final ArrayList arrayList8 = arrayList3;
                                        final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = shareAlert$$ExternalSyntheticLambda29;
                                        final int i7 = 0;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i7) {
                                                    case 0:
                                                        ReactedHeaderView reactedHeaderView4 = reactedHeaderView2;
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i8 = 0; i8 < tL_channels_channelParticipants.users.size(); i8++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i8);
                                                                MessagesController.getInstance(reactedHeaderView4.currentAccount).putUser(user, false);
                                                                int iIndexOf = arrayList6.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList7.add(new ReactedHeaderView.UserSeen(((Integer) arrayList8.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda210.run();
                                                        break;
                                                    default:
                                                        ReactedHeaderView reactedHeaderView5 = reactedHeaderView2;
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i9 = 0; i9 < tL_messages_chatFull.users.size(); i9++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i9);
                                                                MessagesController.getInstance(reactedHeaderView5.currentAccount).putUser(user2, false);
                                                                int iIndexOf2 = arrayList6.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList7.add(new ReactedHeaderView.UserSeen(((Integer) arrayList8.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda210.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final ReactedHeaderView reactedHeaderView3 = reactedHeaderView;
                                        final ArrayList arrayList9 = arrayList2;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ArrayList arrayList11 = arrayList3;
                                        final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda211 = shareAlert$$ExternalSyntheticLambda29;
                                        final int i8 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i8) {
                                                    case 0:
                                                        ReactedHeaderView reactedHeaderView4 = reactedHeaderView3;
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i9 = 0; i9 < tL_channels_channelParticipants.users.size(); i9++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i9);
                                                                MessagesController.getInstance(reactedHeaderView4.currentAccount).putUser(user, false);
                                                                int iIndexOf = arrayList9.indexOf(Long.valueOf(user.id));
                                                                if (!user.self && iIndexOf >= 0) {
                                                                    arrayList10.add(new ReactedHeaderView.UserSeen(((Integer) arrayList11.get(iIndexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda211.run();
                                                        break;
                                                    default:
                                                        ReactedHeaderView reactedHeaderView5 = reactedHeaderView3;
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i10 = 0; i10 < tL_messages_chatFull.users.size(); i10++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i10);
                                                                MessagesController.getInstance(reactedHeaderView5.currentAccount).putUser(user2, false);
                                                                int iIndexOf2 = arrayList9.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && iIndexOf2 >= 0) {
                                                                    arrayList10.add(new ReactedHeaderView.UserSeen(((Integer) arrayList11.get(iIndexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        shareAlert$$ExternalSyntheticLambda211.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    }
                }
                break;
            case 4:
                StarsController starsController = (StarsController) obj2;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda126(starsController, tLObject, this.f$1, (Utilities.Callback) obj, 6));
                break;
            case 5:
                StarsController.PendingPaidReactions pendingPaidReactions = (StarsController.PendingPaidReactions) obj;
                pendingPaidReactions.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda177(pendingPaidReactions, tLObject, (MessagesController) obj2, tL_error, this.f$1, 14));
                break;
            default:
                LivePlayer livePlayer = (LivePlayer) obj2;
                livePlayer.getClass();
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    int i7 = livePlayer.currentAccount;
                    MessagesController.getInstance(i7).putUsers(groupparticipants.users, false);
                    MessagesController.getInstance(i7).putChats(groupparticipants.chats, false);
                    if (livePlayer.instance != null) {
                        UserConfig.getInstance(i7).getClientUserId();
                        ArrayList arrayList6 = new ArrayList();
                        int i8 = 0;
                        while (true) {
                            int[] iArr = (int[]) obj;
                            if (i8 >= iArr.length) {
                                livePlayer.instance.onMediaDescriptionAvailable(j, (VoIPService.RequestedParticipant[]) arrayList6.toArray(new VoIPService.RequestedParticipant[0]));
                            } else {
                                int i9 = iArr[i8];
                                ArrayList<TLRPC.GroupCallParticipant> arrayList7 = groupparticipants.participants;
                                int size2 = arrayList7.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList7.get(i10);
                                    i10++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i9) {
                                        arrayList6.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i9));
                                    }
                                    break;
                                }
                                i8++;
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda51(StarsController.PendingPaidReactions pendingPaidReactions, MessagesController messagesController, long j) {
        this.$r8$classId = 5;
        this.f$2 = pendingPaidReactions;
        this.f$0 = messagesController;
        this.f$1 = j;
    }

    public LaunchActivity$$ExternalSyntheticLambda51(LivePlayer livePlayer, int[] iArr, long j) {
        this.$r8$classId = 6;
        this.f$0 = livePlayer;
        this.f$2 = iArr;
        this.f$1 = j;
    }
}
