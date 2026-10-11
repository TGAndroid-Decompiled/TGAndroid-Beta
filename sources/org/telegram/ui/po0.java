package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class po0 implements TextWatcher {
    public int f40961a = -1;
    public boolean f40962b;
    public int f40963c;
    public final uo0 d;

    public po0(uo0 uo0Var) {
        this.d = uo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f42740f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f40962b = z10;
            this.f40961a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f40962b = false;
                this.f40961a = 3;
                this.f40963c = i10 - 1;
                return;
            }
            this.f40961a = 2;
        } else {
            this.f40961a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
