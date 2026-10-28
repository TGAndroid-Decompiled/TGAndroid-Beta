package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ar0 implements TextWatcher {
    public final nr0 f26648a;

    public ar0(nr0 nr0Var) {
        this.f26648a = nr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        nr0 nr0Var = this.f26648a;
        fr0 fr0Var = nr0Var.L;
        fy0 fy0Var = nr0Var.R;
        m20 m20Var = nr0Var.f31063z0;
        if (!TextUtils.isEmpty(m20Var.f30347r.getText())) {
            nr0Var.M0(false);
        }
        if (nr0Var.B0) {
            String obj = m20Var.f30347r.getText().toString();
            if (obj.length() != 0) {
                if (fy0Var != null) {
                    fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (nr0Var.G.getAdapter() != fr0Var) {
                int C0 = nr0.C0(nr0Var);
                fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                fy0Var.e(false, true);
                nr0Var.M0(false);
                fr0Var.l();
                if (C0 > 0) {
                    nr0Var.I.h1(0, -C0);
                }
            }
            jr0 jr0Var = nr0Var.N;
            if (jr0Var != null) {
                jr0Var.E(obj);
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
