package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import di.a6;
import java.io.File;
import java.util.ArrayList;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.uo;
import org.telegram.ui.web.HttpGetFileTask;
public final class m2 implements Runnable {
    public final int f30330a;
    public final Object f30331b;

    public m2(Object obj, int i10) {
        this.f30330a = i10;
        this.f30331b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f30330a) {
            case 0:
                TextView[] textViewArr = ((o2) ((hg.j0) this.f30331b).e).f30386a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 1:
                s2 s2Var = (s2) this.f30331b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    return;
                }
                return;
            case 2:
                w2 w2Var = (w2) this.f30331b;
                w2Var.e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.f30578a.ascent() + w2Var.f30578a.descent()) / 2.0f)), w2Var.f30578a);
                w2Var.postInvalidate();
                return;
            case 3:
                ((org.telegram.ui.web.k) this.f30331b).f41408w.W2.N(true);
                return;
            case 4:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f30331b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 5:
                ((nu) this.f30331b).requestFocus();
                return;
            case 6:
                pf.d.s(((org.telegram.ui.web.u0) this.f30331b).f41499b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 7:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f30331b;
                Utilities.searchQueue.postRunnable(new v70(f1Var, new ArrayList(f1Var.h.e), f1Var.h.f41358n, 28));
                return;
            case 8:
                HttpGetFileTask.a((HttpGetFileTask) this.f30331b);
                return;
            case 9:
                ((org.telegram.ui.Cells.o1) this.f30331b).invalidateSelf();
                return;
            case 10:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f30331b;
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
                    j10 += org.telegram.ui.web.y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.y1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new uo(y1Var, j10, j11, 1));
                return;
            case 11:
                ((boolean[]) this.f30331b)[0] = true;
                return;
            case 12:
                ((p4.e) this.f30331b).k();
                return;
            case 13:
                ((p4.g) this.f30331b).f43040n = -1;
                return;
            case 14:
                ((pl0) this.f30331b).b();
                return;
            case 15:
                h5 h5Var = ((qg.p0) this.f30331b).f43506b.f43521a;
                if (h5Var != null) {
                    h5Var.Q0();
                    return;
                }
                return;
            case 16:
                qg.q0 q0Var = ((qg.p0) this.f30331b).f43506b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f43524f.getCurrentColor();
                q0Var.l(q0Var.f43522b, false, false);
                a5.a d = q0Var.d(q0Var.f43522b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                qg.f1 f1Var2 = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var2.a(rectF);
                q0Var.p(q0Var.e(f1Var2, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var2, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 17:
                ((qg.a1) ((m5) this.f30331b).f33475b).f43389y.f43397a.a();
                return;
            case 18:
                qg.s1 s1Var = ((qg.t1) this.f30331b).f43585a;
                if (s1Var != null) {
                    s1Var.f();
                    return;
                }
                return;
            case 19:
                qh.c cVar = (qh.c) this.f30331b;
                qh.b bVar = cVar.f43632c;
                if (bVar == qh.b.f43628b) {
                    cVar.a(qh.b.f43627a, true);
                    return;
                } else if (bVar == qh.b.f43629c) {
                    cVar.a(qh.b.d, true);
                    return;
                } else {
                    return;
                }
            case 20:
                qi.c cVar2 = (qi.c) this.f30331b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.f43657a, cVar2.f43658b, 1), 500L);
                return;
            case 21:
                r2.f fVar = (r2.f) this.f30331b;
                synchronized (fVar.f43823a) {
                    try {
                        if (!fVar.f43832m) {
                            long j12 = fVar.f43831l - 1;
                            fVar.f43831l = j12;
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
            case 22:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f30331b;
                ((s5.g) ((t5.c) sVar.e)).f(new ji.m5(sVar, 26));
                return;
            case 23:
                a6 a6Var = (a6) this.f30331b;
                a6Var.f44265x0 = true;
                a6Var.s();
                return;
            case 24:
                ((View) this.f30331b).performClick();
                return;
            case 25:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.n2) this.f30331b).f44383f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((rg.x2) this.f30331b).f44595q0);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((rh.c) this.f30331b).f44652a);
                return;
            case 28:
                rh.c cVar3 = (rh.c) ((c6) this.f30331b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar3.f44656n;
                if (u1Var != null && u1Var.getDelegate() != null) {
                    cVar3.f44656n.getDelegate().x1(cVar3.f44656n, false);
                    return;
                }
                return;
            default:
                ((rh.r) this.f30331b).f44707c.W2.N(true);
                return;
        }
    }
}
