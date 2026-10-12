package org.telegram.ui;
public final class df0 implements Runnable {
    public final int f35247a;
    public final ff0 f35248b;

    public df0(ff0 ff0Var, int i10) {
        this.f35247a = i10;
        this.f35248b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f35247a) {
            case 0:
                ff0 ff0Var = this.f35248b;
                org.telegram.ui.Components.bk0 bk0Var = ff0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ie0 ie0Var = ff0Var.f35813a;
                if (ie0Var != null) {
                    ie0Var.f36949f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ff0 ff0Var2 = this.f35248b;
                int i10 = 0;
                ff0Var2.f35820w = false;
                while (true) {
                    ks[] ksVarArr = ff0Var2.f35813a.f36949f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ff0 ff0Var3 = this.f35248b;
                ff0Var3.postDelayed(new df0(ff0Var3, 3), 150L);
                df0 df0Var = ff0Var3.f35821x;
                ff0Var3.removeCallbacks(df0Var);
                ff0Var3.postDelayed(df0Var, 3000L);
                ff0Var3.f35820w = true;
                return;
            default:
                ie0 ie0Var2 = this.f35248b.f35813a;
                int i11 = 0;
                ie0Var2.e = false;
                ie0Var2.f36949f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr2 = ie0Var2.f36949f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
