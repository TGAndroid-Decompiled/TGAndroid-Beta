package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements Runnable {
    public final int f40512a;
    public final qd0 f40513b;

    public jd0(qd0 qd0Var, int i10) {
        this.f40512a = i10;
        this.f40513b = qd0Var;
    }

    @Override
    public final void run() {
        switch (this.f40512a) {
            case 0:
                this.f40513b.o();
                return;
            case 1:
                qd0 qd0Var = this.f40513b;
                qd0Var.postDelayed(new jd0(qd0Var, 2), 150L);
                jd0 jd0Var = qd0Var.S;
                qd0Var.removeCallbacks(jd0Var);
                qd0Var.postDelayed(jd0Var, 3000L);
                qd0Var.R = true;
                return;
            case 2:
                nd0 nd0Var = this.f40513b.f42672a;
                int i10 = 0;
                nd0Var.e = false;
                nd0Var.f45772f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr = nd0Var.f45772f;
                    if (i10 < zrVarArr.length) {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                qd0 qd0Var2 = this.f40513b;
                qd0Var2.postDelayed(new jd0(qd0Var2, 5), 150L);
                return;
            case 4:
                qd0 qd0Var3 = this.f40513b;
                pd0 pd0Var = qd0Var3.Q;
                boolean z10 = false;
                qd0Var3.R = false;
                int i11 = 0;
                while (true) {
                    zr[] zrVarArr2 = qd0Var3.f42672a.f45772f;
                    if (i11 < zrVarArr2.length) {
                        zrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (pd0Var.getCurrentView() != qd0Var3.e) {
                        pd0Var.showNext();
                        FrameLayout frameLayout = qd0Var3.h;
                        if (qd0Var3.f42675f.getVisibility() != 0 && qd0Var3.W.F != 3 && !qd0Var3.P) {
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
                nd0 nd0Var2 = this.f40513b.f42672a;
                int i12 = 0;
                nd0Var2.e = false;
                nd0Var2.f45772f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr3 = nd0Var2.f45772f;
                    if (i12 < zrVarArr3.length) {
                        zrVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f40513b.p(true);
                return;
            case 7:
                this.f40513b.q();
                return;
            default:
                qd0 qd0Var4 = this.f40513b;
                org.telegram.ui.Components.bk0 bk0Var = qd0Var4.f42679w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                nd0 nd0Var3 = qd0Var4.f42672a;
                if (nd0Var3 != null && nd0Var3.f45772f != null) {
                    nd0Var3.setText("");
                    nd0Var3.f45772f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
