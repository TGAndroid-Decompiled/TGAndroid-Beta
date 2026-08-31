package org.telegram.ui.Components;

import android.content.Context;
public final class oe extends lg {
    public final int f29741i0;
    public final ChatActivityEnterView f29742j0;

    public oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, true);
        this.f29741i0 = i11;
        this.f29742j0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f29741i0) {
            case 0:
                return this.f29742j0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f29741i0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f29742j0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.D0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f29742j0.f24642m3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f29741i0) {
            case 0:
                cf cfVar = this.f29742j0.I0;
                if ((cfVar != null && !cfVar.f41642n0) || this.f28725r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f29741i0) {
            case 0:
                return this.f29742j0.f24686u4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f29741i0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.f24568j5;
                this.f29742j0.z1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
