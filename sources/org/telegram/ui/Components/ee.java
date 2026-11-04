package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class ee extends bg {
    public final int f33371o0 = 0;
    public final ChatActivityEnterView f33372p0;

    public ee(ChatActivityEnterView chatActivityEnterView, Activity activity, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, activity, e6Var, true);
        this.f33372p0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f33371o0) {
            case 0:
                return this.f33372p0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f33371o0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33372p0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f33372p0.f31189r3;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f33371o0) {
            case 0:
                se seVar = this.f33372p0.M0;
                if ((seVar != null && !seVar.f50493q0) || this.f32198r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f33371o0) {
            case 0:
                return this.f33372p0.f31235z4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f33371o0) {
            case 0:
                super.setAlpha(f10);
                int i3 = ChatActivityEnterView.f31082t5;
                this.f33372p0.A1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public ee(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131231501, context, e6Var, true);
        this.f33372p0 = chatActivityEnterView;
    }
}
