package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf implements org.telegram.ui.Components.fi0 {
    public final int f49256a;
    public final bn f49257b;
    public final boolean f49258c;
    public final org.telegram.messenger.gj d;

    public kf(bn bnVar, boolean z10, org.telegram.messenger.gj gjVar, int i7) {
        this.f49256a = i7;
        this.f49257b = bnVar;
        this.f49258c = z10;
        this.d = gjVar;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f49256a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final bn bnVar = this.f49257b;
                    if (j3 != bnVar.getUserConfig().e() && this.f49258c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject g22 = bnVar.getMessagesController().g2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(g22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.np.k1(bnVar.f45958e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.np.m1(g22);
                        bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.r10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            bnVar2.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                            bnVar2.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            bnVar2.getClass();
                                        }
                                        int i7 = bnVar2.f45989g4;
                                        org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(20);
                                        new org.telegram.ui.Components.as(bnVar2, bnVar2.f45958e, arrayList, arrayList2, channelParticipantArr2, bnVar2.f45952d7, (int) bnVar2.d(), i7, true, j2Var).show();
                                        return;
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            bnVar3.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                            bnVar3.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            bnVar3.getClass();
                                        }
                                        int i10 = bnVar3.f45989g4;
                                        org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(20);
                                        new org.telegram.ui.Components.as(bnVar3, bnVar3.f45958e, arrayList, arrayList2, channelParticipantArr3, bnVar3.f45952d7, (int) bnVar3.d(), i10, true, j2Var2).show();
                                        return;
                                }
                            }
                        });
                        bnVar.P7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final bn bnVar2 = this.f49257b;
                bnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != bnVar2.getUserConfig().e() && this.f49258c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject g23 = bnVar2.getMessagesController().g2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(g23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.np.k1(bnVar2.f45958e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.np.m1(g23);
                    bnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    bn bnVar22 = bnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        bnVar22.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                        bnVar22.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        bnVar22.getClass();
                                    }
                                    int i7 = bnVar22.f45989g4;
                                    org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(20);
                                    new org.telegram.ui.Components.as(bnVar22, bnVar22.f45958e, arrayList3, arrayList4, channelParticipantArr22, bnVar22.f45952d7, (int) bnVar22.d(), i7, true, j2Var).show();
                                    return;
                                default:
                                    bn bnVar3 = bnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        bnVar3.getMessagesController().f4(tL_channels_channelParticipant.users, false);
                                        bnVar3.getMessagesController().Z3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        bnVar3.getClass();
                                    }
                                    int i10 = bnVar3.f45989g4;
                                    org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(20);
                                    new org.telegram.ui.Components.as(bnVar3, bnVar3.f45958e, arrayList3, arrayList4, channelParticipantArr3, bnVar3.f45952d7, (int) bnVar3.d(), i10, true, j2Var2).show();
                                    return;
                            }
                        }
                    });
                    bnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
