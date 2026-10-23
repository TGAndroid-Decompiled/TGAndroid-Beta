package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sq0 implements TextWatcher {
    public final fr0 f30346a;

    public sq0(fr0 fr0Var) {
        this.f30346a = fr0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        fr0 fr0Var = this.f30346a;
        xq0 xq0Var = fr0Var.L;
        tx0 tx0Var = fr0Var.R;
        k20 k20Var = fr0Var.f26401z0;
        if (!TextUtils.isEmpty(k20Var.f27730r.getText())) {
            fr0Var.M0(false);
        }
        if (fr0Var.B0) {
            String obj = k20Var.f27730r.getText().toString();
            if (obj.length() != 0) {
                if (tx0Var != null) {
                    tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (fr0Var.G.getAdapter() != xq0Var) {
                int J0 = fr0.J0(fr0Var);
                tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                tx0Var.e(false, true);
                fr0Var.M0(false);
                xq0Var.l();
                if (J0 > 0) {
                    fr0Var.I.h1(0, -J0);
                }
            }
            br0 br0Var = fr0Var.N;
            if (br0Var != null) {
                br0Var.E(obj);
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
