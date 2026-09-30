package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kq0 implements TextWatcher {
    public final xq0 f25811a;

    public kq0(xq0 xq0Var) {
        this.f25811a = xq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        xq0 xq0Var = this.f25811a;
        pq0 pq0Var = xq0Var.K;
        lx0 lx0Var = xq0Var.Q;
        f20 f20Var = xq0Var.f30486y0;
        if (!TextUtils.isEmpty(f20Var.f24137r.getText())) {
            xq0Var.K0(false);
        }
        if (xq0Var.A0) {
            String obj = f20Var.f24137r.getText().toString();
            if (obj.length() != 0) {
                if (lx0Var != null) {
                    lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (xq0Var.F.getAdapter() != pq0Var) {
                int F0 = xq0.F0(xq0Var);
                lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                lx0Var.e(false, true);
                xq0Var.K0(false);
                pq0Var.l();
                if (F0 > 0) {
                    xq0Var.H.h1(0, -F0);
                }
            }
            tq0 tq0Var = xq0Var.M;
            if (tq0Var != null) {
                tq0Var.E(obj);
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
