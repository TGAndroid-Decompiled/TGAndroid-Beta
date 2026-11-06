package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf implements org.telegram.ui.Components.qh0 {
    public final int f47154a;
    public final an f47155b;
    public final boolean f47156c;
    public final org.telegram.messenger.ij d;

    public kf(an anVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.f47154a = i7;
        this.f47155b = anVar;
        this.f47156c = z9;
        this.d = ijVar;
    }

    @Override
    public final void b(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f47154a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final an anVar = this.f47155b;
                    if (j3 != anVar.getUserConfig().e() && this.f47156c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = anVar.getMessagesController().e2(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(anVar.f43747e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.qp.k1(e22);
                        anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new org.telegram.messenger.v10() {
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
                                        int i7 = anVar2.f43766f4;
                                        org.telegram.messenger.pd pdVar = new org.telegram.messenger.pd(12);
                                        new org.telegram.ui.Components.lr(anVar2, anVar2.f43747e, arrayList, arrayList2, channelParticipantArr2, anVar2.f43714b7, (int) anVar2.b(), i7, true, pdVar).show();
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
                                        int i10 = anVar3.f43766f4;
                                        org.telegram.messenger.pd pdVar2 = new org.telegram.messenger.pd(12);
                                        new org.telegram.ui.Components.lr(anVar3, anVar3.f43747e, arrayList, arrayList2, channelParticipantArr3, anVar3.f43714b7, (int) anVar3.b(), i10, true, pdVar2).show();
                                        return;
                                }
                            }
                        });
                        anVar.O7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final an anVar2 = this.f47155b;
                anVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != anVar2.getUserConfig().e() && this.f47156c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = anVar2.getMessagesController().e2(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.qp.i1(anVar2.f43747e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.qp.k1(e23);
                    anVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new d3.b(1), new org.telegram.messenger.v10() {
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
                                    int i7 = anVar22.f43766f4;
                                    org.telegram.messenger.pd pdVar = new org.telegram.messenger.pd(12);
                                    new org.telegram.ui.Components.lr(anVar22, anVar22.f43747e, arrayList3, arrayList4, channelParticipantArr22, anVar22.f43714b7, (int) anVar22.b(), i7, true, pdVar).show();
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
                                    int i10 = anVar3.f43766f4;
                                    org.telegram.messenger.pd pdVar2 = new org.telegram.messenger.pd(12);
                                    new org.telegram.ui.Components.lr(anVar3, anVar3.f43747e, arrayList3, arrayList4, channelParticipantArr3, anVar3.f43714b7, (int) anVar3.b(), i10, true, pdVar2).show();
                                    return;
                            }
                        }
                    });
                    anVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
