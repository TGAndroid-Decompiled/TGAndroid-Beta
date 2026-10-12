package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 extends AsyncTask {
    public final vc.a f40446a;
    public final xo0 f40447b;

    public no0(xo0 xo0Var, vc.a aVar) {
        this.f40447b = xo0Var;
        this.f40446a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        xo0 xo0Var = this.f40447b;
        if (xo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            xo0Var.f44121w0 = str;
            xo0Var.t0();
        }
        xo0Var.H0(true, false);
        xo0Var.D0(false);
    }
}
