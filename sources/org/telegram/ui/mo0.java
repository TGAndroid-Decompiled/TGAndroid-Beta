package org.telegram.ui;

import android.net.Uri;
public final class mo0 implements org.telegram.messenger.c20 {
    public final int f47905a;
    public final so0 f47906b;
    public final boolean f47907c;

    public mo0(so0 so0Var, boolean z9, int i7) {
        this.f47905a = i7;
        this.f47906b = so0Var;
        this.f47907c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f47905a) {
            case 0:
                org.telegram.ui.Components.hc.F(this.f47906b.f49967b.f41391e0, this.f47907c).j();
                return;
            default:
                org.telegram.ui.Components.hc.F(this.f47906b.f49967b.f41391e0, this.f47907c).j();
                return;
        }
    }
}
