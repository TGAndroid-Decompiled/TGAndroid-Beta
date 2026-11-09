package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class l71 extends AsyncTask {
    public final String f35633a;
    public final CountDownLatch f35634b = new CountDownLatch(1);
    public final String[] f35635c = new String[2];
    public String d;
    public final m71 f35636e;

    public l71(m71 m71Var, String str) {
        this.f35636e = m71Var;
        this.f35633a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        m71 m71Var = this.f35636e;
        if (str != null) {
            if (org.telegram.messenger.r2.f25212a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                org.telegram.ui.Cells.f1.u(strArr[0], sb2);
            }
            m71Var.f36016x = true;
            m71Var.f36017y = strArr[0];
            String str2 = strArr[1];
            m71Var.D = str2;
            if (str2.equals("hls")) {
                m71Var.H = true;
            }
            if (m71Var.f36014s) {
                m71Var.i();
            }
            m71Var.j(false, true);
            m71Var.f36006f0.d(true, true);
        } else if (!isCancelled()) {
            m71Var.h();
        }
    }
}
