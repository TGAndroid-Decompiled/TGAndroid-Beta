package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hq0 implements TextWatcher {
    public final uq0 f24737a;

    public hq0(uq0 uq0Var) {
        this.f24737a = uq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        uq0 uq0Var = this.f24737a;
        mq0 mq0Var = uq0Var.K;
        jx0 jx0Var = uq0Var.Q;
        b20 b20Var = uq0Var.f28836y0;
        if (!TextUtils.isEmpty(b20Var.f22856r.getText())) {
            uq0Var.K0(false);
        }
        if (uq0Var.A0) {
            String obj = b20Var.f22856r.getText().toString();
            if (obj.length() != 0) {
                if (jx0Var != null) {
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (uq0Var.F.getAdapter() != mq0Var) {
                int F0 = uq0.F0(uq0Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e(false, true);
                uq0Var.K0(false);
                mq0Var.l();
                if (F0 > 0) {
                    uq0Var.H.h1(0, -F0);
                }
            }
            qq0 qq0Var = uq0Var.M;
            if (qq0Var != null) {
                qq0Var.E(obj);
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
