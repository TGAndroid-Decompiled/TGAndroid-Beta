package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class ho0 implements am0 {
    public final int f29041a;
    public final int f29042b;
    public final org.telegram.ui.ActionBar.r2 f29043c;
    public final Object d;

    public ho0(Object obj, int i10, org.telegram.ui.ActionBar.r2 r2Var, int i11) {
        this.f29041a = i11;
        this.d = obj;
        this.f29042b = i10;
        this.f29043c = r2Var;
    }

    @Override
    public final void c(int i10, View view) {
        bh.x0 x0Var;
        switch (this.f29041a) {
            case 0:
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.f31688r;
                bi.r1 r1Var = po0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f29042b).isPremium()) {
                        new tg.y0(this.f29043c, 24, true).show();
                        return;
                    }
                    long j10 = ((mo0) arrayList.get(i10)).f30567a.h;
                    if (po0Var.h == j10) {
                        x0Var = null;
                    } else {
                        x0Var = ((mo0) arrayList.get(i10)).f30567a;
                    }
                    if (po0Var.f(x0Var)) {
                        for (int i11 = 0; i11 < r1Var.getChildCount(); i11++) {
                            if (r1Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    r1Var.w0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= r1Var.getChildCount() - 2) {
                                    if (i11 == r1Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    r1Var.w0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        r1Var.M(new org.telegram.ui.cr(3));
                        if (po0Var.h == j10) {
                            po0Var.h = 0L;
                            return;
                        }
                        po0Var.h = j10;
                        ((oo0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.m1 m1Var = (tg.m1) this.d;
                if (view instanceof org.telegram.ui.iw0) {
                    org.telegram.ui.iw0 iw0Var = (org.telegram.ui.iw0) view;
                    PremiumPreviewFragment.r0(this.f29042b, iw0Var.f40282f.f46094a);
                    m1Var.showDialog(new tg.y0(this.f29043c, iw0Var.f40282f.f46094a, false));
                    return;
                }
                return;
        }
    }
}
