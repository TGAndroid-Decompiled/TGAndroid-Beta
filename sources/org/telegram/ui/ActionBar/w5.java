package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.eo0;
import org.telegram.ui.web.HttpGetFileTask;
import rh.s8;
public final class w5 implements Runnable {
    public final int f21451a;
    public final Object f21452b;

    public w5(Object obj, int i10) {
        this.f21451a = i10;
        this.f21452b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f21451a) {
            case 0:
                ((CountDownLatch) this.f21452b).countDown();
                return;
            case 1:
                a30.k(1, (k2) this.f21452b);
                return;
            case 2:
                x7 x7Var = (x7) t6.f20948e5.remove((kj) this.f21452b);
                if (x7Var != null) {
                    x7Var.f32479i = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.f21452b;
                xVar.P0 = null;
                xVar.setVisibleParticipant(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f21452b;
                t0Var.K = false;
                t0Var.j(false);
                t0Var.W = false;
                return;
            case 5:
                org.telegram.ui.Components.voip.t0 t0Var2 = (org.telegram.ui.Components.voip.t0) ((eg.b) this.f21452b).f6521b;
                t0Var2.e.invalidate();
                if (!t0Var2.e.isInLayout()) {
                    t0Var2.e.requestLayout();
                    t0Var2.d.requestLayout();
                    t0Var2.f31729f.requestLayout();
                    return;
                }
                return;
            case 6:
                ((org.telegram.ui.Components.voip.s0) this.f21452b).f31714a.a(false);
                return;
            case 7:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.f21452b;
                p1Var.e = false;
                HashMap hashMap = p1Var.f31642a;
                ArrayList arrayList = p1Var.f31644c;
                ArrayList arrayList2 = p1Var.f31643b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (p1Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(p1Var, p1Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (o1Var.f31633a.equals(((org.telegram.ui.Components.voip.o1) arrayList.get(i11)).f31633a)) {
                                arrayList2.remove(i10);
                                arrayList.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        p1Var.addView((View) arrayList2.get(i12), w7.b6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        p1Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < p1Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.o1 o1Var2 = (org.telegram.ui.Components.voip.o1) p1Var.getChildAt(i14);
                        hashMap.put(o1Var2.f31633a, o1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    p1Var.e = true;
                    org.telegram.messenger.i0.h3(new w5(p1Var, 7), 700L);
                    Runnable runnable = p1Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.w1) this.f21452b).f31770a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 9:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.w1) ((ci.i) this.f21452b).e).f31770a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 10:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.f21452b;
                if (a2Var.getVisibility() == 0) {
                    a2Var.a();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.f21452b;
                e2Var.e = Bitmap.createBitmap(e2Var.getMeasuredWidth(), e2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(e2Var.e).drawText(e2Var.d, e2Var.getMeasuredWidth() / 2, (int) ((e2Var.getMeasuredHeight() / 2) - ((e2Var.f31469a.ascent() + e2Var.f31469a.descent()) / 2.0f)), e2Var.f31469a);
                e2Var.postInvalidate();
                return;
            case 12:
                ((org.telegram.ui.web.j) this.f21452b).f42874x.f31183f3.O(true);
                return;
            case 13:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.m) ((eo0) this.f21452b).f36881c).f42929f;
                if (hVar != null) {
                    hVar.d();
                    return;
                }
                return;
            case 14:
                ((mt) this.f21452b).requestFocus();
                return;
            case 15:
                gf.f.r(((org.telegram.ui.web.r0) this.f21452b).f42982b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 16:
                eo0 eo0Var = (eo0) this.f21452b;
                Utilities.f14523g.c(new v41(eo0Var, new ArrayList(((org.telegram.ui.web.b1) eo0Var.f36881c).f42797f), ((org.telegram.ui.web.b1) eo0Var.f36881c).f42799r, 8));
                return;
            case 17:
                HttpGetFileTask.a((HttpGetFileTask) this.f21452b);
                return;
            case 18:
                ((org.telegram.ui.Wallet.a6) this.f21452b).invalidateSelf();
                return;
            case 19:
                org.telegram.ui.web.p1 p1Var2 = (org.telegram.ui.web.p1) this.f21452b;
                File databasePath = org.telegram.messenger.w0.f18945b.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = org.telegram.messenger.w0.f18945b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.w0.f18945b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += org.telegram.ui.web.p1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.w0.f18945b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.p1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.w0.f18945b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.p1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.i0.g3(new ki.d(p1Var2, j10, j11, 4));
                return;
            case 20:
                ((boolean[]) this.f21452b)[0] = true;
                return;
            case 21:
                ((p4.e) this.f21452b).k();
                return;
            case 22:
                ((p4.g) this.f21452b).f44753n = -1;
                return;
            case 23:
                ((wj0) this.f21452b).b();
                return;
            case 24:
                ph.m mVar = (ph.m) this.f21452b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.i0.L(28.0f));
                return;
            case 25:
                ((ph.d0) this.f21452b).onBackPressed();
                return;
            case 26:
                q51 q51Var = ((ph.l1) this.f21452b).Q1;
                if (q51Var != null) {
                    q51Var.O(false);
                    return;
                }
                return;
            case 27:
                ((ph.z0) this.f21452b).c();
                return;
            case 28:
                ((ph.f1) this.f21452b).invalidateSelf();
                return;
            default:
                ph.i1 i1Var = (ph.i1) this.f21452b;
                s8 s8Var = i1Var.e;
                if (s8Var != null) {
                    s8Var.d();
                    i1Var.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
