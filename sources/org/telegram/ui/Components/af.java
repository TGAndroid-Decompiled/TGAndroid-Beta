package org.telegram.ui.Components;

import android.content.Context;
public final class af extends xg {
    public final int f24587l0;
    public final ChatActivityEnterView m0;

    public af(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, true);
        this.f24587l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f24587l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f24587l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f23976q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f24587l0) {
            case 0:
                pf pfVar = this.m0.L0;
                if ((pfVar != null && !pfVar.f36778q0) || this.f32973r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f24587l0) {
            case 0:
                return this.m0.f24021y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f24587l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f23878n5;
                this.m0.x1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
