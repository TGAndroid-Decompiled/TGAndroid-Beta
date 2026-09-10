package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class le0 implements TextWatcher {
    public final int f34688a = 0;
    public boolean f34689b;
    public final ViewGroup f34690c;

    public le0(pg.v2 v2Var) {
        this.f34690c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f34688a) {
            case 0:
                me0 me0Var = (me0) this.f34690c;
                if (this.f34689b) {
                    if (me0Var.f34927f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (me0Var.f34933y) {
                            me0Var.f34927f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f34927f, true, 0.1f, true);
                        return;
                    } else if (me0Var.f34927f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(me0Var.f34927f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                pg.v2 v2Var = (pg.v2) this.f34690c;
                pg.u2 u2Var = v2Var.f40322q0;
                if (this.f34689b && v2Var.f40328w0 > 0 && v2Var.f40329x0 > 0 && !v2Var.f40331z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f40329x0, v2Var.f40328w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f40330y0;
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
        switch (this.f34688a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f34689b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34688a;
    }

    public le0(me0 me0Var, boolean z10) {
        this.f34690c = me0Var;
        this.f34689b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
