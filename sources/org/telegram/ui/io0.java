package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class io0 implements TextWatcher {
    public int f34647a = -1;
    public boolean f34648b;
    public int f34649c;
    public final no0 d;

    public io0(no0 no0Var) {
        this.d = no0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.io0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36062f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f34648b = z10;
            this.f34647a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f34648b = false;
                this.f34647a = 3;
                this.f34649c = i10 - 1;
                return;
            }
            this.f34647a = 2;
        } else {
            this.f34647a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
