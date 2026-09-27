package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iq0 implements TextWatcher {
    public final vq0 f25213a;

    public iq0(vq0 vq0Var) {
        this.f25213a = vq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        vq0 vq0Var = this.f25213a;
        nq0 nq0Var = vq0Var.K;
        kx0 kx0Var = vq0Var.Q;
        e20 e20Var = vq0Var.f29772y0;
        if (!TextUtils.isEmpty(e20Var.f23850r.getText())) {
            vq0Var.H0(false);
        }
        if (vq0Var.A0) {
            String obj = e20Var.f23850r.getText().toString();
            if (obj.length() != 0) {
                if (kx0Var != null) {
                    kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (vq0Var.F.getAdapter() != nq0Var) {
                int s02 = vq0.s0(vq0Var);
                kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                kx0Var.e(false, true);
                vq0Var.H0(false);
                nq0Var.l();
                if (s02 > 0) {
                    vq0Var.H.h1(0, -s02);
                }
            }
            rq0 rq0Var = vq0Var.M;
            if (rq0Var != null) {
                rq0Var.E(obj);
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
