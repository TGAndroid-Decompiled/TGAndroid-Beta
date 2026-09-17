package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f38313a = 0;
    public boolean f38314b;
    public final ViewGroup f38315c;

    public le0(rg.x2 x2Var) {
        this.f38315c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f38313a) {
            case 0:
                me0 me0Var = (me0) this.f38315c;
                if (this.f38314b) {
                    if (me0Var.f38683f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f38689y) {
                            me0Var.f38683f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38683f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f38683f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38683f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.x2 x2Var = (rg.x2) this.f38315c;
                rg.w2 w2Var = x2Var.f45543q0;
                if (this.f38314b && x2Var.f45549w0 > 0 && x2Var.f45550x0 > 0 && !x2Var.f45552z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f45550x0, x2Var.f45549w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f45551y0;
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
        switch (this.f38313a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f38314b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38313a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f38315c = me0Var;
        this.f38314b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
