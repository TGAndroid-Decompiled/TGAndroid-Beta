package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class nm0 implements TextWatcher {
    public int f39976a = -1;
    public boolean f39977b;
    public int f39978c;
    public final sm0 d;

    public nm0(sm0 sm0Var) {
        this.d = sm0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f41559f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f39977b = z10;
            this.f39976a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f39977b = false;
                this.f39976a = 3;
                this.f39978c = i10 - 1;
                return;
            }
            this.f39976a = 2;
        } else {
            this.f39976a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
