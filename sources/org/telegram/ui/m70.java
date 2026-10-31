package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class m70 implements org.telegram.ui.ActionBar.u1 {
    public final int f39494a;
    public final int f39495b;
    public final HashMap f39496c;
    public final boolean d;
    public final boolean e;

    public m70(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f39494a = i11;
        this.f39495b = i10;
        this.f39496c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39494a) {
            case 0:
                int i11 = this.f39495b;
                HashMap hashMap = this.f39496c;
                boolean z10 = this.d;
                boolean z11 = this.e;
                Pattern pattern = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i11), hashMap, z10, z11, true));
                return;
            case 1:
                int i12 = this.f39495b;
                HashMap hashMap2 = this.f39496c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                Pattern pattern2 = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i12), hashMap2, z12, z13, false));
                return;
            default:
                int i13 = this.f39495b;
                HashMap hashMap3 = this.f39496c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                Pattern pattern3 = LaunchActivity.D1;
                Utilities.e.c(new org.telegram.messenger.m4(org.telegram.messenger.i5.r(i13), hashMap3, z14, z15, true));
                return;
        }
    }
}
