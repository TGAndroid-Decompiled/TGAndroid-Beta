package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f31297a = 1;
    public final boolean f31298b;
    public final float f31299c;
    public final float d;
    public final KeyEvent.Callback e;

    public oh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.f31299c = f7;
        this.d = f10;
        this.f31298b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31297a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.f33048o1;
                LinearLayout linearLayout2 = tiVar.f33054q1;
                float f11 = f7 / 500.0f;
                ei eiVar = tiVar.f33017e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.f33005a1.setAlpha(AndroidUtilities.lerp(this.f31299c, this.d, f11));
                tiVar.e2(tiVar.B0, 0);
                tiVar.e2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof cn) || this.f31298b) {
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
                cq0 cq0Var = (cq0) this.e;
                boolean z10 = this.f31298b;
                if (z10) {
                    if (f7 > this.f31299c / 2.0f || !cq0Var.f27243s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !cq0Var.f27242r) {
                    return;
                }
                cq0Var.f27243s = !z10;
                cq0Var.f27242r = z10;
                return;
        }
    }

    public oh(cq0 cq0Var, boolean z10, float f7, float f10) {
        this.e = cq0Var;
        this.f31298b = z10;
        this.f31299c = f7;
        this.d = f10;
    }
}
