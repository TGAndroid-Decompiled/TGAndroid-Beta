package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ne0 implements TextWatcher {
    public final int f35999a = 0;
    public boolean f36000b;
    public final ViewGroup f36001c;

    public ne0(qg.v2 v2Var) {
        this.f36001c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f35999a) {
            case 0:
                oe0 oe0Var = (oe0) this.f36001c;
                if (this.f36000b) {
                    if (oe0Var.f36288f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (oe0Var.f36294y) {
                            oe0Var.f36288f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36288f, true, 0.1f, true);
                        return;
                    } else if (oe0Var.f36288f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oe0Var.f36288f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f36001c;
                qg.u2 u2Var = v2Var.f41977q0;
                if (this.f36000b && v2Var.f41983w0 > 0 && v2Var.f41984x0 > 0 && !v2Var.f41986z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f41984x0, v2Var.f41983w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f41985y0;
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
        switch (this.f35999a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f36000b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35999a;
    }

    public ne0(oe0 oe0Var, boolean z10) {
        this.f36001c = oe0Var;
        this.f36000b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
