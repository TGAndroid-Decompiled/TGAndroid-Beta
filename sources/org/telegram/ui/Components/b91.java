package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class b91 extends AsyncTask {
    public final String f22721a;
    public final CountDownLatch f22722b = new CountDownLatch(1);
    public final String[] f22723c = new String[2];
    public String d;
    public final c91 e;

    public b91(c91 c91Var, String str) {
        this.e = c91Var;
        this.f22721a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        c91 c91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            c91Var.f23035w = true;
            c91Var.f23036x = strArr[0];
            String str2 = strArr[1];
            c91Var.f23037y = str2;
            if (str2.equals("hls")) {
                c91Var.H = true;
            }
            if (c91Var.f23034s) {
                c91Var.i();
            }
            c91Var.j(false, true);
            c91Var.f23026f0.d(true, true);
        } else if (!isCancelled()) {
            c91Var.h();
        }
    }
}
