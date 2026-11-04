package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m60 implements Runnable {
    public final int f47542a;
    public final LaunchActivity f47543b;

    public m60(LaunchActivity launchActivity, int i3) {
        this.f47542a = i3;
        this.f47543b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        int i3 = this.f47542a;
        org.telegram.ui.ActionBar.d2 d2Var = null;
        LaunchActivity launchActivity = this.f47543b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(launchActivity, null);
                ibVar.d(2131624008, new String[0]);
                ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131742821, null));
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.ac.g(Q, ibVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.Y0) {
                    launchActivity.Y0 = false;
                    launchActivity.F(false, false, true);
                    return;
                }
                return;
            case 2:
                if (!launchActivity.f41329y1) {
                    try {
                        org.telegram.ui.ActionBar.s1 B = org.telegram.ui.Components.t4.B(launchActivity);
                        B.setOnDismissListener(new e70(launchActivity, 0));
                        launchActivity.f41329y1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                String str2 = LaunchActivity.E1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().d0();
                    return;
                }
                return;
            case 4:
                if (!launchActivity.f41314r0.getFragmentStack().isEmpty()) {
                    launchActivity.f41314r0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.xv0(launchActivity, launchActivity.f41303k0, launchActivity.f41299i0, launchActivity.f41301j0));
                    return;
                }
                return;
            case 5:
                String str3 = LaunchActivity.E1;
                launchActivity.getClass();
                org.telegram.ui.Components.l10.f35546f0 = false;
                org.telegram.ui.Components.l10.j(launchActivity);
                return;
            case 6:
                String str4 = LaunchActivity.E1;
                if (org.telegram.messenger.g0.f22591g != -10 && org.telegram.messenger.g0.f22589f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.f22594i) != null && weakReference.get() == launchActivity) {
                    int i10 = org.telegram.messenger.g0.h;
                    int i11 = org.telegram.messenger.g0.f22591g;
                    org.telegram.messenger.g0.f22591g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.f22594i = null;
                    try {
                        launchActivity.setRequestedOrientation(i10);
                        launchActivity.setRequestedOrientation(i11);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 7:
                launchActivity.f41325w1 = null;
                return;
            case 8:
                if (launchActivity.V0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a1.g.r(new StringBuilder("remote"), launchActivity.V0.f27140id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.V0;
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new l71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = launchActivity.f41291e0;
                ArrayList arrayList2 = launchActivity.f41293f0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                }
                if (!(d2Var instanceof ProxyListActivity) && !(d2Var instanceof mx0)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                launchActivity.f41327x1 = null;
                return;
            default:
                String str5 = LaunchActivity.E1;
                launchActivity.getClass();
                launchActivity.t0(new t90());
                return;
        }
    }
}
