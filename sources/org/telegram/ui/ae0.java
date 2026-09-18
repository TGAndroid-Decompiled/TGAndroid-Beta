package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements Runnable {
    public final int f32008a;
    public final he0 f32009b;

    public ae0(he0 he0Var, int i10) {
        this.f32008a = i10;
        this.f32009b = he0Var;
    }

    @Override
    public final void run() {
        switch (this.f32008a) {
            case 0:
                this.f32009b.p();
                return;
            case 1:
                he0 he0Var = this.f32009b;
                he0Var.postDelayed(new ae0(he0Var, 2), 150L);
                ae0 ae0Var = he0Var.S;
                he0Var.removeCallbacks(ae0Var);
                he0Var.postDelayed(ae0Var, 3000L);
                he0Var.R = true;
                return;
            case 2:
                ee0 ee0Var = this.f32009b.f34134a;
                int i10 = 0;
                ee0Var.e = false;
                ee0Var.f33074f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr = ee0Var.f33074f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                he0 he0Var2 = this.f32009b;
                he0Var2.postDelayed(new ae0(he0Var2, 5), 150L);
                return;
            case 4:
                he0 he0Var3 = this.f32009b;
                ge0 ge0Var = he0Var3.Q;
                boolean z10 = false;
                he0Var3.R = false;
                int i11 = 0;
                while (true) {
                    gs[] gsVarArr2 = he0Var3.f34134a.f33074f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ge0Var.getCurrentView() != he0Var3.e) {
                        ge0Var.showNext();
                        FrameLayout frameLayout = he0Var3.h;
                        if (he0Var3.f34137f.getVisibility() != 0 && he0Var3.W.F != 3 && !he0Var3.P) {
                            z10 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                ee0 ee0Var2 = this.f32009b.f34134a;
                int i12 = 0;
                ee0Var2.e = false;
                ee0Var2.f33074f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = ee0Var2.f33074f;
                    if (i12 < gsVarArr3.length) {
                        gsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f32009b.q(true);
                return;
            case 7:
                this.f32009b.r();
                return;
            default:
                he0 he0Var4 = this.f32009b;
                org.telegram.ui.Components.lj0 lj0Var = he0Var4.f34141w;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                ee0 ee0Var3 = he0Var4.f34134a;
                if (ee0Var3 != null && ee0Var3.f33074f != null) {
                    ee0Var3.setText("");
                    ee0Var3.f33074f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
