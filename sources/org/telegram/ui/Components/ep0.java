package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ep0 implements TextWatcher {

    public final sp0 f28115a;

    public ep0(sp0 sp0Var) {
        this.f28115a = sp0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        sp0 sp0Var = this.f28115a;
        jp0 jp0Var = sp0Var.G;
        iw0 iw0Var = sp0Var.M;
        p10 p10Var = sp0Var.f32545u0;
        if (!TextUtils.isEmpty(p10Var.f31468r.getText())) {
            sp0Var.K0(false);
        }
        if (sp0Var.f32548w0) {
            String string = p10Var.f31468r.getText().toString();
            if (string.length() != 0) {
                if (iw0Var != null) {
                    iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (sp0Var.B.getAdapter() != jp0Var) {
                int iF0 = sp0.F0(sp0Var);
                iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                iw0Var.e(false, true);
                sp0Var.K0(false);
                jp0Var.l();
                if (iF0 > 0) {
                    sp0Var.D.h1(0, -iF0);
                }
            }
            op0 op0Var = sp0Var.I;
            if (op0Var != null) {
                op0Var.E(string);
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
