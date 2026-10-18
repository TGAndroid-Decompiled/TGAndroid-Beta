package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class t91 extends AsyncTask {
    public final String f30503a;
    public final CountDownLatch f30504b = new CountDownLatch(1);
    public final String[] f30505c = new String[2];
    public String d;
    public final u91 e;

    public t91(u91 u91Var, String str) {
        this.e = u91Var;
        this.f30503a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        u91 u91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                i2.d.v(strArr[0], sb2);
            }
            u91Var.f30951w = true;
            u91Var.f30952x = strArr[0];
            String str2 = strArr[1];
            u91Var.f30953y = str2;
            if (str2.equals("hls")) {
                u91Var.H = true;
            }
            if (u91Var.f30950s) {
                u91Var.i();
            }
            u91Var.j(false, true);
            u91Var.f30942f0.d(true, true);
        } else if (!isCancelled()) {
            u91Var.h();
        }
    }
}
