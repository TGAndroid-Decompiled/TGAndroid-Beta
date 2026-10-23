package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p80 implements Runnable {
    public final int f40394a;
    public final LaunchActivity f40395b;

    public p80(LaunchActivity launchActivity, int i10) {
        this.f40394a = i10;
        this.f40395b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f40394a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        LaunchActivity launchActivity = this.f40395b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(launchActivity, null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f32863b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
                if (launchActivity.X0) {
                    launchActivity.X0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.E1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f33487q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33487q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.ty0(launchActivity, launchActivity.f33475j0, launchActivity.f33471h0, launchActivity.f33473i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.E1;
                launchActivity.getClass();
                org.telegram.ui.Components.i30.f27185e0 = false;
                org.telegram.ui.Components.i30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f33463d0;
                ArrayList arrayList2 = launchActivity.f33465e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof w11)) {
                    launchActivity.u0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                launchActivity.f33500w1 = null;
                return;
            case 7:
                launchActivity.f33502x1 = null;
                return;
            case 8:
                if (launchActivity.U0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.r(new StringBuilder("remote"), launchActivity.U0.f20480id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.U0;
                    org.telegram.ui.ActionBar.j6 u10 = org.telegram.ui.ActionBar.k6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.u0(new qc1(u10, true, 0, false, false));
                    }
                    launchActivity.j0();
                    return;
                }
                return;
            case 9:
                Pattern pattern4 = LaunchActivity.E1;
                launchActivity.getClass();
                launchActivity.u0(new wb0());
                return;
            default:
                if (!launchActivity.f33504y1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.f5.C(launchActivity);
                        C.setOnDismissListener(new q80(launchActivity, 0));
                        launchActivity.f33504y1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
