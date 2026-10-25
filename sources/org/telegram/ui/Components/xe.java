package org.telegram.ui.Components;

import android.content.Context;
public final class xe extends vg {
    public final int f34697n0;
    public final ChatActivityEnterView f34698o0;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(i10, context, u6Var, true);
        this.f34697n0 = i11;
        this.f34698o0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f34697n0) {
            case 0:
                return this.f34698o0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f34697n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34698o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f34698o0.f25942q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f34697n0) {
            case 0:
                mf mfVar = this.f34698o0.L0;
                if ((mfVar != null && !mfVar.f41920p0) || this.f33660r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f34697n0) {
            case 0:
                return this.f34698o0.f25987y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f34697n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f25841r5;
                this.f34698o0.w1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
