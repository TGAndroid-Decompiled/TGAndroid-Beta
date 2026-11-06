package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class e71 extends AsyncTask {
    public final String f33170a;
    public final CountDownLatch f33171b = new CountDownLatch(1);
    public final String[] f33172c = new String[2];
    public String d;
    public final f71 f33173e;

    public e71(f71 f71Var, String str) {
        this.f33173e = f71Var;
        this.f33170a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        f71 f71Var = this.f33173e;
        if (str != null) {
            if (org.telegram.messenger.r2.f25191a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                org.telegram.ui.Cells.f1.u(strArr[0], sb2);
            }
            f71Var.f33535x = true;
            f71Var.f33536y = strArr[0];
            String str2 = strArr[1];
            f71Var.D = str2;
            if (str2.equals("hls")) {
                f71Var.H = true;
            }
            if (f71Var.f33533s) {
                f71Var.i();
            }
            f71Var.j(false, true);
            f71Var.f33525f0.d(true, true);
        } else if (!isCancelled()) {
            f71Var.h();
        }
    }
}
