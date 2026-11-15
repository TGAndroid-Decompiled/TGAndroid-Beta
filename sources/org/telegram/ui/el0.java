package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class el0 implements TextWatcher {
    public int f46863a = -1;
    public boolean f46864b;
    public int f46865c;
    public final jl0 d;

    public el0(jl0 jl0Var) {
        this.d = jl0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.el0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f48396f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f46864b = z10;
            this.f46863a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f46864b = false;
                this.f46863a = 3;
                this.f46865c = i7 - 1;
                return;
            }
            this.f46863a = 2;
        } else {
            this.f46863a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
