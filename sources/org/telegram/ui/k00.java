package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k00 implements TextWatcher {
    public final m00 f38377a;

    public k00(m00 m00Var) {
        this.f38377a = m00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        p00 p00Var = this.f38377a.e;
        if (!TextUtils.equals(editable, p00Var.f39946w)) {
            p00Var.f39943n = !TextUtils.isEmpty(editable);
            p00Var.f39946w = org.telegram.ui.Components.a6.onlyEmojiSpans(editable);
            d00 d00Var = p00Var.I;
            if (d00Var != null) {
                d00Var.e(org.telegram.ui.Components.a6.cloneSpans(p00Var.f39946w, -1, d00Var.f36041s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            e00 e00Var = p00Var.J;
            if (e00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = e00Var.f36356r;
                if (p00.k0(p00Var.f39946w)) {
                    if (p00Var.f39947x) {
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
            kVar = ((org.telegram.ui.ActionBar.n2) p00Var).actionBar;
            CharSequence charSequence = p00Var.f39946w;
            kVar2 = ((org.telegram.ui.ActionBar.n2) p00Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.a6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        p00Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
