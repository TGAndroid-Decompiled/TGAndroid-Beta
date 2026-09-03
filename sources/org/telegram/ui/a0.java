package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class a0 implements Runnable {
    public final int f32395a;
    public final n4 f32396b;
    public final String f32397c;

    public a0(n4 n4Var, String str, int i10) {
        this.f32395a = i10;
        this.f32396b = n4Var;
        this.f32397c = str;
    }

    @Override
    public final void run() {
        switch (this.f32395a) {
            case 0:
                n4 n4Var = this.f32396b;
                lh.n nVar = n4Var.f36363e0.V;
                String str = this.f32397c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                nVar.setText(str);
                lh.n nVar2 = n4Var.f36363e0.V;
                nVar2.setSelection(nVar2.getText().length());
                AndroidUtilities.showKeyboard(n4Var.f36363e0.V);
                return;
            default:
                ze.d.m(this.f32396b.I, this.f32397c, false, null);
                return;
        }
    }
}
