package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class n91 extends AsyncTask {
    public final String f25475a;
    public final CountDownLatch f25476b = new CountDownLatch(1);
    public final String[] f25477c = new String[2];
    public String d;
    public final o91 e;

    public n91(o91 o91Var, String str) {
        this.e = o91Var;
        this.f25475a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        o91 o91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                hc.b.v(strArr[0], sb2);
            }
            o91Var.f25733w = true;
            o91Var.f25734x = strArr[0];
            String str2 = strArr[1];
            o91Var.f25735y = str2;
            if (str2.equals("hls")) {
                o91Var.H = true;
            }
            if (o91Var.f25732s) {
                o91Var.i();
            }
            o91Var.j(false, true);
            o91Var.f25724f0.d(true, true);
        } else if (!isCancelled()) {
            o91Var.h();
        }
    }
}
