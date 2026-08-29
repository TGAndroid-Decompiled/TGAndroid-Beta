package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class id0 implements Runnable {
    public final int f39210a;
    public final pd0 f39211b;

    public id0(pd0 pd0Var, int i10) {
        this.f39210a = i10;
        this.f39211b = pd0Var;
    }

    @Override
    public final void run() {
        switch (this.f39210a) {
            case 0:
                this.f39211b.p();
                return;
            case 1:
                pd0 pd0Var = this.f39211b;
                pd0Var.postDelayed(new id0(pd0Var, 2), 150L);
                id0 id0Var = pd0Var.O;
                pd0Var.removeCallbacks(id0Var);
                pd0Var.postDelayed(id0Var, 3000L);
                pd0Var.N = true;
                return;
            case 2:
                md0 md0Var = this.f39211b.f41371a;
                int i10 = 0;
                md0Var.f42454e = false;
                md0Var.f42455f[0].requestFocus();
                while (true) {
                    ur[] urVarArr = md0Var.f42455f;
                    if (i10 < urVarArr.length) {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                pd0 pd0Var2 = this.f39211b;
                pd0Var2.postDelayed(new id0(pd0Var2, 5), 150L);
                return;
            case 4:
                pd0 pd0Var3 = this.f39211b;
                od0 od0Var = pd0Var3.M;
                boolean z10 = false;
                pd0Var3.N = false;
                int i11 = 0;
                while (true) {
                    ur[] urVarArr2 = pd0Var3.f41371a.f42455f;
                    if (i11 < urVarArr2.length) {
                        urVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (od0Var.getCurrentView() != pd0Var3.f41374e) {
                        od0Var.showNext();
                        FrameLayout frameLayout = pd0Var3.h;
                        if (pd0Var3.f41375f.getVisibility() != 0 && pd0Var3.S.B != 3 && !pd0Var3.L) {
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
                md0 md0Var2 = this.f39211b.f41371a;
                int i12 = 0;
                md0Var2.f42454e = false;
                md0Var2.f42455f[0].requestFocus();
                while (true) {
                    ur[] urVarArr3 = md0Var2.f42455f;
                    if (i12 < urVarArr3.length) {
                        urVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f39211b.q(true);
                return;
            case 7:
                this.f39211b.r();
                return;
            default:
                pd0 pd0Var4 = this.f39211b;
                org.telegram.ui.Components.aj0 aj0Var = pd0Var4.f41379w;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                md0 md0Var3 = pd0Var4.f41371a;
                if (md0Var3 != null && md0Var3.f42455f != null) {
                    md0Var3.setText("");
                    md0Var3.f42455f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
