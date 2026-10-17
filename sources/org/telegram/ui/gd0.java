package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements Runnable {
    public final int f37219a;
    public final od0 f37220b;

    public gd0(od0 od0Var, int i10) {
        this.f37219a = i10;
        this.f37220b = od0Var;
    }

    @Override
    public final void run() {
        switch (this.f37219a) {
            case 0:
                this.f37220b.p();
                return;
            case 1:
                od0 od0Var = this.f37220b;
                od0Var.postDelayed(new gd0(od0Var, 2), 150L);
                gd0 gd0Var = od0Var.S;
                od0Var.removeCallbacks(gd0Var);
                od0Var.postDelayed(gd0Var, 3000L);
                od0Var.R = true;
                return;
            case 2:
                kd0 kd0Var = this.f37220b.f39742a;
                int i10 = 0;
                kd0Var.e = false;
                kd0Var.f41486f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = kd0Var.f41486f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                od0 od0Var2 = this.f37220b;
                od0Var2.postDelayed(new gd0(od0Var2, 5), 150L);
                return;
            case 4:
                od0 od0Var3 = this.f37220b;
                nd0 nd0Var = od0Var3.Q;
                boolean z10 = false;
                od0Var3.R = false;
                int i11 = 0;
                while (true) {
                    vr[] vrVarArr2 = od0Var3.f39742a.f41486f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (nd0Var.getCurrentView() != od0Var3.e) {
                        nd0Var.showNext();
                        FrameLayout frameLayout = od0Var3.h;
                        if (od0Var3.f39745f.getVisibility() != 0 && od0Var3.W.F != 3 && !od0Var3.P) {
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
                kd0 kd0Var2 = this.f37220b.f39742a;
                int i12 = 0;
                kd0Var2.e = false;
                kd0Var2.f41486f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = kd0Var2.f41486f;
                    if (i12 < vrVarArr3.length) {
                        vrVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f37220b.q(true);
                return;
            case 7:
                this.f37220b.r();
                return;
            default:
                od0 od0Var4 = this.f37220b;
                org.telegram.ui.Components.xj0 xj0Var = od0Var4.f39749w;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                kd0 kd0Var3 = od0Var4.f39742a;
                if (kd0Var3 != null && kd0Var3.f41486f != null) {
                    kd0Var3.setText("");
                    kd0Var3.f41486f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
