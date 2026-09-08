package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f38339a = 0;
    public boolean f38340b;
    public final ViewGroup f38341c;

    public le0(rg.x2 x2Var) {
        this.f38341c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f38339a) {
            case 0:
                me0 me0Var = (me0) this.f38341c;
                if (this.f38340b) {
                    if (me0Var.f38709f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f38715y) {
                            me0Var.f38709f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38709f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f38709f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38709f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.x2 x2Var = (rg.x2) this.f38341c;
                rg.w2 w2Var = x2Var.f45570q0;
                if (this.f38340b && x2Var.f45576w0 > 0 && x2Var.f45577x0 > 0 && !x2Var.f45579z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f45577x0, x2Var.f45576w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f45578y0;
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
        switch (this.f38339a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f38340b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38339a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f38341c = me0Var;
        this.f38340b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
