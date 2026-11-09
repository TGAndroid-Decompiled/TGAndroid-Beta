package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class q60 implements org.telegram.ui.ActionBar.r1 {
    public final int f48935a;
    public final int f48936b;
    public final HashMap f48937c;
    public final boolean d;
    public final boolean f48938e;

    public q60(int i7, HashMap hashMap, boolean z9, boolean z10, int i10) {
        this.f48935a = i10;
        this.f48936b = i7;
        this.f48937c = hashMap;
        this.d = z9;
        this.f48938e = z10;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48935a) {
            case 0:
                int i10 = this.f48936b;
                HashMap hashMap = this.f48937c;
                boolean z9 = this.d;
                boolean z10 = this.f48938e;
                String str = LaunchActivity.B1;
                Utilities.f21336e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i10), hashMap, z9, z10, true));
                return;
            case 1:
                int i11 = this.f48936b;
                HashMap hashMap2 = this.f48937c;
                boolean z11 = this.d;
                boolean z12 = this.f48938e;
                String str2 = LaunchActivity.B1;
                Utilities.f21336e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i11), hashMap2, z11, z12, false));
                return;
            default:
                int i12 = this.f48936b;
                HashMap hashMap3 = this.f48937c;
                boolean z13 = this.d;
                boolean z14 = this.f48938e;
                String str3 = LaunchActivity.B1;
                Utilities.f21336e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i12), hashMap3, z13, z14, true));
                return;
        }
    }
}
