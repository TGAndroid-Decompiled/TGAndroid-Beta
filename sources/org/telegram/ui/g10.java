package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g10 implements TextWatcher {
    public final i10 f36270a;

    public g10(i10 i10Var) {
        this.f36270a = i10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        l10 l10Var = this.f36270a.e;
        if (!TextUtils.equals(editable, l10Var.f37811w)) {
            l10Var.f37808n = !TextUtils.isEmpty(editable);
            l10Var.f37811w = org.telegram.ui.Components.b6.onlyEmojiSpans(editable);
            z00 z00Var = l10Var.I;
            if (z00Var != null) {
                z00Var.e(org.telegram.ui.Components.b6.cloneSpans(l10Var.f37811w, -1, z00Var.f42445s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            a10 a10Var = l10Var.J;
            if (a10Var != null) {
                org.telegram.ui.Cells.u3 u3Var = a10Var.f34012r;
                if (l10.k0(l10Var.f37811w)) {
                    if (l10Var.f37812x) {
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
            kVar = ((org.telegram.ui.ActionBar.m2) l10Var).actionBar;
            CharSequence charSequence = l10Var.f37811w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) l10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.b6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        l10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
