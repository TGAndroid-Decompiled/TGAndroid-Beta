package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class ao0 implements TextWatcher {
    public int f35474a = -1;
    public boolean f35475b;
    public int f35476c;
    public final fo0 d;

    public ao0(fo0 fo0Var) {
        this.d = fo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ao0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36983f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f35475b = z10;
            this.f35474a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f35475b = false;
                this.f35474a = 3;
                this.f35476c = i10 - 1;
                return;
            }
            this.f35474a = 2;
        } else {
            this.f35474a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
