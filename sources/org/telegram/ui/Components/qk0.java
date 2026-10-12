package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qk0 extends s4.i0 {
    public final int f29858c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f29859e;
    public final boolean f29860f;
    public final xk0 h;

    public qk0(xk0 xk0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = xk0Var;
        this.f29858c = i10;
        this.d = context;
        this.f29859e = c6Var;
        this.f29860f = z10;
    }

    @Override
    public final int h() {
        int i10;
        xk0 xk0Var = this.h;
        int size = xk0Var.f32789n.size();
        if (!xk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29858c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f32789n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47901f == 0) {
            ((org.telegram.ui.Cells.o6) d1Var.f47897a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f32789n.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            xk0 xk0Var = this.h;
            zb0 zb0Var = xk0Var.J;
            if (zb0Var != null) {
                if (zb0Var.getParent() != null) {
                    ((ViewGroup) xk0Var.J.getParent()).removeView(xk0Var.J);
                }
            } else {
                xk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f29859e)));
            o6Var.addView(view, w7.w5.d(8.0f, -1));
            o6Var.addView(xk0Var.J, w7.w5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f29858c, this.d, this.f29859e, true, this.f29860f);
        }
        return new s4.d1(o6Var);
    }
}
