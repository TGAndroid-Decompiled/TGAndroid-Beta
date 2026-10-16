package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oe0 implements TextWatcher {
    public final int f38629a = 0;
    public boolean f38630b;
    public final ViewGroup f38631c;

    public oe0(rg.x2 x2Var) {
        this.f38631c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f38629a) {
            case 0:
                pe0 pe0Var = (pe0) this.f38631c;
                if (this.f38630b) {
                    if (pe0Var.f38897f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (pe0Var.f38903y) {
                            pe0Var.f38897f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(pe0Var.f38897f, true, 0.1f, true);
                        return;
                    } else if (pe0Var.f38897f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(pe0Var.f38897f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.x2 x2Var = (rg.x2) this.f38631c;
                rg.w2 w2Var = x2Var.f44354q0;
                if (this.f38630b && x2Var.f44360w0 > 0 && x2Var.f44361x0 > 0 && !x2Var.f44363z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f44361x0, x2Var.f44360w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f44362y0;
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
        switch (this.f38629a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f38630b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38629a;
    }

    public oe0(pe0 pe0Var, boolean z10) {
        this.f38631c = pe0Var;
        this.f38630b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
