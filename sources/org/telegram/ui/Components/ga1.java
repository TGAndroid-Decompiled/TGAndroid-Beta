package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class ga1 extends AsyncTask {
    public final String f26709a;
    public final CountDownLatch f26710b = new CountDownLatch(1);
    public final String[] f26711c = new String[2];
    public String d;
    public final ha1 f26712e;

    public ga1(ha1 ha1Var, String str) {
        this.f26712e = ha1Var;
        this.f26709a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        ha1 ha1Var = this.f26712e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                hg.c.t(strArr[0], sb2);
            }
            ha1Var.f27057w = true;
            ha1Var.f27058x = strArr[0];
            String str2 = strArr[1];
            ha1Var.f27059y = str2;
            if (str2.equals("hls")) {
                ha1Var.H = true;
            }
            if (ha1Var.f27056s) {
                ha1Var.i();
            }
            ha1Var.j(false, true);
            ha1Var.f27048f0.d(true, true);
        } else if (!isCancelled()) {
            ha1Var.h();
        }
    }
}
