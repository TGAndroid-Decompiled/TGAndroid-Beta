package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class j71 extends AsyncTask {
    public final String f34880a;
    public final CountDownLatch f34881b = new CountDownLatch(1);
    public final String[] f34882c = new String[2];
    public String d;
    public final k71 f34883e;

    public j71(k71 k71Var, String str) {
        this.f34883e = k71Var;
        this.f34880a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        k71 k71Var = this.f34883e;
        if (str != null) {
            if (org.telegram.messenger.r2.f25191a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                org.telegram.ui.Cells.f1.u(strArr[0], sb2);
            }
            k71Var.f35232x = true;
            k71Var.f35233y = strArr[0];
            String str2 = strArr[1];
            k71Var.D = str2;
            if (str2.equals("hls")) {
                k71Var.H = true;
            }
            if (k71Var.f35230s) {
                k71Var.i();
            }
            k71Var.j(false, true);
            k71Var.f35222f0.d(true, true);
        } else if (!isCancelled()) {
            k71Var.h();
        }
    }
}
