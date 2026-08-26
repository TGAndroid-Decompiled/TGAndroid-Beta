package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;

public final class ReportBottomSheet$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;
    public final BulletinFactory f$1;
    public final Context f$2;
    public final Theme.ResourcesProvider f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda14(Runnable runnable, BulletinFactory bulletinFactory, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = runnable;
        this.f$1 = bulletinFactory;
        this.f$2 = context;
        this.f$3 = resourcesProvider;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsored$18(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ReportBottomSheet.AnonymousClass5.lambda$onReported$1(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ReportBottomSheet.lambda$openSponsored$21(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
