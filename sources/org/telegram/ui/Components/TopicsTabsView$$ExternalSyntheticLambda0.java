package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class TopicsTabsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TopicsTabsView f$0;

    public TopicsTabsView$$ExternalSyntheticLambda0(TopicsTabsView topicsTabsView, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsTabsView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TopicsTabsView topicsTabsView = this.f$0;
                if (topicsTabsView.isLoadingVisible()) {
                    topicsTabsView.loadMore();
                }
                break;
            default:
                TopicsTabsView topicsTabsView2 = this.f$0;
                TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                anonymousClass3.allowReorder(true);
                TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                anonymousClass1.allowReorder(true);
                topicsTabsView2.animatorCloseButtonVisibility.setValue(true, true);
                AndroidUtilities.updateVisibleRows(anonymousClass1);
                AndroidUtilities.updateVisibleRows(anonymousClass3);
                break;
        }
    }
}
