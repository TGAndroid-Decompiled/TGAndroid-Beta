package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f28946a = 0;
    public final boolean f28947b;
    public final float f28948c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.f28948c = f7;
        this.d = f10;
        this.f28947b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28946a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.f30757o1;
                LinearLayout linearLayout2 = tiVar.f30763q1;
                float f11 = f7 / 500.0f;
                hi hiVar = tiVar.f30726e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.f30714a1.setAlpha(AndroidUtilities.lerp(this.f28948c, this.d, f11));
                tiVar.f2(tiVar.B0, 0);
                tiVar.f2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof bn) || this.f28947b) {
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
                xp0 xp0Var = (xp0) this.e;
                boolean z10 = this.f28947b;
                if (z10) {
                    if (f7 > this.f28948c / 2.0f || !xp0Var.f32628s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !xp0Var.f32627r) {
                    return;
                }
                xp0Var.f32628s = !z10;
                xp0Var.f32627r = z10;
                return;
        }
    }

    public nh(xp0 xp0Var, boolean z10, float f7, float f10) {
        this.e = xp0Var;
        this.f28947b = z10;
        this.f28948c = f7;
        this.d = f10;
    }
}
