package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 implements TextWatcher {
    public final ir0 f32041a;

    public vq0(ir0 ir0Var) {
        this.f32041a = ir0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ir0 ir0Var = this.f32041a;
        ar0 ar0Var = ir0Var.L;
        wx0 wx0Var = ir0Var.R;
        k20 k20Var = ir0Var.f27442z0;
        if (!TextUtils.isEmpty(k20Var.f27836r.getText())) {
            ir0Var.P0(false);
        }
        if (ir0Var.B0) {
            String obj = k20Var.f27836r.getText().toString();
            if (obj.length() != 0) {
                if (wx0Var != null) {
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (ir0Var.G.getAdapter() != ar0Var) {
                int O0 = ir0.O0(ir0Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e(false, true);
                ir0Var.P0(false);
                ar0Var.l();
                if (O0 > 0) {
                    ir0Var.I.h1(0, -O0);
                }
            }
            er0 er0Var = ir0Var.N;
            if (er0Var != null) {
                er0Var.E(obj);
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
