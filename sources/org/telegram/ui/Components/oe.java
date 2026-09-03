package org.telegram.ui.Components;

import android.content.Context;
public final class oe extends lg {
    public final int f29742i0;
    public final ChatActivityEnterView f29743j0;

    public oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, true);
        this.f29742i0 = i11;
        this.f29743j0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f29742i0) {
            case 0:
                return this.f29743j0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f29742i0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f29743j0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.D0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f29743j0.f24644m3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f29742i0) {
            case 0:
                cf cfVar = this.f29743j0.I0;
                if ((cfVar != null && !cfVar.f41565n0) || this.f28748r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f29742i0) {
            case 0:
                return this.f29743j0.f24688u4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f29742i0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.f24570j5;
                this.f29743j0.z1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
