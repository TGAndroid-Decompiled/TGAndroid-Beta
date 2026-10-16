package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class ca1 extends AsyncTask {
    public final String f23662a;
    public final CountDownLatch f23663b = new CountDownLatch(1);
    public final String[] f23664c = new String[2];
    public String d;
    public final da1 e;

    public ca1(da1 da1Var, String str) {
        this.e = da1Var;
        this.f23662a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        da1 da1Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                i2.d.v(strArr[0], sb2);
            }
            da1Var.f24064w = true;
            da1Var.f24065x = strArr[0];
            String str2 = strArr[1];
            da1Var.f24066y = str2;
            if (str2.equals("hls")) {
                da1Var.H = true;
            }
            if (da1Var.f24063s) {
                da1Var.i();
            }
            da1Var.j(false, true);
            da1Var.f24055f0.d(true, true);
        } else if (!isCancelled()) {
            da1Var.h();
        }
    }
}
