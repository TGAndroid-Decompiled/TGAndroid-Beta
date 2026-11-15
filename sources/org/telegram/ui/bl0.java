package org.telegram.ui;

import android.os.AsyncTask;
public final class bl0 extends AsyncTask {
    public final uc.a f45784a;
    public final jl0 f45785b;

    public bl0(jl0 jl0Var, uc.a aVar) {
        this.f45785b = jl0Var;
        this.f45784a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bl0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        jl0 jl0Var = this.f45785b;
        if (jl0Var.R0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131747404, null), jl0Var);
        } else {
            jl0Var.f48421x0 = str;
            jl0Var.z0();
        }
        jl0Var.N0(true, false);
        jl0Var.J0(false);
    }
}
