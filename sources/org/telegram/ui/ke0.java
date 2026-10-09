package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ke0 implements TextWatcher {
    public final int f39259a = 0;
    public boolean f39260b;
    public final ViewGroup f39261c;

    public ke0(qg.w2 w2Var) {
        this.f39261c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39259a) {
            case 0:
                le0 le0Var = (le0) this.f39261c;
                if (this.f39260b) {
                    if (le0Var.f39554f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (le0Var.f39560y) {
                            le0Var.f39554f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39554f, true, 0.1f, true);
                        return;
                    } else if (le0Var.f39554f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39554f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.w2 w2Var = (qg.w2) this.f39261c;
                qg.v2 v2Var = w2Var.f46609q0;
                if (this.f39260b && w2Var.f46615w0 > 0 && w2Var.f46616x0 > 0 && !w2Var.f46618z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46616x0, w2Var.f46615w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46617y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                w2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f39259a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39260b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39259a;
    }

    public ke0(le0 le0Var, boolean z10) {
        this.f39261c = le0Var;
        this.f39260b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
