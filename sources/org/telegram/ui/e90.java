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
    public final int f35962a;
    public final LaunchActivity f35963b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f35962a = i10;
        this.f35963b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f35962a;
        org.telegram.ui.ActionBar.n2 n2Var = null;
        LaunchActivity launchActivity = this.f35963b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(launchActivity, null);
                zbVar.d(R.raw.email_check_inbox, new String[0]);
                zbVar.f33466b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.rc.g(R, zbVar, 1500).j();
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
                    launchActivity.I(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.I(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f33798q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33798q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.qy0(launchActivity, launchActivity.f33786j0, launchActivity.f33782h0, launchActivity.f33784i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.d30.f25533e0 = false;
                org.telegram.ui.Components.d30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f33774d0;
                ArrayList arrayList2 = launchActivity.f33776e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList);
                }
                if (!(n2Var instanceof ProxyListActivity) && !(n2Var instanceof h21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f33809v1) {
                    try {
                        org.telegram.ui.ActionBar.b2 C = org.telegram.ui.Components.e5.C(launchActivity);
                        C.setOnDismissListener(new g90(launchActivity, 0));
                        launchActivity.f33809v1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), launchActivity.T0.f20175id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.h6 u10 = org.telegram.ui.ActionBar.i6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new rd1(u10, true, 0, false, false));
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
                launchActivity.f33805t1 = null;
                return;
            default:
                launchActivity.f33807u1 = null;
                return;
        }
    }
}
