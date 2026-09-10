package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.b7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.fb1;
import org.telegram.ui.so;
import org.telegram.ui.web.HttpGetFileTask;
import w7.a6;
public final class x implements Runnable {
    public final int f28527a;
    public final Object f28528b;

    public x(Object obj, int i10) {
        this.f28527a = i10;
        this.f28528b = obj;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28527a) {
            case 0:
                m0 m0Var = (m0) this.f28528b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 1:
                i1 i1Var = (i1) this.f28528b;
                i1Var.K = false;
                i1Var.o(false);
                i1Var.W = false;
                return;
            case 2:
                i1 i1Var2 = (i1) ((kg.b) this.f28528b).f12436b;
                i1Var2.e.invalidate();
                if (!i1Var2.e.isInLayout()) {
                    i1Var2.e.requestLayout();
                    i1Var2.d.requestLayout();
                    i1Var2.f28174f.requestLayout();
                    return;
                }
                return;
            case 3:
                ((h1) this.f28528b).f28159a.i(false);
                return;
            case 4:
                g2 g2Var = (g2) this.f28528b;
                g2Var.e = false;
                HashMap hashMap = g2Var.f28136a;
                ArrayList arrayList = g2Var.f28138c;
                ArrayList arrayList2 = g2Var.f28137b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (g2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        f2 f2Var = (f2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (f2Var.f28121a.equals(((f2) arrayList.get(i11)).f28121a)) {
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
                        g2Var.addView((View) arrayList2.get(i12), a6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        g2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < g2Var.getChildCount(); i14++) {
                        f2 f2Var2 = (f2) g2Var.getChildAt(i14);
                        hashMap.put(f2Var2.f28121a, f2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    g2Var.e = true;
                    AndroidUtilities.runOnUIThread(new x(g2Var, 4), 700L);
                    Runnable runnable = g2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                TextView[] textViewArr = ((o2) this.f28528b).f28307a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 6:
                TextView[] textViewArr2 = ((o2) ((fg.k0) this.f28528b).e).f28307a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 7:
                s2 s2Var = (s2) this.f28528b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    return;
                }
                return;
            case 8:
                x2 x2Var = (x2) this.f28528b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f28538a.ascent() + x2Var.f28538a.descent()) / 2.0f)), x2Var.f28538a);
                x2Var.postInvalidate();
                return;
            case 9:
                ((org.telegram.ui.web.l) this.f28528b).f38004w.Y2.N(true);
                return;
            case 10:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.f28528b).h.e;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 11:
                ((fu) this.f28528b).requestFocus();
                return;
            case 12:
                nf.f.s(((org.telegram.ui.web.u0) this.f28528b).f38088b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 13:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f28528b;
                Utilities.searchQueue.postRunnable(new sx0(g1Var, new ArrayList(g1Var.h.e), g1Var.h.f37944n, 11));
                return;
            case 14:
                HttpGetFileTask.a((HttpGetFileTask) this.f28528b);
                return;
            case 15:
                ((org.telegram.ui.Cells.n1) this.f28528b).invalidateSelf();
                return;
            case 16:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) this.f28528b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j10 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j3 = databasePath.length();
                } else {
                    j3 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j3 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j3 += org.telegram.ui.web.b2.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j3 += org.telegram.ui.web.b2.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j10 = org.telegram.ui.web.b2.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new so(b2Var, j3, j10, 1));
                return;
            case 17:
                ((boolean[]) this.f28528b)[0] = true;
                return;
            case 18:
                ((p4.e) this.f28528b).k();
                return;
            case 19:
                ((p4.g) this.f28528b).f39709n = -1;
                return;
            case 20:
                ((yk0) this.f28528b).b();
                return;
            case 21:
                b7 b7Var = (b7) this.f28528b;
                b7Var.f39989x0 = true;
                b7Var.s();
                return;
            case 22:
                ((View) this.f28528b).performClick();
                return;
            case 23:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((pg.l2) this.f28528b).f40106f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 24:
                AndroidUtilities.showKeyboard(((pg.v2) this.f28528b).f40322q0);
                return;
            case 25:
                AndroidUtilities.showKeyboard(((ph.c) this.f28528b).f40395a);
                return;
            case 26:
                ph.c cVar = (ph.c) ((d6) this.f28528b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar.f40399n;
                if (t1Var != null && t1Var.getDelegate() != null) {
                    cVar.f40399n.getDelegate().C1(cVar.f40399n, false);
                    return;
                }
                return;
            case 27:
                ((ph.q) this.f28528b).f40448c.Y2.N(true);
                return;
            case 28:
                ((ph.p) this.f28528b).a();
                return;
            default:
                qg.k0 k0Var = ((qg.d0) this.f28528b).f40706c;
                k0Var.f21452n.presentFragment(fb1.d0(k0Var.s1(), true));
                return;
        }
    }
}
