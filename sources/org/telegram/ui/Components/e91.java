package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class e91 extends AsyncTask {
    public final String f26487a;
    public final CountDownLatch f26488b = new CountDownLatch(1);
    public final String[] f26489c = new String[2];
    public String d;
    public final f91 f26490e;

    public e91(f91 f91Var, String str) {
        this.f26490e = f91Var;
        this.f26487a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        f91 f91Var = this.f26490e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                org.telegram.ui.yh.v(strArr[0], sb);
            }
            f91Var.f26828w = true;
            f91Var.f26829x = strArr[0];
            String str2 = strArr[1];
            f91Var.f26830y = str2;
            if (str2.equals("hls")) {
                f91Var.E = true;
            }
            if (f91Var.f26827s) {
                f91Var.i();
            }
            f91Var.j(false, true);
            f91Var.f26817c0.d(true, true);
        } else if (!isCancelled()) {
            f91Var.h();
        }
    }
}
