package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i00 implements TextWatcher {
    public final k00 f38972a;

    public i00(k00 k00Var) {
        this.f38972a = k00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i9;
        n00 n00Var = this.f38972a.f39658e;
        if (!TextUtils.equals(editable, n00Var.f40572w)) {
            n00Var.f40569n = !TextUtils.isEmpty(editable);
            n00Var.f40572w = org.telegram.ui.Components.t5.onlyEmojiSpans(editable);
            b00 b00Var = n00Var.E;
            if (b00Var != null) {
                b00Var.e(org.telegram.ui.Components.t5.cloneSpans(n00Var.f40572w, -1, b00Var.f36585s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            c00 c00Var = n00Var.F;
            if (c00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = c00Var.f37021r;
                if (n00.j0(n00Var.f40572w)) {
                    if (n00Var.f40573x) {
                        i9 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i9 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i9);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.o2) n00Var).actionBar;
            CharSequence charSequence = n00Var.f40572w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) n00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.t5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        n00Var.h0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
