package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class j80 implements Runnable {
    public final int f38206a;
    public final LaunchActivity f38207b;

    public j80(LaunchActivity launchActivity, int i10) {
        this.f38206a = i10;
        this.f38207b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f38206a;
        org.telegram.ui.ActionBar.n2 n2Var = null;
        LaunchActivity launchActivity = this.f38207b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(launchActivity, null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f32629b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.C1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f33190q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33190q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.qy0(launchActivity, launchActivity.f33178j0, launchActivity.f33174h0, launchActivity.f33176i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.C1;
                launchActivity.getClass();
                org.telegram.ui.Components.i30.f27104e0 = false;
                org.telegram.ui.Components.i30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f33166d0;
                ArrayList arrayList2 = launchActivity.f33168e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList);
                }
                if (!(n2Var instanceof ProxyListActivity) && !(n2Var instanceof s11)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                launchActivity.f33199u1 = null;
                return;
            case 7:
                launchActivity.f33201v1 = null;
                return;
            case 8:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.r(new StringBuilder("remote"), launchActivity.T0.f20417id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.t0(new kc1(u10, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                Pattern pattern4 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.t0(new qb0());
                return;
            default:
                if (!launchActivity.f33203w1) {
                    try {
                        org.telegram.ui.ActionBar.b2 B = org.telegram.ui.Components.f5.B(launchActivity);
                        B.setOnDismissListener(new k80(launchActivity, 0));
                        launchActivity.f33203w1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
