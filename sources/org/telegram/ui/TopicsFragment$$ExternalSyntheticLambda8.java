package org.telegram.ui;

import android.os.Bundle;

public final class TopicsFragment$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final TopicsFragment f$0;

    public TopicsFragment$$ExternalSyntheticLambda8(TopicsFragment topicsFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TopicsFragment topicsFragment = this.f$0;
                topicsFragment.recyclerListView.postOnAnimation(new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment, 3));
                break;
            case 1:
                TopicsFragment topicsFragment2 = this.f$0;
                if (topicsFragment2.getParentLayout() != null) {
                    topicsFragment2.removeFragmentOnTransitionEnd = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", topicsFragment2.chatId);
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    chatActivity.switchFromTopics = true;
                    topicsFragment2.presentFragment(chatActivity);
                }
                break;
            case 2:
                TopicsFragment topicsFragment3 = this.f$0;
                topicsFragment3.blur3_InvalidateBlur$11();
                topicsFragment3.checkUi_listViewPadding$5();
                break;
            case 3:
                this.f$0.blur3_InvalidateBlur$11();
                break;
            case 4:
                this.f$0.updateChatInfo(true);
                break;
            case 5:
                this.f$0.finishPreviewFragment();
                break;
            default:
                TopicsFragment topicsFragment4 = this.f$0;
                topicsFragment4.excludeTopics = null;
                topicsFragment4.updateTopicsList(true, false);
                break;
        }
    }
}
