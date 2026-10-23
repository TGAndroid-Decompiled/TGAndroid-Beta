package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class do0 implements TextWatcher {
    public int f36663a = -1;
    public boolean f36664b;
    public int f36665c;
    public final io0 d;

    public do0(io0 io0Var) {
        this.d = io0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.do0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f38300f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f36664b = z10;
            this.f36663a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f36664b = false;
                this.f36663a = 3;
                this.f36665c = i10 - 1;
                return;
            }
            this.f36663a = 2;
        } else {
            this.f36663a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
