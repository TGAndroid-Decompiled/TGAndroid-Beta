package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ho0 extends AsyncTask {
    public final xc.a f39944a;
    public final ro0 f39945b;

    public ho0(ro0 ro0Var, xc.a aVar) {
        this.f39945b = ro0Var;
        this.f39944a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ro0 ro0Var = this.f39945b;
        if (ro0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(ro0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            ro0Var.f43132w0 = str;
            ro0Var.u0();
        }
        ro0Var.I0(true, false);
        ro0Var.E0(false);
    }
}
