package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class p80 implements Runnable {

    public final int f41296a;

    public final LaunchActivity f41297b;

    public p80(LaunchActivity launchActivity, int i10) {
        this.f41296a = i10;
        this.f41297b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f41296a;
        org.telegram.ui.ActionBar.n2 n2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.f41297b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(launchActivity, null);
                mbVar.d(R.raw.email_check_inbox, new String[0]);
                mbVar.f30639b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    org.telegram.ui.Components.ec.g(n2VarR, mbVar, 1500).j();
                    try {
                        n2VarR.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.S0) {
                    launchActivity.S0 = false;
                    launchActivity.H(false, false, true);
                }
                break;
            case 2:
                Pattern pattern2 = LaunchActivity.f35496x1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    break;
                }
                break;
            case 3:
                if (!launchActivity.m0.getFragmentStack().isEmpty()) {
                    launchActivity.m0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.ex0(launchActivity, launchActivity.f35509f0, launchActivity.f35505d0, launchActivity.f35507e0));
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.f35496x1;
                launchActivity.getClass();
                org.telegram.ui.Components.n20.f30818a0 = false;
                org.telegram.ui.Components.n20.j(launchActivity);
                break;
            case 5:
                ArrayList arrayList = launchActivity.Z;
                ArrayList arrayList2 = launchActivity.f35499a0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                }
                if (!(n2Var instanceof ProxyListActivity) && !(n2Var instanceof j11)) {
                    launchActivity.p0(new ProxyListActivity());
                    break;
                }
                break;
            case 6:
                if (!launchActivity.f35532r1) {
                    try {
                        org.telegram.ui.ActionBar.b2 b2VarC = org.telegram.ui.Components.y4.C(launchActivity);
                        b2VarC.setOnDismissListener(new q80(launchActivity, i11));
                        launchActivity.f35532r1 = true;
                        b2VarC.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                    break;
                }
                break;
            case 7:
                if (launchActivity.P0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a9.p.o(new StringBuilder("remote"), launchActivity.P0.f22517id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.P0;
                    org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file, tL_theme.title, tL_theme, true);
                    if (f6VarU != null) {
                        launchActivity.p0(new nc1(f6VarU, true, 0, false, false));
                    }
                    launchActivity.h0();
                    break;
                }
                break;
            case 8:
                Pattern pattern4 = LaunchActivity.f35496x1;
                launchActivity.getClass();
                launchActivity.p0(new xb0());
                break;
            case 9:
                launchActivity.f35528p1 = null;
                break;
            default:
                launchActivity.f35530q1 = null;
                break;
        }
    }
}
