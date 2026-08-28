package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dh implements o1.g {
    public final int f27735a = 1;
    public final boolean f27736b;
    public final float f27737c;
    public final float d;
    public final KeyEvent.Callback f27738e;

    public dh(ki kiVar, float f10, float f11, boolean z10) {
        this.f27738e = kiVar;
        this.f27737c = f10;
        this.d = f11;
        this.f27736b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f27735a) {
            case 0:
                ki kiVar = (ki) this.f27738e;
                LinearLayout linearLayout = kiVar.f30121h1;
                LinearLayout linearLayout2 = kiVar.f30127j1;
                float f12 = f10 / 500.0f;
                kiVar.f30096a0.set(kiVar.f30160u0, Float.valueOf(f12));
                kiVar.T0.setAlpha(AndroidUtilities.lerp(this.f27737c, this.d, f12));
                kiVar.X1(kiVar.f30160u0, 0);
                kiVar.X1(kiVar.f30163v0, 0);
                if (!(kiVar.f30163v0 instanceof hm) || this.f27736b) {
                    f12 = 1.0f - f12;
                }
                float clamp = Utilities.clamp(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f13 = 1.0f - clamp;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f13 * AndroidUtilities.dp(16.0f));
                return;
            default:
                fo0 fo0Var = (fo0) this.f27738e;
                boolean z10 = this.f27736b;
                if (z10) {
                    if (f10 > this.f27737c / 2.0f || !fo0Var.f28536s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !fo0Var.f28535r) {
                    return;
                }
                fo0Var.f28536s = !z10;
                fo0Var.f28535r = z10;
                return;
        }
    }

    public dh(fo0 fo0Var, boolean z10, float f10, float f11) {
        this.f27738e = fo0Var;
        this.f27736b = z10;
        this.f27737c = f10;
        this.d = f11;
    }
}
