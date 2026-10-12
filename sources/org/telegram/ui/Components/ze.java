package org.telegram.ui.Components;

import android.content.Context;
public final class ze extends wg {
    public final int f31844l0;
    public final ChatActivityEnterView m0;

    public ze(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f31844l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f31844l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f31844l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f22947q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f31844l0) {
            case 0:
                of ofVar = this.m0.L0;
                if ((ofVar != null && !ofVar.f36854q0) || this.f30881r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f31844l0) {
            case 0:
                return this.m0.f22992y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f31844l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f22849n5;
                this.m0.x1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
