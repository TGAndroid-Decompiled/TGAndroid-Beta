package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class z71 extends AsyncTask {
    public final String f42741a;
    public final CountDownLatch f42742b = new CountDownLatch(1);
    public final String[] f42743c = new String[2];
    public String d;
    public final a81 f42744e;

    public z71(a81 a81Var, String str) {
        this.f42744e = a81Var;
        this.f42741a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        a81 a81Var = this.f42744e;
        if (str != null) {
            if (org.telegram.messenger.s2.f26829a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                p5.c.s(strArr[0], sb2);
            }
            a81Var.f33418x = true;
            a81Var.f33419y = strArr[0];
            String str2 = strArr[1];
            a81Var.E = str2;
            if (str2.equals("hls")) {
                a81Var.I = true;
            }
            if (a81Var.f33416s) {
                a81Var.i();
            }
            a81Var.j(false, true);
            a81Var.f33408g0.d(true, true);
        } else if (!isCancelled()) {
            a81Var.h();
        }
    }
}
