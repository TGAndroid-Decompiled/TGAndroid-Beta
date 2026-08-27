package org.telegram.ui;

public final class ke0 implements Runnable {

    public final int f39706a;

    public final me0 f39707b;

    public ke0(me0 me0Var, int i10) {
        this.f39706a = i10;
        this.f39707b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f39706a) {
            case 0:
                me0 me0Var = this.f39707b;
                org.telegram.ui.Components.ri0 ri0Var = me0Var.f40457e;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                od0 od0Var = me0Var.f40454a;
                if (od0Var != null) {
                    od0Var.f43279f[0].requestFocus();
                }
                break;
            case 1:
                me0 me0Var2 = this.f39707b;
                int i10 = 0;
                me0Var2.f40462w = false;
                while (true) {
                    wr[] wrVarArr = me0Var2.f40454a.f43279f;
                    if (i10 < wrVarArr.length) {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                    break;
                }
                break;
            case 2:
                me0 me0Var3 = this.f39707b;
                me0Var3.postDelayed(new ke0(me0Var3, 3), 150L);
                ke0 ke0Var = me0Var3.f40463x;
                me0Var3.removeCallbacks(ke0Var);
                me0Var3.postDelayed(ke0Var, 3000L);
                me0Var3.f40462w = true;
                break;
            default:
                od0 od0Var2 = this.f39707b.f40454a;
                int i11 = 0;
                od0Var2.f43278e = false;
                od0Var2.f43279f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr2 = od0Var2.f43279f;
                    if (i11 < wrVarArr2.length) {
                        wrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}
