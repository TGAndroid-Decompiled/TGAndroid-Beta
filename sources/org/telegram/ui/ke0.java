package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ke0 implements TextWatcher {
    public final int f39257a = 0;
    public boolean f39258b;
    public final ViewGroup f39259c;

    public ke0(qg.w2 w2Var) {
        this.f39259c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39257a) {
            case 0:
                le0 le0Var = (le0) this.f39259c;
                if (this.f39258b) {
                    if (le0Var.f39552f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (le0Var.f39558y) {
                            le0Var.f39552f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39552f, true, 0.1f, true);
                        return;
                    } else if (le0Var.f39552f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39552f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.w2 w2Var = (qg.w2) this.f39259c;
                qg.v2 v2Var = w2Var.f46607q0;
                if (this.f39258b && w2Var.f46613w0 > 0 && w2Var.f46614x0 > 0 && !w2Var.f46616z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46614x0, w2Var.f46613w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46615y0;
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
        switch (this.f39257a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39258b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39257a;
    }

    public ke0(le0 le0Var, boolean z10) {
        this.f39259c = le0Var;
        this.f39258b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
