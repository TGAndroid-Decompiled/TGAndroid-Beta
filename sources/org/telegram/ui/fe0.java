package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fe0 implements TextWatcher {
    public final int f33635a = 0;
    public boolean f33636b;
    public final ViewGroup f33637c;

    public fe0(qg.v2 v2Var) {
        this.f33637c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f33635a) {
            case 0:
                ge0 ge0Var = (ge0) this.f33637c;
                if (this.f33636b) {
                    if (ge0Var.f33902f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ge0Var.f33908y) {
                            ge0Var.f33902f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f33902f, true, 0.1f, true);
                        return;
                    } else if (ge0Var.f33902f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f33902f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f33637c;
                qg.u2 u2Var = v2Var.f41949q0;
                if (this.f33636b && v2Var.f41955w0 > 0 && v2Var.f41956x0 > 0 && !v2Var.f41958z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f41956x0, v2Var.f41955w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f41957y0;
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
        switch (this.f33635a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f33636b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33635a;
    }

    public fe0(ge0 ge0Var, boolean z10) {
        this.f33637c = ge0Var;
        this.f33636b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
