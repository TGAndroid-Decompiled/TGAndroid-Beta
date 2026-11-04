package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gf implements org.telegram.ui.Components.th0 {
    public final int f45649a;
    public final wm f45650b;
    public final boolean f45651c;
    public final org.telegram.messenger.zi d;

    public gf(wm wmVar, boolean z10, org.telegram.messenger.zi ziVar, int i3) {
        this.f45649a = i3;
        this.f45650b = wmVar;
        this.f45651c = z10;
        this.d = ziVar;
    }

    @Override
    public final void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f45649a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final wm wmVar = this.f45650b;
                    if (j10 != wmVar.getUserConfig().e() && this.f45651c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject e22 = wmVar.getMessagesController().e2(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(wmVar.f51292e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.hp.k1(e22);
                        wmVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new c3.b(1), new org.telegram.messenger.n10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wmVar2.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            wmVar2.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wmVar2.getClass();
                                        }
                                        int i3 = wmVar2.f51325g4;
                                        org.telegram.messenger.hc hcVar = new org.telegram.messenger.hc(16);
                                        new org.telegram.ui.Components.lr(wmVar2, wmVar2.f51292e, arrayList, arrayList2, channelParticipantArr2, wmVar2.f51272c7, (int) wmVar2.b(), i3, true, hcVar).show();
                                        return;
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wmVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                            wmVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wmVar3.getClass();
                                        }
                                        int i10 = wmVar3.f51325g4;
                                        org.telegram.messenger.hc hcVar2 = new org.telegram.messenger.hc(16);
                                        new org.telegram.ui.Components.lr(wmVar3, wmVar3.f51292e, arrayList, arrayList2, channelParticipantArr3, wmVar3.f51272c7, (int) wmVar3.b(), i10, true, hcVar2).show();
                                        return;
                                }
                            }
                        });
                        wmVar.O7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final wm wmVar2 = this.f45650b;
                wmVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != wmVar2.getUserConfig().e() && this.f45651c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject e23 = wmVar2.getMessagesController().e2(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(e23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.hp.i1(wmVar2.f51292e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.hp.k1(e23);
                    wmVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new c3.b(1), new org.telegram.messenger.n10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    wm wmVar22 = wmVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wmVar22.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        wmVar22.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wmVar22.getClass();
                                    }
                                    int i3 = wmVar22.f51325g4;
                                    org.telegram.messenger.hc hcVar = new org.telegram.messenger.hc(16);
                                    new org.telegram.ui.Components.lr(wmVar22, wmVar22.f51292e, arrayList3, arrayList4, channelParticipantArr22, wmVar22.f51272c7, (int) wmVar22.b(), i3, true, hcVar).show();
                                    return;
                                default:
                                    wm wmVar3 = wmVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wmVar3.getMessagesController().Y3(tL_channels_channelParticipant.users, false);
                                        wmVar3.getMessagesController().S3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wmVar3.getClass();
                                    }
                                    int i10 = wmVar3.f51325g4;
                                    org.telegram.messenger.hc hcVar2 = new org.telegram.messenger.hc(16);
                                    new org.telegram.ui.Components.lr(wmVar3, wmVar3.f51292e, arrayList3, arrayList4, channelParticipantArr3, wmVar3.f51272c7, (int) wmVar3.b(), i10, true, hcVar2).show();
                                    return;
                            }
                        }
                    });
                    wmVar2.O7(true);
                    return;
                }
                return;
        }
    }
}
