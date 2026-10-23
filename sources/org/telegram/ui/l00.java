package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l00 implements TextWatcher {
    public final n00 f39095a;

    public l00(n00 n00Var) {
        this.f39095a = n00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        q00 q00Var = this.f39095a.e;
        if (!TextUtils.equals(editable, q00Var.f40592w)) {
            q00Var.f40589n = !TextUtils.isEmpty(editable);
            q00Var.f40592w = org.telegram.ui.Components.a6.onlyEmojiSpans(editable);
            e00 e00Var = q00Var.I;
            if (e00Var != null) {
                e00Var.e(org.telegram.ui.Components.a6.cloneSpans(q00Var.f40592w, -1, e00Var.f36771s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            f00 f00Var = q00Var.J;
            if (f00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = f00Var.f37184r;
                if (q00.k0(q00Var.f40592w)) {
                    if (q00Var.f40593x) {
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
            kVar = ((org.telegram.ui.ActionBar.o2) q00Var).actionBar;
            CharSequence charSequence = q00Var.f40592w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) q00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.a6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        q00Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
