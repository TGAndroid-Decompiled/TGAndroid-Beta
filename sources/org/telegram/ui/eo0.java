package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eo0 extends AsyncTask {
    public final uc.a f33437a;
    public final oo0 f33438b;

    public eo0(oo0 oo0Var, uc.a aVar) {
        this.f33438b = oo0Var;
        this.f33437a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        oo0 oo0Var = this.f33438b;
        if (oo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(oo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            oo0Var.f36296w0 = str;
            oo0Var.t0();
        }
        oo0Var.H0(true, false);
        oo0Var.D0(false);
    }
}
