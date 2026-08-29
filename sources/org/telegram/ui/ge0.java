package org.telegram.ui;
public final class ge0 implements Runnable {
    public final int f38569a;
    public final ie0 f38570b;

    public ge0(ie0 ie0Var, int i10) {
        this.f38569a = i10;
        this.f38570b = ie0Var;
    }

    @Override
    public final void run() {
        switch (this.f38569a) {
            case 0:
                ie0 ie0Var = this.f38570b;
                org.telegram.ui.Components.aj0 aj0Var = ie0Var.f39219e;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                md0 md0Var = ie0Var.f39216a;
                if (md0Var != null) {
                    md0Var.f42455f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ie0 ie0Var2 = this.f38570b;
                int i10 = 0;
                ie0Var2.f39224w = false;
                while (true) {
                    ur[] urVarArr = ie0Var2.f39216a.f42455f;
                    if (i10 < urVarArr.length) {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ie0 ie0Var3 = this.f38570b;
                ie0Var3.postDelayed(new ge0(ie0Var3, 3), 150L);
                ge0 ge0Var = ie0Var3.f39225x;
                ie0Var3.removeCallbacks(ge0Var);
                ie0Var3.postDelayed(ge0Var, 3000L);
                ie0Var3.f39224w = true;
                return;
            default:
                md0 md0Var2 = this.f38570b.f39216a;
                int i11 = 0;
                md0Var2.f42454e = false;
                md0Var2.f42455f[0].requestFocus();
                while (true) {
                    ur[] urVarArr2 = md0Var2.f42455f;
                    if (i11 < urVarArr2.length) {
                        urVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
