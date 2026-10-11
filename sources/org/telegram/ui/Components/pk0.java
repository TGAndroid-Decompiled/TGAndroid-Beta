package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pk0 extends s4.i0 {
    public final int f29763c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f29764e;
    public final boolean f29765f;
    public final wk0 h;

    public pk0(wk0 wk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = wk0Var;
        this.f29763c = i10;
        this.d = context;
        this.f29764e = d6Var;
        this.f29765f = z10;
    }

    @Override
    public final int h() {
        int i10;
        wk0 wk0Var = this.h;
        int size = wk0Var.f32668n.size();
        if (!wk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29763c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f32668n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47752f == 0) {
            ((org.telegram.ui.Cells.o6) d1Var.f47748a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f32668n.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            wk0 wk0Var = this.h;
            wb0 wb0Var = wk0Var.J;
            if (wb0Var != null) {
                if (wb0Var.getParent() != null) {
                    ((ViewGroup) wk0Var.J.getParent()).removeView(wk0Var.J);
                }
            } else {
                wk0Var.i();
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f29764e)));
            o6Var.addView(view, w7.x5.d(8.0f, -1));
            o6Var.addView(wk0Var.J, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.f29763c, this.d, this.f29764e, true, this.f29765f);
        }
        return new s4.d1(o6Var);
    }
}
