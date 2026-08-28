package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class p30 implements TextWatcher {
    public final o50 f41330a;

    public p30(o50 o50Var) {
        this.f41330a = o50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i9;
        o50 o50Var = this.f41330a;
        o50Var.f40976w3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = o50Var.Z;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        o50Var.I.a();
        o50Var.I.setText(str);
        org.telegram.ui.Components.j6 j6Var = o50Var.I;
        if (codePointCount >= i10) {
            i9 = -1280137;
        } else {
            i9 = -1;
        }
        j6Var.setTextColor(i9);
        if (codePointCount > i10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
