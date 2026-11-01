package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class p70 implements Runnable {
    public final int f40381a;
    public final LaunchActivity f40382b;

    public p70(LaunchActivity launchActivity, int i10) {
        this.f40381a = i10;
        this.f40382b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        int i10 = this.f40381a;
        org.telegram.ui.ActionBar.k2 k2Var = null;
        LaunchActivity launchActivity = this.f40382b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(launchActivity, null);
                ebVar.d(2131624008, new String[0]);
                ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131742836, null));
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.wb.g(Q, ebVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.X0) {
                    launchActivity.X0 = false;
                    launchActivity.F(false, false, true);
                    return;
                }
                return;
            case 2:
                if (!launchActivity.f33399x1) {
                    try {
                        org.telegram.ui.ActionBar.x1 B = org.telegram.ui.Components.s4.B(launchActivity);
                        B.setOnDismissListener(new j80(launchActivity, 0));
                        launchActivity.f33399x1 = true;
                        B.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().d0();
                    return;
                }
                return;
            case 4:
                if (!launchActivity.f33384q0.getFragmentStack().isEmpty()) {
                    launchActivity.f33384q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.dx0(launchActivity, launchActivity.f33372j0, launchActivity.f33368h0, launchActivity.f33370i0));
                    return;
                }
                return;
            case 5:
                Pattern pattern3 = LaunchActivity.D1;
                launchActivity.getClass();
                org.telegram.ui.Components.g20.f26297e0 = false;
                org.telegram.ui.Components.g20.j(launchActivity);
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.D1;
                if (org.telegram.messenger.i0.f16155g != -10 && org.telegram.messenger.i0.f16153f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.i0.f16158i) != null && weakReference.get() == launchActivity) {
                    int i11 = org.telegram.messenger.i0.h;
                    int i12 = org.telegram.messenger.i0.f16155g;
                    org.telegram.messenger.i0.f16155g = -10;
                    org.telegram.messenger.i0.h = -10;
                    org.telegram.messenger.i0.f16158i = null;
                    try {
                        launchActivity.setRequestedOrientation(i11);
                        launchActivity.setRequestedOrientation(i12);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            case 7:
                launchActivity.f33395v1 = null;
                return;
            case 8:
                if (launchActivity.U0 != null) {
                    File file = new File(org.telegram.messenger.w0.h(), a1.g.q(new StringBuilder("remote"), launchActivity.U0.f19933id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.U0;
                    org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new k91(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = launchActivity.f33360d0;
                ArrayList arrayList2 = launchActivity.f33362e0;
                if (org.telegram.messenger.i0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                }
                if (!(k2Var instanceof ProxyListActivity) && !(k2Var instanceof iz0)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                launchActivity.f33397w1 = null;
                return;
            default:
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.t0(new ab0());
                return;
        }
    }
}
