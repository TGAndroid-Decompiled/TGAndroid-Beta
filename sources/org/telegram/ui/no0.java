package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class no0 implements TextWatcher {
    public int f39016a = -1;
    public boolean f39017b;
    public int f39018c;
    public final so0 d;

    public no0(so0 so0Var) {
        this.d = so0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f40572f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f39017b = z10;
            this.f39016a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f39017b = false;
                this.f39016a = 3;
                this.f39018c = i10 - 1;
                return;
            }
            this.f39016a = 2;
        } else {
            this.f39016a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
