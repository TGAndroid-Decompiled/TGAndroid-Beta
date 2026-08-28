package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l80 implements Runnable {
    public final int f40078a;
    public final LaunchActivity f40079b;

    public l80(LaunchActivity launchActivity, int i9) {
        this.f40078a = i9;
        this.f40079b = launchActivity;
    }

    @Override
    public final void run() {
        int i9 = this.f40078a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        LaunchActivity launchActivity = this.f40079b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(launchActivity, null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.f31343b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.gc.g(R, obVar, 1500).j();
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
                Pattern pattern2 = LaunchActivity.f35493x1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.m0.getFragmentStack().isEmpty()) {
                    launchActivity.m0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.cx0(launchActivity, launchActivity.f35506f0, launchActivity.f35502d0, launchActivity.f35504e0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.f35493x1;
                launchActivity.getClass();
                org.telegram.ui.Components.j20.f29597a0 = false;
                org.telegram.ui.Components.j20.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.Z;
                ArrayList arrayList2 = launchActivity.f35496a0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof k11)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f35529r1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.y4.C(launchActivity);
                        C.setOnDismissListener(new m80(launchActivity, 0));
                        launchActivity.f35529r1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.P0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), aa.d.q(new StringBuilder("remote"), launchActivity.P0.f22517id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.P0;
                    org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new oc1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.f35493x1;
                launchActivity.getClass();
                launchActivity.p0(new sb0());
                return;
            case 9:
                launchActivity.f35525p1 = null;
                return;
            default:
                launchActivity.f35527q1 = null;
                return;
        }
    }
}
