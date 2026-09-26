package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class jo0 implements TextWatcher {
    public int f34844a = -1;
    public boolean f34845b;
    public int f34846c;
    public final oo0 d;

    public jo0(oo0 oo0Var) {
        this.d = oo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f36290f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f34845b = z10;
            this.f34844a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f34845b = false;
                this.f34844a = 3;
                this.f34846c = i10 - 1;
                return;
            }
            this.f34844a = 2;
        } else {
            this.f34844a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
