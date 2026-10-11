package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class br0 implements TextWatcher {
    public final or0 f25009a;

    public br0(or0 or0Var) {
        this.f25009a = or0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        or0 or0Var = this.f25009a;
        gr0 gr0Var = or0Var.K;
        cy0 cy0Var = or0Var.Q;
        t20 t20Var = or0Var.f29508y0;
        if (!TextUtils.isEmpty(t20Var.f30964r.getText())) {
            or0Var.L0(false);
        }
        if (or0Var.A0) {
            String obj = t20Var.f30964r.getText().toString();
            if (obj.length() != 0) {
                if (cy0Var != null) {
                    cy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (or0Var.F.getAdapter() != gr0Var) {
                int G0 = or0.G0(or0Var);
                cy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                cy0Var.e(false, true);
                or0Var.L0(false);
                gr0Var.l();
                if (G0 > 0) {
                    or0Var.H.h1(0, -G0);
                }
            }
            kr0 kr0Var = or0Var.M;
            if (kr0Var != null) {
                kr0Var.E(obj);
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
