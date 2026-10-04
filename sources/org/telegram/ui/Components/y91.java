package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class y91 extends AsyncTask {
    public final String f33121a;
    public final CountDownLatch f33122b = new CountDownLatch(1);
    public final String[] f33123c = new String[2];
    public String d;
    public final z91 f33124e;

    public y91(z91 z91Var, String str) {
        this.f33124e = z91Var;
        this.f33121a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        z91 z91Var = this.f33124e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            z91Var.f33458w = true;
            z91Var.f33459x = strArr[0];
            String str2 = strArr[1];
            z91Var.f33460y = str2;
            if (str2.equals("hls")) {
                z91Var.H = true;
            }
            if (z91Var.f33457s) {
                z91Var.i();
            }
            z91Var.j(false, true);
            z91Var.f33449f0.d(true, true);
        } else if (!isCancelled()) {
            z91Var.h();
        }
    }
}
