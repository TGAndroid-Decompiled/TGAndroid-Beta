package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fq0 implements TextWatcher {
    public final sq0 f23066a;

    public fq0(sq0 sq0Var) {
        this.f23066a = sq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        sq0 sq0Var = this.f23066a;
        kq0 kq0Var = sq0Var.K;
        jx0 jx0Var = sq0Var.Q;
        k20 k20Var = sq0Var.f27198y0;
        if (!TextUtils.isEmpty(k20Var.f24572r.getText())) {
            sq0Var.K0(false);
        }
        if (sq0Var.A0) {
            String obj = k20Var.f24572r.getText().toString();
            if (obj.length() != 0) {
                if (jx0Var != null) {
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (sq0Var.F.getAdapter() != kq0Var) {
                int F0 = sq0.F0(sq0Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e(false, true);
                sq0Var.K0(false);
                kq0Var.l();
                if (F0 > 0) {
                    sq0Var.H.h1(0, -F0);
                }
            }
            oq0 oq0Var = sq0Var.M;
            if (oq0Var != null) {
                oq0Var.E(obj);
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
