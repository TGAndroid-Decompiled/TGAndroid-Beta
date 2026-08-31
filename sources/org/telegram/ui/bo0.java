package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bo0 extends AsyncTask {
    public final gc.a f35571a;
    public final lo0 f35572b;

    public bo0(lo0 lo0Var, gc.a aVar) {
        this.f35572b = lo0Var;
        this.f35571a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        lo0 lo0Var = this.f35572b;
        if (lo0Var.N0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.z4.w0(lo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            lo0Var.f38824t0 = str;
            lo0Var.t0();
        }
        lo0Var.H0(true, false);
        lo0Var.D0(false);
    }
}
