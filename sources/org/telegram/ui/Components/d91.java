package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class d91 extends AsyncTask {
    public final String f24234a;
    public final CountDownLatch f24235b = new CountDownLatch(1);
    public final String[] f24236c = new String[2];
    public String d;
    public final e91 e;

    public d91(e91 e91Var, String str) {
        this.e = e91Var;
        this.f24234a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        e91 e91Var = this.e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                org.telegram.ui.ai.v(strArr[0], sb);
            }
            e91Var.f24545w = true;
            e91Var.f24546x = strArr[0];
            String str2 = strArr[1];
            e91Var.f24547y = str2;
            if (str2.equals("hls")) {
                e91Var.E = true;
            }
            if (e91Var.f24544s) {
                e91Var.i();
            }
            e91Var.j(false, true);
            e91Var.f24535c0.d(true, true);
        } else if (!isCancelled()) {
            e91Var.h();
        }
    }
}
