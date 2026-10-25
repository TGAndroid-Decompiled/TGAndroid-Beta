package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class ko0 implements TextWatcher {
    public int f40991a = -1;
    public boolean f40992b;
    public int f40993c;
    public final po0 d;

    public ko0(po0 po0Var) {
        this.d = po0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f42596f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f40992b = z10;
            this.f40991a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f40992b = false;
                this.f40991a = 3;
                this.f40993c = i10 - 1;
                return;
            }
            this.f40991a = 2;
        } else {
            this.f40991a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
