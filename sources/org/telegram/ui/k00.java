package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k00 implements TextWatcher {
    public final m00 f39717a;

    public k00(m00 m00Var) {
        this.f39717a = m00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        String str;
        int i10;
        p00 p00Var = this.f39717a.f40336e;
        if (!TextUtils.equals(editable, p00Var.f41268w)) {
            p00Var.f41265n = !TextUtils.isEmpty(editable);
            p00Var.f41268w = org.telegram.ui.Components.y5.onlyEmojiSpans(editable);
            d00 d00Var = p00Var.E;
            if (d00Var != null) {
                d00Var.e(org.telegram.ui.Components.y5.cloneSpans(p00Var.f41268w, -1, d00Var.f37251s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            e00 e00Var = p00Var.F;
            if (e00Var != null) {
                org.telegram.ui.Cells.r3 r3Var = e00Var.f37661r;
                if (p00.k0(p00Var.f41268w)) {
                    if (p00Var.f41269x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                r3Var.setText(str);
            }
            lVar = ((org.telegram.ui.ActionBar.o2) p00Var).actionBar;
            CharSequence charSequence = p00Var.f41268w;
            lVar2 = ((org.telegram.ui.ActionBar.o2) p00Var).actionBar;
            lVar.setTitle(org.telegram.ui.Components.y5.cloneSpans(charSequence, -1, lVar2.getTitleFontMetricsInt()));
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
