package org.telegram.ui;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class eo0 implements TextWatcher {
    public int f34056a = -1;
    public boolean f34057b;
    public int f34058c;
    public final jo0 d;

    public eo0(jo0 jo0Var) {
        this.d = jo0Var;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4 = false;
        if (i11 == 0 && i12 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f35399f[1].getText(), '/') != -1) {
                z4 = true;
            }
            this.f34057b = z4;
            this.f34056a = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == '/' && i10 > 0) {
                this.f34057b = false;
                this.f34056a = 3;
                this.f34058c = i10 - 1;
                return;
            }
            this.f34056a = 2;
        } else {
            this.f34056a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
