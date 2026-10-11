package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ok0 extends s4.i0 {
    public final int f29548c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f29549e;
    public final boolean f29550f;
    public final vk0 h;

    public ok0(vk0 vk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = vk0Var;
        this.f29548c = i10;
        this.d = context;
        this.f29549e = d6Var;
        this.f29550f = z10;
    }

    @Override
    public final int h() {
        int i10;
        vk0 vk0Var = this.h;
        int size = vk0Var.f31909n.size();
        if (!vk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29548c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31909n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47786f == 0) {
            ((org.telegram.ui.Cells.o6) d1Var.f47782a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31909n.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            vk0 vk0Var = this.h;
            vb0 vb0Var = vk0Var.J;
            if (vb0Var != null) {
                if (vb0Var.getParent() != null) {
                    ((ViewGroup) vk0Var.J.getParent()).removeView(vk0Var.J);
                }
            } else {
                vk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f29549e)));
            o6Var.addView(view, w7.x5.d(8.0f, -1));
            o6Var.addView(vk0Var.J, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f29548c, this.d, this.f29549e, true, this.f29550f);
        }
        return new s4.d1(o6Var);
    }
}
