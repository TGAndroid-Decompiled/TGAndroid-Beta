package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
public final class be extends zf {
    public final int f24712n0 = 0;
    public final ChatActivityEnterView f24713o0;

    public be(ChatActivityEnterView chatActivityEnterView, Activity activity, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, activity, p6Var, true);
        this.f24713o0 = chatActivityEnterView;
    }

    @Override
    public boolean d() {
        switch (this.f24712n0) {
            case 0:
                return this.f24713o0.c();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e() {
        switch (this.f24712n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24713o0;
                if (!chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !this.f24713o0.f23773q3;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f24712n0) {
            case 0:
                pe peVar = this.f24713o0.L0;
                if ((peVar != null && !peVar.f38077p0) || this.f33142r > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean j() {
        switch (this.f24712n0) {
            case 0:
                return this.f24713o0.f23820y4;
            default:
                return super.j();
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f24712n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.f23673s5;
                this.f24713o0.y1();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2131231502, context, p6Var, true);
        this.f24713o0 = chatActivityEnterView;
    }
}
