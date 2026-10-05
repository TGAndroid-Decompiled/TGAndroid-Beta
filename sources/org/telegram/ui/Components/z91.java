package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class z91 extends AsyncTask {
    public final String f33472a;
    public final CountDownLatch f33473b = new CountDownLatch(1);
    public final String[] f33474c = new String[2];
    public String d;
    public final aa1 f33475e;

    public z91(aa1 aa1Var, String str) {
        this.f33475e = aa1Var;
        this.f33472a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        aa1 aa1Var = this.f33475e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            aa1Var.f24573w = true;
            aa1Var.f24574x = strArr[0];
            String str2 = strArr[1];
            aa1Var.f24575y = str2;
            if (str2.equals("hls")) {
                aa1Var.H = true;
            }
            if (aa1Var.f24572s) {
                aa1Var.i();
            }
            aa1Var.j(false, true);
            aa1Var.f24564f0.d(true, true);
        } else if (!isCancelled()) {
            aa1Var.h();
        }
    }
}
