package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f90 implements Runnable {
    public final int f32722a;
    public final LaunchActivity f32723b;

    public f90(LaunchActivity launchActivity, int i10) {
        this.f32722a = i10;
        this.f32723b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f32722a;
        org.telegram.ui.ActionBar.p2 p2Var = null;
        LaunchActivity launchActivity = this.f32723b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(launchActivity, null);
                xbVar.d(R.raw.email_check_inbox, new String[0]);
                xbVar.f29000b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.pc.g(R, xbVar, 1500).j();
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
                if (!launchActivity.f29957q0.getFragmentStack().isEmpty()) {
                    launchActivity.f29957q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.hy0(launchActivity, launchActivity.f29945j0, launchActivity.f29941h0, launchActivity.f29943i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.j30.f24208e0 = false;
                org.telegram.ui.Components.j30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f29933d0;
                ArrayList arrayList2 = launchActivity.f29935e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList);
                }
                if (!(p2Var instanceof ProxyListActivity) && !(p2Var instanceof u21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f29968v1) {
                    try {
                        org.telegram.ui.ActionBar.d2 C = org.telegram.ui.Components.d5.C(launchActivity);
                        C.setOnDismissListener(new g90(launchActivity, 0));
                        launchActivity.f29968v1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), launchActivity.T0.f17332id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new ae1(u10, true, 0, false, false));
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
                launchActivity.f29964t1 = null;
                return;
            default:
                launchActivity.f29966u1 = null;
                return;
        }
    }
}
