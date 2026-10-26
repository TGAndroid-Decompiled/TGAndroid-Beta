package org.telegram.ui;
public final class he0 implements Runnable {
    public final int f39995a;
    public final je0 f39996b;

    public he0(je0 je0Var, int i10) {
        this.f39995a = i10;
        this.f39996b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f39995a) {
            case 0:
                je0 je0Var = this.f39996b;
                org.telegram.ui.Components.ak0 ak0Var = je0Var.e;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                ld0 ld0Var = je0Var.f40575a;
                if (ld0Var != null) {
                    ld0Var.f44897f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                je0 je0Var2 = this.f39996b;
                int i10 = 0;
                je0Var2.f40582w = false;
                while (true) {
                    xr[] xrVarArr = je0Var2.f40575a.f44897f;
                    if (i10 < xrVarArr.length) {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                je0 je0Var3 = this.f39996b;
                je0Var3.postDelayed(new he0(je0Var3, 3), 150L);
                he0 he0Var = je0Var3.f40583x;
                je0Var3.removeCallbacks(he0Var);
                je0Var3.postDelayed(he0Var, 3000L);
                je0Var3.f40582w = true;
                return;
            default:
                ld0 ld0Var2 = this.f39996b.f40575a;
                int i11 = 0;
                ld0Var2.e = false;
                ld0Var2.f44897f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr2 = ld0Var2.f44897f;
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
