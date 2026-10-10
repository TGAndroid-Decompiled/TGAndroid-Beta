package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class ha1 extends AsyncTask {
    public final String f26979a;
    public final CountDownLatch f26980b = new CountDownLatch(1);
    public final String[] f26981c = new String[2];
    public String d;
    public final ia1 f26982e;

    public ha1(ia1 ia1Var, String str) {
        this.f26982e = ia1Var;
        this.f26979a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        ia1 ia1Var = this.f26982e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                hg.c.t(strArr[0], sb2);
            }
            ia1Var.f27337w = true;
            ia1Var.f27338x = strArr[0];
            String str2 = strArr[1];
            ia1Var.f27339y = str2;
            if (str2.equals("hls")) {
                ia1Var.H = true;
            }
            if (ia1Var.f27336s) {
                ia1Var.i();
            }
            ia1Var.j(false, true);
            ia1Var.f27328f0.d(true, true);
        } else if (!isCancelled()) {
            ia1Var.h();
        }
    }
}
