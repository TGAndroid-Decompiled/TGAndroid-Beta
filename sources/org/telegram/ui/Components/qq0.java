package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qq0 implements TextWatcher {
    public final dr0 f29723a;

    public qq0(dr0 dr0Var) {
        this.f29723a = dr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        dr0 dr0Var = this.f29723a;
        vq0 vq0Var = dr0Var.K;
        rx0 rx0Var = dr0Var.Q;
        k20 k20Var = dr0Var.f25684y0;
        if (!TextUtils.isEmpty(k20Var.f27712r.getText())) {
            dr0Var.L0(false);
        }
        if (dr0Var.A0) {
            String obj = k20Var.f27712r.getText().toString();
            if (obj.length() != 0) {
                if (rx0Var != null) {
                    rx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (dr0Var.F.getAdapter() != vq0Var) {
                int G0 = dr0.G0(dr0Var);
                rx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                rx0Var.e(false, true);
                dr0Var.L0(false);
                vq0Var.l();
                if (G0 > 0) {
                    dr0Var.H.h1(0, -G0);
                }
            }
            zq0 zq0Var = dr0Var.M;
            if (zq0Var != null) {
                zq0Var.E(obj);
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
