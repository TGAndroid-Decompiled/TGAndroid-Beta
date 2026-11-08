package org.telegram.ui.ActionBar;

import a8.wa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.xk;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.zs;
import org.telegram.ui.an;
import org.telegram.ui.w91;
import org.telegram.ui.web.HttpGetFileTask;
public final class m5 implements Runnable {
    public final int f28309a;
    public final Object f28310b;

    public m5(Object obj, int i7) {
        this.f28309a = i7;
        this.f28310b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28309a) {
            case 0:
                Drawable drawable = (Drawable) this.f28310b;
                k6.d = null;
                k6.P();
                if (!k6.f27808b) {
                    k6.j(drawable);
                    k6.h(drawable);
                }
                qs.e().k(276, new Object[0]);
                return;
            case 1:
                ((CountDownLatch) this.f28310b).countDown();
                return;
            case 2:
                org.telegram.messenger.camera.q.j(1, (f2) this.f28310b);
                return;
            case 3:
                c8 c8Var = (c8) k6.f27870e5.remove((ij) this.f28310b);
                if (c8Var != null) {
                    c8Var.f32476i = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f28310b;
                k0Var.P0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 5:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.d1) this.f28310b).h;
                ti.o oVar = g1Var.f39218a;
                if (oVar != null) {
                    oVar.c();
                }
                org.telegram.ui.Components.voip.f1 f1Var = g1Var.f39222f;
                if (f1Var != null) {
                    f1Var.a();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.f28310b;
                a2Var.f39093e = false;
                HashMap hashMap = a2Var.f39090a;
                ArrayList arrayList = a2Var.f39092c;
                ArrayList arrayList2 = a2Var.f39091b;
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
                            } else if (z1Var.f39677a.equals(((org.telegram.ui.Components.voip.z1) arrayList.get(i10)).f39677a)) {
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
                        hashMap.put(z1Var2.f39677a, z1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    a2Var.f39093e = true;
                    org.telegram.messenger.g0.i3(new m5(a2Var, 6), 700L);
                    Runnable runnable = a2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.h2) this.f28310b).f39244a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 8:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.h2) ((jg.j0) this.f28310b).f16813e).f39244a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 9:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.f28310b;
                if (l2Var.getVisibility() == 0) {
                    l2Var.a();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.f28310b;
                p2Var.f39474e = Bitmap.createBitmap(p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(p2Var.f39474e).drawText(p2Var.d, p2Var.getMeasuredWidth() / 2, (int) ((p2Var.getMeasuredHeight() / 2) - ((p2Var.f39471a.ascent() + p2Var.f39471a.descent()) / 2.0f)), p2Var.f39471a);
                p2Var.postInvalidate();
                return;
            case 11:
                ((org.telegram.ui.web.j) this.f28310b).f51173x.f37190f3.O(true);
                return;
            case 12:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.l) ((fi.u2) this.f28310b).f12884c).f51223f;
                if (hVar != null) {
                    hVar.d();
                    return;
                }
                return;
            case 13:
                ((zs) this.f28310b).requestFocus();
                return;
            case 14:
                vf.c.t(((org.telegram.ui.web.q0) this.f28310b).f51282b.f51293e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 15:
                fi.u2 u2Var = (fi.u2) this.f28310b;
                Utilities.f21338g.c(new r31(u2Var, new ArrayList(((org.telegram.ui.web.z0) u2Var.f12884c).f51412f), ((org.telegram.ui.web.z0) u2Var.f12884c).f51414r, 8));
                return;
            case 16:
                HttpGetFileTask.a((HttpGetFileTask) this.f28310b);
                return;
            case 17:
                ((org.telegram.ui.Wallet.w5) this.f28310b).invalidateSelf();
                return;
            case 18:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.f28310b;
                File databasePath = org.telegram.messenger.t0.f25566b.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f25566b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += org.telegram.ui.web.o1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += org.telegram.ui.web.o1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = org.telegram.ui.web.o1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new xk(o1Var, j3, j10, 2));
                return;
            case 19:
                ((boolean[]) this.f28310b)[0] = true;
                return;
            case 20:
                q2.d dVar = (q2.d) this.f28310b;
                if (!dVar.f53718c) {
                    q2.g gVar = dVar.f53717b;
                    if (gVar != null) {
                        gVar.c(dVar.f53716a);
                    }
                    dVar.d.f53729y.remove(dVar);
                    dVar.f53718c = true;
                    return;
                }
                return;
            case 21:
                ((q2.b) this.f28310b).c(null);
                return;
            case 22:
                w91 w91Var = (w91) this.f28310b;
                if (w91Var.getParentLayout() != null) {
                    w91Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", w91Var.f50992a);
                    an anVar = new an(bundle);
                    anVar.Ca = true;
                    w91Var.presentFragment(anVar);
                    return;
                }
                return;
            case 23:
                ((rt) this.f28310b).m0();
                return;
            case 24:
                iz izVar = (iz) this.f28310b;
                rh.b bVar = (rh.b) izVar.f34846c;
                if (bVar == rh.b.f54536b) {
                    izVar.a(rh.b.f54535a, true);
                    return;
                } else if (bVar == rh.b.f54537c) {
                    izVar.a(rh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 25:
                ((s4.e) this.f28310b).k();
                return;
            case 26:
                ((s4.g) this.f28310b).f54820n = -1;
                return;
            case 27:
                ((ri0) this.f28310b).b();
                return;
            case 28:
                vy vyVar = ((sg.h0) this.f28310b).f55061b.f55085a;
                if (vyVar != null) {
                    vyVar.b();
                    return;
                }
                return;
            default:
                sg.j0 j0Var = ((sg.h0) this.f28310b).f55061b;
                if (j0Var.d == null) {
                    j0Var.L = null;
                    return;
                }
                int currentColor = j0Var.f55089f.getCurrentColor();
                j0Var.l(j0Var.f55086b, false, false);
                wa d = j0Var.d(j0Var.f55086b, currentColor, new RectF(j0Var.h));
                j0Var.b();
                sg.z0 z0Var = j0Var.d;
                RectF rectF = new RectF();
                j0Var.h = rectF;
                z0Var.a(rectF);
                j0Var.p(j0Var.e(z0Var, currentColor, new RectF(j0Var.h)), false);
                j0Var.p(d, false);
                j0Var.e(z0Var, currentColor, null);
                j0Var.d = null;
                j0Var.J = 0.0f;
                j0Var.L = null;
                return;
        }
    }
}
