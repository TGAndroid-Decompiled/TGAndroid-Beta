package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qh implements o1.g {
    public final int f30154a = 1;
    public final boolean f30155b;
    public final float f30156c;
    public final float d;
    public final KeyEvent.Callback f30157e;

    public qh(yi yiVar, float f7, float f10, boolean z10) {
        this.f30157e = yiVar;
        this.f30156c = f7;
        this.d = f10;
        this.f30155b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30154a) {
            case 0:
                yi yiVar = (yi) this.f30157e;
                LinearLayout linearLayout = yiVar.f33243o1;
                LinearLayout linearLayout2 = yiVar.f33249q1;
                float f11 = f7 / 500.0f;
                mi miVar = yiVar.f33212e0;
                qi qiVar = yiVar.B0;
                Float valueOf = Float.valueOf(f11);
                miVar.getClass();
                miVar.a(qiVar, valueOf);
                yiVar.f33199a1.setAlpha(AndroidUtilities.lerp(this.f30156c, this.d, f11));
                yiVar.b2(yiVar.B0, 0);
                yiVar.b2(yiVar.C0, 0);
                if (!(yiVar.C0 instanceof hn) || this.f30155b) {
                    f11 = 1.0f - f11;
                }
                float clamp = Utilities.clamp(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f12 = 1.0f - clamp;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f12 * AndroidUtilities.dp(16.0f));
                return;
            default:
                dq0 dq0Var = (dq0) this.f30157e;
                boolean z10 = this.f30155b;
                if (z10) {
                    if (f7 > this.f30156c / 2.0f || !dq0Var.f25666s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !dq0Var.f25665r) {
                    return;
                }
                dq0Var.f25666s = !z10;
                dq0Var.f25665r = z10;
                return;
        }
    }

    public qh(dq0 dq0Var, boolean z10, float f7, float f10) {
        this.f30157e = dq0Var;
        this.f30155b = z10;
        this.f30156c = f7;
        this.d = f10;
    }
}
