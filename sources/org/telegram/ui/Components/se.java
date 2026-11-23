package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class se extends tg {
    public final int f39584y0 = 0;
    public final ChatActivityEnterView f39585z0;

    public se(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, activity, i6Var, true);
        this.f39585z0 = chatActivityEnterView;
    }

    @Override
    public boolean b() {
        switch (this.f39584y0) {
            case 0:
                return this.f39585z0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        switch (this.f39584y0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39585z0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f39585z0.f32690g4;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f39584y0) {
            case 0:
                org.telegram.ui.dg0 dg0Var = this.f39585z0.M0;
                if ((dg0Var != null && !dg0Var.f47118u0) || this.f39944w > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f39584y0) {
            case 0:
                return this.f39585z0.Y5;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39584y0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.f32633s7;
                this.f39585z0.i2();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public se(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2131231505, context, i6Var, true);
        this.f39585z0 = chatActivityEnterView;
    }
}
