package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.ok;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.xs;
import org.telegram.ui.web.HttpGetFileTask;
public final class d4 implements Runnable {
    public final int f27458a;
    public final Object f27459b;

    public d4(Object obj, int i3) {
        this.f27458a = i3;
        this.f27459b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27458a) {
            case 0:
                i4 i4Var = ((e4) this.f27459b).f27476b;
                i4Var.f27610c.dismiss();
                i4Var.f27612f.removeAllViews();
                return;
            case 1:
                ((e4) this.f27459b).f27476b.f27610c.dismiss();
                return;
            case 2:
                i5 i5Var = (i5) this.f27459b;
                if (!i5Var.f27646y && i5Var.N) {
                    i5Var.c();
                    return;
                }
                return;
            case 3:
                Drawable drawable = (Drawable) this.f27459b;
                k6.d = null;
                k6.P();
                if (!k6.f27835b) {
                    k6.j(drawable);
                    k6.h(drawable);
                }
                hs.e().k(276, new Object[0]);
                return;
            case 4:
                ((CountDownLatch) this.f27459b).countDown();
                return;
            case 5:
                org.telegram.messenger.camera.q.j(1, (d2) this.f27459b);
                return;
            case 6:
                a8 a8Var = (a8) k6.f27897e5.remove((zi) this.f27459b);
                if (a8Var != null) {
                    a8Var.f31756i = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.f27459b;
                xVar.Q0 = null;
                xVar.setVisibleParticipant(true);
                return;
            case 8:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f27459b;
                s0Var.L = false;
                s0Var.j(false);
                s0Var.X = false;
                return;
            case 9:
                org.telegram.ui.Components.voip.s0 s0Var2 = (org.telegram.ui.Components.voip.s0) ((ee0) this.f27459b).f33374b;
                s0Var2.f39595e.invalidate();
                if (!s0Var2.f39595e.isInLayout()) {
                    s0Var2.f39595e.requestLayout();
                    s0Var2.d.requestLayout();
                    s0Var2.f39596f.requestLayout();
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.Components.voip.q0) this.f27459b).f39538a.a(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.f27459b;
                p1Var.f39512e = false;
                HashMap hashMap = p1Var.f39509a;
                ArrayList arrayList = p1Var.f39511c;
                ArrayList arrayList2 = p1Var.f39510b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (p1Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(p1Var, p1Var.d);
                    }
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) arrayList2.get(i3);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            } else if (o1Var.f39499a.equals(((org.telegram.ui.Components.voip.o1) arrayList.get(i10)).f39499a)) {
                                arrayList2.remove(i3);
                                arrayList.remove(i10);
                                i3--;
                            } else {
                                i10++;
                            }
                        }
                        i3++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        p1Var.addView((View) arrayList2.get(i11), mf.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        p1Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < p1Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.o1 o1Var2 = (org.telegram.ui.Components.voip.o1) p1Var.getChildAt(i13);
                        hashMap.put(o1Var2.f39499a, o1Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    p1Var.f39512e = true;
                    org.telegram.messenger.g0.i3(new d4(p1Var, 11), 700L);
                    Runnable runnable = p1Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.w1) this.f27459b).f39662a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 13:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.w1) ((kg.g0) this.f27459b).f17032e).f39662a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 14:
                org.telegram.ui.Components.voip.a2 a2Var = (org.telegram.ui.Components.voip.a2) this.f27459b;
                if (a2Var.getVisibility() == 0) {
                    a2Var.a();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.f27459b;
                e2Var.f39323e = Bitmap.createBitmap(e2Var.getMeasuredWidth(), e2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(e2Var.f39323e).drawText(e2Var.d, e2Var.getMeasuredWidth() / 2, (int) ((e2Var.getMeasuredHeight() / 2) - ((e2Var.f39320a.ascent() + e2Var.f39320a.descent()) / 2.0f)), e2Var.f39320a);
                e2Var.postInvalidate();
                return;
            case 16:
                ((org.telegram.ui.web.l) this.f27459b).f50934x.f35594g3.O(true);
                return;
            case 17:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.n) ((gi.s2) this.f27459b).f13553c).f50956f;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 18:
                ((xs) this.f27459b).requestFocus();
                return;
            case 19:
                sf.c.t(((org.telegram.ui.web.p0) this.f27459b).f50986b.f50996e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 20:
                gi.s2 s2Var = (gi.s2) this.f27459b;
                Utilities.f21389g.c(new iv0(s2Var, new ArrayList(((org.telegram.ui.web.y0) s2Var.f13553c).f51112f), ((org.telegram.ui.web.y0) s2Var.f13553c).f51114r, 12));
                return;
            case 21:
                HttpGetFileTask.a((HttpGetFileTask) this.f27459b);
                return;
            case 22:
                ((org.telegram.ui.Wallet.v5) this.f27459b).invalidateSelf();
                return;
            case 23:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.f27459b;
                File databasePath = org.telegram.messenger.t0.f25457b.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = org.telegram.messenger.t0.f25457b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += org.telegram.ui.web.m1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.m1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.m1.e0(file3, Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new ok(m1Var, j10, j11, 2));
                return;
            case 24:
                ((boolean[]) this.f27459b)[0] = true;
                return;
            case 25:
                p2.d dVar = (p2.d) this.f27459b;
                if (!dVar.f53097c) {
                    p2.g gVar = dVar.f53096b;
                    if (gVar != null) {
                        gVar.b(dVar.f53095a);
                    }
                    dVar.d.f53108y.remove(dVar);
                    dVar.f53097c = true;
                    return;
                }
                return;
            case 26:
                ((p2.b) this.f27459b).b(null);
                return;
            case 27:
                ((nh) this.f27459b).B();
                return;
            case 28:
                ((r4.e) this.f27459b).k();
                return;
            default:
                ((r4.g) this.f27459b).f54290n = -1;
                return;
        }
    }
}
