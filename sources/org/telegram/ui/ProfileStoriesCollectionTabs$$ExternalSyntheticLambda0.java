package org.telegram.ui;

public final class ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ProfileStoriesCollectionTabs f$0;
    public final int f$1;

    public ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0(ProfileStoriesCollectionTabs profileStoriesCollectionTabs, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = profileStoriesCollectionTabs;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.f$0;
                ProfileStoriesCollectionTabs.Adapter adapter = profileStoriesCollectionTabs.adapter;
                int i = this.f$1;
                profileStoriesCollectionTabs.tabsView.scrollToTab(i, adapter.getItemPosition(i));
                break;
            default:
                ProfileStoriesCollectionTabs profileStoriesCollectionTabs2 = this.f$0;
                ProfileStoriesCollectionTabs.Adapter adapter2 = profileStoriesCollectionTabs2.adapter;
                int i2 = this.f$1;
                profileStoriesCollectionTabs2.tabsView.scrollToTab(i2, adapter2.getItemPosition(i2));
                break;
        }
    }
}
