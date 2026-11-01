package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class m81 extends AsyncTask {
    public final String f28414a;
    public final CountDownLatch f28415b = new CountDownLatch(1);
    public final String[] f28416c = new String[2];
    public String d;
    public final n81 e;

    public m81(n81 n81Var, String str) {
        this.e = n81Var;
        this.f28414a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m81.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        n81 n81Var = this.e;
        if (str != null) {
            if (org.telegram.messenger.v2.f18578a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                a1.g.z(strArr[0], sb2);
            }
            n81Var.f28744x = true;
            n81Var.f28745y = strArr[0];
            String str2 = strArr[1];
            n81Var.D = str2;
            if (str2.equals("hls")) {
                n81Var.H = true;
            }
            if (n81Var.f28742s) {
                n81Var.i();
            }
            n81Var.j(false, true);
            n81Var.f28734f0.d(true, true);
        } else if (!isCancelled()) {
            n81Var.h();
        }
    }
}
