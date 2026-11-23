package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class o60 implements org.telegram.ui.ActionBar.q1 {
    public final int f50555a;
    public final int f50556b;
    public final HashMap f50557c;
    public final boolean d;
    public final boolean f50558e;

    public o60(int i7, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.f50555a = i10;
        this.f50556b = i7;
        this.f50557c = hashMap;
        this.d = z10;
        this.f50558e = z11;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50555a) {
            case 0:
                int i10 = this.f50556b;
                HashMap hashMap = this.f50557c;
                boolean z10 = this.d;
                boolean z11 = this.f50558e;
                String str = LaunchActivity.C1;
                Utilities.f22877e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i10), hashMap, z10, z11, true, 0));
                return;
            case 1:
                int i11 = this.f50556b;
                HashMap hashMap2 = this.f50557c;
                boolean z12 = this.d;
                boolean z13 = this.f50558e;
                String str2 = LaunchActivity.C1;
                Utilities.f22877e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i11), hashMap2, z12, z13, false, 0));
                return;
            default:
                int i12 = this.f50556b;
                HashMap hashMap3 = this.f50557c;
                boolean z14 = this.d;
                boolean z15 = this.f50558e;
                String str3 = LaunchActivity.C1;
                Utilities.f22877e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i12), hashMap3, z14, z15, true, 0));
                return;
        }
    }
}
