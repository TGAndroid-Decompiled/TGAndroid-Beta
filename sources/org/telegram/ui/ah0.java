package org.telegram.ui;

import java.util.ArrayList;
public final class ah0 implements Runnable {
    public final int f35785a;
    public final org.telegram.ui.ActionBar.k2 f35786b;

    public ah0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f35785a = i10;
        this.f35786b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f35785a) {
            case 0:
                ?? obj = new Object();
                obj.f20390a = true;
                this.f35786b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.k2 k2Var = this.f35786b;
                if (k2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) k2Var;
                    premiumPreviewFragment.f33715p0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.f33696a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f33715p0 = true;
                    if (k2Var != null) {
                        k2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (k2Var != null && (k2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        k2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) k2Var.getParentActivity()).f33398x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f35786b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 4:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 5:
                this.f35786b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f35786b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f35786b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f35786b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 10:
                org.telegram.messenger.a30.k(3, this.f35786b);
                return;
            case 11:
                org.telegram.messenger.a30.k(3, this.f35786b);
                return;
            case 12:
                org.telegram.ui.ActionBar.k2 k2Var2 = this.f35786b;
                kg.i1 i1Var = new kg.i1(k2Var2, 5, false);
                i1Var.K0();
                k2Var2.showDialog(i1Var);
                return;
            case 13:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 14:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 15:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 16:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 17:
                org.telegram.messenger.a30.k(1, this.f35786b);
                return;
            case 18:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 19:
                this.f35786b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 21:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 22:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 23:
                this.f35786b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 25:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 26:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 27:
                org.telegram.messenger.a30.k(0, this.f35786b);
                return;
            case 28:
                this.f35786b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f35786b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
