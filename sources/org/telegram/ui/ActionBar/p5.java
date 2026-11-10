package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.xk;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.ys;
import org.telegram.ui.cn;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.z91;
public final class p5 implements Runnable {
    public final int f28385a;
    public final Object f28386b;

    public p5(Object obj, int i7) {
        this.f28385a = i7;
        this.f28386b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28385a) {
            case 0:
                org.telegram.messenger.camera.q.j(1, (f2) this.f28386b);
                return;
            case 1:
                b8 b8Var = (b8) m6.f27908e5.remove((ij) this.f28386b);
                if (b8Var != null) {
                    b8Var.f32149i = null;
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f28386b;
                k0Var.P0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 3:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.d1) this.f28386b).h;
                ti.o oVar = g1Var.f39227a;
                if (oVar != null) {
                    oVar.c();
                }
                org.telegram.ui.Components.voip.f1 f1Var = g1Var.f39231f;
                if (f1Var != null) {
                    f1Var.a();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.f28386b;
                a2Var.f39102e = false;
                HashMap hashMap = a2Var.f39099a;
                ArrayList arrayList = a2Var.f39101c;
                ArrayList arrayList2 = a2Var.f39100b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (a2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(a2Var, a2Var.d);
                    }
                    int i7 = 0;
                    while (i7 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) arrayList2.get(i7);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            } else if (z1Var.f39688a.equals(((org.telegram.ui.Components.voip.z1) arrayList.get(i10)).f39688a)) {
                                arrayList2.remove(i7);
                                arrayList.remove(i10);
                                i7--;
                            } else {
                                i10++;
                            }
                        }
                        i7++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        a2Var.addView((View) arrayList2.get(i11), ha.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        a2Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < a2Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.z1 z1Var2 = (org.telegram.ui.Components.voip.z1) a2Var.getChildAt(i13);
                        hashMap.put(z1Var2.f39688a, z1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    a2Var.f39102e = true;
                    org.telegram.messenger.g0.i3(new p5(a2Var, 4), 700L);
                    Runnable runnable = a2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.h2) this.f28386b).f39253a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 6:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.h2) ((jg.j0) this.f28386b).f16813e).f39253a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 7:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.f28386b;
                if (l2Var.getVisibility() == 0) {
                    l2Var.a();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.f28386b;
                p2Var.f39483e = Bitmap.createBitmap(p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(p2Var.f39483e).drawText(p2Var.d, p2Var.getMeasuredWidth() / 2, (int) ((p2Var.getMeasuredHeight() / 2) - ((p2Var.f39480a.ascent() + p2Var.f39480a.descent()) / 2.0f)), p2Var.f39480a);
                p2Var.postInvalidate();
                return;
            case 9:
                ((org.telegram.ui.web.j) this.f28386b).f51108x.f37496f3.O(true);
                return;
            case 10:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.l) ((fi.u2) this.f28386b).f12886c).f51158f;
                if (hVar != null) {
                    hVar.d();
                    return;
                }
                return;
            case 11:
                ((ys) this.f28386b).requestFocus();
                return;
            case 12:
                vf.c.t(((org.telegram.ui.web.q0) this.f28386b).f51217b.f51228e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 13:
                fi.u2 u2Var = (fi.u2) this.f28386b;
                Utilities.f21343g.c(new r31(u2Var, new ArrayList(((org.telegram.ui.web.z0) u2Var.f12886c).f51347f), ((org.telegram.ui.web.z0) u2Var.f12886c).f51349r, 8));
                return;
            case 14:
                HttpGetFileTask.a((HttpGetFileTask) this.f28386b);
                return;
            case 15:
                ((org.telegram.ui.Wallet.y5) this.f28386b).invalidateSelf();
                return;
            case 16:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.f28386b;
                File databasePath = org.telegram.messenger.t0.f25570b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f25570b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += org.telegram.ui.web.o1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += org.telegram.ui.web.o1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = org.telegram.ui.web.o1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new xk(o1Var, j3, j10, 2));
                return;
            case 17:
                ((boolean[]) this.f28386b)[0] = true;
                return;
            case 18:
                q2.d dVar = (q2.d) this.f28386b;
                if (!dVar.f53730c) {
                    q2.g gVar = dVar.f53729b;
                    if (gVar != null) {
                        gVar.c(dVar.f53728a);
                    }
                    dVar.d.f53741y.remove(dVar);
                    dVar.f53730c = true;
                    return;
                }
                return;
            case 19:
                ((q2.b) this.f28386b).c(null);
                return;
            case 20:
                z91 z91Var = (z91) this.f28386b;
                if (z91Var.getParentLayout() != null) {
                    z91Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", z91Var.f52343a);
                    cn cnVar = new cn(bundle);
                    cnVar.Ea = true;
                    z91Var.presentFragment(cnVar);
                    return;
                }
                return;
            case 21:
                ((qt) this.f28386b).m0();
                return;
            case 22:
                hz hzVar = (hz) this.f28386b;
                rh.b bVar = (rh.b) hzVar.f34486c;
                if (bVar == rh.b.f54548b) {
                    hzVar.a(rh.b.f54547a, true);
                    return;
                } else if (bVar == rh.b.f54549c) {
                    hzVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 23:
                ((s4.e) this.f28386b).k();
                return;
            case 24:
                ((s4.g) this.f28386b).f54832n = -1;
                return;
            case 25:
                ((ri0) this.f28386b).b();
                return;
            case 26:
                uy uyVar = ((sg.h0) this.f28386b).f55075b.f55098a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            case 27:
                sg.j0 j0Var = ((sg.h0) this.f28386b).f55075b;
                if (j0Var.d == null) {
                    j0Var.L = null;
                    return;
                }
                int currentColor = j0Var.f55102f.getCurrentColor();
                j0Var.l(j0Var.f55099b, false, false);
                wa d = j0Var.d(j0Var.f55099b, currentColor, new RectF(j0Var.h));
                j0Var.b();
                sg.y0 y0Var = j0Var.d;
                RectF rectF = new RectF();
                j0Var.h = rectF;
                y0Var.a(rectF);
                j0Var.p(j0Var.e(y0Var, currentColor, new RectF(j0Var.h)), false);
                j0Var.p(d, false);
                j0Var.e(y0Var, currentColor, null);
                j0Var.d = null;
                j0Var.J = 0.0f;
                j0Var.L = null;
                return;
            case 28:
                ((sg.t0) ((dt) this.f28386b).f33073b).D.f55233a.n();
                return;
            default:
                sg.k1 k1Var = ((sg.l1) this.f28386b).f55146a;
                if (k1Var != null) {
                    k1Var.f();
                    return;
                }
                return;
        }
    }
}
