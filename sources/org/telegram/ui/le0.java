package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f38312a = 0;
    public boolean f38313b;
    public final ViewGroup f38314c;

    public le0(rg.x2 x2Var) {
        this.f38314c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f38312a) {
            case 0:
                me0 me0Var = (me0) this.f38314c;
                if (this.f38313b) {
                    if (me0Var.f38682f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f38688y) {
                            me0Var.f38682f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38682f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f38682f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f38682f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.x2 x2Var = (rg.x2) this.f38314c;
                rg.w2 w2Var = x2Var.f45542q0;
                if (this.f38313b && x2Var.f45548w0 > 0 && x2Var.f45549x0 > 0 && !x2Var.f45551z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f45549x0, x2Var.f45548w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f45550y0;
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
        switch (this.f38312a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f38313b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38312a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f38314c = me0Var;
        this.f38313b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
