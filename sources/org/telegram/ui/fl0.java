package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class fl0 implements TextWatcher {
    public int f47912a = -1;
    public boolean f47913b;
    public int f47914c;
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
        boolean z10 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f49467f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f47913b = z10;
            this.f47912a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f47913b = false;
                this.f47912a = 3;
                this.f47914c = i7 - 1;
                return;
            }
            this.f47912a = 2;
        } else {
            this.f47912a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
