package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dh implements o1.g {
    public final int f26272a = 1;
    public final boolean f26273b;
    public final float f26274c;
    public final float d;
    public final KeyEvent.Callback f26275e;

    public dh(mi miVar, float f10, float f11, boolean z4) {
        this.f26275e = miVar;
        this.f26274c = f10;
        this.d = f11;
        this.f26273b = z4;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26272a) {
            case 0:
                mi miVar = (mi) this.f26275e;
                LinearLayout linearLayout = miVar.f29079i1;
                LinearLayout linearLayout2 = miVar.f29085k1;
                float f12 = f10 / 500.0f;
                miVar.f29054b0.set(miVar.f29118v0, Float.valueOf(f12));
                miVar.U0.setAlpha(AndroidUtilities.lerp(this.f26274c, this.d, f12));
                miVar.X1(miVar.f29118v0, 0);
                miVar.X1(miVar.f29122w0, 0);
                if (!(miVar.f29122w0 instanceof pm) || this.f26273b) {
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
                ap0 ap0Var = (ap0) this.f26275e;
                boolean z4 = this.f26273b;
                if (z4) {
                    if (f10 > this.f26274c / 2.0f || !ap0Var.f25344s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !ap0Var.f25343r) {
                    return;
                }
                ap0Var.f25344s = !z4;
                ap0Var.f25343r = z4;
                return;
        }
    }

    public dh(ap0 ap0Var, boolean z4, float f10, float f11) {
        this.f26275e = ap0Var;
        this.f26273b = z4;
        this.f26274c = f10;
        this.d = f11;
    }
}
