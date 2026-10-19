package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rq0 implements TextWatcher {
    public final er0 f30022a;

    public rq0(er0 er0Var) {
        this.f30022a = er0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        er0 er0Var = this.f30022a;
        wq0 wq0Var = er0Var.L;
        sx0 sx0Var = er0Var.R;
        k20 k20Var = er0Var.f26009z0;
        if (!TextUtils.isEmpty(k20Var.f27686r.getText())) {
            er0Var.M0(false);
        }
        if (er0Var.B0) {
            String obj = k20Var.f27686r.getText().toString();
            if (obj.length() != 0) {
                if (sx0Var != null) {
                    sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (er0Var.G.getAdapter() != wq0Var) {
                int J0 = er0.J0(er0Var);
                sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                sx0Var.e(false, true);
                er0Var.M0(false);
                wq0Var.l();
                if (J0 > 0) {
                    er0Var.I.h1(0, -J0);
                }
            }
            ar0 ar0Var = er0Var.N;
            if (ar0Var != null) {
                ar0Var.E(obj);
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
