package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iq0 implements TextWatcher {
    public final vq0 f25173a;

    public iq0(vq0 vq0Var) {
        this.f25173a = vq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        vq0 vq0Var = this.f25173a;
        nq0 nq0Var = vq0Var.K;
        jx0 jx0Var = vq0Var.Q;
        d20 d20Var = vq0Var.f29747y0;
        if (!TextUtils.isEmpty(d20Var.f23475r.getText())) {
            vq0Var.K0(false);
        }
        if (vq0Var.A0) {
            String obj = d20Var.f23475r.getText().toString();
            if (obj.length() != 0) {
                if (jx0Var != null) {
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (vq0Var.F.getAdapter() != nq0Var) {
                int F0 = vq0.F0(vq0Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e(false, true);
                vq0Var.K0(false);
                nq0Var.l();
                if (F0 > 0) {
                    vq0Var.H.h1(0, -F0);
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
