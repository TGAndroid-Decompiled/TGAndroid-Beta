package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zp0 implements TextWatcher {
    public final mq0 f33937a;

    public zp0(mq0 mq0Var) {
        this.f33937a = mq0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        mq0 mq0Var = this.f33937a;
        eq0 eq0Var = mq0Var.H;
        ax0 ax0Var = mq0Var.N;
        d20 d20Var = mq0Var.f29223v0;
        if (!TextUtils.isEmpty(d20Var.f26172r.getText())) {
            mq0Var.K0(false);
        }
        if (mq0Var.f29227x0) {
            String obj = d20Var.f26172r.getText().toString();
            if (obj.length() != 0) {
                if (ax0Var != null) {
                    ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (mq0Var.C.getAdapter() != eq0Var) {
                int F0 = mq0.F0(mq0Var);
                ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ax0Var.e(false, true);
                mq0Var.K0(false);
                eq0Var.l();
                if (F0 > 0) {
                    mq0Var.E.h1(0, -F0);
                }
            }
            iq0 iq0Var = mq0Var.J;
            if (iq0Var != null) {
                iq0Var.E(obj);
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
