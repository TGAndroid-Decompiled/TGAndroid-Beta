package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BuildVars;
public final class a91 extends AsyncTask {
    public final String f24313a;
    public final CountDownLatch f24314b = new CountDownLatch(1);
    public final String[] f24315c = new String[2];
    public String d;
    public final b91 f24316e;

    public a91(b91 b91Var, String str) {
        this.f24316e = b91Var;
        this.f24313a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a91.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        b91 b91Var = this.f24316e;
        if (str != null) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("start play youtube video ");
                sb2.append(strArr[1]);
                sb2.append(" ");
                com.google.android.gms.internal.vision.e2.t(strArr[0], sb2);
            }
            b91Var.f24638w = true;
            b91Var.f24639x = strArr[0];
            String str2 = strArr[1];
            b91Var.f24640y = str2;
            if (str2.equals("hls")) {
                b91Var.H = true;
            }
            if (b91Var.f24637s) {
                b91Var.i();
            }
            b91Var.j(false, true);
            b91Var.f24629f0.d(true, true);
        } else if (!isCancelled()) {
            b91Var.h();
        }
    }
}
