package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d90 implements Runnable {
    public final int f32897a;
    public final LaunchActivity f32898b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f32897a = i10;
        this.f32898b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f32897a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        LaunchActivity launchActivity = this.f32898b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(launchActivity, null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30642b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
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
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f31132q0.getFragmentStack().isEmpty()) {
                    launchActivity.f31132q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.hy0(launchActivity, launchActivity.f31120j0, launchActivity.f31116h0, launchActivity.f31118i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.c30.f23198e0 = false;
                org.telegram.ui.Components.c30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f31108d0;
                ArrayList arrayList2 = launchActivity.f31110e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.g(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof h21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f31143v1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.e5.C(launchActivity);
                        C.setOnDismissListener(new f90(launchActivity, 0));
                        launchActivity.f31143v1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), launchActivity.T0.f18466id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.h6 u10 = org.telegram.ui.ActionBar.i6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new pd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.p0(new kc0());
                return;
            case 9:
                launchActivity.f31139t1 = null;
                return;
            default:
                launchActivity.f31141u1 = null;
                return;
        }
    }
}
