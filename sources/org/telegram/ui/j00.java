package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j00 implements TextWatcher {
    public final l00 f40378a;

    public j00(l00 l00Var) {
        this.f40378a = l00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        String str;
        int i10;
        o00 o00Var = this.f40378a.e;
        if (!TextUtils.equals(editable, o00Var.f42061w)) {
            o00Var.f42058n = !TextUtils.isEmpty(editable);
            o00Var.f42061w = org.telegram.ui.Components.c6.onlyEmojiSpans(editable);
            c00 c00Var = o00Var.I;
            if (c00Var != null) {
                c00Var.e(org.telegram.ui.Components.c6.cloneSpans(o00Var.f42061w, -1, c00Var.f38196s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            d00 d00Var = o00Var.J;
            if (d00Var != null) {
                org.telegram.ui.Cells.y3 y3Var = d00Var.f38707r;
                if (o00.m0(o00Var.f42061w)) {
                    if (o00Var.f42062x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                y3Var.setText(str);
            }
            if (!o00Var.f42060s || !TextUtils.isEmpty(o00Var.f42061w)) {
                r5Var = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                CharSequence charSequence = o00Var.f42061w;
                r5Var2 = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                r5Var.setTitle(org.telegram.ui.Components.c6.cloneSpans(charSequence, -1, r5Var2.getTitleFontMetricsInt()));
            } else {
                r5Var3 = ((org.telegram.ui.ActionBar.r2) o00Var).simpleActionBar;
                r5Var3.setTitle(LocaleController.getString(R.string.FilterNew));
            }
        }
        o00Var.k0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
