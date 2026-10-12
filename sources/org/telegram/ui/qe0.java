package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qe0 implements TextWatcher {
    public final int f39421a = 0;
    public boolean f39422b;
    public final ViewGroup f39423c;

    public qe0(rg.x2 x2Var) {
        this.f39423c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39421a) {
            case 0:
                re0 re0Var = (re0) this.f39423c;
                if (this.f39422b) {
                    if (re0Var.f39776f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (re0Var.f39782y) {
                            re0Var.f39776f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(re0Var.f39776f, true, 0.1f, true);
                        return;
                    } else if (re0Var.f39776f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(re0Var.f39776f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.x2 x2Var = (rg.x2) this.f39423c;
                rg.w2 w2Var = x2Var.f44595q0;
                if (this.f39422b && x2Var.f44601w0 > 0 && x2Var.f44602x0 > 0 && !x2Var.f44604z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f44602x0, x2Var.f44601w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f44603y0;
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
        switch (this.f39421a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39422b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39421a;
    }

    public qe0(re0 re0Var, boolean z10) {
        this.f39423c = re0Var;
        this.f39422b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
