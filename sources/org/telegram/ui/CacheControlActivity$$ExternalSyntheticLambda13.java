package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.ui.Storage.CacheModel;

public final class CacheControlActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;
    public final ArrayList f$1;
    public final ArrayList f$2;
    public final ArrayList f$3;
    public final CacheModel f$4;

    public CacheControlActivity$$ExternalSyntheticLambda13(CacheControlActivity cacheControlActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CacheModel cacheModel, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = arrayList3;
        this.f$4 = cacheModel;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadDialogEntities$6(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$loadDialogEntities$7(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
