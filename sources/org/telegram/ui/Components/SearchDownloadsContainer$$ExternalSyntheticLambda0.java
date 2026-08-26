package org.telegram.ui.Components;

import java.util.ArrayList;

public final class SearchDownloadsContainer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final SearchDownloadsContainer f$0;
    public final String f$1;
    public final ArrayList f$2;
    public final ArrayList f$3;

    public SearchDownloadsContainer$$ExternalSyntheticLambda0(SearchDownloadsContainer searchDownloadsContainer, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f$0 = searchDownloadsContainer;
        this.f$1 = str;
        this.f$2 = arrayList;
        this.f$3 = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$update$4(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$update$5(this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public SearchDownloadsContainer$$ExternalSyntheticLambda0(SearchDownloadsContainer searchDownloadsContainer, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f$0 = searchDownloadsContainer;
        this.f$2 = arrayList;
        this.f$1 = str;
        this.f$3 = arrayList2;
    }
}
