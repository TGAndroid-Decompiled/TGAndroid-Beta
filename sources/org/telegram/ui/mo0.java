package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 extends AsyncTask {
    public final uc.a f35013a;
    public final wo0 f35014b;

    public mo0(wo0 wo0Var, uc.a aVar) {
        this.f35014b = wo0Var;
        this.f35013a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        wo0 wo0Var = this.f35014b;
        if (wo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.d5.w0(wo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            wo0Var.f38289w0 = str;
            wo0Var.t0();
        }
        wo0Var.H0(true, false);
        wo0Var.D0(false);
    }
}
