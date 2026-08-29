package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class r81 extends AsyncTask {
    public final String f32242a;
    public final CountDownLatch f32243b = new CountDownLatch(1);
    public final String[] f32244c = new String[2];
    public String d;
    public final s81 f32245e;

    public r81(s81 s81Var, String str) {
        this.f32245e = s81Var;
        this.f32242a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r81.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        s81 s81Var = this.f32245e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                org.telegram.ui.th.v(strArr[0], sb2);
            }
            s81Var.f32584w = true;
            s81Var.f32585x = strArr[0];
            String str2 = strArr[1];
            s81Var.f32586y = str2;
            if (str2.equals("hls")) {
                s81Var.D = true;
            }
            if (s81Var.f32583s) {
                s81Var.i();
            }
            s81Var.j(false, true);
            s81Var.f32572b0.d(true, true);
        } else if (!isCancelled()) {
            s81Var.h();
        }
    }
}
