package org.telegram.ui;

import java.util.ArrayList;
public final class ni0 implements Runnable {
    public final int f36003a;
    public final org.telegram.ui.ActionBar.o2 f36004b;

    public ni0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36003a = i10;
        this.f36004b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f36003a) {
            case 0:
                ?? obj = new Object();
                obj.f19631a = true;
                this.f36004b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.f36004b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.f31462p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f31443a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f31462p0 = true;
                    if (o2Var != null) {
                        o2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (o2Var != null && (o2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        o2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) o2Var.getParentActivity()).f31146x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f36004b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 4:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 5:
                this.f36004b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f36004b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f36004b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f36004b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 10:
                org.telegram.messenger.qk.m(3, this.f36004b);
                return;
            case 11:
                org.telegram.messenger.qk.m(3, this.f36004b);
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f36004b;
                rg.x0 x0Var = new rg.x0(o2Var2, 5, false);
                x0Var.B();
                o2Var2.showDialog(x0Var);
                return;
            case 13:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 14:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 15:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 16:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 17:
                org.telegram.messenger.qk.m(1, this.f36004b);
                return;
            case 18:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 19:
                this.f36004b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 21:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 22:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 23:
                this.f36004b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 25:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 26:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 27:
                org.telegram.messenger.qk.m(0, this.f36004b);
                return;
            case 28:
                this.f36004b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f36004b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
