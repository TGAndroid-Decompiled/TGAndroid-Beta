package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class ba1 extends AsyncTask {
    public final String f23731a;
    public final CountDownLatch f23732b = new CountDownLatch(1);
    public final String[] f23733c = new String[2];
    public String d;
    public final ca1 e;

    public ba1(ca1 ca1Var, String str) {
        this.e = ca1Var;
        this.f23731a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        ca1 ca1Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                i2.d.t(strArr[0], sb2);
            }
            ca1Var.f24008w = true;
            ca1Var.f24009x = strArr[0];
            String str2 = strArr[1];
            ca1Var.f24010y = str2;
            if (str2.equals("hls")) {
                ca1Var.H = true;
            }
            if (ca1Var.f24007s) {
                ca1Var.i();
            }
            ca1Var.j(false, true);
            ca1Var.f23999f0.d(true, true);
        } else if (!isCancelled()) {
            ca1Var.h();
        }
    }
}
