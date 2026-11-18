package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class v71 extends AsyncTask {
    public final String f40520a;
    public final CountDownLatch f40521b = new CountDownLatch(1);
    public final String[] f40522c = new String[2];
    public String d;
    public final w71 f40523e;

    public v71(w71 w71Var, String str) {
        this.f40523e = w71Var;
        this.f40520a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v71.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        w71 w71Var = this.f40523e;
        if (str != null) {
            if (org.telegram.messenger.s2.f26723a) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                p5.c.s(strArr[0], sb2);
            }
            w71Var.f41613x = true;
            w71Var.f41614y = strArr[0];
            String str2 = strArr[1];
            w71Var.E = str2;
            if (str2.equals("hls")) {
                w71Var.I = true;
            }
            if (w71Var.f41611s) {
                w71Var.i();
            }
            w71Var.j(false, true);
            w71Var.f41603g0.d(true, true);
        } else if (!isCancelled()) {
            w71Var.h();
        }
    }
}
