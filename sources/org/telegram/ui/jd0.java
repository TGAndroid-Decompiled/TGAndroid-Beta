package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements Runnable {
    public final int f38538a;
    public final qd0 f38539b;

    public jd0(qd0 qd0Var, int i10) {
        this.f38538a = i10;
        this.f38539b = qd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38538a) {
            case 0:
                this.f38539b.o();
                return;
            case 1:
                qd0 qd0Var = this.f38539b;
                qd0Var.postDelayed(new jd0(qd0Var, 2), 150L);
                jd0 jd0Var = qd0Var.S;
                qd0Var.removeCallbacks(jd0Var);
                qd0Var.postDelayed(jd0Var, 3000L);
                qd0Var.R = true;
                return;
            case 2:
                nd0 nd0Var = this.f38539b.f40783a;
                int i10 = 0;
                nd0Var.e = false;
                nd0Var.f41792f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = nd0Var.f41792f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                qd0 qd0Var2 = this.f38539b;
                qd0Var2.postDelayed(new jd0(qd0Var2, 5), 150L);
                return;
            case 4:
                qd0 qd0Var3 = this.f38539b;
                pd0 pd0Var = qd0Var3.Q;
                boolean z10 = false;
                qd0Var3.R = false;
                int i11 = 0;
                while (true) {
                    vr[] vrVarArr2 = qd0Var3.f40783a.f41792f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (pd0Var.getCurrentView() != qd0Var3.e) {
                        pd0Var.showNext();
                        FrameLayout frameLayout = qd0Var3.h;
                        if (qd0Var3.f40786f.getVisibility() != 0 && qd0Var3.W.F != 3 && !qd0Var3.P) {
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
                nd0 nd0Var2 = this.f38539b.f40783a;
                int i12 = 0;
                nd0Var2.e = false;
                nd0Var2.f41792f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = nd0Var2.f41792f;
                    if (i12 < vrVarArr3.length) {
                        vrVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38539b.p(true);
                return;
            case 7:
                this.f38539b.q();
                return;
            default:
                qd0 qd0Var4 = this.f38539b;
                org.telegram.ui.Components.ak0 ak0Var = qd0Var4.f40790w;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                nd0 nd0Var3 = qd0Var4.f40783a;
                if (nd0Var3 != null && nd0Var3.f41792f != null) {
                    nd0Var3.setText("");
                    nd0Var3.f41792f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
