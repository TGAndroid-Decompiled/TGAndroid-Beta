package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lo0 extends AsyncTask {
    public final vc.a f39689a;
    public final vo0 f39690b;

    public lo0(vo0 vo0Var, vc.a aVar) {
        this.f39690b = vo0Var;
        this.f39689a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        vo0 vo0Var = this.f39690b;
        if (vo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(vo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            vo0Var.f42993w0 = str;
            vo0Var.t0();
        }
        vo0Var.H0(true, false);
        vo0Var.D0(false);
    }
}
