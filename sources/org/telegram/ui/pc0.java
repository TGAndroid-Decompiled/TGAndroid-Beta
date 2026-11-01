package org.telegram.ui;

import android.widget.FrameLayout;
public final class pc0 implements Runnable {
    public final int f40456a;
    public final vc0 f40457b;

    public pc0(vc0 vc0Var, int i10) {
        this.f40456a = i10;
        this.f40457b = vc0Var;
    }

    @Override
    public final void run() {
        switch (this.f40456a) {
            case 0:
                this.f40457b.o();
                return;
            case 1:
                vc0 vc0Var = this.f40457b;
                vc0Var.postDelayed(new pc0(vc0Var, 2), 150L);
                pc0 pc0Var = vc0Var.S;
                vc0Var.removeCallbacks(pc0Var);
                vc0Var.postDelayed(pc0Var, 3000L);
                vc0Var.R = true;
                return;
            case 2:
                tc0 tc0Var = this.f40457b.f42478a;
                int i10 = 0;
                tc0Var.e = false;
                tc0Var.f44045f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = tc0Var.f44045f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                vc0 vc0Var2 = this.f40457b;
                vc0Var2.postDelayed(new pc0(vc0Var2, 5), 150L);
                return;
            case 4:
                vc0 vc0Var3 = this.f40457b;
                uc0 uc0Var = vc0Var3.Q;
                boolean z10 = false;
                vc0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = vc0Var3.f42478a.f44045f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (uc0Var.getCurrentView() != vc0Var3.e) {
                        uc0Var.showNext();
                        FrameLayout frameLayout = vc0Var3.h;
                        if (vc0Var3.f42481f.getVisibility() != 0 && vc0Var3.W.F != 3 && !vc0Var3.P) {
                            z10 = true;
                        }
                        org.telegram.messenger.i0.Y3(frameLayout, z10, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                tc0 tc0Var2 = this.f40457b.f42478a;
                int i12 = 0;
                tc0Var2.e = false;
                tc0Var2.f44045f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = tc0Var2.f44045f;
                    if (i12 < bsVarArr3.length) {
                        bsVarArr3[i12].z(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f40457b.p(true);
                return;
            case 7:
                this.f40457b.q();
                return;
            default:
                vc0 vc0Var4 = this.f40457b;
                org.telegram.ui.Components.fi0 fi0Var = vc0Var4.f42486x;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                tc0 tc0Var3 = vc0Var4.f42478a;
                if (tc0Var3 != null && tc0Var3.f44045f != null) {
                    tc0Var3.setText("");
                    tc0Var3.f44045f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
