package org.telegram.ui;

import java.util.ArrayList;
public final class fi0 implements Runnable {
    public final int f37340a;
    public final org.telegram.ui.ActionBar.o2 f37341b;

    public fi0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37340a = i10;
        this.f37341b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f37340a) {
            case 0:
                ?? obj = new Object();
                obj.f21636a = true;
                this.f37341b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.f37341b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.f33818p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f33799a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f33818p0 = true;
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
                    ((LaunchActivity) o2Var.getParentActivity()).f33501x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f37341b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 4:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 5:
                this.f37341b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f37341b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f37341b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f37341b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 10:
                org.telegram.messenger.sl.o(3, this.f37341b);
                return;
            case 11:
                org.telegram.messenger.sl.o(3, this.f37341b);
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f37341b;
                sg.y0 y0Var = new sg.y0(o2Var2, 5, false);
                y0Var.E();
                o2Var2.showDialog(y0Var);
                return;
            case 13:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 14:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 15:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 16:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 17:
                org.telegram.messenger.sl.o(1, this.f37341b);
                return;
            case 18:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 19:
                this.f37341b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 21:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 22:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 23:
                this.f37341b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 25:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 26:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 27:
                org.telegram.messenger.sl.o(0, this.f37341b);
                return;
            case 28:
                this.f37341b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f37341b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
