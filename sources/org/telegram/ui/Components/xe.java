package org.telegram.ui.Components;

import android.content.Context;
public final class xe extends vg {
    public final int f32532n0;
    public final ChatActivityEnterView f32533o0;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, true);
        this.f32532n0 = i11;
        this.f32533o0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f32532n0) {
            case 0:
                return this.f32533o0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f32532n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32533o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f32533o0.f24150q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f32532n0) {
            case 0:
                mf mfVar = this.f32533o0.L0;
                if ((mfVar != null && !mfVar.f40837p0) || this.f31464r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f32532n0) {
            case 0:
                return this.f32533o0.f24196y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f32532n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f24050r5;
                this.f32533o0.w1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
