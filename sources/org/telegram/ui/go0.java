package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class go0 extends AsyncTask {
    public final uc.a f33601a;
    public final qo0 f33602b;

    public go0(qo0 qo0Var, uc.a aVar) {
        this.f33602b = qo0Var;
        this.f33601a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.go0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        qo0 qo0Var = this.f33602b;
        if (qo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(qo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            qo0Var.f36518w0 = str;
            qo0Var.t0();
        }
        qo0Var.H0(true, false);
        qo0Var.D0(false);
    }
}
