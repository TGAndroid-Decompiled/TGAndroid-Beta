package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class e40 implements TextWatcher {
    public final c60 f33884a;

    public e40(c60 c60Var) {
        this.f33884a = c60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        c60 c60Var = this.f33884a;
        c60Var.f33197x3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = c60Var.f33098a0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        c60Var.J.a();
        c60Var.J.setText(str);
        org.telegram.ui.Components.k6 k6Var = c60Var.J;
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
