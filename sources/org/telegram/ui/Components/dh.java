package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dh implements o1.g {
    public final int f24276a = 0;
    public final boolean f24277b;
    public final float f24278c;
    public final float d;
    public final KeyEvent.Callback e;

    public dh(li liVar, float f10, float f11, boolean z4) {
        this.e = liVar;
        this.f24278c = f10;
        this.d = f11;
        this.f24277b = z4;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f24276a) {
            case 0:
                li liVar = (li) this.e;
                LinearLayout linearLayout = liVar.f26705i1;
                LinearLayout linearLayout2 = liVar.f26711k1;
                float f12 = f10 / 500.0f;
                liVar.f26681b0.set(liVar.f26744v0, Float.valueOf(f12));
                liVar.U0.setAlpha(AndroidUtilities.lerp(this.f24278c, this.d, f12));
                liVar.X1(liVar.f26744v0, 0);
                liVar.X1(liVar.f26748w0, 0);
                if (!(liVar.f26748w0 instanceof nm) || this.f24277b) {
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
                zo0 zo0Var = (zo0) this.e;
                boolean z4 = this.f24277b;
                if (z4) {
                    if (f10 > this.f24278c / 2.0f || !zo0Var.f31446s) {
                        return;
                    }
                } else if (f10 < this.d / 2.0f || !zo0Var.f31445r) {
                    return;
                }
                zo0Var.f31446s = !z4;
                zo0Var.f31445r = z4;
                return;
        }
    }

    public dh(zo0 zo0Var, boolean z4, float f10, float f11) {
        this.e = zo0Var;
        this.f24277b = z4;
        this.f24278c = f10;
        this.d = f11;
    }
}
