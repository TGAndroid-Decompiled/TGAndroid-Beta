package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ne0 implements TextWatcher {
    public final int f36086a = 0;
    public boolean f36087b;
    public final ViewGroup f36088c;

    public ne0(qg.x2 x2Var) {
        this.f36088c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f36086a) {
            case 0:
                oe0 oe0Var = (oe0) this.f36088c;
                if (this.f36087b) {
                    if (oe0Var.f36324f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (oe0Var.f36330y) {
                            oe0Var.f36324f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36324f, true, 0.1f, true);
                        return;
                    } else if (oe0Var.f36324f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36324f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.x2 x2Var = (qg.x2) this.f36088c;
                qg.w2 w2Var = x2Var.f41733q0;
                if (this.f36087b && x2Var.f41739w0 > 0 && x2Var.f41740x0 > 0 && !x2Var.f41742z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f41740x0, x2Var.f41739w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f41741y0;
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
        switch (this.f36086a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f36087b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36086a;
    }

    public ne0(oe0 oe0Var, boolean z10) {
        this.f36088c = oe0Var;
        this.f36087b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
