package org.telegram.ui;

import java.util.ArrayList;

public final class ci0 implements Runnable {

    public final int f37097a;

    public final org.telegram.ui.ActionBar.n2 f37098b;

    public ci0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37097a = i10;
        this.f37098b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f37097a) {
            case 0:
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                this.f37098b.showAsSheet(new PremiumPreviewFragment(0, "effect"), l2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f37098b;
                if (n2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) n2Var;
                    premiumPreviewFragment.f35858l0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f35842a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f35858l0 = true;
                    if (n2Var != null) {
                        n2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            n2VarU.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (n2Var != null && (n2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        n2Var.getFragmentView().performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) n2Var.getParentActivity()).f35535t0.c(false);
                    break;
                }
                break;
            case 2:
                this.f37098b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                this.f37098b.presentFragment(new DataSettingsActivity());
                break;
            case 4:
                this.f37098b.presentFragment(new DataSettingsActivity());
                break;
            case 5:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 6:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 7:
                this.f37098b.presentFragment(new WallpapersListActivity(0));
                break;
            case 8:
                this.f37098b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 9:
                this.f37098b.presentFragment(new WallpapersListActivity(1));
                break;
            case 10:
                this.f37098b.presentFragment(new WallpapersListActivity(0));
                break;
            case 11:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f37098b;
                ag.g2 g2Var = new ag.g2(n2Var2, 4, false);
                g2Var.D();
                n2Var2.showDialog(g2Var);
                break;
            case 13:
                org.telegram.messenger.rl.k(3, this.f37098b);
                break;
            case 14:
                org.telegram.messenger.rl.k(3, this.f37098b);
                break;
            case 15:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 16:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 17:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 18:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 19:
                org.telegram.messenger.rl.k(1, this.f37098b);
                break;
            case 20:
                this.f37098b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 22:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 23:
                this.f37098b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 25:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 26:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 27:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            case 28:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
            default:
                org.telegram.messenger.rl.k(0, this.f37098b);
                break;
        }
    }
}
