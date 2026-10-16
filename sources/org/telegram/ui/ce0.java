package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ce0 implements Runnable {
    public final int f34575a;
    public final je0 f34576b;

    public ce0(je0 je0Var, int i10) {
        this.f34575a = i10;
        this.f34576b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f34575a) {
            case 0:
                this.f34576b.p();
                return;
            case 1:
                je0 je0Var = this.f34576b;
                je0Var.postDelayed(new ce0(je0Var, 2), 150L);
                ce0 ce0Var = je0Var.S;
                je0Var.removeCallbacks(ce0Var);
                je0Var.postDelayed(ce0Var, 3000L);
                je0Var.R = true;
                return;
            case 2:
                ge0 ge0Var = this.f34576b.f37030a;
                int i10 = 0;
                ge0Var.e = false;
                ge0Var.f36645f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr = ge0Var.f36645f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                je0 je0Var2 = this.f34576b;
                je0Var2.postDelayed(new ce0(je0Var2, 5), 150L);
                return;
            case 4:
                je0 je0Var3 = this.f34576b;
                ie0 ie0Var = je0Var3.Q;
                boolean z10 = false;
                je0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ks[] ksVarArr2 = je0Var3.f37030a.f36645f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ie0Var.getCurrentView() != je0Var3.e) {
                        ie0Var.showNext();
                        FrameLayout frameLayout = je0Var3.h;
                        if (je0Var3.f37033f.getVisibility() != 0 && je0Var3.W.F != 3 && !je0Var3.P) {
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
                ge0 ge0Var2 = this.f34576b.f37030a;
                int i12 = 0;
                ge0Var2.e = false;
                ge0Var2.f36645f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = ge0Var2.f36645f;
                    if (i12 < ksVarArr3.length) {
                        ksVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f34576b.q(true);
                return;
            case 7:
                this.f34576b.r();
                return;
            default:
                je0 je0Var4 = this.f34576b;
                org.telegram.ui.Components.bk0 bk0Var = je0Var4.f37037w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ge0 ge0Var3 = je0Var4.f37030a;
                if (ge0Var3 != null && ge0Var3.f36645f != null) {
                    ge0Var3.setText("");
                    ge0Var3.f36645f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
