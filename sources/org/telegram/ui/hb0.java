package org.telegram.ui;

import android.widget.FrameLayout;
public final class hb0 implements Runnable {
    public final int f48322a;
    public final ob0 f48323b;

    public hb0(ob0 ob0Var, int i7) {
        this.f48322a = i7;
        this.f48323b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f48322a) {
            case 0:
                this.f48323b.o();
                return;
            case 1:
                ob0 ob0Var = this.f48323b;
                ob0Var.postDelayed(new hb0(ob0Var, 2), 150L);
                hb0 hb0Var = ob0Var.T;
                ob0Var.removeCallbacks(hb0Var);
                ob0Var.postDelayed(hb0Var, 3000L);
                ob0Var.S = true;
                return;
            case 2:
                lb0 lb0Var = this.f48323b.f50547a;
                int i7 = 0;
                lb0Var.f46282e = false;
                lb0Var.f46283f[0].requestFocus();
                while (true) {
                    er[] erVarArr = lb0Var.f46283f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                ob0 ob0Var2 = this.f48323b;
                ob0Var2.postDelayed(new hb0(ob0Var2, 5), 150L);
                return;
            case 4:
                ob0 ob0Var3 = this.f48323b;
                nb0 nb0Var = ob0Var3.R;
                boolean z10 = false;
                ob0Var3.S = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = ob0Var3.f50547a.f46283f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else if (nb0Var.getCurrentView() != ob0Var3.f50551e) {
                        nb0Var.showNext();
                        FrameLayout frameLayout = ob0Var3.h;
                        if (ob0Var3.f50552f.getVisibility() != 0 && ob0Var3.f50548a0.G != 3 && !ob0Var3.Q) {
                            z10 = true;
                        }
                        org.telegram.messenger.g0.X3(frameLayout, z10, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                lb0 lb0Var2 = this.f48323b.f50547a;
                int i11 = 0;
                lb0Var2.f46282e = false;
                lb0Var2.f46283f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = lb0Var2.f46283f;
                    if (i11 < erVarArr3.length) {
                        erVarArr3[i11].A(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f48323b.p(true);
                return;
            case 7:
                this.f48323b.q();
                return;
            default:
                ob0 ob0Var4 = this.f48323b;
                org.telegram.ui.Components.ph0 ph0Var = ob0Var4.f50557x;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                lb0 lb0Var3 = ob0Var4.f50547a;
                if (lb0Var3 != null && lb0Var3.f46283f != null) {
                    lb0Var3.setText("");
                    lb0Var3.f46283f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
