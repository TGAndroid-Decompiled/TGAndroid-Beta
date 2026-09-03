package org.telegram.ui;

import java.util.ArrayList;
public final class ji0 implements Runnable {
    public final int f35285a;
    public final org.telegram.ui.ActionBar.p2 f35286b;

    public ji0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35285a = i10;
        this.f35286b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f35285a) {
            case 0:
                ?? obj = new Object();
                obj.f20453a = true;
                this.f35286b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = this.f35286b;
                if (p2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) p2Var;
                    premiumPreviewFragment.m0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f31925a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.m0 = true;
                    if (p2Var != null) {
                        p2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (p2Var != null && (p2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        p2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) p2Var.getParentActivity()).f31626u0.c(false);
                    return;
                }
                return;
            case 2:
                this.f35286b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                this.f35286b.presentFragment(new DataSettingsActivity());
                return;
            case 4:
                this.f35286b.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                b.k(0, this.f35286b);
                return;
            case 6:
                b.k(0, this.f35286b);
                return;
            case 7:
                this.f35286b.presentFragment(new WallpapersListActivity(0));
                return;
            case 8:
                this.f35286b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 9:
                this.f35286b.presentFragment(new WallpapersListActivity(1));
                return;
            case 10:
                this.f35286b.presentFragment(new WallpapersListActivity(0));
                return;
            case 11:
                b.k(0, this.f35286b);
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f35286b;
                eg.o1 o1Var = new eg.o1(p2Var2, 4, false);
                o1Var.C();
                p2Var2.showDialog(o1Var);
                return;
            case 13:
                b.k(3, this.f35286b);
                return;
            case 14:
                b.k(3, this.f35286b);
                return;
            case 15:
                b.k(0, this.f35286b);
                return;
            case 16:
                b.k(0, this.f35286b);
                return;
            case 17:
                b.k(0, this.f35286b);
                return;
            case 18:
                b.k(0, this.f35286b);
                return;
            case 19:
                b.k(1, this.f35286b);
                return;
            case 20:
                this.f35286b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 21:
                b.k(0, this.f35286b);
                return;
            case 22:
                b.k(0, this.f35286b);
                return;
            case 23:
                this.f35286b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                b.k(0, this.f35286b);
                return;
            case 25:
                b.k(0, this.f35286b);
                return;
            case 26:
                b.k(0, this.f35286b);
                return;
            case 27:
                b.k(0, this.f35286b);
                return;
            case 28:
                b.k(0, this.f35286b);
                return;
            default:
                b.k(0, this.f35286b);
                return;
        }
    }
}
