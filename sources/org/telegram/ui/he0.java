package org.telegram.ui;
public final class he0 implements Runnable {
    public final int f39992a;
    public final je0 f39993b;

    public he0(je0 je0Var, int i10) {
        this.f39992a = i10;
        this.f39993b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f39992a) {
            case 0:
                je0 je0Var = this.f39993b;
                org.telegram.ui.Components.ak0 ak0Var = je0Var.e;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                ld0 ld0Var = je0Var.f40572a;
                if (ld0Var != null) {
                    ld0Var.f44894f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                je0 je0Var2 = this.f39993b;
                int i10 = 0;
                je0Var2.f40579w = false;
                while (true) {
                    xr[] xrVarArr = je0Var2.f40572a.f44894f;
                    if (i10 < xrVarArr.length) {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                je0 je0Var3 = this.f39993b;
                je0Var3.postDelayed(new he0(je0Var3, 3), 150L);
                he0 he0Var = je0Var3.f40580x;
                je0Var3.removeCallbacks(he0Var);
                je0Var3.postDelayed(he0Var, 3000L);
                je0Var3.f40579w = true;
                return;
            default:
                ld0 ld0Var2 = this.f39993b.f40572a;
                int i11 = 0;
                ld0Var2.e = false;
                ld0Var2.f44894f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr2 = ld0Var2.f44894f;
                    if (i11 < xrVarArr2.length) {
                        xrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
