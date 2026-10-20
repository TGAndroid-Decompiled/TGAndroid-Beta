package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i00 implements TextWatcher {
    public final k00 f37826a;

    public i00(k00 k00Var) {
        this.f37826a = k00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        n00 n00Var = this.f37826a.e;
        if (!TextUtils.equals(editable, n00Var.f39382w)) {
            n00Var.f39379n = !TextUtils.isEmpty(editable);
            n00Var.f39382w = org.telegram.ui.Components.a6.onlyEmojiSpans(editable);
            b00 b00Var = n00Var.I;
            if (b00Var != null) {
                b00Var.e(org.telegram.ui.Components.a6.cloneSpans(n00Var.f39382w, -1, b00Var.f35464s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            c00 c00Var = n00Var.J;
            if (c00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = c00Var.f35764r;
                if (n00.k0(n00Var.f39382w)) {
                    if (n00Var.f39383x) {
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
            kVar = ((org.telegram.ui.ActionBar.n2) n00Var).actionBar;
            CharSequence charSequence = n00Var.f39382w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) n00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.a6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        n00Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
