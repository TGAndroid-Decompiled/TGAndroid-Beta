package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ed0 implements Runnable {
    public final int f36638a;
    public final md0 f36639b;

    public ed0(md0 md0Var, int i10) {
        this.f36638a = i10;
        this.f36639b = md0Var;
    }

    @Override
    public final void run() {
        switch (this.f36638a) {
            case 0:
                this.f36639b.p();
                return;
            case 1:
                md0 md0Var = this.f36639b;
                md0Var.postDelayed(new ed0(md0Var, 2), 150L);
                ed0 ed0Var = md0Var.S;
                md0Var.removeCallbacks(ed0Var);
                md0Var.postDelayed(ed0Var, 3000L);
                md0Var.R = true;
                return;
            case 2:
                id0 id0Var = this.f36639b.f39213a;
                int i10 = 0;
                id0Var.e = false;
                id0Var.f40962f[0].requestFocus();
                while (true) {
                    tr[] trVarArr = id0Var.f40962f;
                    if (i10 < trVarArr.length) {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                md0 md0Var2 = this.f36639b;
                md0Var2.postDelayed(new ed0(md0Var2, 5), 150L);
                return;
            case 4:
                md0 md0Var3 = this.f36639b;
                ld0 ld0Var = md0Var3.Q;
                boolean z10 = false;
                md0Var3.R = false;
                int i11 = 0;
                while (true) {
                    tr[] trVarArr2 = md0Var3.f39213a.f40962f;
                    if (i11 < trVarArr2.length) {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ld0Var.getCurrentView() != md0Var3.e) {
                        ld0Var.showNext();
                        FrameLayout frameLayout = md0Var3.h;
                        if (md0Var3.f39216f.getVisibility() != 0 && md0Var3.W.F != 3 && !md0Var3.P) {
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
                id0 id0Var2 = this.f36639b.f39213a;
                int i12 = 0;
                id0Var2.e = false;
                id0Var2.f40962f[0].requestFocus();
                while (true) {
                    tr[] trVarArr3 = id0Var2.f40962f;
                    if (i12 < trVarArr3.length) {
                        trVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f36639b.q(true);
                return;
            case 7:
                this.f36639b.r();
                return;
            default:
                md0 md0Var4 = this.f36639b;
                org.telegram.ui.Components.yj0 yj0Var = md0Var4.f39220w;
                yj0Var.getAnimatedDrawable().N(0, false, false);
                yj0Var.d();
                id0 id0Var3 = md0Var4.f39213a;
                if (id0Var3 != null && id0Var3.f40962f != null) {
                    id0Var3.setText("");
                    id0Var3.f40962f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
