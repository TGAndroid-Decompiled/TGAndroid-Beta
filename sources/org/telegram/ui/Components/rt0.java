package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 implements View.OnClickListener {
    public final int f30502a;
    public final org.telegram.ui.ActionBar.f1 f30503b;
    public final org.telegram.ui.ActionBar.f1 f30504c;
    public final tt0 d;

    public rt0(tt0 tt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f30502a = i10;
        this.d = tt0Var;
        this.f30503b = f1Var;
        this.f30504c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30502a) {
            case 0:
                pv0 pv0Var = this.d.d;
                if (!pv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f30503b;
                    boolean z10 = f1Var.getCheckView().f30141a.f24094q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f30504c;
                    if (!z10 && f1Var2.getCheckView().f30141a.f24094q) {
                        float f7 = -pv0Var.f29795s1;
                        pv0Var.f29795s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f30141a.f24094q);
                    if (f1Var2.getCheckView().f30141a.f24094q && f1Var.getCheckView().f30141a.f24094q) {
                        pv0Var.f29797t1[0].f26153q = 0;
                    } else {
                        pv0Var.f29797t1[0].f26153q = 2;
                    }
                    pv0.s(pv0Var);
                    return;
                }
                return;
            default:
                pv0 pv0Var2 = this.d.d;
                if (!pv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f30503b;
                    boolean z11 = f1Var3.getCheckView().f30141a.f24094q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f30504c;
                    if (!z11 && f1Var4.getCheckView().f30141a.f24094q) {
                        float f10 = -pv0Var2.f29795s1;
                        pv0Var2.f29795s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f30141a.f24094q);
                    if (f1Var3.getCheckView().f30141a.f24094q && f1Var4.getCheckView().f30141a.f24094q) {
                        pv0Var2.f29797t1[0].f26153q = 0;
                    } else {
                        pv0Var2.f29797t1[0].f26153q = 1;
                    }
                    pv0.s(pv0Var2);
                    return;
                }
                return;
        }
    }
}
