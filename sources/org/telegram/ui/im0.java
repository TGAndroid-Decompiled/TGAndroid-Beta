package org.telegram.ui;

import android.os.AsyncTask;
public final class im0 extends AsyncTask {
    public final oc.a f38108a;
    public final qm0 f38109b;

    public im0(qm0 qm0Var, oc.a aVar) {
        this.f38109b = qm0Var;
        this.f38108a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        qm0 qm0Var = this.f38109b;
        if (qm0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131747420, null), qm0Var);
        } else {
            qm0Var.f40847w0 = str;
            qm0Var.z0();
        }
        qm0Var.N0(true, false);
        qm0Var.J0(false);
    }
}
