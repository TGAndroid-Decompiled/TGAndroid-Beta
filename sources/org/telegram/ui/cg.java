package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cg implements org.telegram.ui.Components.bk0 {
    public final int f32766a;
    public final zn f32767b;
    public final boolean f32768c;
    public final MessageObject d;

    public cg(zn znVar, boolean z10, MessageObject messageObject, int i10) {
        this.f32766a = i10;
        this.f32767b = znVar;
        this.f32768c = z10;
        this.d = messageObject;
    }

    @Override
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f32766a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final zn znVar = this.f32767b;
                    if (j3 != znVar.getUserConfig().getClientUserId() && this.f32768c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = znVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        zn znVar2 = znVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            znVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            znVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            znVar2.getClass();
                                        }
                                        int i10 = znVar2.R3;
                                        ai.f fVar = new ai.f(17);
                                        new org.telegram.ui.Components.fs(znVar2, znVar2.e, arrayList, arrayList2, channelParticipantArr2, znVar2.L6, (int) znVar2.d(), i10, true, fVar).show();
                                        return;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            znVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            znVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            znVar3.getClass();
                                        }
                                        int i11 = znVar3.R3;
                                        ai.f fVar2 = new ai.f(17);
                                        new org.telegram.ui.Components.fs(znVar3, znVar3.e, arrayList, arrayList2, channelParticipantArr3, znVar3.L6, (int) znVar3.d(), i11, true, fVar2).show();
                                        return;
                                }
                            }
                        });
                        znVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final zn znVar2 = this.f32767b;
                znVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != znVar2.getUserConfig().getClientUserId() && this.f32768c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = znVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(znVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    znVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    zn znVar22 = znVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        znVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        znVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        znVar22.getClass();
                                    }
                                    int i10 = znVar22.R3;
                                    ai.f fVar = new ai.f(17);
                                    new org.telegram.ui.Components.fs(znVar22, znVar22.e, arrayList3, arrayList4, channelParticipantArr22, znVar22.L6, (int) znVar22.d(), i10, true, fVar).show();
                                    return;
                                default:
                                    zn znVar3 = znVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        znVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        znVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        znVar3.getClass();
                                    }
                                    int i11 = znVar3.R3;
                                    ai.f fVar2 = new ai.f(17);
                                    new org.telegram.ui.Components.fs(znVar3, znVar3.e, arrayList3, arrayList4, channelParticipantArr3, znVar3.L6, (int) znVar3.d(), i11, true, fVar2).show();
                                    return;
                            }
                        }
                    });
                    znVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
