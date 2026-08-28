package org.telegram.ui;

import java.util.ArrayList;
public final class ai0 implements Runnable {
    public final int f36503a;
    public final org.telegram.ui.ActionBar.o2 f36504b;

    public ai0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36503a = i9;
        this.f36504b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f36503a) {
            case 0:
                ?? obj = new Object();
                obj.f23653a = true;
                this.f36504b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.f36504b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.f35855l0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f35839a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f35855l0 = true;
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
                    ((LaunchActivity) o2Var.getParentActivity()).f35532t0.c(false);
                    return;
                }
                return;
            case 2:
                this.f36504b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                this.f36504b.presentFragment(new DataSettingsActivity());
                return;
            case 4:
                this.f36504b.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 6:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 7:
                this.f36504b.presentFragment(new WallpapersListActivity(0));
                return;
            case 8:
                this.f36504b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 9:
                this.f36504b.presentFragment(new WallpapersListActivity(1));
                return;
            case 10:
                this.f36504b.presentFragment(new WallpapersListActivity(0));
                return;
            case 11:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f36504b;
                zf.x0 x0Var = new zf.x0(o2Var2, 4, false);
                x0Var.C();
                o2Var2.showDialog(x0Var);
                return;
            case 13:
                org.telegram.messenger.ll.m(3, this.f36504b);
                return;
            case 14:
                org.telegram.messenger.ll.m(3, this.f36504b);
                return;
            case 15:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 16:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 17:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 18:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 19:
                org.telegram.messenger.ll.m(1, this.f36504b);
                return;
            case 20:
                this.f36504b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 21:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 22:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 23:
                this.f36504b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 25:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 26:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 27:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            case 28:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
            default:
                org.telegram.messenger.ll.m(0, this.f36504b);
                return;
        }
    }
}
