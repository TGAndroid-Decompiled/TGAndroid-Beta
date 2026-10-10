package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ar0 implements TextWatcher {
    public final nr0 f24612a;

    public ar0(nr0 nr0Var) {
        this.f24612a = nr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        nr0 nr0Var = this.f24612a;
        fr0 fr0Var = nr0Var.K;
        by0 by0Var = nr0Var.Q;
        t20 t20Var = nr0Var.f29223y0;
        if (!TextUtils.isEmpty(t20Var.f30958r.getText())) {
            nr0Var.L0(false);
        }
        if (nr0Var.A0) {
            String obj = t20Var.f30958r.getText().toString();
            if (obj.length() != 0) {
                if (by0Var != null) {
                    by0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (nr0Var.F.getAdapter() != fr0Var) {
                int G0 = nr0.G0(nr0Var);
                by0Var.d.setText(LocaleController.getString(R.string.NoResult));
                by0Var.e(false, true);
                nr0Var.L0(false);
                fr0Var.l();
                if (G0 > 0) {
                    nr0Var.H.h1(0, -G0);
                }
            }
            jr0 jr0Var = nr0Var.M;
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
