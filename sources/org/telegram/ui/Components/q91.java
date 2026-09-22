package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class q91 extends AsyncTask {
    public final String f27527a;
    public final CountDownLatch f27528b = new CountDownLatch(1);
    public final String[] f27529c = new String[2];
    public String d;
    public final r91 e;

    public q91(r91 r91Var, String str) {
        this.e = r91Var;
        this.f27527a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        r91 r91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            r91Var.f27908w = true;
            r91Var.f27909x = strArr[0];
            String str2 = strArr[1];
            r91Var.f27910y = str2;
            if (str2.equals("hls")) {
                r91Var.H = true;
            }
            if (r91Var.f27907s) {
                r91Var.i();
            }
            r91Var.j(false, true);
            r91Var.f27899f0.d(true, true);
        } else if (!isCancelled()) {
            r91Var.h();
        }
    }
}
