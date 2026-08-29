package org.telegram.ui.Components;

import android.content.Context;
public final class re extends og {
    public final int f32271h0;
    public final ChatActivityEnterView f32272i0;

    public re(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f32271h0 = i11;
        this.f32272i0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f32271h0) {
            case 0:
                return this.f32272i0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f32271h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32272i0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f32272i0.f26154l3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f32271h0) {
            case 0:
                ff ffVar = this.f32272i0.H0;
                if ((ffVar != null && !ffVar.m0) || this.f31358r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f32271h0) {
            case 0:
                return this.f32272i0.f26197t4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f32271h0) {
            case 0:
                super.setAlpha(f9);
                int i10 = ChatActivityEnterView.f26085i5;
                this.f32272i0.z1();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }
}
