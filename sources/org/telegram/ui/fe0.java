package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fe0 implements TextWatcher {
    public final int f33651a = 0;
    public boolean f33652b;
    public final ViewGroup f33653c;

    public fe0(qg.v2 v2Var) {
        this.f33653c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f33651a) {
            case 0:
                ge0 ge0Var = (ge0) this.f33653c;
                if (this.f33652b) {
                    if (ge0Var.f33918f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ge0Var.f33924y) {
                            ge0Var.f33918f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f33918f, true, 0.1f, true);
                        return;
                    } else if (ge0Var.f33918f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ge0Var.f33918f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f33653c;
                qg.u2 u2Var = v2Var.f41964q0;
                if (this.f33652b && v2Var.f41970w0 > 0 && v2Var.f41971x0 > 0 && !v2Var.f41973z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f41971x0, v2Var.f41970w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f41972y0;
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
        switch (this.f33651a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f33652b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33651a;
    }

    public fe0(ge0 ge0Var, boolean z10) {
        this.f33653c = ge0Var;
        this.f33652b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
