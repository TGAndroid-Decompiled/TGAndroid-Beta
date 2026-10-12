package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f36002a;
    public final i4 f36003b;

    public b0(i4 i4Var, int i10) {
        this.f36002a = i10;
        this.f36003b = i4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f36002a) {
            case 0:
                i4 i4Var = this.f36003b;
                i4Var.getClass();
                try {
                    if (i4Var.f38647f0.getParent() != null) {
                        ((WindowManager) i4Var.L.getSystemService("window")).removeView(i4Var.f38647f0);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                i4 i4Var2 = this.f36003b;
                k0 k0Var = i4Var2.f38648g0;
                if (k0Var != null && i4Var2.f38647f0 != null) {
                    k0Var.setLayerType(0, null);
                    i4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(i4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f36003b, 11));
                return;
            case 3:
                i4 i4Var3 = this.f36003b;
                float currentProgress = 0.7f - i4Var3.f38649h0.f43420d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.s90 s90Var = i4Var3.f38649h0.f43420d0;
                    s90Var.a(s90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(i4Var3.f38651j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f36003b, 11));
                return;
            case 5:
                this.f36003b.K.dismiss(true);
                return;
            case 6:
                this.f36003b.K.dismiss(true);
                return;
            case 7:
                i4 i4Var4 = this.f36003b;
                k0 k0Var2 = i4Var4.f38648g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    i4Var4.Z = 0;
                    i4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f36003b.c0();
                return;
            case 9:
                this.f36003b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f21087a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new s(this.f36003b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f36003b.f0();
                return;
        }
    }
}
