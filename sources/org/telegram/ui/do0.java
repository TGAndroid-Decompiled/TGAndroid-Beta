package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class do0 extends AsyncTask {
    public final uc.a f33248a;
    public final no0 f33249b;

    public do0(no0 no0Var, uc.a aVar) {
        this.f33249b = no0Var;
        this.f33248a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.do0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        no0 no0Var = this.f33249b;
        if (no0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(no0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            no0Var.f36084w0 = str;
            no0Var.t0();
        }
        no0Var.H0(true, false);
        no0Var.D0(false);
    }
}
