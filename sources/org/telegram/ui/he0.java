package org.telegram.ui;
public final class he0 implements Runnable {
    public final int f38763a;
    public final je0 f38764b;

    public he0(je0 je0Var, int i9) {
        this.f38763a = i9;
        this.f38764b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f38763a) {
            case 0:
                je0 je0Var = this.f38764b;
                org.telegram.ui.Components.pi0 pi0Var = je0Var.f39456e;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                ld0 ld0Var = je0Var.f39453a;
                if (ld0Var != null) {
                    ld0Var.f42755f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                je0 je0Var2 = this.f38764b;
                int i9 = 0;
                je0Var2.f39461w = false;
                while (true) {
                    vr[] vrVarArr = je0Var2.f39453a.f42755f;
                    if (i9 < vrVarArr.length) {
                        vrVarArr[i9].i(0.0f);
                        i9++;
                    } else {
                        return;
                    }
                }
            case 2:
                je0 je0Var3 = this.f38764b;
                je0Var3.postDelayed(new he0(je0Var3, 3), 150L);
                he0 he0Var = je0Var3.f39462x;
                je0Var3.removeCallbacks(he0Var);
                je0Var3.postDelayed(he0Var, 3000L);
                je0Var3.f39461w = true;
                return;
            default:
                ld0 ld0Var2 = this.f38764b.f39453a;
                int i10 = 0;
                ld0Var2.f42754e = false;
                ld0Var2.f42755f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = ld0Var2.f42755f;
                    if (i10 < vrVarArr2.length) {
                        vrVarArr2[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
