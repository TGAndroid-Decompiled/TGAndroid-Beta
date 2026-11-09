package org.telegram.ui;

import android.widget.FrameLayout;
public final class jb0 implements Runnable {
    public final int f46912a;
    public final qb0 f46913b;

    public jb0(qb0 qb0Var, int i7) {
        this.f46912a = i7;
        this.f46913b = qb0Var;
    }

    @Override
    public final void run() {
        switch (this.f46912a) {
            case 0:
                this.f46913b.o();
                return;
            case 1:
                qb0 qb0Var = this.f46913b;
                qb0Var.postDelayed(new jb0(qb0Var, 2), 150L);
                jb0 jb0Var = qb0Var.S;
                qb0Var.removeCallbacks(jb0Var);
                qb0Var.postDelayed(jb0Var, 3000L);
                qb0Var.R = true;
                return;
            case 2:
                nb0 nb0Var = this.f46913b.f49001a;
                int i7 = 0;
                nb0Var.f43767e = false;
                nb0Var.f43768f[0].requestFocus();
                while (true) {
                    dr[] drVarArr = nb0Var.f43768f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                qb0 qb0Var2 = this.f46913b;
                qb0Var2.postDelayed(new jb0(qb0Var2, 5), 150L);
                return;
            case 4:
                qb0 qb0Var3 = this.f46913b;
                pb0 pb0Var = qb0Var3.Q;
                boolean z9 = false;
                qb0Var3.R = false;
                int i10 = 0;
                while (true) {
                    dr[] drVarArr2 = qb0Var3.f49001a.f43768f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].z(0.0f);
                        i10++;
                    } else if (pb0Var.getCurrentView() != qb0Var3.f49004e) {
                        pb0Var.showNext();
                        FrameLayout frameLayout = qb0Var3.h;
                        if (qb0Var3.f49005f.getVisibility() != 0 && qb0Var3.W.F != 3 && !qb0Var3.P) {
                            z9 = true;
                        }
                        org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                nb0 nb0Var2 = this.f46913b.f49001a;
                int i11 = 0;
                nb0Var2.f43767e = false;
                nb0Var2.f43768f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = nb0Var2.f43768f;
                    if (i11 < drVarArr3.length) {
                        drVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f46913b.p(true);
                return;
            case 7:
                this.f46913b.q();
                return;
            default:
                qb0 qb0Var4 = this.f46913b;
                org.telegram.ui.Components.dh0 dh0Var = qb0Var4.f49010x;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                nb0 nb0Var3 = qb0Var4.f49001a;
                if (nb0Var3 != null && nb0Var3.f43768f != null) {
                    nb0Var3.setText("");
                    nb0Var3.f43768f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
