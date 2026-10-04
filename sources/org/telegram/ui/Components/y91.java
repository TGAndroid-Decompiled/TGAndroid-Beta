package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class y91 extends AsyncTask {
    public final String f33128a;
    public final CountDownLatch f33129b = new CountDownLatch(1);
    public final String[] f33130c = new String[2];
    public String d;
    public final z91 f33131e;

    public y91(z91 z91Var, String str) {
        this.f33131e = z91Var;
        this.f33128a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        z91 z91Var = this.f33131e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            z91Var.f33465w = true;
            z91Var.f33466x = strArr[0];
            String str2 = strArr[1];
            z91Var.f33467y = str2;
            if (str2.equals("hls")) {
                z91Var.H = true;
            }
            if (z91Var.f33464s) {
                z91Var.i();
            }
            z91Var.j(false, true);
            z91Var.f33456f0.d(true, true);
        } else if (!isCancelled()) {
            z91Var.h();
        }
    }
}
