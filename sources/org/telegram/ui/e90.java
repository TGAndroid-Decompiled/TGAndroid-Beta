package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e90 implements Runnable {
    public final int f37243a;
    public final LaunchActivity f37244b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f37243a = i10;
        this.f37244b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f37243a;
        org.telegram.ui.ActionBar.m2 m2Var = null;
        LaunchActivity launchActivity = this.f37244b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(launchActivity, null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f24488b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.sc.g(R, acVar, 1500).j();
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
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f33835q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33835q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.zy0(launchActivity, launchActivity.f33823j0, launchActivity.f33819h0, launchActivity.f33821i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.r30.f30318e0 = false;
                org.telegram.ui.Components.r30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f33811d0;
                ArrayList arrayList2 = launchActivity.f33813e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        m2Var = (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    m2Var = (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList);
                }
                if (!(m2Var instanceof ProxyListActivity) && !(m2Var instanceof m21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f33846v1) {
                    try {
                        org.telegram.ui.ActionBar.a2 B = org.telegram.ui.Components.g5.B(launchActivity);
                        B.setOnDismissListener(new g90(launchActivity, 0));
                        launchActivity.f33846v1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.s(new StringBuilder("remote"), launchActivity.T0.f20169id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new wd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.p0(new lc0());
                return;
            case 9:
                launchActivity.f33842t1 = null;
                return;
            default:
                launchActivity.f33844u1 = null;
                return;
        }
    }
}
