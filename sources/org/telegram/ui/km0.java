package org.telegram.ui;

import android.os.AsyncTask;
public final class km0 extends AsyncTask {
    public final oc.a f38903a;
    public final sm0 f38904b;

    public km0(sm0 sm0Var, oc.a aVar) {
        this.f38904b = sm0Var;
        this.f38903a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        sm0 sm0Var = this.f38904b;
        if (sm0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131747420, null), sm0Var);
        } else {
            sm0Var.f41581w0 = str;
            sm0Var.y0();
        }
        sm0Var.M0(true, false);
        sm0Var.I0(false);
    }
}
