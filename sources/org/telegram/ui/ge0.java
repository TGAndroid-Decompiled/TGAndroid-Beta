package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ge0 implements TextWatcher {
    public final int f33539a = 0;
    public boolean f33540b;
    public final ViewGroup f33541c;

    public ge0(qg.x2 x2Var) {
        this.f33541c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f33539a) {
            case 0:
                he0 he0Var = (he0) this.f33541c;
                if (this.f33540b) {
                    if (he0Var.f33831f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (he0Var.f33837y) {
                            he0Var.f33831f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(he0Var.f33831f, true, 0.1f, true);
                        return;
                    } else if (he0Var.f33831f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(he0Var.f33831f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.x2 x2Var = (qg.x2) this.f33541c;
                qg.w2 w2Var = x2Var.f41658q0;
                if (this.f33540b && x2Var.f41664w0 > 0 && x2Var.f41665x0 > 0 && !x2Var.f41667z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f41665x0, x2Var.f41664w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f41666y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                x2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f33539a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f33540b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33539a;
    }

    public ge0(he0 he0Var, boolean z10) {
        this.f33541c = he0Var;
        this.f33540b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
