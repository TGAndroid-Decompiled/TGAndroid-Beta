package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class km0 implements mk0 {
    public final int f30202a;
    public final int f30203b;
    public final org.telegram.ui.ActionBar.o2 f30204c;
    public final Object d;

    public km0(Object obj, int i9, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f30202a = i10;
        this.d = obj;
        this.f30203b = i9;
        this.f30204c = o2Var;
    }

    @Override
    public final void a(int i9, View view) {
        hg.r0 r0Var;
        switch (this.f30202a) {
            case 0:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.f32524r;
                gh.f1 f1Var = sm0Var.d;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f30203b).isPremium()) {
                        new zf.x0(this.f30204c, 24, true).show();
                        return;
                    }
                    long j10 = ((pm0) arrayList.get(i9)).f31693a.h;
                    if (sm0Var.h == j10) {
                        r0Var = null;
                    } else {
                        r0Var = ((pm0) arrayList.get(i9)).f31693a;
                    }
                    if (sm0Var.f(r0Var)) {
                        for (int i10 = 0; i10 < f1Var.getChildCount(); i10++) {
                            if (f1Var.getChildAt(i10) == view) {
                                float f10 = 50.0f;
                                if (i10 <= 1) {
                                    if (i10 == 0) {
                                        f10 = 90.0f;
                                    }
                                    f1Var.v0(-AndroidUtilities.dp(f10), 0, null);
                                } else if (i10 >= f1Var.getChildCount() - 2) {
                                    if (i10 == f1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    f1Var.v0(AndroidUtilities.dp(f10), 0, null);
                                }
                            }
                        }
                        f1Var.M(new org.telegram.ui.yq(3));
                        if (sm0Var.h == j10) {
                            sm0Var.h = 0L;
                            return;
                        }
                        sm0Var.h = j10;
                        ((rm0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                zf.k1 k1Var = (zf.k1) this.d;
                if (view instanceof org.telegram.ui.qv0) {
                    org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) view;
                    PremiumPreviewFragment.p0(this.f30203b, qv0Var.f42209f.f38610a);
                    k1Var.showDialog(new zf.x0(this.f30204c, qv0Var.f42209f.f38610a, false));
                    return;
                }
                return;
        }
    }
}
