package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q60 implements Runnable {
    public final int f50471a;
    public final LaunchActivity f50472b;

    public q60(LaunchActivity launchActivity, int i7) {
        this.f50471a = i7;
        this.f50472b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        int i7 = this.f50471a;
        org.telegram.ui.ActionBar.e2 e2Var = null;
        LaunchActivity launchActivity = this.f50472b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(launchActivity, null);
                fbVar.d(2131624009, new String[0]);
                fbVar.f34556b.setText(org.telegram.messenger.hd.M0(2131742811, null));
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.xb.g(Q, fbVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.F(false, false, true);
                    return;
                }
                return;
            case 2:
                if (!launchActivity.f42664w1) {
                    try {
                        org.telegram.ui.ActionBar.t1 z10 = org.telegram.ui.Components.t4.z(launchActivity);
                        z10.setOnDismissListener(new i70(launchActivity, 0));
                        launchActivity.f42664w1 = true;
                        z10.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().V();
                    return;
                }
                return;
            case 4:
                if (!launchActivity.f42649p0.getFragmentStack().isEmpty()) {
                    launchActivity.f42649p0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.bw0(launchActivity, launchActivity.f42642k0, launchActivity.f42638i0, launchActivity.f42640j0));
                    return;
                }
                return;
            case 5:
                String str3 = LaunchActivity.C1;
                launchActivity.getClass();
                org.telegram.ui.Components.s10.f39140g0 = false;
                org.telegram.ui.Components.s10.k(launchActivity);
                return;
            case 6:
                String str4 = LaunchActivity.C1;
                if (org.telegram.messenger.g0.f23594g != -10 && org.telegram.messenger.g0.f23592f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.f23597i) != null && weakReference.get() == launchActivity) {
                    int i10 = org.telegram.messenger.g0.h;
                    int i11 = org.telegram.messenger.g0.f23594g;
                    org.telegram.messenger.g0.f23594g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.f23597i = null;
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
                launchActivity.f42660u1 = null;
                return;
            case 8:
                if (launchActivity.T0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), launchActivity.T0.f28190id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.i6 v = org.telegram.ui.ActionBar.j6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new t71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = launchActivity.f42630e0;
                ArrayList arrayList2 = launchActivity.f42632f0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
                }
                if (!(e2Var instanceof ProxyListActivity) && !(e2Var instanceof tx0)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                launchActivity.f42662v1 = null;
                return;
            default:
                String str5 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.t0(new x90());
                return;
        }
    }
}
