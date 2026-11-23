package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class re extends ug {
    public final int f39174y0 = 0;
    public final ChatActivityEnterView f39175z0;

    public re(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, activity, h6Var, true);
        this.f39175z0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f39174y0) {
            case 0:
                return this.f39175z0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f39174y0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39175z0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f39175z0.f32626g4;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f39174y0) {
            case 0:
                org.telegram.ui.eg0 eg0Var = this.f39175z0.M0;
                if ((eg0Var != null && !eg0Var.f47290u0) || this.f40356w > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f39174y0) {
            case 0:
                return this.f39175z0.Y5;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39174y0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.f32569s7;
                this.f39175z0.g2();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public re(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2131231502, context, h6Var, true);
        this.f39175z0 = chatActivityEnterView;
    }
}
