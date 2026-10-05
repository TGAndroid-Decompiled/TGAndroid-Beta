package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oq0 implements TextWatcher {
    public final br0 f29535a;

    public oq0(br0 br0Var) {
        this.f29535a = br0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        br0 br0Var = this.f29535a;
        tq0 tq0Var = br0Var.K;
        ux0 ux0Var = br0Var.Q;
        f20 f20Var = br0Var.f25084y0;
        if (!TextUtils.isEmpty(f20Var.f26295r.getText())) {
            br0Var.H0(false);
        }
        if (br0Var.A0) {
            String obj = f20Var.f26295r.getText().toString();
            if (obj.length() != 0) {
                if (ux0Var != null) {
                    ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (br0Var.F.getAdapter() != tq0Var) {
                int s02 = br0.s0(br0Var);
                ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ux0Var.e(false, true);
                br0Var.H0(false);
                tq0Var.l();
                if (s02 > 0) {
                    br0Var.H.h1(0, -s02);
                }
            }
            xq0 xq0Var = br0Var.M;
            if (xq0Var != null) {
                xq0Var.E(obj);
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
