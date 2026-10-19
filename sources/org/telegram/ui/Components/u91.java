package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class u91 extends AsyncTask {
    public final String f30919a;
    public final CountDownLatch f30920b = new CountDownLatch(1);
    public final String[] f30921c = new String[2];
    public String d;
    public final v91 e;

    public u91(v91 v91Var, String str) {
        this.e = v91Var;
        this.f30919a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        v91 v91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                i2.e.v(strArr[0], sb2);
            }
            v91Var.f31239w = true;
            v91Var.f31240x = strArr[0];
            String str2 = strArr[1];
            v91Var.f31241y = str2;
            if (str2.equals("hls")) {
                v91Var.H = true;
            }
            if (v91Var.f31238s) {
                v91Var.i();
            }
            v91Var.j(false, true);
            v91Var.f31230f0.d(true, true);
        } else if (!isCancelled()) {
            v91Var.h();
        }
    }
}
