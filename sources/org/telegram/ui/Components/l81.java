package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class l81 extends AsyncTask {
    public final String f28035a;
    public final CountDownLatch f28036b = new CountDownLatch(1);
    public final String[] f28037c = new String[2];
    public String d;
    public final m81 e;

    public l81(m81 m81Var, String str) {
        this.e = m81Var;
        this.f28035a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l81.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        m81 m81Var = this.e;
        if (str != null) {
            if (org.telegram.messenger.v2.f18448a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                a1.g.z(strArr[0], sb2);
            }
            m81Var.f28378x = true;
            m81Var.f28379y = strArr[0];
            String str2 = strArr[1];
            m81Var.D = str2;
            if (str2.equals("hls")) {
                m81Var.H = true;
            }
            if (m81Var.f28376s) {
                m81Var.i();
            }
            m81Var.j(false, true);
            m81Var.f28368f0.d(true, true);
        } else if (!isCancelled()) {
            m81Var.h();
        }
    }
}
