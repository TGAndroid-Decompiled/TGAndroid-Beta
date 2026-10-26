package org.telegram.ui;

import java.util.ArrayList;
public final class ci0 implements Runnable {
    public final int f38467a;
    public final org.telegram.ui.ActionBar.r2 f38468b;

    public ci0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f38467a = i10;
        this.f38468b = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f38467a) {
            case 0:
                ?? obj = new Object();
                obj.f22928a = true;
                this.f38468b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = this.f38468b;
                if (r2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) r2Var;
                    premiumPreviewFragment.f35884p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f35865a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f35884p0 = true;
                    if (r2Var != null) {
                        r2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (r2Var != null && (r2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        r2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) r2Var.getParentActivity()).f35567x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f38468b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 4:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 5:
                this.f38468b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f38468b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f38468b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f38468b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 10:
                org.telegram.messenger.vh.l(3, this.f38468b);
                return;
            case 11:
                org.telegram.messenger.vh.l(3, this.f38468b);
                return;
            case 12:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f38468b;
                tg.y0 y0Var = new tg.y0(r2Var2, 5, false);
                y0Var.F();
                r2Var2.showDialog(y0Var);
                return;
            case 13:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 14:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 15:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 16:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 17:
                org.telegram.messenger.vh.l(1, this.f38468b);
                return;
            case 18:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 19:
                this.f38468b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 21:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 22:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 23:
                this.f38468b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 25:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 26:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 27:
                org.telegram.messenger.vh.l(0, this.f38468b);
                return;
            case 28:
                this.f38468b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f38468b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
