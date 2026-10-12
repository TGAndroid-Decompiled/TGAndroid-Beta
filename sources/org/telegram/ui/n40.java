package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class n40 implements TextWatcher {
    public final n60 f38424a;

    public n40(n60 n60Var) {
        this.f38424a = n60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        n60 n60Var = this.f38424a;
        n60Var.A3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = n60Var.f38454d0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        n60Var.M.a();
        n60Var.M.setText(str);
        org.telegram.ui.Components.s6 s6Var = n60Var.M;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
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
