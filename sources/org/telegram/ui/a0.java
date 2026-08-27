package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

public final class a0 implements Runnable {

    public final int f36323a;

    public final m4 f36324b;

    public final String f36325c;

    public a0(m4 m4Var, String str, int i10) {
        this.f36323a = i10;
        this.f36324b = m4Var;
        this.f36325c = str;
    }

    @Override
    public final void run() {
        switch (this.f36323a) {
            case 0:
                m4 m4Var = this.f36324b;
                hh.o oVar = m4Var.f40335d0.U;
                String str = this.f36325c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                hh.o oVar2 = m4Var.f40335d0.U;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(m4Var.f40335d0.U);
                break;
            default:
                we.e.m(this.f36324b.H, this.f36325c, false, null);
                break;
        }
    }
}
