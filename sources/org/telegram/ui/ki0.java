package org.telegram.ui;

import java.util.ArrayList;
public final class ki0 implements Runnable {
    public final int f35072a;
    public final org.telegram.ui.ActionBar.m2 f35073b;

    public ki0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35072a = i10;
        this.f35073b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f35072a) {
            case 0:
                ?? obj = new Object();
                obj.f19581a = true;
                this.f35073b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 m2Var = this.f35073b;
                if (m2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) m2Var;
                    premiumPreviewFragment.f31459p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f31440a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f31459p0 = true;
                    if (m2Var != null) {
                        m2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (m2Var != null && (m2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        m2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) m2Var.getParentActivity()).f31143x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f35073b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 4:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 5:
                this.f35073b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f35073b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f35073b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f35073b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 10:
                org.telegram.messenger.ok.m(3, this.f35073b);
                return;
            case 11:
                org.telegram.messenger.ok.m(3, this.f35073b);
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f35073b;
                rg.x0 x0Var = new rg.x0(m2Var2, 5, false);
                x0Var.B();
                m2Var2.showDialog(x0Var);
                return;
            case 13:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 14:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 15:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 16:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 17:
                org.telegram.messenger.ok.m(1, this.f35073b);
                return;
            case 18:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 19:
                this.f35073b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 21:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 22:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 23:
                this.f35073b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 25:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 26:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 27:
                org.telegram.messenger.ok.m(0, this.f35073b);
                return;
            case 28:
                this.f35073b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f35073b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
