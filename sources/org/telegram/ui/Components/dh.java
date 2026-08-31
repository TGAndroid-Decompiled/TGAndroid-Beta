package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dh implements o1.g {
    public final int f26269a = 1;
    public final boolean f26270b;
    public final float f26271c;
    public final float d;
    public final KeyEvent.Callback f26272e;

    public dh(mi miVar, float f10, float f11, boolean z4) {
        this.f26272e = miVar;
        this.f26271c = f10;
        this.d = f11;
        this.f26270b = z4;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26269a) {
            case 0:
                mi miVar = (mi) this.f26272e;
                LinearLayout linearLayout = miVar.f29061i1;
                LinearLayout linearLayout2 = miVar.f29067k1;
                float f12 = f10 / 500.0f;
                miVar.f29036b0.set(miVar.f29100v0, Float.valueOf(f12));
                miVar.U0.setAlpha(AndroidUtilities.lerp(this.f26271c, this.d, f12));
                miVar.X1(miVar.f29100v0, 0);
                miVar.X1(miVar.f29104w0, 0);
                if (!(miVar.f29104w0 instanceof qm) || this.f26270b) {
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
                bp0 bp0Var = (bp0) this.f26272e;
                boolean z4 = this.f26270b;
                if (z4) {
                    if (f10 > this.f26271c / 2.0f || !bp0Var.f25700s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !bp0Var.f25699r) {
                    return;
                }
                bp0Var.f25700s = !z4;
                bp0Var.f25699r = z4;
                return;
        }
    }

    public dh(bp0 bp0Var, boolean z4, float f10, float f11) {
        this.f26272e = bp0Var;
        this.f26270b = z4;
        this.f26271c = f10;
        this.d = f11;
    }
}
