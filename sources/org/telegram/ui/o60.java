package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class o60 implements org.telegram.ui.ActionBar.r1 {
    public final int f48255a;
    public final int f48256b;
    public final HashMap f48257c;
    public final boolean d;
    public final boolean f48258e;

    public o60(int i7, HashMap hashMap, boolean z9, boolean z10, int i10) {
        this.f48255a = i10;
        this.f48256b = i7;
        this.f48257c = hashMap;
        this.d = z9;
        this.f48258e = z10;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48255a) {
            case 0:
                int i10 = this.f48256b;
                HashMap hashMap = this.f48257c;
                boolean z9 = this.d;
                boolean z10 = this.f48258e;
                String str = LaunchActivity.B1;
                Utilities.f21333e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i10), hashMap, z9, z10, true));
                return;
            case 1:
                int i11 = this.f48256b;
                HashMap hashMap2 = this.f48257c;
                boolean z11 = this.d;
                boolean z12 = this.f48258e;
                String str2 = LaunchActivity.B1;
                Utilities.f21333e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i11), hashMap2, z11, z12, false));
                return;
            default:
                int i12 = this.f48256b;
                HashMap hashMap3 = this.f48257c;
                boolean z13 = this.d;
                boolean z14 = this.f48258e;
                String str3 = LaunchActivity.B1;
                Utilities.f21333e.c(new org.telegram.messenger.j4(org.telegram.messenger.g5.r(i12), hashMap3, z13, z14, true));
                return;
        }
    }
}
