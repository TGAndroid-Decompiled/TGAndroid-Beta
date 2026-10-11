package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class je0 implements TextWatcher {
    public final int f39055a = 0;
    public boolean f39056b;
    public final ViewGroup f39057c;

    public je0(qg.v2 v2Var) {
        this.f39057c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39055a) {
            case 0:
                ke0 ke0Var = (ke0) this.f39057c;
                if (this.f39056b) {
                    if (ke0Var.f39348f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ke0Var.f39354y) {
                            ke0Var.f39348f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f39348f, true, 0.1f, true);
                        return;
                    } else if (ke0Var.f39348f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f39348f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f39057c;
                qg.u2 u2Var = v2Var.f46697q0;
                if (this.f39056b && v2Var.f46703w0 > 0 && v2Var.f46704x0 > 0 && !v2Var.f46706z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f46704x0, v2Var.f46703w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f46705y0;
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
        switch (this.f39055a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39056b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39055a;
    }

    public je0(ke0 ke0Var, boolean z10) {
        this.f39057c = ke0Var;
        this.f39056b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
