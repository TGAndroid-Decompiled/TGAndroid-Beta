package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class o91 extends AsyncTask {
    public final String f27009a;
    public final CountDownLatch f27010b = new CountDownLatch(1);
    public final String[] f27011c = new String[2];
    public String d;
    public final p91 e;

    public o91(p91 p91Var, String str) {
        this.e = p91Var;
        this.f27009a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        p91 p91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            p91Var.f27300w = true;
            p91Var.f27301x = strArr[0];
            String str2 = strArr[1];
            p91Var.f27302y = str2;
            if (str2.equals("hls")) {
                p91Var.H = true;
            }
            if (p91Var.f27299s) {
                p91Var.i();
            }
            p91Var.j(false, true);
            p91Var.f27291f0.d(true, true);
        } else if (!isCancelled()) {
            p91Var.h();
        }
    }
}
