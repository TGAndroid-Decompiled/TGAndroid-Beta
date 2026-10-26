package org.telegram.ui.Components;

import android.content.Context;
public final class xe extends vg {
    public final int f34700n0;
    public final ChatActivityEnterView f34701o0;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(i10, context, u6Var, true);
        this.f34700n0 = i11;
        this.f34701o0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f34700n0) {
            case 0:
                return this.f34701o0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f34700n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34701o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f34701o0.f25944q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f34700n0) {
            case 0:
                mf mfVar = this.f34701o0.L0;
                if ((mfVar != null && !mfVar.f41923p0) || this.f33663r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f34700n0) {
            case 0:
                return this.f34701o0.f25989y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f34700n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f25843r5;
                this.f34701o0.w1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
