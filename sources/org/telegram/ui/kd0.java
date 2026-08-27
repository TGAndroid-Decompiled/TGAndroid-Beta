package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class kd0 implements Runnable {

    public final int f39699a;

    public final sd0 f39700b;

    public kd0(sd0 sd0Var, int i10) {
        this.f39699a = i10;
        this.f39700b = sd0Var;
    }

    @Override
    public final void run() {
        switch (this.f39699a) {
            case 0:
                this.f39700b.p();
                break;
            case 1:
                sd0 sd0Var = this.f39700b;
                sd0Var.postDelayed(new kd0(sd0Var, 2), 150L);
                kd0 kd0Var = sd0Var.O;
                sd0Var.removeCallbacks(kd0Var);
                sd0Var.postDelayed(kd0Var, 3000L);
                sd0Var.N = true;
                break;
            case 2:
                od0 od0Var = this.f39700b.f42580a;
                int i10 = 0;
                od0Var.f43278e = false;
                od0Var.f43279f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr = od0Var.f43279f;
                    if (i10 < wrVarArr.length) {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                    break;
                }
                break;
            case 3:
                sd0 sd0Var2 = this.f39700b;
                sd0Var2.postDelayed(new kd0(sd0Var2, 5), 150L);
                break;
            case 4:
                sd0 sd0Var3 = this.f39700b;
                rd0 rd0Var = sd0Var3.M;
                boolean z10 = false;
                sd0Var3.N = false;
                int i11 = 0;
                while (true) {
                    wr[] wrVarArr2 = sd0Var3.f42580a.f43279f;
                    if (i11 < wrVarArr2.length) {
                        wrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (rd0Var.getCurrentView() != sd0Var3.f42583e) {
                        rd0Var.showNext();
                        FrameLayout frameLayout = sd0Var3.h;
                        if (sd0Var3.f42584f.getVisibility() != 0 && sd0Var3.S.B != 3 && !sd0Var3.L) {
                            z10 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                    }
                    break;
                }
                break;
            case 5:
                od0 od0Var2 = this.f39700b.f42580a;
                int i12 = 0;
                od0Var2.f43278e = false;
                od0Var2.f43279f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr3 = od0Var2.f43279f;
                    if (i12 < wrVarArr3.length) {
                        wrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                    break;
                }
                break;
            case 6:
                this.f39700b.q(true);
                break;
            case 7:
                this.f39700b.r();
                break;
            default:
                sd0 sd0Var4 = this.f39700b;
                org.telegram.ui.Components.ri0 ri0Var = sd0Var4.f42588w;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                od0 od0Var3 = sd0Var4.f42580a;
                if (od0Var3 != null && od0Var3.f43279f != null) {
                    od0Var3.setText("");
                    od0Var3.f43279f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
