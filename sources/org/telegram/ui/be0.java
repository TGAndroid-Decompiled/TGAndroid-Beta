package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class be0 implements Runnable {
    public final int f32409a;
    public final ie0 f32410b;

    public be0(ie0 ie0Var, int i10) {
        this.f32409a = i10;
        this.f32410b = ie0Var;
    }

    @Override
    public final void run() {
        switch (this.f32409a) {
            case 0:
                this.f32410b.p();
                return;
            case 1:
                ie0 ie0Var = this.f32410b;
                ie0Var.postDelayed(new be0(ie0Var, 2), 150L);
                be0 be0Var = ie0Var.S;
                ie0Var.removeCallbacks(be0Var);
                ie0Var.postDelayed(be0Var, 3000L);
                ie0Var.R = true;
                return;
            case 2:
                fe0 fe0Var = this.f32410b.f34559a;
                int i10 = 0;
                fe0Var.e = false;
                fe0Var.f33145f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr = fe0Var.f33145f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ie0 ie0Var2 = this.f32410b;
                ie0Var2.postDelayed(new be0(ie0Var2, 5), 150L);
                return;
            case 4:
                ie0 ie0Var3 = this.f32410b;
                he0 he0Var = ie0Var3.Q;
                boolean z10 = false;
                ie0Var3.R = false;
                int i11 = 0;
                while (true) {
                    gs[] gsVarArr2 = ie0Var3.f34559a.f33145f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (he0Var.getCurrentView() != ie0Var3.e) {
                        he0Var.showNext();
                        FrameLayout frameLayout = ie0Var3.h;
                        if (ie0Var3.f34562f.getVisibility() != 0 && ie0Var3.W.F != 3 && !ie0Var3.P) {
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
                fe0 fe0Var2 = this.f32410b.f34559a;
                int i12 = 0;
                fe0Var2.e = false;
                fe0Var2.f33145f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = fe0Var2.f33145f;
                    if (i12 < gsVarArr3.length) {
                        gsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f32410b.q(true);
                return;
            case 7:
                this.f32410b.r();
                return;
            default:
                ie0 ie0Var4 = this.f32410b;
                org.telegram.ui.Components.nj0 nj0Var = ie0Var4.f34566w;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                fe0 fe0Var3 = ie0Var4.f34559a;
                if (fe0Var3 != null && fe0Var3.f33145f != null) {
                    fe0Var3.setText("");
                    fe0Var3.f33145f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
