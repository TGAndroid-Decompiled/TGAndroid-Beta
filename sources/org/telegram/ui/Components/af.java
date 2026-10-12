package org.telegram.ui.Components;

import android.content.Context;
public final class af extends zg {
    public final int f24298l0;
    public final ChatActivityEnterView m0;

    public af(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f24298l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f24298l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f24298l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                if (!chatActivityEnterView.f23671i3 && ((!chatActivityEnterView.x0() || chatActivityEnterView.f23665h3.b()) && (chatActivityEnterView.c() || chatActivityEnterView.G0 != Integer.MAX_VALUE))) {
                    return false;
                }
                return true;
            default:
                return !this.m0.S3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f24298l0) {
            case 0:
                rf rfVar = this.m0.L0;
                if ((rfVar != null && !rfVar.f37146q0) || this.f33369r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f24298l0) {
            case 0:
                return this.m0.f23628b5;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f24298l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.Q5;
                this.m0.C1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
