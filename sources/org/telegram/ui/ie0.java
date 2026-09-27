package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ie0 implements TextWatcher {
    public final int f34455a = 0;
    public boolean f34456b;
    public final ViewGroup f34457c;

    public ie0(qg.v2 v2Var) {
        this.f34457c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f34455a) {
            case 0:
                je0 je0Var = (je0) this.f34457c;
                if (this.f34456b) {
                    if (je0Var.f34719f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (je0Var.f34725y) {
                            je0Var.f34719f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(je0Var.f34719f, true, 0.1f, true);
                        return;
                    } else if (je0Var.f34719f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(je0Var.f34719f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f34457c;
                qg.u2 u2Var = v2Var.f41994q0;
                if (this.f34456b && v2Var.f42000w0 > 0 && v2Var.f42001x0 > 0 && !v2Var.f42003z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f42001x0, v2Var.f42000w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f42002y0;
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
        switch (this.f34455a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f34456b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34455a;
    }

    public ie0(je0 je0Var, boolean z10) {
        this.f34457c = je0Var;
        this.f34456b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
