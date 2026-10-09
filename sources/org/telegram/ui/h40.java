package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class h40 implements TextWatcher {
    public final g60 f38210a;

    public h40(g60 g60Var) {
        this.f38210a = g60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        g60 g60Var = this.f38210a;
        g60Var.A3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = g60Var.f37799d0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        g60Var.M.a();
        g60Var.M.setText(str);
        org.telegram.ui.Components.r6 r6Var = g60Var.M;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        r6Var.setTextColor(i10);
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
