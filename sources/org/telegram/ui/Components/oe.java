package org.telegram.ui.Components;

import android.content.Context;
public final class oe extends lg {
    public final int f31363h0;
    public final ChatActivityEnterView f31364i0;

    public oe(ChatActivityEnterView chatActivityEnterView, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, true);
        this.f31363h0 = i10;
        this.f31364i0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f31363h0) {
            case 0:
                return this.f31364i0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f31363h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f31364i0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f31364i0.f26143l3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f31363h0) {
            case 0:
                cf cfVar = this.f31364i0.H0;
                if ((cfVar != null && !cfVar.m0) || this.f30444r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f31363h0) {
            case 0:
                return this.f31364i0.f26186t4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f31363h0) {
            case 0:
                super.setAlpha(f10);
                int i9 = ChatActivityEnterView.f26074i5;
                this.f31364i0.z1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
