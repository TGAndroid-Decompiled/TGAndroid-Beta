package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 implements TextWatcher {
    public final ir0 f30295a;

    public vq0(ir0 ir0Var) {
        this.f30295a = ir0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ir0 ir0Var = this.f30295a;
        ar0 ar0Var = ir0Var.K;
        wx0 wx0Var = ir0Var.Q;
        o20 o20Var = ir0Var.f25772y0;
        if (!TextUtils.isEmpty(o20Var.f27510r.getText())) {
            ir0Var.L0(false);
        }
        if (ir0Var.A0) {
            String obj = o20Var.f27510r.getText().toString();
            if (obj.length() != 0) {
                if (wx0Var != null) {
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (ir0Var.F.getAdapter() != ar0Var) {
                int G0 = ir0.G0(ir0Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e(false, true);
                ir0Var.L0(false);
                ar0Var.l();
                if (G0 > 0) {
                    ir0Var.H.h1(0, -G0);
                }
            }
            er0 er0Var = ir0Var.M;
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
