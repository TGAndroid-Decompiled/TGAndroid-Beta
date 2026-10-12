package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f39716a = 0;
    public boolean f39717b;
    public final ViewGroup f39718c;

    public le0(qg.w2 w2Var) {
        this.f39718c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39716a) {
            case 0:
                me0 me0Var = (me0) this.f39718c;
                if (this.f39717b) {
                    if (me0Var.f40024f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f40030y) {
                            me0Var.f40024f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f40024f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f40024f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f40024f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.w2 w2Var = (qg.w2) this.f39718c;
                qg.v2 v2Var = w2Var.f46554q0;
                if (this.f39717b && w2Var.f46560w0 > 0 && w2Var.f46561x0 > 0 && !w2Var.f46563z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46561x0, w2Var.f46560w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46562y0;
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
        switch (this.f39716a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39717b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39716a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f39718c = me0Var;
        this.f39717b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
