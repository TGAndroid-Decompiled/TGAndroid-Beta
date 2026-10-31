package org.telegram.ui;

import android.widget.FrameLayout;
public final class qc0 implements Runnable {
    public final int f40953a;
    public final wc0 f40954b;

    public qc0(wc0 wc0Var, int i10) {
        this.f40953a = i10;
        this.f40954b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f40953a) {
            case 0:
                this.f40954b.o();
                return;
            case 1:
                wc0 wc0Var = this.f40954b;
                wc0Var.postDelayed(new qc0(wc0Var, 2), 150L);
                qc0 qc0Var = wc0Var.S;
                wc0Var.removeCallbacks(qc0Var);
                wc0Var.postDelayed(qc0Var, 3000L);
                wc0Var.R = true;
                return;
            case 2:
                uc0 uc0Var = this.f40954b.f42927a;
                int i10 = 0;
                uc0Var.e = false;
                uc0Var.f44219f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = uc0Var.f44219f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                wc0 wc0Var2 = this.f40954b;
                wc0Var2.postDelayed(new qc0(wc0Var2, 5), 150L);
                return;
            case 4:
                wc0 wc0Var3 = this.f40954b;
                vc0 vc0Var = wc0Var3.Q;
                boolean z10 = false;
                wc0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = wc0Var3.f42927a.f44219f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else if (vc0Var.getCurrentView() != wc0Var3.e) {
                        vc0Var.showNext();
                        FrameLayout frameLayout = wc0Var3.h;
                        if (wc0Var3.f42930f.getVisibility() != 0 && wc0Var3.W.F != 3 && !wc0Var3.P) {
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
                uc0 uc0Var2 = this.f40954b.f42927a;
                int i12 = 0;
                uc0Var2.e = false;
                uc0Var2.f44219f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = uc0Var2.f44219f;
                    if (i12 < bsVarArr3.length) {
                        bsVarArr3[i12].z(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f40954b.p(true);
                return;
            case 7:
                this.f40954b.q();
                return;
            default:
                wc0 wc0Var4 = this.f40954b;
                org.telegram.ui.Components.ei0 ei0Var = wc0Var4.f42935x;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                uc0 uc0Var3 = wc0Var4.f42927a;
                if (uc0Var3 != null && uc0Var3.f44219f != null) {
                    uc0Var3.setText("");
                    uc0Var3.f44219f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
