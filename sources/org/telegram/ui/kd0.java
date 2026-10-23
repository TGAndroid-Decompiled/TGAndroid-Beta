package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements Runnable {
    public final int f38930a;
    public final rd0 f38931b;

    public kd0(rd0 rd0Var, int i10) {
        this.f38930a = i10;
        this.f38931b = rd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38930a) {
            case 0:
                this.f38931b.o();
                return;
            case 1:
                rd0 rd0Var = this.f38931b;
                rd0Var.postDelayed(new kd0(rd0Var, 2), 150L);
                kd0 kd0Var = rd0Var.S;
                rd0Var.removeCallbacks(kd0Var);
                rd0Var.postDelayed(kd0Var, 3000L);
                rd0Var.R = true;
                return;
            case 2:
                od0 od0Var = this.f38931b.f41094a;
                int i10 = 0;
                od0Var.e = false;
                od0Var.f41793f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = od0Var.f41793f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                rd0 rd0Var2 = this.f38931b;
                rd0Var2.postDelayed(new kd0(rd0Var2, 5), 150L);
                return;
            case 4:
                rd0 rd0Var3 = this.f38931b;
                qd0 qd0Var = rd0Var3.Q;
                boolean z10 = false;
                rd0Var3.R = false;
                int i11 = 0;
                while (true) {
                    vr[] vrVarArr2 = rd0Var3.f41094a.f41793f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (qd0Var.getCurrentView() != rd0Var3.e) {
                        qd0Var.showNext();
                        FrameLayout frameLayout = rd0Var3.h;
                        if (rd0Var3.f41097f.getVisibility() != 0 && rd0Var3.W.F != 3 && !rd0Var3.P) {
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
                od0 od0Var2 = this.f38931b.f41094a;
                int i12 = 0;
                od0Var2.e = false;
                od0Var2.f41793f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = od0Var2.f41793f;
                    if (i12 < vrVarArr3.length) {
                        vrVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38931b.p(true);
                return;
            case 7:
                this.f38931b.q();
                return;
            default:
                rd0 rd0Var4 = this.f38931b;
                org.telegram.ui.Components.bk0 bk0Var = rd0Var4.f41101w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                od0 od0Var3 = rd0Var4.f41094a;
                if (od0Var3 != null && od0Var3.f41793f != null) {
                    od0Var3.setText("");
                    od0Var3.f41793f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
