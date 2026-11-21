package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements RequestDelegate {
    public final int f28346a = 0;
    public final mp f28347b;
    public final boolean f28348c;
    public final long d;
    public final TLObject f28349e;

    public zk(mp mpVar, TLRPC.Chat chat, boolean z10, long j3) {
        this.f28347b = mpVar;
        this.f28349e = chat;
        this.f28348c = z10;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        ArrayList arrayList;
        switch (this.f28346a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f28349e;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        boolean z10 = chat.megagroup;
                        mp mpVar = this.f28347b;
                        if (z10) {
                            tr messagesStorage = mpVar.getMessagesStorage();
                            long j10 = chat.f28431id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.f27080a.c(new aq(messagesStorage, j10, zArr, countDownLatch, 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e10) {
                                messagesStorage.o(e10, true);
                            }
                            if (zArr[0]) {
                                return;
                            }
                        }
                        g0.g3(new fi(16, mpVar, tL_channels_channelParticipant));
                        mpVar.getMessagesStorage().m1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        boolean z11 = this.f28348c;
                        long j11 = this.d;
                        if (z11 && Math.abs(mpVar.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            tr messagesStorage2 = mpVar.getMessagesStorage();
                            messagesStorage2.getClass();
                            j3 = j11;
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.f27080a.c(new aq(messagesStorage2, j3, zArr2, countDownLatch2, 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e11) {
                                messagesStorage2.o(e11, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int j12 = mpVar.getUserConfig().j();
                                tL_messageService.f28452id = j12;
                                tL_messageService.local_id = j12;
                                tL_messageService.date = tL_channels_channelParticipant.participant.date;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel;
                                tL_peerChannel.channel_id = j3;
                                tL_messageService.media_unread = true;
                                tL_messageService.unread = true;
                                tL_messageService.post = true;
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == mpVar.getUserConfig().e()) {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                                } else {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                                }
                                tL_messageService.action.users.add(Long.valueOf(mpVar.getUserConfig().e()));
                                tL_messageService.dialog_id = -j3;
                                mpVar.getUserConfig().v(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i7 = 0; i7 < tL_channels_channelParticipant.users.size(); i7++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i7);
                                    concurrentHashMap.put(Long.valueOf(user.f28580id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new fj(mpVar.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != mpVar.getUserConfig().e()) {
                                    mpVar.getMessagesStorage().f27080a.c(new xj(mpVar, arrayList, 3));
                                }
                                mpVar.getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                tr messagesStorage3 = mpVar.getMessagesStorage();
                                long j13 = j3;
                                messagesStorage3.f27080a.c(new np(2, tL_channels_channelParticipant.participant.inviter_id, j13, messagesStorage3));
                                g0.g3(new fm(mpVar, j13, arrayList3, tL_channels_channelParticipant, 4));
                                return;
                            }
                        } else {
                            j3 = j11;
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        tr messagesStorage32 = mpVar.getMessagesStorage();
                        long j132 = j3;
                        messagesStorage32.f27080a.c(new np(2, tL_channels_channelParticipant.participant.inviter_id, j132, messagesStorage32));
                        g0.g3(new fm(mpVar, j132, arrayList32, tL_channels_channelParticipant, 4));
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f28349e;
                if (tL_error == null) {
                    boolean z12 = tLObject instanceof TLRPC.Updates;
                    mp mpVar2 = this.f28347b;
                    if (z12) {
                        mpVar2.V3((TLRPC.Updates) tLObject, false);
                    }
                    if (this.f28348c && !o10.C(user2)) {
                        g0.h3(new ik(mpVar2, this.d, 11), 1000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zk(mp mpVar, boolean z10, TLRPC.User user, long j3) {
        this.f28347b = mpVar;
        this.f28348c = z10;
        this.f28349e = user;
        this.d = j3;
    }
}
