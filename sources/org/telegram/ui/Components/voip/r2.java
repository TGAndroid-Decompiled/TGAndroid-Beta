package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import di.a6;
import java.io.File;
import java.util.ArrayList;
import ji.m5;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.uo;
import org.telegram.ui.web.HttpGetFileTask;
public final class r2 implements Runnable {
    public final int f30103a;
    public final Object f30104b;

    public r2(Object obj, int i10) {
        this.f30103a = i10;
        this.f30104b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f30103a) {
            case 0:
                s2 s2Var = (s2) this.f30104b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    return;
                }
                return;
            case 1:
                w2 w2Var = (w2) this.f30104b;
                w2Var.e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.f30247a.ascent() + w2Var.f30247a.descent()) / 2.0f)), w2Var.f30247a);
                w2Var.postInvalidate();
                return;
            case 2:
                ((org.telegram.ui.web.k) this.f30104b).f41099w.W2.N(true);
                return;
            case 3:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f30104b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 4:
                ((nu) this.f30104b).requestFocus();
                return;
            case 5:
                pf.d.r(((org.telegram.ui.web.v0) this.f30104b).f41200b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 6:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f30104b;
                Utilities.searchQueue.postRunnable(new ze0(g1Var, new ArrayList(g1Var.h.e), g1Var.h.f41061n, 25));
                return;
            case 7:
                HttpGetFileTask.a((HttpGetFileTask) this.f30104b);
                return;
            case 8:
                ((org.telegram.ui.Cells.o1) this.f30104b).invalidateSelf();
                return;
            case 9:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.f30104b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += org.telegram.ui.web.z1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.z1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.z1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new uo(z1Var, j10, j11, 1));
                return;
            case 10:
                ((boolean[]) this.f30104b)[0] = true;
                return;
            case 11:
                ((p4.e) this.f30104b).k();
                return;
            case 12:
                ((p4.g) this.f30104b).f42737n = -1;
                return;
            case 13:
                ((pl0) this.f30104b).b();
                return;
            case 14:
                pi.c cVar = (pi.c) this.f30104b;
                AndroidUtilities.runOnUIThread(new pi.b(cVar.f42939a, cVar.f42940b, 1), 500L);
                return;
            case 15:
                w4 w4Var = ((qg.p0) this.f30104b).f43248b.f43263a;
                if (w4Var != null) {
                    w4Var.Y0();
                    return;
                }
                return;
            case 16:
                qg.q0 q0Var = ((qg.p0) this.f30104b).f43248b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f43266f.getCurrentColor();
                q0Var.l(q0Var.f43264b, false, false);
                a5.a d = q0Var.d(q0Var.f43264b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                qg.f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 17:
                ((qg.a1) ((p4.s0) this.f30104b).f42804b).f43131y.f43139a.a();
                return;
            case 18:
                qg.s1 s1Var = ((qg.t1) this.f30104b).f43327a;
                if (s1Var != null) {
                    s1Var.e();
                    return;
                }
                return;
            case 19:
                qh.c cVar2 = (qh.c) this.f30104b;
                qh.b bVar = cVar2.f43374c;
                if (bVar == qh.b.f43370b) {
                    cVar2.a(qh.b.f43369a, true);
                    return;
                } else if (bVar == qh.b.f43371c) {
                    cVar2.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 20:
                r2.f fVar = (r2.f) this.f30104b;
                synchronized (fVar.f43582a) {
                    try {
                        if (!fVar.f43591m) {
                            long j12 = fVar.f43590l - 1;
                            fVar.f43590l = j12;
                            int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                            if (i10 <= 0) {
                                if (i10 < 0) {
                                    fVar.c(new IllegalStateException());
                                    return;
                                } else {
                                    fVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 21:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f30104b;
                ((s5.g) ((t5.c) sVar.e)).f(new m5(sVar, 26));
                return;
            case 22:
                a6 a6Var = (a6) this.f30104b;
                a6Var.f44024x0 = true;
                a6Var.s();
                return;
            case 23:
                ((View) this.f30104b).performClick();
                return;
            case 24:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.n2) this.f30104b).f44142f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((rg.x2) this.f30104b).f44354q0);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((rh.c) this.f30104b).f44411a);
                return;
            case 27:
                rh.c cVar3 = (rh.c) ((c6) this.f30104b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar3.f44415n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar3.f44415n.getDelegate().y1(cVar3.f44415n, false);
                    return;
                }
                return;
            case 28:
                ((rh.q) this.f30104b).f44464c.W2.N(true);
                return;
            default:
                ((rh.p) this.f30104b).a();
                return;
        }
    }
}
