package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class no0 implements TextWatcher {
    public int f39022a = -1;
    public boolean f39023b;
    public int f39024c;
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
            if (TextUtils.indexOf((CharSequence) this.d.f40554f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f39023b = z10;
            this.f39022a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f39023b = false;
                this.f39022a = 3;
                this.f39024c = i10 - 1;
                return;
            }
            this.f39022a = 2;
        } else {
            this.f39022a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
