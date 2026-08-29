package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f41003a;
    public final LaunchActivity f41004b;

    public o80(LaunchActivity launchActivity, int i10) {
        this.f41003a = i10;
        this.f41004b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f41003a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        LaunchActivity launchActivity = this.f41004b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(launchActivity, null);
                ubVar.d(R.raw.email_check_inbox, new String[0]);
                ubVar.f33185b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.mc.g(R, ubVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.S0) {
                    launchActivity.S0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.f35560x1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.m0.getFragmentStack().isEmpty()) {
                    launchActivity.m0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.nx0(launchActivity, launchActivity.f35573f0, launchActivity.f35569d0, launchActivity.f35571e0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.f35560x1;
                launchActivity.getClass();
                org.telegram.ui.Components.w20.f34274a0 = false;
                org.telegram.ui.Components.w20.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.Z;
                ArrayList arrayList2 = launchActivity.f35563a0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof l11)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f35596r1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.c5.C(launchActivity);
                        C.setOnDismissListener(new p80(launchActivity, 0));
                        launchActivity.f35596r1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.P0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.w.p(new StringBuilder("remote"), launchActivity.P0.f22529id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.P0;
                    org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new qc1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.f35560x1;
                launchActivity.getClass();
                launchActivity.p0(new ub0());
                return;
            case 9:
                launchActivity.f35592p1 = null;
                return;
            default:
                launchActivity.f35594q1 = null;
                return;
        }
    }
}
