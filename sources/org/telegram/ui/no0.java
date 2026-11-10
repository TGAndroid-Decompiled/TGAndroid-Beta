package org.telegram.ui;

import android.net.Uri;
public final class no0 implements org.telegram.messenger.c20 {
    public final int f48238a;
    public final to0 f48239b;
    public final boolean f48240c;

    public no0(to0 to0Var, boolean z9, int i7) {
        this.f48238a = i7;
        this.f48239b = to0Var;
        this.f48240c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f48238a) {
            case 0:
                org.telegram.ui.Components.gc.F(this.f48239b.f50316b.f41382e0, this.f48240c).j();
                return;
            default:
                org.telegram.ui.Components.gc.F(this.f48239b.f50316b.f41382e0, this.f48240c).j();
                return;
        }
    }
}
