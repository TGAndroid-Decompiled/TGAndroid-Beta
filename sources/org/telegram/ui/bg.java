package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements org.telegram.ui.Components.bk0 {
    public final int f35080a;
    public final yn f35081b;
    public final boolean f35082c;
    public final MessageObject d;

    public bg(yn ynVar, boolean z10, MessageObject messageObject, int i10) {
        this.f35080a = i10;
        this.f35081b = ynVar;
        this.f35082c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f35080a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final yn ynVar = this.f35081b;
                    if (j3 != ynVar.getUserConfig().getClientUserId() && this.f35082c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = ynVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(ynVar.f43315e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        ynVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        yn ynVar2 = ynVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            ynVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            ynVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            ynVar2.getClass();
                                        }
                                        int i10 = ynVar2.P3;
                                        ai.f fVar = new ai.f(17);
                                        new org.telegram.ui.Components.is(ynVar2, ynVar2.f43315e, arrayList, arrayList2, channelParticipantArr2, ynVar2.J6, (int) ynVar2.d(), i10, true, fVar).show();
                                        return;
                                    default:
                                        yn ynVar3 = ynVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            ynVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            ynVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            ynVar3.getClass();
                                        }
                                        int i11 = ynVar3.P3;
                                        ai.f fVar2 = new ai.f(17);
                                        new org.telegram.ui.Components.is(ynVar3, ynVar3.f43315e, arrayList, arrayList2, channelParticipantArr3, ynVar3.J6, (int) ynVar3.d(), i11, true, fVar2).show();
                                        return;
                                }
                            }
                        });
                        ynVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final yn ynVar2 = this.f35081b;
                ynVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != ynVar2.getUserConfig().getClientUserId() && this.f35082c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = ynVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(ynVar2.f43315e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    ynVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    yn ynVar22 = ynVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        ynVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        ynVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        ynVar22.getClass();
                                    }
                                    int i10 = ynVar22.P3;
                                    ai.f fVar = new ai.f(17);
                                    new org.telegram.ui.Components.is(ynVar22, ynVar22.f43315e, arrayList3, arrayList4, channelParticipantArr22, ynVar22.J6, (int) ynVar22.d(), i10, true, fVar).show();
                                    return;
                                default:
                                    yn ynVar3 = ynVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        ynVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        ynVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        ynVar3.getClass();
                                    }
                                    int i11 = ynVar3.P3;
                                    ai.f fVar2 = new ai.f(17);
                                    new org.telegram.ui.Components.is(ynVar3, ynVar3.f43315e, arrayList3, arrayList4, channelParticipantArr3, ynVar3.J6, (int) ynVar3.d(), i11, true, fVar2).show();
                                    return;
                            }
                        }
                    });
                    ynVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
