package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class c71 extends AsyncTask {
    public final String f32586a;
    public final CountDownLatch f32587b = new CountDownLatch(1);
    public final String[] f32588c = new String[2];
    public String d;
    public final d71 f32589e;

    public c71(d71 d71Var, String str) {
        this.f32589e = d71Var;
        this.f32586a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        d71 d71Var = this.f32589e;
        if (str != null) {
            if (org.telegram.messenger.r2.f25040a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                k2.p1.w(strArr[0], sb2);
            }
            d71Var.f33017x = true;
            d71Var.f33018y = strArr[0];
            String str2 = strArr[1];
            d71Var.E = str2;
            if (str2.equals("hls")) {
                d71Var.I = true;
            }
            if (d71Var.f33015s) {
                d71Var.i();
            }
            d71Var.j(false, true);
            d71Var.f33007g0.d(true, true);
        } else if (!isCancelled()) {
            d71Var.h();
        }
    }
}
