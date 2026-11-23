package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class y71 extends AsyncTask {
    public final String f42337a;
    public final CountDownLatch f42338b = new CountDownLatch(1);
    public final String[] f42339c = new String[2];
    public String d;
    public final z71 f42340e;

    public y71(z71 z71Var, String str) {
        this.f42340e = z71Var;
        this.f42337a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        z71 z71Var = this.f42340e;
        if (str != null) {
            if (org.telegram.messenger.s2.f26730a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                p5.c.s(strArr[0], sb2);
            }
            z71Var.f42731x = true;
            z71Var.f42732y = strArr[0];
            String str2 = strArr[1];
            z71Var.E = str2;
            if (str2.equals("hls")) {
                z71Var.I = true;
            }
            if (z71Var.f42729s) {
                z71Var.i();
            }
            z71Var.j(false, true);
            z71Var.f42721g0.d(true, true);
        } else if (!isCancelled()) {
            z71Var.h();
        }
    }
}
