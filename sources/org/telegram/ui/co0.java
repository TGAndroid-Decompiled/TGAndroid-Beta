package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class co0 implements TextWatcher {
    public int f36378a = -1;
    public boolean f36379b;
    public int f36380c;
    public final ho0 d;

    public co0(ho0 ho0Var) {
        this.d = ho0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f37927f[1].getText(), '/') != -1) {
                z10 = true;
            }
            this.f36379b = z10;
            this.f36378a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f36379b = false;
                this.f36378a = 3;
                this.f36380c = i10 - 1;
                return;
            }
            this.f36378a = 2;
        } else {
            this.f36378a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
