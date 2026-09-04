package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 extends AsyncTask {
    public final uc.a f38996a;
    public final xo0 f38997b;

    public no0(xo0 xo0Var, uc.a aVar) {
        this.f38997b = xo0Var;
        this.f38996a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        xo0 xo0Var = this.f38997b;
        if (xo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            xo0Var.f42841w0 = str;
            xo0Var.t0();
        }
        xo0Var.H0(true, false);
        xo0Var.D0(false);
    }
}
