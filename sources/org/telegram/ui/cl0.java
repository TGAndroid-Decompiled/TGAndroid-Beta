package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class cl0 implements TextWatcher {
    public int f44846a = -1;
    public boolean f44847b;
    public int f44848c;
    public final hl0 d;

    public cl0(hl0 hl0Var) {
        this.d = hl0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cl0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9 = false;
        if (i10 == 0 && i11 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f46420f[1].getText(), '/') != -1) {
                z9 = true;
            }
            this.f44847b = z9;
            this.f44846a = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == '/' && i7 > 0) {
                this.f44847b = false;
                this.f44846a = 3;
                this.f44848c = i7 - 1;
                return;
            }
            this.f44846a = 2;
        } else {
            this.f44846a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
