package org.telegram.ui;

import android.widget.FrameLayout;
public final class hb0 implements Runnable {
    public final int f48524a;
    public final ob0 f48525b;

    public hb0(ob0 ob0Var, int i7) {
        this.f48524a = i7;
        this.f48525b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f48524a) {
            case 0:
                this.f48525b.o();
                return;
            case 1:
                ob0 ob0Var = this.f48525b;
                ob0Var.postDelayed(new hb0(ob0Var, 2), 150L);
                hb0 hb0Var = ob0Var.T;
                ob0Var.removeCallbacks(hb0Var);
                ob0Var.postDelayed(hb0Var, 3000L);
                ob0Var.S = true;
                return;
            case 2:
                lb0 lb0Var = this.f48525b.f50620a;
                int i7 = 0;
                lb0Var.f46490e = false;
                lb0Var.f46491f[0].requestFocus();
                while (true) {
                    er[] erVarArr = lb0Var.f46491f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                ob0 ob0Var2 = this.f48525b;
                ob0Var2.postDelayed(new hb0(ob0Var2, 5), 150L);
                return;
            case 4:
                ob0 ob0Var3 = this.f48525b;
                nb0 nb0Var = ob0Var3.R;
                boolean z10 = false;
                ob0Var3.S = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = ob0Var3.f50620a.f46491f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else if (nb0Var.getCurrentView() != ob0Var3.f50624e) {
                        nb0Var.showNext();
                        FrameLayout frameLayout = ob0Var3.h;
                        if (ob0Var3.f50625f.getVisibility() != 0 && ob0Var3.f50621a0.G != 3 && !ob0Var3.Q) {
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
                lb0 lb0Var2 = this.f48525b.f50620a;
                int i11 = 0;
                lb0Var2.f46490e = false;
                lb0Var2.f46491f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = lb0Var2.f46491f;
                    if (i11 < erVarArr3.length) {
                        erVarArr3[i11].A(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f48525b.p(true);
                return;
            case 7:
                this.f48525b.q();
                return;
            default:
                ob0 ob0Var4 = this.f48525b;
                org.telegram.ui.Components.qh0 qh0Var = ob0Var4.f50630x;
                qh0Var.getAnimatedDrawable().N(0, false, false);
                qh0Var.d();
                lb0 lb0Var3 = ob0Var4.f50620a;
                if (lb0Var3 != null && lb0Var3.f46491f != null) {
                    lb0Var3.setText("");
                    lb0Var3.f46491f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
