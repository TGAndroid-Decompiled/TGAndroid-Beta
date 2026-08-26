package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda247 implements ReactedUsersListView.OnProfileSelectedListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final boolean f$1;
    public final MessageObject f$2;

    public ChatActivity$$ExternalSyntheticLambda247(ChatActivity chatActivity, boolean z, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
        this.f$2 = messageObject;
    }

    @Override
    public final void onProfileSelected(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.$r8$classId) {
            case 0:
                final ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != chatActivity.getUserConfig().getClientUserId() && this.f$1) {
                    final ArrayList arrayList = new ArrayList(1);
                    arrayList.add(this.f$2);
                    TLObject userOrChat = chatActivity.getMessagesController().getUserOrChat(j);
                    final ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(userOrChat);
                    final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(chatActivity.currentChat);
                    tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                    final int i = 1;
                    chatActivity.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i) {
                                case 0:
                                    ChatActivity chatActivity2 = chatActivity;
                                    TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                    if (tL_channels_channelParticipant != null) {
                                        chatActivity2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        chatActivity2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        chatActivity2.getClass();
                                    }
                                    new DeleteMessagesBottomSheet(chatActivity2, chatActivity2.currentChat, arrayList, arrayList2, channelParticipantArr2, chatActivity2.mergeDialogId, (int) chatActivity2.getTopicId(), chatActivity2.chatMode, true, new ChatActivity$$ExternalSyntheticLambda470(0)).show();
                                    break;
                                default:
                                    ChatActivity chatActivity3 = chatActivity;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                    if (tL_channels_channelParticipant != null) {
                                        chatActivity3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        chatActivity3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        chatActivity3.getClass();
                                    }
                                    new DeleteMessagesBottomSheet(chatActivity3, chatActivity3.currentChat, arrayList, arrayList2, channelParticipantArr3, chatActivity3.mergeDialogId, (int) chatActivity3.getTopicId(), chatActivity3.chatMode, true, new ChatActivity$$ExternalSyntheticLambda470(0)).show();
                                    break;
                            }
                        }
                    });
                    chatActivity.closeMenu(true);
                    break;
                }
                break;
            default:
                final ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != chatActivity2.getUserConfig().getClientUserId() && this.f$1) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.f$2);
                    TLObject userOrChat2 = chatActivity2.getMessagesController().getUserOrChat(j);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(chatActivity2.currentChat);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i2 = 0;
                    chatActivity2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i2) {
                                case 0:
                                    ChatActivity chatActivity3 = chatActivity2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        chatActivity3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        chatActivity3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        chatActivity3.getClass();
                                    }
                                    new DeleteMessagesBottomSheet(chatActivity3, chatActivity3.currentChat, arrayList3, arrayList4, channelParticipantArr3, chatActivity3.mergeDialogId, (int) chatActivity3.getTopicId(), chatActivity3.chatMode, true, new ChatActivity$$ExternalSyntheticLambda470(0)).show();
                                    break;
                                default:
                                    ChatActivity chatActivity4 = chatActivity2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        chatActivity4.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        chatActivity4.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr4[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        chatActivity4.getClass();
                                    }
                                    new DeleteMessagesBottomSheet(chatActivity4, chatActivity4.currentChat, arrayList3, arrayList4, channelParticipantArr4, chatActivity4.mergeDialogId, (int) chatActivity4.getTopicId(), chatActivity4.chatMode, true, new ChatActivity$$ExternalSyntheticLambda470(0)).show();
                                    break;
                            }
                        }
                    });
                    chatActivity2.closeMenu(true);
                    break;
                }
                break;
        }
    }
}
