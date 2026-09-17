package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements org.telegram.ui.Components.pj0 {
    public final int f33113a;
    public final bo f33114b;
    public final boolean f33115c;
    public final MessageObject d;

    public dg(bo boVar, boolean z10, MessageObject messageObject, int i10) {
        this.f33113a = i10;
        this.f33114b = boVar;
        this.f33115c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f33113a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final bo boVar = this.f33114b;
                    if (j3 != boVar.getUserConfig().getClientUserId() && this.f33115c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = boVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(boVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        boVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        bo boVar2 = boVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            boVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            boVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            boVar2.getClass();
                                        }
                                        int i10 = boVar2.R3;
                                        ai.f fVar = new ai.f(17);
                                        new org.telegram.ui.Components.fs(boVar2, boVar2.e, arrayList, arrayList2, channelParticipantArr2, boVar2.L6, (int) boVar2.d(), i10, true, fVar).show();
                                        return;
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            boVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            boVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            boVar3.getClass();
                                        }
                                        int i11 = boVar3.R3;
                                        ai.f fVar2 = new ai.f(17);
                                        new org.telegram.ui.Components.fs(boVar3, boVar3.e, arrayList, arrayList2, channelParticipantArr3, boVar3.L6, (int) boVar3.d(), i11, true, fVar2).show();
                                        return;
                                }
                            }
                        });
                        boVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final bo boVar2 = this.f33114b;
                boVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != boVar2.getUserConfig().getClientUserId() && this.f33115c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = boVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(boVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    boVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    bo boVar22 = boVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        boVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        boVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        boVar22.getClass();
                                    }
                                    int i10 = boVar22.R3;
                                    ai.f fVar = new ai.f(17);
                                    new org.telegram.ui.Components.fs(boVar22, boVar22.e, arrayList3, arrayList4, channelParticipantArr22, boVar22.L6, (int) boVar22.d(), i10, true, fVar).show();
                                    return;
                                default:
                                    bo boVar3 = boVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        boVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        boVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        boVar3.getClass();
                                    }
                                    int i11 = boVar3.R3;
                                    ai.f fVar2 = new ai.f(17);
                                    new org.telegram.ui.Components.fs(boVar3, boVar3.e, arrayList3, arrayList4, channelParticipantArr3, boVar3.L6, (int) boVar3.d(), i11, true, fVar2).show();
                                    return;
                            }
                        }
                    });
                    boVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
