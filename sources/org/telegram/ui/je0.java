package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class je0 implements TextWatcher {
    public final int f37677a = 0;
    public boolean f37678b;
    public final ViewGroup f37679c;

    public je0(qg.v2 v2Var) {
        this.f37679c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f37677a) {
            case 0:
                ke0 ke0Var = (ke0) this.f37679c;
                if (this.f37678b) {
                    if (ke0Var.f37985f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ke0Var.f37991y) {
                            ke0Var.f37985f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f37985f, true, 0.1f, true);
                        return;
                    } else if (ke0Var.f37985f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ke0Var.f37985f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.v2 v2Var = (qg.v2) this.f37679c;
                qg.u2 u2Var = v2Var.f45380q0;
                if (this.f37678b && v2Var.f45386w0 > 0 && v2Var.f45387x0 > 0 && !v2Var.f45389z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f45387x0, v2Var.f45386w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f45388y0;
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
        switch (this.f37677a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f37678b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37677a;
    }

    public je0(ke0 ke0Var, boolean z10) {
        this.f37679c = ke0Var;
        this.f37678b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
