package org.telegram.ui;
public final class ke0 implements Runnable {
    public final int f38937a;
    public final me0 f38938b;

    public ke0(me0 me0Var, int i10) {
        this.f38937a = i10;
        this.f38938b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f38937a) {
            case 0:
                me0 me0Var = this.f38938b;
                org.telegram.ui.Components.bk0 bk0Var = me0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                od0 od0Var = me0Var.f39523a;
                if (od0Var != null) {
                    od0Var.f41793f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                me0 me0Var2 = this.f38938b;
                int i10 = 0;
                me0Var2.f39530w = false;
                while (true) {
                    vr[] vrVarArr = me0Var2.f39523a.f41793f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                me0 me0Var3 = this.f38938b;
                me0Var3.postDelayed(new ke0(me0Var3, 3), 150L);
                ke0 ke0Var = me0Var3.f39531x;
                me0Var3.removeCallbacks(ke0Var);
                me0Var3.postDelayed(ke0Var, 3000L);
                me0Var3.f39530w = true;
                return;
            default:
                od0 od0Var2 = this.f38938b.f39523a;
                int i11 = 0;
                od0Var2.e = false;
                od0Var2.f41793f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = od0Var2.f41793f;
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
