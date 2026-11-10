package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lf implements org.telegram.ui.Components.qh0 {
    public final int f47594a;
    public final cn f47595b;
    public final boolean f47596c;
    public final org.telegram.messenger.ij d;

    public lf(cn cnVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.f47594a = i7;
        this.f47595b = cnVar;
        this.f47596c = z9;
        this.d = ijVar;
    }

    @Override
    public final void d(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f47594a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final cn cnVar = this.f47595b;
                    if (j3 != cnVar.getUserConfig().e() && this.f47596c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = cnVar.getMessagesController().e2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(cnVar.f44473e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.qp.k1(e22);
                        cnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            cnVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            cnVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            cnVar2.getClass();
                                        }
                                        int i7 = cnVar2.f44492f4;
                                        org.telegram.messenger.rc rcVar = new org.telegram.messenger.rc(14);
                                        new org.telegram.ui.Components.kr(cnVar2, cnVar2.f44473e, arrayList, arrayList2, channelParticipantArr2, cnVar2.f44440b7, (int) cnVar2.b(), i7, true, rcVar).show();
                                        return;
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            cnVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            cnVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            cnVar3.getClass();
                                        }
                                        int i10 = cnVar3.f44492f4;
                                        org.telegram.messenger.rc rcVar2 = new org.telegram.messenger.rc(14);
                                        new org.telegram.ui.Components.kr(cnVar3, cnVar3.f44473e, arrayList, arrayList2, channelParticipantArr3, cnVar3.f44440b7, (int) cnVar3.b(), i10, true, rcVar2).show();
                                        return;
                                }
                            }
                        });
                        cnVar.P7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final cn cnVar2 = this.f47595b;
                cnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != cnVar2.getUserConfig().e() && this.f47596c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = cnVar2.getMessagesController().e2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.qp.i1(cnVar2.f44473e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.qp.k1(e23);
                    cnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    cn cnVar22 = cnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        cnVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        cnVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        cnVar22.getClass();
                                    }
                                    int i7 = cnVar22.f44492f4;
                                    org.telegram.messenger.rc rcVar = new org.telegram.messenger.rc(14);
                                    new org.telegram.ui.Components.kr(cnVar22, cnVar22.f44473e, arrayList3, arrayList4, channelParticipantArr22, cnVar22.f44440b7, (int) cnVar22.b(), i7, true, rcVar).show();
                                    return;
                                default:
                                    cn cnVar3 = cnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        cnVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        cnVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        cnVar3.getClass();
                                    }
                                    int i10 = cnVar3.f44492f4;
                                    org.telegram.messenger.rc rcVar2 = new org.telegram.messenger.rc(14);
                                    new org.telegram.ui.Components.kr(cnVar3, cnVar3.f44473e, arrayList3, arrayList4, channelParticipantArr3, cnVar3.f44440b7, (int) cnVar3.b(), i10, true, rcVar2).show();
                                    return;
                            }
                        }
                    });
                    cnVar2.P7(true);
                    return;
                }
                return;
        }
    }
}
