package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class i60 implements org.telegram.ui.ActionBar.p1 {
    public final int f46125a;
    public final int f46126b;
    public final HashMap f46127c;
    public final boolean d;
    public final boolean f46128e;

    public i60(int i3, HashMap hashMap, boolean z10, boolean z11, int i10) {
        this.f46125a = i10;
        this.f46126b = i3;
        this.f46127c = hashMap;
        this.d = z10;
        this.f46128e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f46125a) {
            case 0:
                int i10 = this.f46126b;
                HashMap hashMap = this.f46127c;
                boolean z10 = this.d;
                boolean z11 = this.f46128e;
                String str = LaunchActivity.E1;
                Utilities.f21387e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i10), hashMap, z10, z11, true));
                return;
            case 1:
                int i11 = this.f46126b;
                HashMap hashMap2 = this.f46127c;
                boolean z12 = this.d;
                boolean z13 = this.f46128e;
                String str2 = LaunchActivity.E1;
                Utilities.f21387e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i11), hashMap2, z12, z13, false));
                return;
            default:
                int i12 = this.f46126b;
                HashMap hashMap3 = this.f46127c;
                boolean z14 = this.d;
                boolean z15 = this.f46128e;
                String str3 = LaunchActivity.E1;
                Utilities.f21387e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i12), hashMap3, z14, z15, true));
                return;
        }
    }
}
