package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ho0 extends AsyncTask {
    public final uc.a f34264a;
    public final ro0 f34265b;

    public ho0(ro0 ro0Var, uc.a aVar) {
        this.f34265b = ro0Var;
        this.f34264a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ro0 ro0Var = this.f34265b;
        if (ro0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(ro0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            ro0Var.f37202w0 = str;
            ro0Var.t0();
        }
        ro0Var.H0(true, false);
        ro0Var.D0(false);
    }
}
