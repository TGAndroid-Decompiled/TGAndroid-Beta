package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f28766a = 1;
    public final boolean f28767b;
    public final float f28768c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.f28768c = f7;
        this.d = f10;
        this.f28767b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28766a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.f30608o1;
                LinearLayout linearLayout2 = tiVar.f30614q1;
                float f11 = f7 / 500.0f;
                hi hiVar = tiVar.f30577e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.f30565a1.setAlpha(AndroidUtilities.lerp(this.f28768c, this.d, f11));
                tiVar.b2(tiVar.B0, 0);
                tiVar.b2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof bn) || this.f28767b) {
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
                sp0 sp0Var = (sp0) this.e;
                boolean z10 = this.f28767b;
                if (z10) {
                    if (f7 > this.f28768c / 2.0f || !sp0Var.f30317s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !sp0Var.f30316r) {
                    return;
                }
                sp0Var.f30317s = !z10;
                sp0Var.f30316r = z10;
                return;
        }
    }

    public nh(sp0 sp0Var, boolean z10, float f7, float f10) {
        this.e = sp0Var;
        this.f28767b = z10;
        this.f28768c = f7;
        this.d = f10;
    }
}
