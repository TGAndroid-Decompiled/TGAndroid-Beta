package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ee0 implements Runnable {
    public final int f35524a;
    public final le0 f35525b;

    public ee0(le0 le0Var, int i10) {
        this.f35524a = i10;
        this.f35525b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f35524a) {
            case 0:
                this.f35525b.p();
                return;
            case 1:
                le0 le0Var = this.f35525b;
                le0Var.postDelayed(new ee0(le0Var, 2), 150L);
                ee0 ee0Var = le0Var.S;
                le0Var.removeCallbacks(ee0Var);
                le0Var.postDelayed(ee0Var, 3000L);
                le0Var.R = true;
                return;
            case 2:
                ie0 ie0Var = this.f35525b.f37930a;
                int i10 = 0;
                ie0Var.e = false;
                ie0Var.f36949f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr = ie0Var.f36949f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                le0 le0Var2 = this.f35525b;
                le0Var2.postDelayed(new ee0(le0Var2, 5), 150L);
                return;
            case 4:
                le0 le0Var3 = this.f35525b;
                ke0 ke0Var = le0Var3.Q;
                boolean z10 = false;
                le0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ks[] ksVarArr2 = le0Var3.f37930a.f36949f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ke0Var.getCurrentView() != le0Var3.e) {
                        ke0Var.showNext();
                        FrameLayout frameLayout = le0Var3.h;
                        if (le0Var3.f37933f.getVisibility() != 0 && le0Var3.W.F != 3 && !le0Var3.P) {
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
                ie0 ie0Var2 = this.f35525b.f37930a;
                int i12 = 0;
                ie0Var2.e = false;
                ie0Var2.f36949f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = ie0Var2.f36949f;
                    if (i12 < ksVarArr3.length) {
                        ksVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f35525b.q(true);
                return;
            case 7:
                this.f35525b.r();
                return;
            default:
                le0 le0Var4 = this.f35525b;
                org.telegram.ui.Components.bk0 bk0Var = le0Var4.f37937w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ie0 ie0Var3 = le0Var4.f37930a;
                if (ie0Var3 != null && ie0Var3.f36949f != null) {
                    ie0Var3.setText("");
                    ie0Var3.f36949f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
