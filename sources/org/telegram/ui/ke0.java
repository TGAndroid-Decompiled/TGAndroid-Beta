package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ke0 implements TextWatcher {
    public final int f39303a = 0;
    public boolean f39304b;
    public final ViewGroup f39305c;

    public ke0(qg.w2 w2Var) {
        this.f39305c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39303a) {
            case 0:
                le0 le0Var = (le0) this.f39305c;
                if (this.f39304b) {
                    if (le0Var.f39598f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (le0Var.f39604y) {
                            le0Var.f39598f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39598f, true, 0.1f, true);
                        return;
                    } else if (le0Var.f39598f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(le0Var.f39598f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.w2 w2Var = (qg.w2) this.f39305c;
                qg.v2 v2Var = w2Var.f46653q0;
                if (this.f39304b && w2Var.f46659w0 > 0 && w2Var.f46660x0 > 0 && !w2Var.f46662z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46660x0, w2Var.f46659w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46661y0;
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
        switch (this.f39303a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39304b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39303a;
    }

    public ke0(le0 le0Var, boolean z10) {
        this.f39305c = le0Var;
        this.f39304b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
