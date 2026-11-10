package org.telegram.ui;

import android.widget.FrameLayout;
public final class kb0 implements Runnable {
    public final int f47247a;
    public final rb0 f47248b;

    public kb0(rb0 rb0Var, int i7) {
        this.f47247a = i7;
        this.f47248b = rb0Var;
    }

    @Override
    public final void run() {
        switch (this.f47247a) {
            case 0:
                this.f47248b.o();
                return;
            case 1:
                rb0 rb0Var = this.f47248b;
                rb0Var.postDelayed(new kb0(rb0Var, 2), 150L);
                kb0 kb0Var = rb0Var.S;
                rb0Var.removeCallbacks(kb0Var);
                rb0Var.postDelayed(kb0Var, 3000L);
                rb0Var.R = true;
                return;
            case 2:
                ob0 ob0Var = this.f47248b.f49332a;
                int i7 = 0;
                ob0Var.f44117e = false;
                ob0Var.f44118f[0].requestFocus();
                while (true) {
                    er[] erVarArr = ob0Var.f44118f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                rb0 rb0Var2 = this.f47248b;
                rb0Var2.postDelayed(new kb0(rb0Var2, 5), 150L);
                return;
            case 4:
                rb0 rb0Var3 = this.f47248b;
                qb0 qb0Var = rb0Var3.Q;
                boolean z9 = false;
                rb0Var3.R = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = rb0Var3.f49332a.f44118f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].z(0.0f);
                        i10++;
                    } else if (qb0Var.getCurrentView() != rb0Var3.f49335e) {
                        qb0Var.showNext();
                        FrameLayout frameLayout = rb0Var3.h;
                        if (rb0Var3.f49336f.getVisibility() != 0 && rb0Var3.W.F != 3 && !rb0Var3.P) {
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
                ob0 ob0Var2 = this.f47248b.f49332a;
                int i11 = 0;
                ob0Var2.f44117e = false;
                ob0Var2.f44118f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = ob0Var2.f44118f;
                    if (i11 < erVarArr3.length) {
                        erVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f47248b.p(true);
                return;
            case 7:
                this.f47248b.q();
                return;
            default:
                rb0 rb0Var4 = this.f47248b;
                org.telegram.ui.Components.ch0 ch0Var = rb0Var4.f49341x;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                ob0 ob0Var3 = rb0Var4.f49332a;
                if (ob0Var3 != null && ob0Var3.f44118f != null) {
                    ob0Var3.setText("");
                    ob0Var3.f44118f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
