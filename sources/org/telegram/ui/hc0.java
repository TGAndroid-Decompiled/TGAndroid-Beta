package org.telegram.ui;
public final class hc0 implements Runnable {
    public final int f46287a;
    public final jc0 f46288b;

    public hc0(jc0 jc0Var, int i7) {
        this.f46287a = i7;
        this.f46288b = jc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46287a) {
            case 0:
                jc0 jc0Var = this.f46288b;
                org.telegram.ui.Components.dh0 dh0Var = jc0Var.f46919e;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                nb0 nb0Var = jc0Var.f46916a;
                if (nb0Var != null) {
                    nb0Var.f43768f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                jc0 jc0Var2 = this.f46288b;
                int i7 = 0;
                jc0Var2.f46925x = false;
                while (true) {
                    dr[] drVarArr = jc0Var2.f46916a.f43768f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                jc0 jc0Var3 = this.f46288b;
                jc0Var3.postDelayed(new hc0(jc0Var3, 3), 150L);
                hc0 hc0Var = jc0Var3.f46926y;
                jc0Var3.removeCallbacks(hc0Var);
                jc0Var3.postDelayed(hc0Var, 3000L);
                jc0Var3.f46925x = true;
                return;
            default:
                nb0 nb0Var2 = this.f46288b.f46916a;
                int i10 = 0;
                nb0Var2.f43767e = false;
                nb0Var2.f43768f[0].requestFocus();
                while (true) {
                    dr[] drVarArr2 = nb0Var2.f43768f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
