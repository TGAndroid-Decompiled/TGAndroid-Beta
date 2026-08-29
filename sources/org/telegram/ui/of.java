package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class of implements org.telegram.ui.Components.oj0 {
    public final int f41107a;
    public final tn f41108b;
    public final boolean f41109c;
    public final MessageObject d;

    public of(tn tnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f41107a = i10;
        this.f41108b = tnVar;
        this.f41109c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41107a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final tn tnVar = this.f41108b;
                    if (j10 != tnVar.getUserConfig().getClientUserId() && this.f41109c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = tnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(tnVar.f42787e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        tnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        tn tnVar2 = tnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            tnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            tnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            tnVar2.getClass();
                                        }
                                        int i10 = tnVar2.N3;
                                        ag.o0 o0Var = new ag.o0(24);
                                        new org.telegram.ui.Components.as(tnVar2, tnVar2.f42787e, arrayList, arrayList2, channelParticipantArr2, tnVar2.H6, (int) tnVar2.b(), i10, true, o0Var).show();
                                        return;
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            tnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            tnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            tnVar3.getClass();
                                        }
                                        int i11 = tnVar3.N3;
                                        ag.o0 o0Var2 = new ag.o0(24);
                                        new org.telegram.ui.Components.as(tnVar3, tnVar3.f42787e, arrayList, arrayList2, channelParticipantArr3, tnVar3.H6, (int) tnVar3.b(), i11, true, o0Var2).show();
                                        return;
                                }
                            }
                        });
                        tnVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final tn tnVar2 = this.f41108b;
                tnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != tnVar2.getUserConfig().getClientUserId() && this.f41109c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = tnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(tnVar2.f42787e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    tnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    tn tnVar22 = tnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        tnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        tnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        tnVar22.getClass();
                                    }
                                    int i10 = tnVar22.N3;
                                    ag.o0 o0Var = new ag.o0(24);
                                    new org.telegram.ui.Components.as(tnVar22, tnVar22.f42787e, arrayList3, arrayList4, channelParticipantArr22, tnVar22.H6, (int) tnVar22.b(), i10, true, o0Var).show();
                                    return;
                                default:
                                    tn tnVar3 = tnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        tnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        tnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        tnVar3.getClass();
                                    }
                                    int i11 = tnVar3.N3;
                                    ag.o0 o0Var2 = new ag.o0(24);
                                    new org.telegram.ui.Components.as(tnVar3, tnVar3.f42787e, arrayList3, arrayList4, channelParticipantArr3, tnVar3.H6, (int) tnVar3.b(), i11, true, o0Var2).show();
                                    return;
                            }
                        }
                    });
                    tnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
