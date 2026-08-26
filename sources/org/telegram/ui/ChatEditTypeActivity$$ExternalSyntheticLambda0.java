package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Components.LayoutHelper;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda0(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ChatEditTypeActivity chatEditTypeActivity = this.f$0;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda1(chatEditTypeActivity, 0));
                }
                break;
            case 1:
                final ChatEditTypeActivity chatEditTypeActivity2 = this.f$0;
                chatEditTypeActivity2.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                ChatEditTypeActivity chatEditTypeActivity3 = chatEditTypeActivity2;
                                chatEditTypeActivity3.getClass();
                                if (tLObject instanceof TLRPC.TL_boolTrue) {
                                    for (int i2 = 0; i2 < chatEditTypeActivity3.currentChat.usernames.size(); i2++) {
                                        TLRPC.TL_username tL_username = chatEditTypeActivity3.currentChat.usernames.get(i2);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                chatEditTypeActivity3.deactivatingLinks = false;
                                AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda1(chatEditTypeActivity3, 4));
                                break;
                            default:
                                ChatEditTypeActivity chatEditTypeActivity4 = chatEditTypeActivity2;
                                chatEditTypeActivity4.loadingAdminedChannels = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && chatEditTypeActivity4.getParentActivity() != null) {
                                    int i3 = 0;
                                    while (true) {
                                        ArrayList arrayList = chatEditTypeActivity4.adminedChannelCells;
                                        if (i3 >= arrayList.size()) {
                                            arrayList.clear();
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                            for (int i4 = 0; i4 < tL_messages_chats.chats.size(); i4++) {
                                                boolean z = true;
                                                AdminedChannelCell adminedChannelCell = new AdminedChannelCell(chatEditTypeActivity4.getParentActivity(), new ChatEditTypeActivity$$ExternalSyntheticLambda4(chatEditTypeActivity4, 1 == true ? 1 : 0), false, 0);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(i4);
                                                if (i4 != tL_messages_chats.chats.size() - 1) {
                                                    z = false;
                                                }
                                                adminedChannelCell.setChannel(chat, z);
                                                arrayList.add(adminedChannelCell);
                                                chatEditTypeActivity4.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
                                            }
                                            chatEditTypeActivity4.updatePrivatePublic$1();
                                        } else {
                                            chatEditTypeActivity4.linearLayout.removeView((View) arrayList.get(i3));
                                            i3++;
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final ChatEditTypeActivity chatEditTypeActivity3 = this.f$0;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ChatEditTypeActivity chatEditTypeActivity4 = chatEditTypeActivity3;
                                chatEditTypeActivity4.getClass();
                                if (tLObject instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < chatEditTypeActivity4.currentChat.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = chatEditTypeActivity4.currentChat.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                chatEditTypeActivity4.deactivatingLinks = false;
                                AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda1(chatEditTypeActivity4, 4));
                                break;
                            default:
                                ChatEditTypeActivity chatEditTypeActivity5 = chatEditTypeActivity3;
                                chatEditTypeActivity5.loadingAdminedChannels = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && chatEditTypeActivity5.getParentActivity() != null) {
                                    int i4 = 0;
                                    while (true) {
                                        ArrayList arrayList = chatEditTypeActivity5.adminedChannelCells;
                                        if (i4 >= arrayList.size()) {
                                            arrayList.clear();
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                            for (int i5 = 0; i5 < tL_messages_chats.chats.size(); i5++) {
                                                boolean z = true;
                                                AdminedChannelCell adminedChannelCell = new AdminedChannelCell(chatEditTypeActivity5.getParentActivity(), new ChatEditTypeActivity$$ExternalSyntheticLambda4(chatEditTypeActivity5, 1 == true ? 1 : 0), false, 0);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(i5);
                                                if (i5 != tL_messages_chats.chats.size() - 1) {
                                                    z = false;
                                                }
                                                adminedChannelCell.setChannel(chat, z);
                                                arrayList.add(adminedChannelCell);
                                                chatEditTypeActivity5.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
                                            }
                                            chatEditTypeActivity5.updatePrivatePublic$1();
                                        } else {
                                            chatEditTypeActivity5.linearLayout.removeView((View) arrayList.get(i4));
                                            i4++;
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(6, this.f$0, tL_error));
                break;
        }
    }
}
