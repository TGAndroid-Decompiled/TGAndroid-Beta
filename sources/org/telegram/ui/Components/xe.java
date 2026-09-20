package org.telegram.ui.Components;

import android.content.Context;
public final class xe extends ug {
    public final int f30246l0;
    public final ChatActivityEnterView m0;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.f30246l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f30246l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f30246l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f22043p3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f30246l0) {
            case 0:
                mf mfVar = this.m0.L0;
                if ((mfVar != null && !mfVar.f33078q0) || this.f28673r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f30246l0) {
            case 0:
                return this.m0.f22088x4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f30246l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f21952m5;
                this.m0.y1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
