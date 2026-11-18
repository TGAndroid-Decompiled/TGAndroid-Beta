package org.telegram.ui;

import android.os.AsyncTask;
public final class el0 extends AsyncTask {
    public final uc.a f47254a;
    public final ml0 f47255b;

    public el0(ml0 ml0Var, uc.a aVar) {
        this.f47255b = ml0Var;
        this.f47254a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.el0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ml0 ml0Var = this.f47255b;
        if (ml0Var.R0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131747211, null), ml0Var);
        } else {
            ml0Var.f49892x0 = str;
            ml0Var.z0();
        }
        ml0Var.N0(true, false);
        ml0Var.J0(false);
    }
}
