package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a10 implements TextWatcher {
    public final c10 f31893a;

    public a10(c10 c10Var) {
        this.f31893a = c10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        f10 f10Var = this.f31893a.e;
        if (!TextUtils.equals(editable, f10Var.f33397w)) {
            f10Var.f33394n = !TextUtils.isEmpty(editable);
            f10Var.f33397w = org.telegram.ui.Components.z5.onlyEmojiSpans(editable);
            t00 t00Var = f10Var.I;
            if (t00Var != null) {
                t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f33397w, -1, t00Var.f37526s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            u00 u00Var = f10Var.J;
            if (u00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = u00Var.f37842r;
                if (f10.k0(f10Var.f33397w)) {
                    if (f10Var.f33398x) {
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
            CharSequence charSequence = f10Var.f33397w;
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
