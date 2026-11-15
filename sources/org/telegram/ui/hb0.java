package org.telegram.ui;

import android.widget.FrameLayout;
public final class hb0 implements Runnable {
    public final int f47660a;
    public final ob0 f47661b;

    public hb0(ob0 ob0Var, int i7) {
        this.f47660a = i7;
        this.f47661b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f47660a) {
            case 0:
                this.f47661b.o();
                return;
            case 1:
                ob0 ob0Var = this.f47661b;
                ob0Var.postDelayed(new hb0(ob0Var, 2), 150L);
                hb0 hb0Var = ob0Var.T;
                ob0Var.removeCallbacks(hb0Var);
                ob0Var.postDelayed(hb0Var, 3000L);
                ob0Var.S = true;
                return;
            case 2:
                lb0 lb0Var = this.f47661b.f49890a;
                int i7 = 0;
                lb0Var.f45490e = false;
                lb0Var.f45491f[0].requestFocus();
                while (true) {
                    dr[] drVarArr = lb0Var.f45491f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                ob0 ob0Var2 = this.f47661b;
                ob0Var2.postDelayed(new hb0(ob0Var2, 5), 150L);
                return;
            case 4:
                ob0 ob0Var3 = this.f47661b;
                nb0 nb0Var = ob0Var3.R;
                boolean z10 = false;
                ob0Var3.S = false;
                int i10 = 0;
                while (true) {
                    dr[] drVarArr2 = ob0Var3.f49890a.f45491f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].A(0.0f);
                        i10++;
                    } else if (nb0Var.getCurrentView() != ob0Var3.f49894e) {
                        nb0Var.showNext();
                        FrameLayout frameLayout = ob0Var3.h;
                        if (ob0Var3.f49895f.getVisibility() != 0 && ob0Var3.f49891a0.G != 3 && !ob0Var3.Q) {
                            z10 = true;
                        }
                        org.telegram.messenger.g0.Y3(frameLayout, z10, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                lb0 lb0Var2 = this.f47661b.f49890a;
                int i11 = 0;
                lb0Var2.f45490e = false;
                lb0Var2.f45491f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = lb0Var2.f45491f;
                    if (i11 < drVarArr3.length) {
                        drVarArr3[i11].A(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f47661b.p(true);
                return;
            case 7:
                this.f47661b.q();
                return;
            default:
                ob0 ob0Var4 = this.f47661b;
                org.telegram.ui.Components.fh0 fh0Var = ob0Var4.f49900x;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                lb0 lb0Var3 = ob0Var4.f49890a;
                if (lb0Var3 != null && lb0Var3.f45491f != null) {
                    lb0Var3.setText("");
                    lb0Var3.f45491f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
