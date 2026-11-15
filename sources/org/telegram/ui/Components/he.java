package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class he extends jg {
    public final int f35218w0 = 0;
    public final ChatActivityEnterView f35219x0;

    public he(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, activity, e6Var, true);
        this.f35219x0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f35218w0) {
            case 0:
                return this.f35219x0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f35218w0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f35219x0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f35219x0.Y3;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f35218w0) {
            case 0:
                org.telegram.ui.bg0 bg0Var = this.f35219x0.M0;
                if ((bg0Var != null && !bg0Var.f45733u0) || this.f35992w > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f35218w0) {
            case 0:
                return this.f35219x0.Q5;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f35218w0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.N6;
                this.f35219x0.T1();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public he(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131231501, context, e6Var, true);
        this.f35219x0 = chatActivityEnterView;
    }
}
