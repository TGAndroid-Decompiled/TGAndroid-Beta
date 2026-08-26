package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.TextCheckCell;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda4(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void onClick(View view) {
        ChatEditTypeActivity chatEditTypeActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (!chatEditTypeActivity.isPrivate) {
                    chatEditTypeActivity.isPrivate = true;
                    chatEditTypeActivity.updatePrivatePublic$1();
                    break;
                }
                break;
            case 1:
                TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
                AlertDialog.Builder builder = new AlertDialog.Builder(chatEditTypeActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.AppName);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                if (chatEditTypeActivity.isChannel) {
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, chatEditTypeActivity.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, chatEditTypeActivity.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new ChatActivity$$ExternalSyntheticLambda189(7, chatEditTypeActivity, currentChannel));
                chatEditTypeActivity.showDialog(alertDialog);
                break;
            case 2:
                if (chatEditTypeActivity.isPrivate) {
                    if (!chatEditTypeActivity.canCreatePublic) {
                        chatEditTypeActivity.showPremiumIncreaseLimitDialog$1();
                    } else {
                        chatEditTypeActivity.isPrivate = false;
                        chatEditTypeActivity.updatePrivatePublic$1();
                    }
                    break;
                }
                break;
            case 3:
                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatEditTypeActivity.chatId, 0L, 0);
                TLRPC.ChatFull chatFull = chatEditTypeActivity.info;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatEditTypeActivity.invite;
                manageLinksActivity.info = chatFull;
                manageLinksActivity.invite = tL_chatInviteExported;
                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                manageLinksActivity.loadLinks(true);
                chatEditTypeActivity.presentFragment(manageLinksActivity);
                break;
            default:
                boolean z = !chatEditTypeActivity.isSaveRestricted;
                chatEditTypeActivity.isSaveRestricted = z;
                ((TextCheckCell) view).setChecked(z);
                break;
        }
    }
}
