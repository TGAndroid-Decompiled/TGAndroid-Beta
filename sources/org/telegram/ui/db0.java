package org.telegram.ui;

import android.widget.FrameLayout;
public final class db0 implements Runnable {
    public final int f44614a;
    public final lb0 f44615b;

    public db0(lb0 lb0Var, int i3) {
        this.f44614a = i3;
        this.f44615b = lb0Var;
    }

    @Override
    public final void run() {
        switch (this.f44614a) {
            case 0:
                this.f44615b.o();
                return;
            case 1:
                lb0 lb0Var = this.f44615b;
                lb0Var.postDelayed(new db0(lb0Var, 2), 150L);
                db0 db0Var = lb0Var.T;
                lb0Var.removeCallbacks(db0Var);
                lb0Var.postDelayed(db0Var, 3000L);
                lb0Var.S = true;
                return;
            case 2:
                ib0 ib0Var = this.f44615b.f47283a;
                int i3 = 0;
                ib0Var.f52077e = false;
                ib0Var.f52078f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr = ib0Var.f52078f;
                    if (i3 < zqVarArr.length) {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    } else {
                        return;
                    }
                }
            case 3:
                lb0 lb0Var2 = this.f44615b;
                lb0Var2.postDelayed(new db0(lb0Var2, 5), 150L);
                return;
            case 4:
                lb0 lb0Var3 = this.f44615b;
                kb0 kb0Var = lb0Var3.R;
                boolean z10 = false;
                lb0Var3.S = false;
                int i10 = 0;
                while (true) {
                    zq[] zqVarArr2 = lb0Var3.f47283a.f52078f;
                    if (i10 < zqVarArr2.length) {
                        zqVarArr2[i10].z(0.0f);
                        i10++;
                    } else if (kb0Var.getCurrentView() != lb0Var3.f47287e) {
                        kb0Var.showNext();
                        FrameLayout frameLayout = lb0Var3.h;
                        if (lb0Var3.f47288f.getVisibility() != 0 && lb0Var3.f47284a0.G != 3 && !lb0Var3.Q) {
                            z10 = true;
                        }
                        org.telegram.messenger.g0.Z3(frameLayout, z10, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                ib0 ib0Var2 = this.f44615b.f47283a;
                int i11 = 0;
                ib0Var2.f52077e = false;
                ib0Var2.f52078f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr3 = ib0Var2.f52078f;
                    if (i11 < zqVarArr3.length) {
                        zqVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f44615b.p(true);
                return;
            case 7:
                this.f44615b.q();
                return;
            default:
                lb0 lb0Var4 = this.f44615b;
                org.telegram.ui.Components.fh0 fh0Var = lb0Var4.f47293x;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                ib0 ib0Var3 = lb0Var4.f47283a;
                if (ib0Var3 != null && ib0Var3.f52078f != null) {
                    ib0Var3.setText("");
                    ib0Var3.f52078f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
