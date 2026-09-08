package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class a91 extends AsyncTask {
    public final String f24339a;
    public final CountDownLatch f24340b = new CountDownLatch(1);
    public final String[] f24341c = new String[2];
    public String d;
    public final b91 f24342e;

    public a91(b91 b91Var, String str) {
        this.f24342e = b91Var;
        this.f24339a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        b91 b91Var = this.f24342e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            b91Var.f24664w = true;
            b91Var.f24665x = strArr[0];
            String str2 = strArr[1];
            b91Var.f24666y = str2;
            if (str2.equals("hls")) {
                b91Var.H = true;
            }
            if (b91Var.f24663s) {
                b91Var.i();
            }
            b91Var.j(false, true);
            b91Var.f24655f0.d(true, true);
        } else if (!isCancelled()) {
            b91Var.h();
        }
    }
}
