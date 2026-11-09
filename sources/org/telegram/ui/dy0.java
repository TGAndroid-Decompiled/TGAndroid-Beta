package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.g5 f45132a;
    public final ey0 f45133b;

    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.f45133b = ey0Var;
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.G6, ey0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.id.M0(2131751350, null));
        addView(g10, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f45132a = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z9) {
        ey0 ey0Var = this.f45133b;
        String Q = org.telegram.messenger.ui.b0(ey0.d0(ey0Var)).Q();
        org.telegram.ui.Components.g5 g5Var = this.f45132a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                g5Var.j(Long.parseLong(Q.substring(9)), z9);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(ey0.e0(ey0Var)).f25836r.get(Q);
        if (tL_availableReaction != null) {
            g5Var.i(tL_availableReaction.static_icon, z9);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.g5 g5Var = this.f45132a;
        g5Var.setBounds((width - g5Var.f33869s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.f33869s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.f33869s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f45132a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45132a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45132a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
