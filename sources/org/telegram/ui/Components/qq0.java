package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qq0 implements Runnable {
    public final int f29825a;
    public final xu0 f29826b;

    public qq0(xu0 xu0Var, int i10) {
        this.f29825a = i10;
        this.f29826b = xu0Var;
    }

    @Override
    public final void run() {
        switch (this.f29825a) {
            case 0:
                xu0 xu0Var = this.f29826b;
                js jsVar = xu0Var.P0;
                xu0Var.f32708b2 = (int) jsVar.c(AndroidUtilities.dp(14.0f));
                nr0 nr0Var = xu0Var.V;
                if (nr0Var != null) {
                    nr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) jsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qt0[] qt0VarArr = xu0Var.f32729k0;
                if (qt0VarArr != null) {
                    for (qt0 qt0Var : qt0VarArr) {
                        if (qt0Var != null) {
                            int paddingTop = qt0Var.h.getPaddingTop();
                            wr0 wr0Var = qt0Var.h;
                            int paddingLeft = wr0Var.getPaddingLeft();
                            int Z = xu0Var.Z(qt0Var.F);
                            int paddingRight = qt0Var.h.getPaddingRight();
                            wr0 wr0Var2 = qt0Var.h;
                            int Y = xu0Var.Y(xu0Var.v0());
                            wr0Var2.f29516e3 = Y;
                            wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qt0Var.h, new m8(qt0Var, paddingTop - qt0Var.h.getPaddingTop(), 9));
                        }
                    }
                    return;
                }
                return;
            case 1:
                xu0 xu0Var2 = this.f29826b;
                xu0Var2.b1(false);
                xu0Var2.G.h(true);
                xu0Var2.f32704a1 = 0;
                return;
            default:
                this.f29826b.k0();
                return;
        }
    }
}
