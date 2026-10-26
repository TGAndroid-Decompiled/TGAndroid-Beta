package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fo0 extends AsyncTask {
    public final xc.a f39429a;
    public final po0 f39430b;

    public fo0(po0 po0Var, xc.a aVar) {
        this.f39430b = po0Var;
        this.f39429a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        po0 po0Var = this.f39430b;
        if (po0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(po0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            po0Var.f42621w0 = str;
            po0Var.u0();
        }
        po0Var.I0(true, false);
        po0Var.E0(false);
    }
}
