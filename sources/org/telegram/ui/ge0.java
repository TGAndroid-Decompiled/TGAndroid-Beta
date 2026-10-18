package org.telegram.ui;
public final class ge0 implements Runnable {
    public final int f37166a;
    public final ie0 f37167b;

    public ge0(ie0 ie0Var, int i10) {
        this.f37166a = i10;
        this.f37167b = ie0Var;
    }

    @Override
    public final void run() {
        switch (this.f37166a) {
            case 0:
                ie0 ie0Var = this.f37167b;
                org.telegram.ui.Components.xj0 xj0Var = ie0Var.e;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                kd0 kd0Var = ie0Var.f37842a;
                if (kd0Var != null) {
                    kd0Var.f41477f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ie0 ie0Var2 = this.f37167b;
                int i10 = 0;
                ie0Var2.f37849w = false;
                while (true) {
                    vr[] vrVarArr = ie0Var2.f37842a.f41477f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ie0 ie0Var3 = this.f37167b;
                ie0Var3.postDelayed(new ge0(ie0Var3, 3), 150L);
                ge0 ge0Var = ie0Var3.f37850x;
                ie0Var3.removeCallbacks(ge0Var);
                ie0Var3.postDelayed(ge0Var, 3000L);
                ie0Var3.f37849w = true;
                return;
            default:
                kd0 kd0Var2 = this.f37167b.f37842a;
                int i11 = 0;
                kd0Var2.e = false;
                kd0Var2.f41477f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = kd0Var2.f41477f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
