package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class a0 implements Runnable {
    public final int f36385a;
    public final m4 f36386b;
    public final String f36387c;

    public a0(m4 m4Var, String str, int i10) {
        this.f36385a = i10;
        this.f36386b = m4Var;
        this.f36387c = str;
    }

    @Override
    public final void run() {
        switch (this.f36385a) {
            case 0:
                m4 m4Var = this.f36386b;
                jh.m mVar = m4Var.f40392d0.U;
                String str = this.f36387c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                mVar.setText(str);
                jh.m mVar2 = m4Var.f40392d0.U;
                mVar2.setSelection(mVar2.getText().length());
                AndroidUtilities.showKeyboard(m4Var.f40392d0.U);
                return;
            default:
                ye.d.m(this.f36386b.H, this.f36387c, false, null);
                return;
        }
    }
}
