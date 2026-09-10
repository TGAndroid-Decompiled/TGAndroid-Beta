package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c10 implements TextWatcher {
    public final e10 f31484a;

    public c10(e10 e10Var) {
        this.f31484a = e10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        String str;
        int i10;
        h10 h10Var = this.f31484a.e;
        if (!TextUtils.equals(editable, h10Var.f33239w)) {
            h10Var.f33236n = !TextUtils.isEmpty(editable);
            h10Var.f33239w = org.telegram.ui.Components.y5.onlyEmojiSpans(editable);
            v00 v00Var = h10Var.I;
            if (v00Var != null) {
                v00Var.e(org.telegram.ui.Components.y5.cloneSpans(h10Var.f33239w, -1, v00Var.f37371s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            w00 w00Var = h10Var.J;
            if (w00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = w00Var.f37663r;
                if (h10.k0(h10Var.f33239w)) {
                    if (h10Var.f33240x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            lVar = ((org.telegram.ui.ActionBar.p2) h10Var).actionBar;
            CharSequence charSequence = h10Var.f33239w;
            lVar2 = ((org.telegram.ui.ActionBar.p2) h10Var).actionBar;
            lVar.setTitle(org.telegram.ui.Components.y5.cloneSpans(charSequence, -1, lVar2.getTitleFontMetricsInt()));
        }
        h10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
