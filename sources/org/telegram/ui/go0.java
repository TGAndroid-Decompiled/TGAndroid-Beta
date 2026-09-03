package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class go0 implements TextWatcher {
    public int f34487a = -1;
    public boolean f34488b;
    public int f34489c;
    public final lo0 d;

    public go0(lo0 lo0Var) {
        this.d = lo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.go0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f35826f[1].getText(), '/') != -1) {
                z4 = true;
            }
            this.f34488b = z4;
            this.f34487a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f34488b = false;
                this.f34487a = 3;
                this.f34489c = i10 - 1;
                return;
            }
            this.f34487a = 2;
        } else {
            this.f34487a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
