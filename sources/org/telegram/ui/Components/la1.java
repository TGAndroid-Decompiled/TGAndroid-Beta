package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class la1 extends AsyncTask {
    public final String f28131a;
    public final CountDownLatch f28132b = new CountDownLatch(1);
    public final String[] f28133c = new String[2];
    public String d;
    public final ma1 f28134e;

    public la1(ma1 ma1Var, String str) {
        this.f28134e = ma1Var;
        this.f28131a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.la1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        ma1 ma1Var = this.f28134e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                hg.c.v(strArr[0], sb2);
            }
            ma1Var.f28517w = true;
            ma1Var.f28518x = strArr[0];
            String str2 = strArr[1];
            ma1Var.f28519y = str2;
            if (str2.equals("hls")) {
                ma1Var.H = true;
            }
            if (ma1Var.f28516s) {
                ma1Var.i();
            }
            ma1Var.j(false, true);
            ma1Var.f28508f0.d(true, true);
        } else if (!isCancelled()) {
            ma1Var.h();
        }
    }
}
