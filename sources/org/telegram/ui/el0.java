package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class el0 implements TextWatcher {
    public int f45460a = -1;
    public boolean f45461b;
    public int f45462c;
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
        boolean z9 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f47007f[1].getText(), '/') != -1) {
                z9 = true;
            }
            this.f45461b = z9;
            this.f45460a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f45461b = false;
                this.f45460a = 3;
                this.f45462c = i7 - 1;
                return;
            }
            this.f45460a = 2;
        } else {
            this.f45460a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
