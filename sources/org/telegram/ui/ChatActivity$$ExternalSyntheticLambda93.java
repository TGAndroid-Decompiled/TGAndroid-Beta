package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.BotAskCell;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatUnreadCell;

public final class ChatActivity$$ExternalSyntheticLambda93 implements Consumer {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda93(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ChatActivity chatActivity = this.f$0;
                if (tL_premium_boostsStatus != null) {
                    chatActivity.boostsStatus = tL_premium_boostsStatus;
                    chatActivity.getMessagesController().getBoostsController().userCanBoostChannel(chatActivity.dialog_id, tL_premium_boostsStatus, new ChatActivity$$ExternalSyntheticLambda93(chatActivity, 1));
                } else {
                    chatActivity.getClass();
                }
                break;
            case 1:
                this.f$0.canApplyBoosts = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                View view = (View) obj;
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                if (view instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                    chatMessageCell.isAllChats = chatActivity2.isAllChats();
                    chatMessageCell.isSideMenued = chatActivity2.isSideMenued();
                    boolean zIsSideMenuEnabled = chatActivity2.isSideMenuEnabled();
                    if (chatMessageCell.isSideMenuEnabled != zIsSideMenuEnabled) {
                        chatMessageCell.isSideMenuEnabled = zIsSideMenuEnabled;
                        chatActivity2.chatListView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                        chatMessageCell.forcedLayout = true;
                        chatMessageCell.forceLayout();
                        if (childAdapterPosition >= 0) {
                            chatActivity2.chatAdapter.notifyItemChanged(childAdapterPosition);
                        }
                    }
                    chatMessageCell.sideMenuAlpha = chatActivity2.getSideMenuAlpha();
                    int sideMenuWidth = chatActivity2.getSideMenuWidth();
                    if (chatMessageCell.sideMenuWidth != sideMenuWidth) {
                        chatMessageCell.sideMenuWidth = sideMenuWidth;
                        chatMessageCell.updateTranslation();
                        chatMessageCell.invalidate();
                    }
                } else if (view instanceof ChatActionCell) {
                    ChatActionCell chatActionCell = (ChatActionCell) view;
                    chatActionCell.isAllChats = chatActivity2.isAllChats();
                    chatActionCell.isSideMenued = chatActivity2.isSideMenued();
                    chatActivity2.isSideMenuEnabled();
                    chatActivity2.getSideMenuAlpha();
                    int sideMenuWidth2 = chatActivity2.getSideMenuWidth();
                    if (chatActionCell.sideMenuWidth != sideMenuWidth2) {
                        chatActionCell.sideMenuWidth = sideMenuWidth2;
                        chatActionCell.invalidate();
                    }
                } else if (view instanceof ChatUnreadCell) {
                    ((ChatUnreadCell) view).getTextView().setTranslationX(chatActivity2.getSideMenuWidth() / 2.0f);
                } else if (view instanceof BotAskCell) {
                    view.invalidate();
                } else if (view instanceof BotHelpCell) {
                    view.invalidate();
                }
                break;
        }
    }
}
