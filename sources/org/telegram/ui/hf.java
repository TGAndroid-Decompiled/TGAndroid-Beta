package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hf implements org.telegram.ui.Components.uh0 {
    public final int f47697a;
    public final an f47698b;
    public final boolean f47699c;
    public final org.telegram.messenger.gj d;

    public hf(an anVar, boolean z10, org.telegram.messenger.gj gjVar, int i7) {
        this.f47697a = i7;
        this.f47698b = anVar;
        this.f47699c = z10;
        this.d = gjVar;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f47697a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final an anVar = this.f47698b;
                    if (j3 != anVar.getUserConfig().e() && this.f47699c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = anVar.getMessagesController().e2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.np.i1(anVar.f45173e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.np.k1(e22);
                        anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.s10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            anVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            anVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            anVar2.getClass();
                                        }
                                        int i7 = anVar2.f45204g4;
                                        org.telegram.messenger.c6 c6Var = new org.telegram.messenger.c6(18);
                                        new org.telegram.ui.Components.rr(anVar2, anVar2.f45173e, arrayList, arrayList2, channelParticipantArr2, anVar2.f45154c7, (int) anVar2.b(), i7, true, c6Var).show();
                                        return;
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            anVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            anVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            anVar3.getClass();
                                        }
                                        int i10 = anVar3.f45204g4;
                                        org.telegram.messenger.c6 c6Var2 = new org.telegram.messenger.c6(18);
                                        new org.telegram.ui.Components.rr(anVar3, anVar3.f45173e, arrayList, arrayList2, channelParticipantArr3, anVar3.f45154c7, (int) anVar3.b(), i10, true, c6Var2).show();
                                        return;
                                }
                            }
                        });
                        anVar.P7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final an anVar2 = this.f47698b;
                anVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != anVar2.getUserConfig().e() && this.f47699c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = anVar2.getMessagesController().e2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.np.i1(anVar2.f45173e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.np.k1(e23);
                    anVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.s10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    an anVar22 = anVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        anVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        anVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        anVar22.getClass();
                                    }
                                    int i7 = anVar22.f45204g4;
                                    org.telegram.messenger.c6 c6Var = new org.telegram.messenger.c6(18);
                                    new org.telegram.ui.Components.rr(anVar22, anVar22.f45173e, arrayList3, arrayList4, channelParticipantArr22, anVar22.f45154c7, (int) anVar22.b(), i7, true, c6Var).show();
                                    return;
                                default:
                                    an anVar3 = anVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        anVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        anVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        anVar3.getClass();
                                    }
                                    int i10 = anVar3.f45204g4;
                                    org.telegram.messenger.c6 c6Var2 = new org.telegram.messenger.c6(18);
                                    new org.telegram.ui.Components.rr(anVar3, anVar3.f45173e, arrayList3, arrayList4, channelParticipantArr3, anVar3.f45154c7, (int) anVar3.b(), i10, true, c6Var2).show();
                                    return;
                            }
                        }
                    });
                    anVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
