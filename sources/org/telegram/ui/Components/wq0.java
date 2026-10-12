package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wq0 implements TextWatcher {
    public final jr0 f30947a;

    public wq0(jr0 jr0Var) {
        this.f30947a = jr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        jr0 jr0Var = this.f30947a;
        br0 br0Var = jr0Var.K;
        wx0 wx0Var = jr0Var.Q;
        o20 o20Var = jr0Var.f26489y0;
        if (!TextUtils.isEmpty(o20Var.f27815r.getText())) {
            jr0Var.L0(false);
        }
        if (jr0Var.A0) {
            String obj = o20Var.f27815r.getText().toString();
            if (obj.length() != 0) {
                if (wx0Var != null) {
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (jr0Var.F.getAdapter() != br0Var) {
                int G0 = jr0.G0(jr0Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e(false, true);
                jr0Var.L0(false);
                br0Var.l();
                if (G0 > 0) {
                    jr0Var.H.h1(0, -G0);
                }
            }
            fr0 fr0Var = jr0Var.M;
            if (fr0Var != null) {
                fr0Var.E(obj);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
