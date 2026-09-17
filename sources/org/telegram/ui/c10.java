package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c10 implements TextWatcher {
    public final e10 f32623a;

    public c10(e10 e10Var) {
        this.f32623a = e10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        h10 h10Var = this.f32623a.e;
        if (!TextUtils.equals(editable, h10Var.f34093w)) {
            h10Var.f34090n = !TextUtils.isEmpty(editable);
            h10Var.f34093w = org.telegram.ui.Components.x5.onlyEmojiSpans(editable);
            v00 v00Var = h10Var.I;
            if (v00Var != null) {
                v00Var.e(org.telegram.ui.Components.x5.cloneSpans(h10Var.f34093w, -1, v00Var.f38252s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            w00 w00Var = h10Var.J;
            if (w00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = w00Var.f38539r;
                if (h10.k0(h10Var.f34093w)) {
                    if (h10Var.f34094x) {
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
            kVar = ((org.telegram.ui.ActionBar.o2) h10Var).actionBar;
            CharSequence charSequence = h10Var.f34093w;
            kVar2 = ((org.telegram.ui.ActionBar.o2) h10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.x5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
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
