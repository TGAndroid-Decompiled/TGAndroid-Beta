package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements Runnable {
    public final int f39982a;
    public final od0 f39983b;

    public hd0(od0 od0Var, int i10) {
        this.f39982a = i10;
        this.f39983b = od0Var;
    }

    @Override
    public final void run() {
        switch (this.f39982a) {
            case 0:
                this.f39983b.o();
                return;
            case 1:
                od0 od0Var = this.f39983b;
                od0Var.postDelayed(new hd0(od0Var, 2), 150L);
                hd0 hd0Var = od0Var.S;
                od0Var.removeCallbacks(hd0Var);
                od0Var.postDelayed(hd0Var, 3000L);
                od0Var.R = true;
                return;
            case 2:
                ld0 ld0Var = this.f39983b.f42151a;
                int i10 = 0;
                ld0Var.e = false;
                ld0Var.f44894f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr = ld0Var.f44894f;
                    if (i10 < xrVarArr.length) {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                od0 od0Var2 = this.f39983b;
                od0Var2.postDelayed(new hd0(od0Var2, 5), 150L);
                return;
            case 4:
                od0 od0Var3 = this.f39983b;
                nd0 nd0Var = od0Var3.Q;
                boolean z10 = false;
                od0Var3.R = false;
                int i11 = 0;
                while (true) {
                    xr[] xrVarArr2 = od0Var3.f42151a.f44894f;
                    if (i11 < xrVarArr2.length) {
                        xrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (nd0Var.getCurrentView() != od0Var3.e) {
                        nd0Var.showNext();
                        FrameLayout frameLayout = od0Var3.h;
                        if (od0Var3.f42154f.getVisibility() != 0 && od0Var3.W.F != 3 && !od0Var3.P) {
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
                ld0 ld0Var2 = this.f39983b.f42151a;
                int i12 = 0;
                ld0Var2.e = false;
                ld0Var2.f44894f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr3 = ld0Var2.f44894f;
                    if (i12 < xrVarArr3.length) {
                        xrVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f39983b.p(true);
                return;
            case 7:
                this.f39983b.q();
                return;
            default:
                od0 od0Var4 = this.f39983b;
                org.telegram.ui.Components.ak0 ak0Var = od0Var4.f42158w;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                ld0 ld0Var3 = od0Var4.f42151a;
                if (ld0Var3 != null && ld0Var3.f44894f != null) {
                    ld0Var3.setText("");
                    ld0Var3.f44894f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
