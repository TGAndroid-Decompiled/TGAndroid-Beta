package org.telegram.ui;

import android.os.AsyncTask;
public final class bl0 extends AsyncTask {
    public final uc.a f44066a;
    public final jl0 f44067b;

    public bl0(jl0 jl0Var, uc.a aVar) {
        this.f44067b = jl0Var;
        this.f44066a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bl0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        jl0 jl0Var = this.f44067b;
        if (jl0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131747404, null), jl0Var);
        } else {
            jl0Var.f47029w0 = str;
            jl0Var.z0();
        }
        jl0Var.N0(true, false);
        jl0Var.J0(false);
    }
}
