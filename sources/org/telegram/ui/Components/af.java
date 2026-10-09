package org.telegram.ui.Components;

import android.content.Context;
public final class af extends xg {
    public final int f24677l0;
    public final ChatActivityEnterView m0;

    public af(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(i10, context, e6Var, true);
        this.f24677l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f24677l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f24677l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.m0.f23948q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f24677l0) {
            case 0:
                pf pfVar = this.m0.L0;
                if ((pfVar != null && !pfVar.f37011q0) || this.f32845r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f24677l0) {
            case 0:
                return this.m0.f23993y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f24677l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f23850n5;
                this.m0.x1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
