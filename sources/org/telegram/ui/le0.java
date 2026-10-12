package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f39722a = 0;
    public boolean f39723b;
    public final ViewGroup f39724c;

    public le0(qg.w2 w2Var) {
        this.f39724c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f39722a) {
            case 0:
                me0 me0Var = (me0) this.f39724c;
                if (this.f39723b) {
                    if (me0Var.f40021f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f40027y) {
                            me0Var.f40021f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f40021f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f40021f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f40021f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg.w2 w2Var = (qg.w2) this.f39724c;
                qg.v2 v2Var = w2Var.f46546q0;
                if (this.f39723b && w2Var.f46552w0 > 0 && w2Var.f46553x0 > 0 && !w2Var.f46555z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46553x0, w2Var.f46552w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46554y0;
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
        switch (this.f39722a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f39723b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39722a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f39724c = me0Var;
        this.f39723b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
