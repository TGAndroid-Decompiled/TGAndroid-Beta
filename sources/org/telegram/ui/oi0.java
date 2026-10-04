package org.telegram.ui;

import java.util.ArrayList;
public final class oi0 implements Runnable {
    public final int f39204a;
    public final org.telegram.ui.ActionBar.n2 f39205b;

    public oi0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39204a = i10;
        this.f39205b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f39204a) {
            case 0:
                ?? obj = new Object();
                obj.f21354a = true;
                this.f39205b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f39205b;
                if (n2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) n2Var;
                    premiumPreviewFragment.f34142p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f34122a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f34142p0 = true;
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
                    ((LaunchActivity) n2Var.getParentActivity()).f33818x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f39205b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 4:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 5:
                this.f39205b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f39205b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f39205b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f39205b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 10:
                org.telegram.messenger.bi.l(3, this.f39205b);
                return;
            case 11:
                org.telegram.messenger.bi.l(3, this.f39205b);
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f39205b;
                rg.y0 y0Var = new rg.y0(n2Var2, 5, false);
                y0Var.B();
                n2Var2.showDialog(y0Var);
                return;
            case 13:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 14:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 15:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 16:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 17:
                org.telegram.messenger.bi.l(1, this.f39205b);
                return;
            case 18:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 19:
                this.f39205b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 21:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 22:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 23:
                this.f39205b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 25:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 26:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 27:
                org.telegram.messenger.bi.l(0, this.f39205b);
                return;
            case 28:
                this.f39205b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f39205b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
