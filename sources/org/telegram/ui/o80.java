package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f42118a;
    public final LaunchActivity f42119b;

    public o80(LaunchActivity launchActivity, int i10) {
        this.f42118a = i10;
        this.f42119b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f42118a;
        org.telegram.ui.ActionBar.r2 r2Var = null;
        LaunchActivity launchActivity = this.f42119b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(launchActivity, null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f34998b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.qc.g(R, ybVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.X0) {
                    launchActivity.X0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f35550q0.getFragmentStack().isEmpty()) {
                    launchActivity.f35550q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.cz0(launchActivity, launchActivity.f35538j0, launchActivity.f35534h0, launchActivity.f35536i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.D1;
                launchActivity.getClass();
                org.telegram.ui.Components.k30.f29785e0 = false;
                org.telegram.ui.Components.k30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f35526d0;
                ArrayList arrayList2 = launchActivity.f35528e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
                }
                if (!(r2Var instanceof ProxyListActivity) && !(r2Var instanceof b21)) {
                    launchActivity.u0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                launchActivity.f35561v1 = null;
                return;
            case 7:
                launchActivity.f35563w1 = null;
                return;
            case 8:
                if (launchActivity.U0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.r(new StringBuilder("remote"), launchActivity.U0.f22164id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.U0;
                    org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.u0(new tc1(u10, true, 0, false, false));
                    }
                    launchActivity.j0();
                    return;
                }
                return;
            case 9:
                Pattern pattern4 = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.u0(new tb0());
                return;
            default:
                if (!launchActivity.f35565x1) {
                    try {
                        org.telegram.ui.ActionBar.e2 B = org.telegram.ui.Components.g5.B(launchActivity);
                        B.setOnDismissListener(new p80(launchActivity, 0));
                        launchActivity.f35565x1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
