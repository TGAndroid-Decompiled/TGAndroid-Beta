package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dh implements o1.g {
    public final int f24268a = 1;
    public final boolean f24269b;
    public final float f24270c;
    public final float d;
    public final KeyEvent.Callback e;

    public dh(li liVar, float f10, float f11, boolean z4) {
        this.e = liVar;
        this.f24270c = f10;
        this.d = f11;
        this.f24269b = z4;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f24268a) {
            case 0:
                li liVar = (li) this.e;
                LinearLayout linearLayout = liVar.f26709i1;
                LinearLayout linearLayout2 = liVar.f26715k1;
                float f12 = f10 / 500.0f;
                liVar.f26685b0.set(liVar.f26748v0, Float.valueOf(f12));
                liVar.U0.setAlpha(AndroidUtilities.lerp(this.f24270c, this.d, f12));
                liVar.X1(liVar.f26748v0, 0);
                liVar.X1(liVar.f26752w0, 0);
                if (!(liVar.f26752w0 instanceof om) || this.f24269b) {
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
                ap0 ap0Var = (ap0) this.e;
                boolean z4 = this.f24269b;
                if (z4) {
                    if (f10 > this.f24270c / 2.0f || !ap0Var.f23491s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !ap0Var.f23490r) {
                    return;
                }
                ap0Var.f23491s = !z4;
                ap0Var.f23490r = z4;
                return;
        }
    }

    public dh(ap0 ap0Var, boolean z4, float f10, float f11) {
        this.e = ap0Var;
        this.f24269b = z4;
        this.f24270c = f10;
        this.d = f11;
    }
}
