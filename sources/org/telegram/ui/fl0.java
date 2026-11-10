package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class fl0 implements TextWatcher {
    public int f45793a = -1;
    public boolean f45794b;
    public int f45795c;
    public final kl0 d;

    public fl0(kl0 kl0Var) {
        this.d = kl0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f47339f[1].getText(), '/') != -1) {
                z9 = true;
            }
            this.f45794b = z9;
            this.f45793a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f45794b = false;
                this.f45793a = 3;
                this.f45795c = i7 - 1;
                return;
            }
            this.f45793a = 2;
        } else {
            this.f45793a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
