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
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.go0;
import org.telegram.ui.web.HttpGetFileTask;
import rh.s8;
public final class w5 implements Runnable {
    public final int f21450a;
    public final Object f21451b;

    public w5(Object obj, int i10) {
        this.f21450a = i10;
        this.f21451b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f21450a) {
            case 0:
                ((CountDownLatch) this.f21451b).countDown();
                return;
            case 1:
                z20.k(1, (k2) this.f21451b);
                return;
            case 2:
                x7 x7Var = (x7) t6.f20947e5.remove((jj) this.f21451b);
                if (x7Var != null) {
                    x7Var.f32400i = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.voip.w wVar = (org.telegram.ui.Components.voip.w) this.f21451b;
                wVar.P0 = null;
                wVar.setVisibleParticipant(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f21451b;
                s0Var.K = false;
                s0Var.j(false);
                s0Var.W = false;
                return;
            case 5:
                org.telegram.ui.Components.voip.s0 s0Var2 = (org.telegram.ui.Components.voip.s0) ((eg.b) this.f21451b).f6521b;
                s0Var2.e.invalidate();
                if (!s0Var2.e.isInLayout()) {
                    s0Var2.e.requestLayout();
                    s0Var2.d.requestLayout();
                    s0Var2.f31650f.requestLayout();
                    return;
                }
                return;
            case 6:
                ((org.telegram.ui.Components.voip.r0) this.f21451b).f31635a.a(false);
                return;
            case 7:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f21451b;
                o1Var.e = false;
                HashMap hashMap = o1Var.f31563a;
                ArrayList arrayList = o1Var.f31565c;
                ArrayList arrayList2 = o1Var.f31564b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (o1Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(o1Var, o1Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (n1Var.f31555a.equals(((org.telegram.ui.Components.voip.n1) arrayList.get(i11)).f31555a)) {
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
                        o1Var.addView((View) arrayList2.get(i12), w7.b6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        o1Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < o1Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.n1 n1Var2 = (org.telegram.ui.Components.voip.n1) o1Var.getChildAt(i14);
                        hashMap.put(n1Var2.f31555a, n1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    o1Var.e = true;
                    org.telegram.messenger.i0.h3(new w5(o1Var, 7), 700L);
                    Runnable runnable = o1Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.v1) this.f21451b).f31690a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 9:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.v1) ((ci.i) this.f21451b).e).f31690a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 10:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) this.f21451b;
                if (z1Var.getVisibility() == 0) {
                    z1Var.a();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.d2 d2Var = (org.telegram.ui.Components.voip.d2) this.f21451b;
                d2Var.e = Bitmap.createBitmap(d2Var.getMeasuredWidth(), d2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(d2Var.e).drawText(d2Var.d, d2Var.getMeasuredWidth() / 2, (int) ((d2Var.getMeasuredHeight() / 2) - ((d2Var.f31380a.ascent() + d2Var.f31380a.descent()) / 2.0f)), d2Var.f31380a);
                d2Var.postInvalidate();
                return;
            case 12:
                ((org.telegram.ui.web.j) this.f21451b).f43072x.f30819f3.O(true);
                return;
            case 13:
                org.telegram.ui.web.h hVar = ((org.telegram.ui.web.m) ((go0) this.f21451b).f37607c).f43127f;
                if (hVar != null) {
                    hVar.d();
                    return;
                }
                return;
            case 14:
                ((mt) this.f21451b).requestFocus();
                return;
            case 15:
                gf.f.r(((org.telegram.ui.web.r0) this.f21451b).f43180b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 16:
                go0 go0Var = (go0) this.f21451b;
                Utilities.f14522g.c(new u41(go0Var, new ArrayList(((org.telegram.ui.web.b1) go0Var.f37607c).f42995f), ((org.telegram.ui.web.b1) go0Var.f37607c).f42997r, 8));
                return;
            case 17:
                HttpGetFileTask.a((HttpGetFileTask) this.f21451b);
                return;
            case 18:
                ((org.telegram.ui.Wallet.a6) this.f21451b).invalidateSelf();
                return;
            case 19:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) this.f21451b;
                File databasePath = org.telegram.messenger.w0.f19025b.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = org.telegram.messenger.w0.f19025b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += org.telegram.ui.web.p1.d0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.p1.d0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.p1.d0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.i0.g3(new ki.d(p1Var, j10, j11, 4));
                return;
            case 20:
                ((boolean[]) this.f21451b)[0] = true;
                return;
            case 21:
                ((p4.e) this.f21451b).k();
                return;
            case 22:
                ((p4.g) this.f21451b).f44742n = -1;
                return;
            case 23:
                ((vj0) this.f21451b).b();
                return;
            case 24:
                ph.m mVar = (ph.m) this.f21451b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.i0.L(28.0f));
                return;
            case 25:
                ((ph.d0) this.f21451b).onBackPressed();
                return;
            case 26:
                p51 p51Var = ((ph.l1) this.f21451b).Q1;
                if (p51Var != null) {
                    p51Var.O(false);
                    return;
                }
                return;
            case 27:
                ((ph.z0) this.f21451b).c();
                return;
            case 28:
                ((ph.f1) this.f21451b).invalidateSelf();
                return;
            default:
                ph.i1 i1Var = (ph.i1) this.f21451b;
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
