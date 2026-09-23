package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class g40 implements TextWatcher {
    public final f60 f33459a;

    public g40(f60 f60Var) {
        this.f33459a = f60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        f60 f60Var = this.f33459a;
        f60Var.A3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = f60Var.f33111d0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        f60Var.M.a();
        f60Var.M.setText(str);
        org.telegram.ui.Components.p6 p6Var = f60Var.M;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        p6Var.setTextColor(i10);
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
