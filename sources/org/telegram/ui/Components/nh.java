package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f28797a = 0;
    public final boolean f28798b;
    public final float f28799c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.f28799c = f7;
        this.d = f10;
        this.f28798b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28797a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.f30576o1;
                LinearLayout linearLayout2 = tiVar.f30582q1;
                float f11 = f7 / 500.0f;
                hi hiVar = tiVar.f30545e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.f30533a1.setAlpha(AndroidUtilities.lerp(this.f28799c, this.d, f11));
                tiVar.b2(tiVar.B0, 0);
                tiVar.b2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof bn) || this.f28798b) {
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
                tp0 tp0Var = (tp0) this.e;
                boolean z10 = this.f28798b;
                if (z10) {
                    if (f7 > this.f28799c / 2.0f || !tp0Var.f30651s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !tp0Var.f30650r) {
                    return;
                }
                tp0Var.f30651s = !z10;
                tp0Var.f30650r = z10;
                return;
        }
    }

    public nh(tp0 tp0Var, boolean z10, float f7, float f10) {
        this.e = tp0Var;
        this.f28798b = z10;
        this.f28799c = f7;
        this.d = f10;
    }
}
