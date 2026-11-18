package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class p60 implements org.telegram.ui.ActionBar.r1 {
    public final int f50720a;
    public final int f50721b;
    public final HashMap f50722c;
    public final boolean d;
    public final boolean f50723e;

    public p60(int i7, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.f50720a = i10;
        this.f50721b = i7;
        this.f50722c = hashMap;
        this.d = z10;
        this.f50723e = z11;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50720a) {
            case 0:
                int i10 = this.f50721b;
                HashMap hashMap = this.f50722c;
                boolean z10 = this.d;
                boolean z11 = this.f50723e;
                String str = LaunchActivity.C1;
                Utilities.f22779e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i10), hashMap, z10, z11, true, 0));
                return;
            case 1:
                int i11 = this.f50721b;
                HashMap hashMap2 = this.f50722c;
                boolean z12 = this.d;
                boolean z13 = this.f50723e;
                String str2 = LaunchActivity.C1;
                Utilities.f22779e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i11), hashMap2, z12, z13, false, 0));
                return;
            default:
                int i12 = this.f50721b;
                HashMap hashMap3 = this.f50722c;
                boolean z14 = this.d;
                boolean z15 = this.f50723e;
                String str3 = LaunchActivity.C1;
                Utilities.f22779e.c(new org.telegram.messenger.k4(org.telegram.messenger.i5.r(i12), hashMap3, z14, z15, true, 0));
                return;
        }
    }
}
