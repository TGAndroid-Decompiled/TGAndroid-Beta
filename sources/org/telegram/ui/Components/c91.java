package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class c91 extends AsyncTask {
    public final String f22985a;
    public final CountDownLatch f22986b = new CountDownLatch(1);
    public final String[] f22987c = new String[2];
    public String d;
    public final d91 e;

    public c91(d91 d91Var, String str) {
        this.e = d91Var;
        this.f22985a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        d91 d91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            d91Var.f23282w = true;
            d91Var.f23283x = strArr[0];
            String str2 = strArr[1];
            d91Var.f23284y = str2;
            if (str2.equals("hls")) {
                d91Var.H = true;
            }
            if (d91Var.f23281s) {
                d91Var.i();
            }
            d91Var.j(false, true);
            d91Var.f23273f0.d(true, true);
        } else if (!isCancelled()) {
            d91Var.h();
        }
    }
}
