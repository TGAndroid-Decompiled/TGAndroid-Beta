package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ne0 implements TextWatcher {
    public final int f36020a = 0;
    public boolean f36021b;
    public final ViewGroup f36022c;

    public ne0(qg.v2 v2Var) {
        this.f36022c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f36020a) {
            case 0:
                oe0 oe0Var = (oe0) this.f36022c;
                if (this.f36021b) {
                    if (oe0Var.f36306f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (oe0Var.f36312y) {
                            oe0Var.f36306f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36306f, true, 0.1f, true);
                        return;
                    } else if (oe0Var.f36306f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36306f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f36022c;
                qg.u2 u2Var = v2Var.f41998q0;
                if (this.f36021b && v2Var.f42004w0 > 0 && v2Var.f42005x0 > 0 && !v2Var.f42007z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f42005x0, v2Var.f42004w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f42006y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                v2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f36020a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f36021b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36020a;
    }

    public ne0(oe0 oe0Var, boolean z10) {
        this.f36022c = oe0Var;
        this.f36021b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
