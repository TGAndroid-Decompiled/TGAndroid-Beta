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
    public final int f34215a;
    public final LaunchActivity f34216b;

    public h90(LaunchActivity launchActivity, int i10) {
        this.f34215a = i10;
        this.f34216b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f34215a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        LaunchActivity launchActivity = this.f34216b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(launchActivity, null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f29623b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.oc.g(R, wbVar, 1500).j();
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
                if (!launchActivity.f30858q0.getFragmentStack().isEmpty()) {
                    launchActivity.f30858q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.wx0(launchActivity, launchActivity.f30846j0, launchActivity.f30842h0, launchActivity.f30844i0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.z20.f30374e0 = false;
                org.telegram.ui.Components.z20.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f30834d0;
                ArrayList arrayList2 = launchActivity.f30836e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof q21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f30869v1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.c5.C(launchActivity);
                        C.setOnDismissListener(new j90(launchActivity, 0));
                        launchActivity.f30869v1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), launchActivity.T0.f18258id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new xd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.p0(new pc0());
                return;
            case 9:
                launchActivity.f30865t1 = null;
                return;
            default:
                launchActivity.f30867u1 = null;
                return;
        }
    }
}
