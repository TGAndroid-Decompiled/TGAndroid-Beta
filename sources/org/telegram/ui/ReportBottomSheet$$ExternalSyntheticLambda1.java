package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class ReportBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Context f$1;
    public final Theme.ResourcesProvider f$2;
    public final Runnable f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda1(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = context;
        this.f$2 = resourcesProvider;
        this.f$3 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsoredPeer$25(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ReportBottomSheet.AnonymousClass6.lambda$onReported$1(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ReportBottomSheet.lambda$openSponsoredPeer$28(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
