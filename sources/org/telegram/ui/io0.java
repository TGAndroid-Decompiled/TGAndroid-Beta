package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class io0 extends AsyncTask {
    public final uc.a f37480a;
    public final so0 f37481b;

    public io0(so0 so0Var, uc.a aVar) {
        this.f37481b = so0Var;
        this.f37480a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        so0 so0Var = this.f37481b;
        if (so0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(so0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            so0Var.f40582w0 = str;
            so0Var.t0();
        }
        so0Var.H0(true, false);
        so0Var.D0(false);
    }
}
