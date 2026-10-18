package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class bo0 implements TextWatcher {
    public int f35739a = -1;
    public boolean f35740b;
    public int f35741c;
    public final go0 d;

    public bo0(go0 go0Var) {
        this.d = go0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f37266f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f35740b = z10;
            this.f35739a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f35740b = false;
                this.f35739a = 3;
                this.f35741c = i10 - 1;
                return;
            }
            this.f35739a = 2;
        } else {
            this.f35739a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
