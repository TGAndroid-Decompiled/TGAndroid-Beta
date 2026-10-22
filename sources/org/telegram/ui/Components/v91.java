package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class v91 extends AsyncTask {
    public final String f31209a;
    public final CountDownLatch f31210b = new CountDownLatch(1);
    public final String[] f31211c = new String[2];
    public String d;
    public final w91 e;

    public v91(w91 w91Var, String str) {
        this.e = w91Var;
        this.f31209a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        w91 w91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                i2.e.v(strArr[0], sb2);
            }
            w91Var.f32038w = true;
            w91Var.f32039x = strArr[0];
            String str2 = strArr[1];
            w91Var.f32040y = str2;
            if (str2.equals("hls")) {
                w91Var.H = true;
            }
            if (w91Var.f32037s) {
                w91Var.i();
            }
            w91Var.j(false, true);
            w91Var.f32029f0.d(true, true);
        } else if (!isCancelled()) {
            w91Var.h();
        }
    }
}
