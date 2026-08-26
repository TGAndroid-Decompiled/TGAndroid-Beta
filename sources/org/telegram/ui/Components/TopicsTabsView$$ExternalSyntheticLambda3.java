package org.telegram.ui.Components;

public final class TopicsTabsView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final TopicsTabsView f$0;

    public TopicsTabsView$$ExternalSyntheticLambda3(TopicsTabsView topicsTabsView, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsTabsView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onTabLongClick$12();
                break;
            default:
                this.f$0.lambda$updateTabs$3();
                break;
        }
    }
}
