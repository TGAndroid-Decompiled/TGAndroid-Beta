package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oo0 extends AsyncTask {
    public final uc.a f36393a;
    public final yo0 f36394b;

    public oo0(yo0 yo0Var, uc.a aVar) {
        this.f36394b = yo0Var;
        this.f36393a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        yo0 yo0Var = this.f36394b;
        if (yo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.c5.w0(yo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            yo0Var.f39979w0 = str;
            yo0Var.t0();
        }
        yo0Var.H0(true, false);
        yo0Var.D0(false);
    }
}
