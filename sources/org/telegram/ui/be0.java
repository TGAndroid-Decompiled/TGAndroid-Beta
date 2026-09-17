package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class be0 implements Runnable {
    public final int f32108a;
    public final ie0 f32109b;

    public be0(ie0 ie0Var, int i10) {
        this.f32108a = i10;
        this.f32109b = ie0Var;
    }

    @Override
    public final void run() {
        switch (this.f32108a) {
            case 0:
                this.f32109b.p();
                return;
            case 1:
                ie0 ie0Var = this.f32109b;
                ie0Var.postDelayed(new be0(ie0Var, 2), 150L);
                be0 be0Var = ie0Var.S;
                ie0Var.removeCallbacks(be0Var);
                ie0Var.postDelayed(be0Var, 3000L);
                ie0Var.R = true;
                return;
            case 2:
                fe0 fe0Var = this.f32109b.f34541a;
                int i10 = 0;
                fe0Var.e = false;
                fe0Var.f33749f[0].requestFocus();
                while (true) {
                    is[] isVarArr = fe0Var.f33749f;
                    if (i10 < isVarArr.length) {
                        isVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ie0 ie0Var2 = this.f32109b;
                ie0Var2.postDelayed(new be0(ie0Var2, 5), 150L);
                return;
            case 4:
                ie0 ie0Var3 = this.f32109b;
                he0 he0Var = ie0Var3.Q;
                boolean z10 = false;
                ie0Var3.R = false;
                int i11 = 0;
                while (true) {
                    is[] isVarArr2 = ie0Var3.f34541a.f33749f;
                    if (i11 < isVarArr2.length) {
                        isVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (he0Var.getCurrentView() != ie0Var3.e) {
                        he0Var.showNext();
                        FrameLayout frameLayout = ie0Var3.h;
                        if (ie0Var3.f34544f.getVisibility() != 0 && ie0Var3.W.F != 3 && !ie0Var3.P) {
                            z10 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                fe0 fe0Var2 = this.f32109b.f34541a;
                int i12 = 0;
                fe0Var2.e = false;
                fe0Var2.f33749f[0].requestFocus();
                while (true) {
                    is[] isVarArr3 = fe0Var2.f33749f;
                    if (i12 < isVarArr3.length) {
                        isVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f32109b.q(true);
                return;
            case 7:
                this.f32109b.r();
                return;
            default:
                ie0 ie0Var4 = this.f32109b;
                org.telegram.ui.Components.bj0 bj0Var = ie0Var4.f34548w;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                fe0 fe0Var3 = ie0Var4.f34541a;
                if (fe0Var3 != null && fe0Var3.f33749f != null) {
                    fe0Var3.setText("");
                    fe0Var3.f33749f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
