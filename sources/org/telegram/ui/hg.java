package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hg implements org.telegram.ui.Components.pk0 {
    public final int f36543a;
    public final fo f36544b;
    public final boolean f36545c;
    public final MessageObject d;

    public hg(fo foVar, boolean z10, MessageObject messageObject, int i10) {
        this.f36543a = i10;
        this.f36544b = foVar;
        this.f36545c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f36543a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final fo foVar = this.f36544b;
                    if (j10 != foVar.getUserConfig().getClientUserId() && this.f36545c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = foVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(foVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        foVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        fo foVar2 = foVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            foVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            foVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            foVar2.getClass();
                                        }
                                        int i10 = foVar2.R3;
                                        ah.j jVar = new ah.j(18);
                                        new org.telegram.ui.Components.ss(foVar2, foVar2.e, arrayList, arrayList2, channelParticipantArr2, foVar2.L6, (int) foVar2.d(), i10, true, jVar).show();
                                        return;
                                    default:
                                        fo foVar3 = foVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            foVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            foVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            foVar3.getClass();
                                        }
                                        int i11 = foVar3.R3;
                                        ah.j jVar2 = new ah.j(18);
                                        new org.telegram.ui.Components.ss(foVar3, foVar3.e, arrayList, arrayList2, channelParticipantArr3, foVar3.L6, (int) foVar3.d(), i11, true, jVar2).show();
                                        return;
                                }
                            }
                        });
                        foVar.D7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final fo foVar2 = this.f36544b;
                foVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != foVar2.getUserConfig().getClientUserId() && this.f36545c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = foVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(foVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    foVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    fo foVar22 = foVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        foVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        foVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        foVar22.getClass();
                                    }
                                    int i10 = foVar22.R3;
                                    ah.j jVar = new ah.j(18);
                                    new org.telegram.ui.Components.ss(foVar22, foVar22.e, arrayList3, arrayList4, channelParticipantArr22, foVar22.L6, (int) foVar22.d(), i10, true, jVar).show();
                                    return;
                                default:
                                    fo foVar3 = foVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        foVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        foVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        foVar3.getClass();
                                    }
                                    int i11 = foVar3.R3;
                                    ah.j jVar2 = new ah.j(18);
                                    new org.telegram.ui.Components.ss(foVar3, foVar3.e, arrayList3, arrayList4, channelParticipantArr3, foVar3.L6, (int) foVar3.d(), i11, true, jVar2).show();
                                    return;
                            }
                        }
                    });
                    foVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
