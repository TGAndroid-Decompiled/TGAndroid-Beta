package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h90 implements Runnable {
    public final int f38300a;
    public final LaunchActivity f38301b;

    public h90(LaunchActivity launchActivity, int i10) {
        this.f38300a = i10;
        this.f38301b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f38300a;
        org.telegram.ui.ActionBar.m2 m2Var = null;
        LaunchActivity launchActivity = this.f38301b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(launchActivity, null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f24276b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
                if (!launchActivity.f33644q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33644q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.dz0(launchActivity, launchActivity.f33632j0, launchActivity.f33628h0, launchActivity.f33630i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.t30.f30740e0 = false;
                org.telegram.ui.Components.t30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f33620d0;
                ArrayList arrayList2 = launchActivity.f33622e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        m2Var = (org.telegram.ui.ActionBar.m2) hg.c.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    m2Var = (org.telegram.ui.ActionBar.m2) hg.c.h(1, arrayList);
                }
                if (!(m2Var instanceof ProxyListActivity) && !(m2Var instanceof q21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f33655v1) {
                    try {
                        org.telegram.ui.ActionBar.a2 B = org.telegram.ui.Components.g5.B(launchActivity);
                        B.setOnDismissListener(new j90(launchActivity, 0));
                        launchActivity.f33655v1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.s(new StringBuilder("remote"), launchActivity.T0.f19939id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new zd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.p0(new nc0());
                return;
            case 9:
                launchActivity.f33651t1 = null;
                return;
            default:
                launchActivity.f33653u1 = null;
                return;
        }
    }
}
