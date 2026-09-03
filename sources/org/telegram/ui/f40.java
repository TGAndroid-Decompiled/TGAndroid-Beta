package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class f40 implements TextWatcher {
    public final d60 f36653a;

    public f40(d60 d60Var) {
        this.f36653a = d60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        d60 d60Var = this.f36653a;
        d60Var.f36090x3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = d60Var.f35990a0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        d60Var.J.a();
        d60Var.J.setText(str);
        org.telegram.ui.Components.k6 k6Var = d60Var.J;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        k6Var.setTextColor(i10);
        if (codePointCount > i11) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
