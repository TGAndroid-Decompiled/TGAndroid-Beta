package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class hl0 implements TextWatcher {
    public int f48474a = -1;
    public boolean f48475b;
    public int f48476c;
    public final ml0 d;

    public hl0(ml0 ml0Var) {
        this.d = ml0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f49893f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f48475b = z10;
            this.f48474a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f48475b = false;
                this.f48474a = 3;
                this.f48476c = i7 - 1;
                return;
            }
            this.f48474a = 2;
        } else {
            this.f48474a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
