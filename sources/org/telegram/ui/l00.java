package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l00 implements TextWatcher {
    public final n00 f40944a;

    public l00(n00 n00Var) {
        this.f40944a = n00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        String str;
        int i10;
        q00 q00Var = this.f40944a.e;
        if (!TextUtils.equals(editable, q00Var.f42562w)) {
            q00Var.f42559n = !TextUtils.isEmpty(editable);
            q00Var.f42562w = org.telegram.ui.Components.c6.onlyEmojiSpans(editable);
            e00 e00Var = q00Var.I;
            if (e00Var != null) {
                e00Var.e(org.telegram.ui.Components.c6.cloneSpans(q00Var.f42562w, -1, e00Var.f38722s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            f00 f00Var = q00Var.J;
            if (f00Var != null) {
                org.telegram.ui.Cells.y3 y3Var = f00Var.f39119r;
                if (q00.m0(q00Var.f42562w)) {
                    if (q00Var.f42563x) {
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
            if (!q00Var.f42561s || !TextUtils.isEmpty(q00Var.f42562w)) {
                r5Var = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                CharSequence charSequence = q00Var.f42562w;
                r5Var2 = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                r5Var.setTitle(org.telegram.ui.Components.c6.cloneSpans(charSequence, -1, r5Var2.getTitleFontMetricsInt()));
            } else {
                r5Var3 = ((org.telegram.ui.ActionBar.r2) q00Var).simpleActionBar;
                r5Var3.setTitle(LocaleController.getString(R.string.FilterNew));
            }
        }
        q00Var.k0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
