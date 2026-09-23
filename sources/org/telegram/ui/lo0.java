package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class lo0 implements TextWatcher {
    public int f35034a = -1;
    public boolean f35035b;
    public int f35036c;
    public final qo0 d;

    public lo0(qo0 qo0Var) {
        this.d = qo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36496f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f35035b = z10;
            this.f35034a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f35035b = false;
                this.f35034a = 3;
                this.f35036c = i10 - 1;
                return;
            }
            this.f35034a = 2;
        } else {
            this.f35034a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
