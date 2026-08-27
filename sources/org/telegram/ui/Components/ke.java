package org.telegram.ui.Components;

import android.content.Context;

public final class ke extends hg {

    public final int f30081h0;

    public final ChatActivityEnterView f30082i0;

    public ke(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f30081h0 = i11;
        this.f30082i0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f30081h0) {
            case 0:
                return this.f30082i0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f30081h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30082i0;
                return !chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE;
            default:
                return !this.f30082i0.f26139l3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f30081h0) {
            case 0:
                ye yeVar = this.f30082i0.H0;
                return !(yeVar == null || yeVar.m0) || this.f29001r > 0;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f30081h0) {
            case 0:
                return this.f30082i0.f26182t4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f30081h0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.f26070i5;
                this.f30082i0.y1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}
