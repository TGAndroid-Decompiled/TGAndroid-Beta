package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a10 implements TextWatcher {
    public final c10 f34634a;

    public a10(c10 c10Var) {
        this.f34634a = c10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        f10 f10Var = this.f34634a.f35244e;
        if (!TextUtils.equals(editable, f10Var.f36141w)) {
            f10Var.f36138n = !TextUtils.isEmpty(editable);
            f10Var.f36141w = org.telegram.ui.Components.z5.onlyEmojiSpans(editable);
            t00 t00Var = f10Var.I;
            if (t00Var != null) {
                t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f36141w, -1, t00Var.f40641s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            u00 u00Var = f10Var.J;
            if (u00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = u00Var.f41003r;
                if (f10.k0(f10Var.f36141w)) {
                    if (f10Var.f36142x) {
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
            kVar = ((org.telegram.ui.ActionBar.n2) f10Var).actionBar;
            CharSequence charSequence = f10Var.f36141w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) f10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.z5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        f10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
