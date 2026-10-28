package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class ma1 extends AsyncTask {
    public final String f30488a;
    public final CountDownLatch f30489b = new CountDownLatch(1);
    public final String[] f30490c = new String[2];
    public String d;
    public final na1 e;

    public ma1(na1 na1Var, String str) {
        this.e = na1Var;
        this.f30488a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        na1 na1Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                ic.a.w(strArr[0], sb2);
            }
            na1Var.f30825w = true;
            na1Var.f30826x = strArr[0];
            String str2 = strArr[1];
            na1Var.f30827y = str2;
            if (str2.equals("hls")) {
                na1Var.H = true;
            }
            if (na1Var.f30824s) {
                na1Var.i();
            }
            na1Var.j(false, true);
            na1Var.f30816f0.d(true, true);
        } else if (!isCancelled()) {
            na1Var.h();
        }
    }
}
