package org.telegram.ui;

import java.util.ArrayList;
public final class nf0 implements Runnable {
    public final int f47985a;
    public final org.telegram.ui.ActionBar.d2 f47986b;

    public nf0(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f47985a = i3;
        this.f47986b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f47985a) {
            case 0:
                ?? obj = new Object();
                obj.f27395a = true;
                this.f47986b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = this.f47986b;
                if (d2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) d2Var;
                    premiumPreviewFragment.f41653q0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.f41632a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f41653q0 = true;
                    if (d2Var != null) {
                        d2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (d2Var != null && (d2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        d2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) d2Var.getParentActivity()).f41328y0.c(false);
                    return;
                }
                return;
            case 2:
                this.f47986b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 4:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 5:
                this.f47986b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f47986b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f47986b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f47986b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 10:
                org.telegram.messenger.camera.q.j(3, this.f47986b);
                return;
            case 11:
                org.telegram.messenger.camera.q.j(3, this.f47986b);
                return;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f47986b;
                vg.v0 v0Var = new vg.v0(d2Var2, 5, false);
                v0Var.K0();
                d2Var2.showDialog(v0Var);
                return;
            case 13:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 14:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 15:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 16:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 17:
                org.telegram.messenger.camera.q.j(1, this.f47986b);
                return;
            case 18:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 19:
                this.f47986b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 21:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 22:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 23:
                this.f47986b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 25:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 26:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 27:
                org.telegram.messenger.camera.q.j(0, this.f47986b);
                return;
            case 28:
                this.f47986b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f47986b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
