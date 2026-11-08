package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class k71 extends AsyncTask {
    public final String f35247a;
    public final CountDownLatch f35248b = new CountDownLatch(1);
    public final String[] f35249c = new String[2];
    public String d;
    public final l71 f35250e;

    public k71(l71 l71Var, String str) {
        this.f35250e = l71Var;
        this.f35247a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        l71 l71Var = this.f35250e;
        if (str != null) {
            if (org.telegram.messenger.r2.f25212a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                org.telegram.ui.Cells.f1.u(strArr[0], sb2);
            }
            l71Var.f35590x = true;
            l71Var.f35591y = strArr[0];
            String str2 = strArr[1];
            l71Var.D = str2;
            if (str2.equals("hls")) {
                l71Var.H = true;
            }
            if (l71Var.f35588s) {
                l71Var.i();
            }
            l71Var.j(false, true);
            l71Var.f35580f0.d(true, true);
        } else if (!isCancelled()) {
            l71Var.h();
        }
    }
}
