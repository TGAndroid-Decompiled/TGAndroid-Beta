package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class je0 implements TextWatcher {
    public final int f39021a = 0;
    public boolean f39022b;
    public final ViewGroup f39023c;

    public je0(qg.v2 v2Var) {
        this.f39023c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39021a) {
            case 0:
                ke0 ke0Var = (ke0) this.f39023c;
                if (this.f39022b) {
                    if (ke0Var.f39314f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ke0Var.f39320y) {
                            ke0Var.f39314f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f39314f, true, 0.1f, true);
                        return;
                    } else if (ke0Var.f39314f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f39314f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f39023c;
                qg.u2 u2Var = v2Var.f46663q0;
                if (this.f39022b && v2Var.f46669w0 > 0 && v2Var.f46670x0 > 0 && !v2Var.f46672z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f46670x0, v2Var.f46669w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f46671y0;
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
        switch (this.f39021a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39022b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39021a;
    }

    public je0(ke0 ke0Var, boolean z10) {
        this.f39023c = ke0Var;
        this.f39022b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
