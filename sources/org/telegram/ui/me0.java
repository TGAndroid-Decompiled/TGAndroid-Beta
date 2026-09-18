package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class me0 implements TextWatcher {
    public final int f35641a = 0;
    public boolean f35642b;
    public final ViewGroup f35643c;

    public me0(qg.u2 u2Var) {
        this.f35643c = u2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f35641a) {
            case 0:
                ne0 ne0Var = (ne0) this.f35643c;
                if (this.f35642b) {
                    if (ne0Var.f35916f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ne0Var.f35922y) {
                            ne0Var.f35916f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ne0Var.f35916f, true, 0.1f, true);
                        return;
                    } else if (ne0Var.f35916f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ne0Var.f35916f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.u2 u2Var = (qg.u2) this.f35643c;
                qg.t2 t2Var = u2Var.f41929q0;
                if (this.f35642b && u2Var.f41935w0 > 0 && u2Var.f41936x0 > 0 && !u2Var.f41938z0 && t2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = t2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * u2Var.getBaseFontSize()), u2Var.f41936x0, u2Var.f41935w0)) != u2Var.getBaseFontSize()) {
                        u2Var.setBaseFontSize(clamp);
                        Runnable runnable = u2Var.f41937y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                u2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f35641a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f35642b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35641a;
    }

    public me0(ne0 ne0Var, boolean z10) {
        this.f35643c = ne0Var;
        this.f35642b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
