package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a0 implements Runnable {
    public final int f34302a;
    public final i4 f34303b;

    public a0(i4 i4Var, int i10) {
        this.f34302a = i10;
        this.f34303b = i4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f34302a) {
            case 0:
                i4 i4Var = this.f34303b;
                i4Var.getClass();
                try {
                    if (i4Var.f37245f0.getParent() != null) {
                        ((WindowManager) i4Var.L.getSystemService("window")).removeView(i4Var.f37245f0);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                i4 i4Var2 = this.f34303b;
                j0 j0Var = i4Var2.f37246g0;
                if (j0Var != null && i4Var2.f37245f0 != null) {
                    j0Var.setLayerType(0, null);
                    i4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(i4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a0(this.f34303b, 11));
                return;
            case 3:
                i4 i4Var3 = this.f34303b;
                float currentProgress = 0.7f - i4Var3.f37247h0.f42307d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.m80 m80Var = i4Var3.f37247h0.f42307d0;
                    m80Var.a(m80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(i4Var3.f37249j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a0(this.f34303b, 11));
                return;
            case 5:
                this.f34303b.K.dismiss(true);
                return;
            case 6:
                this.f34303b.K.dismiss(true);
                return;
            case 7:
                i4 i4Var4 = this.f34303b;
                j0 j0Var2 = i4Var4.f37246g0;
                if (j0Var2 != null) {
                    j0Var2.setLayerType(0, null);
                    i4Var4.Z = 0;
                    i4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f34303b.c0();
                return;
            case 9:
                this.f34303b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f21169a = true;
                    U.showAsSheet(new org.telegram.ui.web.a2(new r(this.f34303b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f34303b.f0();
                return;
        }
    }
}
