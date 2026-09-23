package org.telegram.ui;

import java.util.ArrayList;
public final class li0 implements Runnable {
    public final int f34987a;
    public final org.telegram.ui.ActionBar.n2 f34988b;

    public li0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f34987a = i10;
        this.f34988b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f34987a) {
            case 0:
                ?? obj = new Object();
                obj.f19352a = true;
                this.f34988b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f34988b;
                if (n2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) n2Var;
                    premiumPreviewFragment.f31145p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f31126a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f31145p0 = true;
                    if (n2Var != null) {
                        n2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (n2Var != null && (n2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        n2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) n2Var.getParentActivity()).f30829x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f34988b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 4:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 5:
                this.f34988b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f34988b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f34988b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f34988b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 10:
                org.telegram.messenger.ul.n(3, this.f34988b);
                return;
            case 11:
                org.telegram.messenger.ul.n(3, this.f34988b);
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f34988b;
                rg.x0 x0Var = new rg.x0(n2Var2, 5, false);
                x0Var.B();
                n2Var2.showDialog(x0Var);
                return;
            case 13:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 14:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 15:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 16:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 17:
                org.telegram.messenger.ul.n(1, this.f34988b);
                return;
            case 18:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 19:
                this.f34988b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 21:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 22:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 23:
                this.f34988b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 25:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 26:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 27:
                org.telegram.messenger.ul.n(0, this.f34988b);
                return;
            case 28:
                this.f34988b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f34988b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
