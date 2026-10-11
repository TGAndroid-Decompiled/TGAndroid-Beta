package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 extends AsyncTask {
    public final vc.a f39389a;
    public final uo0 f39390b;

    public ko0(uo0 uo0Var, vc.a aVar) {
        this.f39390b = uo0Var;
        this.f39389a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        uo0 uo0Var = this.f39390b;
        if (uo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(uo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            uo0Var.f42728w0 = str;
            uo0Var.t0();
        }
        uo0Var.H0(true, false);
        uo0Var.D0(false);
    }
}
