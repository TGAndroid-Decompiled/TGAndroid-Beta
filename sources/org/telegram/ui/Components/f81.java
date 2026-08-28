package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class f81 extends AsyncTask {
    public final String f28341a;
    public final CountDownLatch f28342b = new CountDownLatch(1);
    public final String[] f28343c = new String[2];
    public String d;
    public final g81 f28344e;

    public f81(g81 g81Var, String str) {
        this.f28344e = g81Var;
        this.f28341a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f81.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        g81 g81Var = this.f28344e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                j3.r0.x(strArr[0], sb2);
            }
            g81Var.f28707w = true;
            g81Var.f28708x = strArr[0];
            String str2 = strArr[1];
            g81Var.f28709y = str2;
            if (str2.equals("hls")) {
                g81Var.D = true;
            }
            if (g81Var.f28706s) {
                g81Var.i();
            }
            g81Var.j(false, true);
            g81Var.f28695b0.d(true, true);
        } else if (!isCancelled()) {
            g81Var.h();
        }
    }
}
