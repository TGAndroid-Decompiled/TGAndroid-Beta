package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class up0 implements TextWatcher {
    public final hq0 f30934a;

    public up0(hq0 hq0Var) {
        this.f30934a = hq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        hq0 hq0Var = this.f30934a;
        zp0 zp0Var = hq0Var.K;
        xw0 xw0Var = hq0Var.Q;
        b20 b20Var = hq0Var.f26820y0;
        if (!TextUtils.isEmpty(b20Var.f24522r.getText())) {
            hq0Var.K0(false);
        }
        if (hq0Var.A0) {
            String obj = b20Var.f24522r.getText().toString();
            if (obj.length() != 0) {
                if (xw0Var != null) {
                    xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (hq0Var.F.getAdapter() != zp0Var) {
                int F0 = hq0.F0(hq0Var);
                xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                xw0Var.e(false, true);
                hq0Var.K0(false);
                zp0Var.l();
                if (F0 > 0) {
                    hq0Var.H.h1(0, -F0);
                }
            }
            dq0 dq0Var = hq0Var.M;
            if (dq0Var != null) {
                dq0Var.E(obj);
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
