package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class fe extends cg {
    public final int f33537n0 = 0;
    public final ChatActivityEnterView f33538o0;

    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, activity, h6Var, true);
        this.f33538o0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f33537n0) {
            case 0:
                return this.f33538o0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f33537n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33538o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f33538o0.f31128q3;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f33537n0) {
            case 0:
                te teVar = this.f33538o0.L0;
                if ((teVar != null && !teVar.f45288p0) || this.f32576r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f33537n0) {
            case 0:
                return this.f33538o0.f31176y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f33537n0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.s5;
                this.f33538o0.B1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2131231501, context, h6Var, true);
        this.f33538o0 = chatActivityEnterView;
    }
}
