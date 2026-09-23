package org.telegram.ui.Components;

import android.content.Context;
public final class xe extends ug {
    public final int f29987l0;
    public final ChatActivityEnterView m0;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, true);
        this.f29987l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f29987l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f29987l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f21793p3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f29987l0) {
            case 0:
                mf mfVar = this.m0.L0;
                if ((mfVar != null && !mfVar.f39016q0) || this.f28497r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f29987l0) {
            case 0:
                return this.m0.f21843y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f29987l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f21701n5;
                this.m0.A1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
