package org.telegram.ui;

import android.widget.FrameLayout;
public final class ib0 implements Runnable {
    public final int f48719a;
    public final pb0 f48720b;

    public ib0(pb0 pb0Var, int i7) {
        this.f48719a = i7;
        this.f48720b = pb0Var;
    }

    @Override
    public final void run() {
        switch (this.f48719a) {
            case 0:
                this.f48720b.o();
                return;
            case 1:
                pb0 pb0Var = this.f48720b;
                pb0Var.postDelayed(new ib0(pb0Var, 2), 150L);
                ib0 ib0Var = pb0Var.T;
                pb0Var.removeCallbacks(ib0Var);
                pb0Var.postDelayed(ib0Var, 3000L);
                pb0Var.S = true;
                return;
            case 2:
                mb0 mb0Var = this.f48720b.f50833a;
                int i7 = 0;
                mb0Var.f46300e = false;
                mb0Var.f46301f[0].requestFocus();
                while (true) {
                    er[] erVarArr = mb0Var.f46301f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 3:
                pb0 pb0Var2 = this.f48720b;
                pb0Var2.postDelayed(new ib0(pb0Var2, 5), 150L);
                return;
            case 4:
                pb0 pb0Var3 = this.f48720b;
                ob0 ob0Var = pb0Var3.R;
                boolean z10 = false;
                pb0Var3.S = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = pb0Var3.f50833a.f46301f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else if (ob0Var.getCurrentView() != pb0Var3.f50837e) {
                        ob0Var.showNext();
                        FrameLayout frameLayout = pb0Var3.h;
                        if (pb0Var3.f50838f.getVisibility() != 0 && pb0Var3.f50834a0.G != 3 && !pb0Var3.Q) {
                            z10 = true;
                        }
                        org.telegram.messenger.g0.X3(frameLayout, z10, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                mb0 mb0Var2 = this.f48720b.f50833a;
                int i11 = 0;
                mb0Var2.f46300e = false;
                mb0Var2.f46301f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = mb0Var2.f46301f;
                    if (i11 < erVarArr3.length) {
                        erVarArr3[i11].A(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f48720b.p(true);
                return;
            case 7:
                this.f48720b.q();
                return;
            default:
                pb0 pb0Var4 = this.f48720b;
                org.telegram.ui.Components.rh0 rh0Var = pb0Var4.f50843x;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                mb0 mb0Var3 = pb0Var4.f50833a;
                if (mb0Var3 != null && mb0Var3.f46301f != null) {
                    mb0Var3.setText("");
                    mb0Var3.f46301f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
