package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class mo0 implements TextWatcher {
    public int f41492a = -1;
    public boolean f41493b;
    public int f41494c;
    public final ro0 d;

    public mo0(ro0 ro0Var) {
        this.d = ro0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f43110f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f41493b = z10;
            this.f41492a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f41493b = false;
                this.f41492a = 3;
                this.f41494c = i10 - 1;
                return;
            }
            this.f41492a = 2;
        } else {
            this.f41492a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
