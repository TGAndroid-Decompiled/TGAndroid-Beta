package org.telegram.ui.Components;

import android.content.Context;
public final class oe extends lg {
    public final int f27549i0;
    public final ChatActivityEnterView f27550j0;

    public oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.f27549i0 = i11;
        this.f27550j0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f27549i0) {
            case 0:
                return this.f27550j0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f27549i0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27550j0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.D0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f27550j0.f22802m3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f27549i0) {
            case 0:
                cf cfVar = this.f27550j0.I0;
                if ((cfVar != null && !cfVar.f38367n0) || this.f26651r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f27549i0) {
            case 0:
                return this.f27550j0.f22846u4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27549i0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.f22729j5;
                this.f27550j0.z1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
