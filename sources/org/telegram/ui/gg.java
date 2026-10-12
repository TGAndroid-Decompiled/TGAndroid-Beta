package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gg implements org.telegram.ui.Components.wk0 {
    public final int f38036a;
    public final eo f38037b;
    public final boolean f38038c;
    public final MessageObject d;

    public gg(eo eoVar, boolean z10, MessageObject messageObject, int i10) {
        this.f38036a = i10;
        this.f38037b = eoVar;
        this.f38038c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f38036a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final eo eoVar = this.f38037b;
                    if (j3 != eoVar.getUserConfig().getClientUserId() && this.f38038c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = eoVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(eoVar.f37246e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        eoVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        eo eoVar2 = eoVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            eoVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            eoVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            eoVar2.getClass();
                                        }
                                        int i10 = eoVar2.R3;
                                        ai.f fVar = new ai.f(17);
                                        new org.telegram.ui.Components.xs(eoVar2, eoVar2.f37246e, arrayList, arrayList2, channelParticipantArr2, eoVar2.L6, (int) eoVar2.d(), i10, true, fVar).show();
                                        return;
                                    default:
                                        eo eoVar3 = eoVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            eoVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            eoVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            eoVar3.getClass();
                                        }
                                        int i11 = eoVar3.R3;
                                        ai.f fVar2 = new ai.f(17);
                                        new org.telegram.ui.Components.xs(eoVar3, eoVar3.f37246e, arrayList, arrayList2, channelParticipantArr3, eoVar3.L6, (int) eoVar3.d(), i11, true, fVar2).show();
                                        return;
                                }
                            }
                        });
                        eoVar.D7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final eo eoVar2 = this.f38037b;
                eoVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != eoVar2.getUserConfig().getClientUserId() && this.f38038c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = eoVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(eoVar2.f37246e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    eoVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    eo eoVar22 = eoVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        eoVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        eoVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        eoVar22.getClass();
                                    }
                                    int i10 = eoVar22.R3;
                                    ai.f fVar = new ai.f(17);
                                    new org.telegram.ui.Components.xs(eoVar22, eoVar22.f37246e, arrayList3, arrayList4, channelParticipantArr22, eoVar22.L6, (int) eoVar22.d(), i10, true, fVar).show();
                                    return;
                                default:
                                    eo eoVar3 = eoVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        eoVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        eoVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        eoVar3.getClass();
                                    }
                                    int i11 = eoVar3.R3;
                                    ai.f fVar2 = new ai.f(17);
                                    new org.telegram.ui.Components.xs(eoVar3, eoVar3.f37246e, arrayList3, arrayList4, channelParticipantArr3, eoVar3.L6, (int) eoVar3.d(), i11, true, fVar2).show();
                                    return;
                            }
                        }
                    });
                    eoVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
