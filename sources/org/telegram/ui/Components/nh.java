package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f26422a = 0;
    public final boolean f26423b;
    public final float f26424c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.f26424c = f7;
        this.d = f10;
        this.f26423b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26422a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.f29689n1;
                float f11 = f7 / 500.0f;
                wiVar.f29661e0.set(wiVar.f29726y0, Float.valueOf(f11));
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.f26424c, this.d, f11));
                wiVar.X1(wiVar.f29726y0, 0);
                wiVar.X1(wiVar.f29729z0, 0);
                if (!(wiVar.f29729z0 instanceof rm) || this.f26423b) {
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
                wo0 wo0Var = (wo0) this.e;
                boolean z10 = this.f26423b;
                if (z10) {
                    if (f7 > this.f26424c / 2.0f || !wo0Var.f29771s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !wo0Var.f29770r) {
                    return;
                }
                wo0Var.f29771s = !z10;
                wo0Var.f29770r = z10;
                return;
        }
    }

    public nh(wo0 wo0Var, boolean z10, float f7, float f10) {
        this.e = wo0Var;
        this.f26423b = z10;
        this.f26424c = f7;
        this.d = f10;
    }
}
