package org.telegram.ui.Components;

public final class PostsSearchContainer$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final PostsSearchContainer f$0;

    public PostsSearchContainer$$ExternalSyntheticLambda4(PostsSearchContainer postsSearchContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = postsSearchContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$load$1();
                break;
            default:
                this.f$0.updateEmptyView();
                break;
        }
    }
}
