package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class l00 implements TextWatcher {

    public final n00 f39908a;

    public l00(n00 n00Var) {
        this.f39908a = n00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string;
        q00 q00Var = this.f39908a.f40618e;
        if (!TextUtils.equals(editable, q00Var.f41479w)) {
            q00Var.f41476n = !TextUtils.isEmpty(editable);
            q00Var.f41479w = org.telegram.ui.Components.t5.onlyEmojiSpans(editable);
            e00 e00Var = q00Var.E;
            if (e00Var != null) {
                e00Var.e(org.telegram.ui.Components.t5.cloneSpans(q00Var.f41479w, -1, e00Var.f37581s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            f00 f00Var = q00Var.F;
            if (f00Var != null) {
                org.telegram.ui.Cells.r3 r3Var = f00Var.f37890r;
                if (q00.k0(q00Var.f41479w)) {
                    string = LocaleController.getString(q00Var.f41480x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                } else {
                    string = null;
                }
                r3Var.setText(string);
            }
            ((org.telegram.ui.ActionBar.n2) q00Var).actionBar.setTitle(org.telegram.ui.Components.t5.cloneSpans(q00Var.f41479w, -1, ((org.telegram.ui.ActionBar.n2) q00Var).actionBar.getTitleFontMetricsInt()));
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
