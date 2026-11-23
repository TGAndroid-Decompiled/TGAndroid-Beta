package org.telegram.ui;

import android.os.AsyncTask;
public final class el0 extends AsyncTask {
    public final uc.a f47296a;
    public final ml0 f47297b;

    public el0(ml0 ml0Var, uc.a aVar) {
        this.f47297b = ml0Var;
        this.f47296a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.el0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ml0 ml0Var = this.f47297b;
        if (ml0Var.R0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.c5.t0(org.telegram.messenger.hd.N0(2131747210, null), ml0Var);
        } else {
            ml0Var.f49906x0 = str;
            ml0Var.z0();
        }
        ml0Var.N0(true, false);
        ml0Var.J0(false);
    }
}
