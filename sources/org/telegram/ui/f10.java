package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f10 implements TextWatcher {
    public final h10 f35423a;

    public f10(h10 h10Var) {
        this.f35423a = h10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        k10 k10Var = this.f35423a.e;
        if (!TextUtils.equals(editable, k10Var.f37205w)) {
            k10Var.f37202n = !TextUtils.isEmpty(editable);
            k10Var.f37205w = org.telegram.ui.Components.b6.onlyEmojiSpans(editable);
            y00 y00Var = k10Var.I;
            if (y00Var != null) {
                y00Var.e(org.telegram.ui.Components.b6.cloneSpans(k10Var.f37205w, -1, y00Var.f41699s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            z00 z00Var = k10Var.J;
            if (z00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = z00Var.f42123r;
                if (k10.k0(k10Var.f37205w)) {
                    if (k10Var.f37206x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.m2) k10Var).actionBar;
            CharSequence charSequence = k10Var.f37205w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) k10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.b6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        k10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
