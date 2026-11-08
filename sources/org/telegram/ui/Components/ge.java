package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class ge extends dg {
    public final int f33931n0 = 0;
    public final ChatActivityEnterView f33932o0;

    public ge(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, activity, f6Var, true);
        this.f33932o0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f33931n0) {
            case 0:
                return this.f33932o0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f33931n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33932o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f33932o0.f31112q3;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f33931n0) {
            case 0:
                ue ueVar = this.f33932o0.L0;
                if ((ueVar != null && !ueVar.f44338p0) || this.f32902r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f33931n0) {
            case 0:
                return this.f33932o0.f31160y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f33931n0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.s5;
                this.f33932o0.B1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2131231501, context, f6Var, true);
        this.f33932o0 = chatActivityEnterView;
    }
}
