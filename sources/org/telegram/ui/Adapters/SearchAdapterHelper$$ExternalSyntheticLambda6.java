package org.telegram.ui.Adapters;

public final class SearchAdapterHelper$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final SearchAdapterHelper f$0;

    public SearchAdapterHelper$$ExternalSyntheticLambda6(SearchAdapterHelper searchAdapterHelper, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapterHelper;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadRecentHashtags$6();
                break;
            default:
                this.f$0.lambda$clearRecentHashtags$8();
                break;
        }
    }
}
