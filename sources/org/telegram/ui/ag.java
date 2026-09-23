package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements org.telegram.ui.Components.pj0 {
    public final int f31782a;
    public final xn f31783b;
    public final boolean f31784c;
    public final MessageObject d;

    public ag(xn xnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f31782a = i10;
        this.f31783b = xnVar;
        this.f31784c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f31782a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final xn xnVar = this.f31783b;
                    if (j3 != xnVar.getUserConfig().getClientUserId() && this.f31784c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = xnVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(xnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        xnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar2.getClass();
                                        }
                                        int i10 = xnVar2.R3;
                                        ai.f fVar = new ai.f(17);
                                        new org.telegram.ui.Components.gs(xnVar2, xnVar2.e, arrayList, arrayList2, channelParticipantArr2, xnVar2.L6, (int) xnVar2.d(), i10, true, fVar).show();
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar3.getClass();
                                        }
                                        int i11 = xnVar3.R3;
                                        ai.f fVar2 = new ai.f(17);
                                        new org.telegram.ui.Components.gs(xnVar3, xnVar3.e, arrayList, arrayList2, channelParticipantArr3, xnVar3.L6, (int) xnVar3.d(), i11, true, fVar2).show();
                                        return;
                                }
                            }
                        });
                        xnVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final xn xnVar2 = this.f31783b;
                xnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != xnVar2.getUserConfig().getClientUserId() && this.f31784c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = xnVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(xnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    xnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    xn xnVar22 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar22.getClass();
                                    }
                                    int i10 = xnVar22.R3;
                                    ai.f fVar = new ai.f(17);
                                    new org.telegram.ui.Components.gs(xnVar22, xnVar22.e, arrayList3, arrayList4, channelParticipantArr22, xnVar22.L6, (int) xnVar22.d(), i10, true, fVar).show();
                                    return;
                                default:
                                    xn xnVar3 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar3.getClass();
                                    }
                                    int i11 = xnVar3.R3;
                                    ai.f fVar2 = new ai.f(17);
                                    new org.telegram.ui.Components.gs(xnVar3, xnVar3.e, arrayList3, arrayList4, channelParticipantArr3, xnVar3.L6, (int) xnVar3.d(), i11, true, fVar2).show();
                                    return;
                            }
                        }
                    });
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
