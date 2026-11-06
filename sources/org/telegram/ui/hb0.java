package org.telegram.ui;

import android.widget.FrameLayout;
public final class hb0 implements Runnable {
    public final int f46316a;
    public final ob0 f46317b;

    public hb0(ob0 ob0Var, int i7) {
        this.f46316a = i7;
        this.f46317b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f46316a) {
            case 0:
                this.f46317b.o();
                return;
            case 1:
                ob0 ob0Var = this.f46317b;
                ob0Var.postDelayed(new hb0(ob0Var, 2), 150L);
                hb0 hb0Var = ob0Var.S;
                ob0Var.removeCallbacks(hb0Var);
                ob0Var.postDelayed(hb0Var, 3000L);
                ob0Var.R = true;
                return;
            case 2:
                lb0 lb0Var = this.f46317b.f48353a;
                int i7 = 0;
                lb0Var.f52310e = false;
                lb0Var.f52311f[0].requestFocus();
                while (true) {
                    br[] brVarArr = lb0Var.f52311f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                ob0 ob0Var2 = this.f46317b;
                ob0Var2.postDelayed(new hb0(ob0Var2, 5), 150L);
                return;
            case 4:
                ob0 ob0Var3 = this.f46317b;
                nb0 nb0Var = ob0Var3.Q;
                boolean z9 = false;
                ob0Var3.R = false;
                int i10 = 0;
                while (true) {
                    br[] brVarArr2 = ob0Var3.f48353a.f52311f;
                    if (i10 < brVarArr2.length) {
                        brVarArr2[i10].z(0.0f);
                        i10++;
                    } else if (nb0Var.getCurrentView() != ob0Var3.f48356e) {
                        nb0Var.showNext();
                        FrameLayout frameLayout = ob0Var3.h;
                        if (ob0Var3.f48357f.getVisibility() != 0 && ob0Var3.W.F != 3 && !ob0Var3.P) {
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
                lb0 lb0Var2 = this.f46317b.f48353a;
                int i11 = 0;
                lb0Var2.f52310e = false;
                lb0Var2.f52311f[0].requestFocus();
                while (true) {
                    br[] brVarArr3 = lb0Var2.f52311f;
                    if (i11 < brVarArr3.length) {
                        brVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f46317b.p(true);
                return;
            case 7:
                this.f46317b.q();
                return;
            default:
                ob0 ob0Var4 = this.f46317b;
                org.telegram.ui.Components.ch0 ch0Var = ob0Var4.f48362x;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var3 = ob0Var4.f48353a;
                if (lb0Var3 != null && lb0Var3.f52311f != null) {
                    lb0Var3.setText("");
                    lb0Var3.f52311f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
