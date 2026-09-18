package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class p91 extends AsyncTask {
    public final String f27161a;
    public final CountDownLatch f27162b = new CountDownLatch(1);
    public final String[] f27163c = new String[2];
    public String d;
    public final q91 e;

    public p91(q91 q91Var, String str) {
        this.e = q91Var;
        this.f27161a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        q91 q91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            q91Var.f27527w = true;
            q91Var.f27528x = strArr[0];
            String str2 = strArr[1];
            q91Var.f27529y = str2;
            if (str2.equals("hls")) {
                q91Var.H = true;
            }
            if (q91Var.f27526s) {
                q91Var.i();
            }
            q91Var.j(false, true);
            q91Var.f27518f0.d(true, true);
        } else if (!isCancelled()) {
            q91Var.h();
        }
    }
}
