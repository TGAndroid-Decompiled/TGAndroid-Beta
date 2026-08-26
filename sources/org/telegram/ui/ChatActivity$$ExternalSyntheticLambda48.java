package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.Components.TopicsTabsView;

public final class ChatActivity$$ExternalSyntheticLambda48 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda48(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj) {
        ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                TopicsTabsView topicsTabsView = chatActivity.topicsTabs;
                if (topicsTabsView != null) {
                    topicsTabsView.selectTopic(l.longValue(), true);
                }
                break;
            case 1:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.messageSuggestionParams = messageSuggestionParams;
                chatActivity2.editingMessageObject.messageOwner.suggested_post = messageSuggestionParams.toTl();
                chatActivity2.showFieldPanel(true, null, chatActivity2.editingMessageObject, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 2:
                chatActivity.showBottomOverlayProgress(true, false);
                if (((Boolean) obj).booleanValue()) {
                    chatActivity.finishFragment();
                }
                break;
            case 3:
                chatActivity.openHashtagSearch((String) obj, false);
                break;
            case 4:
                chatActivity.showFieldPanelForSuggestionParams((MessageSuggestionParams) obj);
                break;
            case 5:
                ComposeDrawable composeDrawable = chatActivity.otherIcon;
                composeDrawable.views.add(((ActionBarMenuItem) obj).getIconView());
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                int i = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.processSelectedOption$1(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                int i2 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.processSelectedOption$1(iIntValue2);
                break;
        }
    }
}
