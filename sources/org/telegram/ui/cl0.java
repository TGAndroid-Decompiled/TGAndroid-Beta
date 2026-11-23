package org.telegram.ui;

import android.os.AsyncTask;
public final class cl0 extends AsyncTask {
    public final uc.a f46825a;
    public final kl0 f46826b;

    public cl0(kl0 kl0Var, uc.a aVar) {
        this.f46826b = kl0Var;
        this.f46825a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cl0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        kl0 kl0Var = this.f46826b;
        if (kl0Var.R0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.N0(2131747210, null), kl0Var);
        } else {
            kl0Var.f49492x0 = str;
            kl0Var.z0();
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
    }
}
