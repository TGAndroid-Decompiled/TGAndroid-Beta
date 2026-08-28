package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements Runnable {
    public final int f38753a;
    public final pd0 f38754b;

    public hd0(pd0 pd0Var, int i9) {
        this.f38753a = i9;
        this.f38754b = pd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38753a) {
            case 0:
                this.f38754b.p();
                return;
            case 1:
                pd0 pd0Var = this.f38754b;
                pd0Var.postDelayed(new hd0(pd0Var, 2), 150L);
                hd0 hd0Var = pd0Var.O;
                pd0Var.removeCallbacks(hd0Var);
                pd0Var.postDelayed(hd0Var, 3000L);
                pd0Var.N = true;
                return;
            case 2:
                ld0 ld0Var = this.f38754b.f41482a;
                int i9 = 0;
                ld0Var.f42754e = false;
                ld0Var.f42755f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = ld0Var.f42755f;
                    if (i9 < vrVarArr.length) {
                        vrVarArr[i9].i(0.0f);
                        i9++;
                    } else {
                        return;
                    }
                }
            case 3:
                pd0 pd0Var2 = this.f38754b;
                pd0Var2.postDelayed(new hd0(pd0Var2, 5), 150L);
                return;
            case 4:
                pd0 pd0Var3 = this.f38754b;
                od0 od0Var = pd0Var3.M;
                boolean z10 = false;
                pd0Var3.N = false;
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr2 = pd0Var3.f41482a.f42755f;
                    if (i10 < vrVarArr2.length) {
                        vrVarArr2[i10].i(0.0f);
                        i10++;
                    } else if (od0Var.getCurrentView() != pd0Var3.f41485e) {
                        od0Var.showNext();
                        FrameLayout frameLayout = pd0Var3.h;
                        if (pd0Var3.f41486f.getVisibility() != 0 && pd0Var3.S.B != 3 && !pd0Var3.L) {
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
                ld0 ld0Var2 = this.f38754b.f41482a;
                int i11 = 0;
                ld0Var2.f42754e = false;
                ld0Var2.f42755f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = ld0Var2.f42755f;
                    if (i11 < vrVarArr3.length) {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38754b.q(true);
                return;
            case 7:
                this.f38754b.r();
                return;
            default:
                pd0 pd0Var4 = this.f38754b;
                org.telegram.ui.Components.pi0 pi0Var = pd0Var4.f41490w;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                ld0 ld0Var3 = pd0Var4.f41482a;
                if (ld0Var3 != null && ld0Var3.f42755f != null) {
                    ld0Var3.setText("");
                    ld0Var3.f42755f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
