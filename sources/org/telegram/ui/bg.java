package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements org.telegram.ui.Components.oj0 {
    public final int f34790a;
    public final co f34791b;
    public final boolean f34792c;
    public final MessageObject d;

    public bg(co coVar, boolean z10, MessageObject messageObject, int i10) {
        this.f34790a = i10;
        this.f34791b = coVar;
        this.f34792c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f34790a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final co coVar = this.f34791b;
                    if (j3 != coVar.getUserConfig().getClientUserId() && this.f34792c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = coVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(coVar.f35237e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        coVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        co coVar2 = coVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            coVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            coVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            coVar2.getClass();
                                        }
                                        int i10 = coVar2.R3;
                                        ah.j jVar = new ah.j(18);
                                        new org.telegram.ui.Components.es(coVar2, coVar2.f35237e, arrayList, arrayList2, channelParticipantArr2, coVar2.L6, (int) coVar2.d(), i10, true, jVar).show();
                                        return;
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            coVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            coVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            coVar3.getClass();
                                        }
                                        int i11 = coVar3.R3;
                                        ah.j jVar2 = new ah.j(18);
                                        new org.telegram.ui.Components.es(coVar3, coVar3.f35237e, arrayList, arrayList2, channelParticipantArr3, coVar3.L6, (int) coVar3.d(), i11, true, jVar2).show();
                                        return;
                                }
                            }
                        });
                        coVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final co coVar2 = this.f34791b;
                coVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != coVar2.getUserConfig().getClientUserId() && this.f34792c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = coVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(coVar2.f35237e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    coVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    co coVar22 = coVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        coVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        coVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        coVar22.getClass();
                                    }
                                    int i10 = coVar22.R3;
                                    ah.j jVar = new ah.j(18);
                                    new org.telegram.ui.Components.es(coVar22, coVar22.f35237e, arrayList3, arrayList4, channelParticipantArr22, coVar22.L6, (int) coVar22.d(), i10, true, jVar).show();
                                    return;
                                default:
                                    co coVar3 = coVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        coVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        coVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        coVar3.getClass();
                                    }
                                    int i11 = coVar3.R3;
                                    ah.j jVar2 = new ah.j(18);
                                    new org.telegram.ui.Components.es(coVar3, coVar3.f35237e, arrayList3, arrayList4, channelParticipantArr3, coVar3.L6, (int) coVar3.d(), i11, true, jVar2).show();
                                    return;
                            }
                        }
                    });
                    coVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
