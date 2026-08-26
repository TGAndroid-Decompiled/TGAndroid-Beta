package org.telegram.ui.Components;

public final class PostsSearchContainer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final PostsSearchContainer f$0;

    public PostsSearchContainer$$ExternalSyntheticLambda5(PostsSearchContainer postsSearchContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = postsSearchContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateEmptyView();
                break;
            default:
                this.f$0.load(true);
                break;
        }
    }
}
