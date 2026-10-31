package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class oz0 extends FrameLayout {
    public final org.telegram.ui.Components.d5 f40401a;
    public final pz0 f40402b;

    public oz0(pz0 pz0Var, Context context) {
        super(context);
        this.f40402b = pz0Var;
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.G6, pz0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.cd.L0(2131751351, null));
        addView(g10, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f40401a = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        pz0 pz0Var = this.f40402b;
        String Q = org.telegram.messenger.ui.b0(pz0.c0(pz0Var)).Q();
        org.telegram.ui.Components.d5 d5Var = this.f40401a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                d5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(pz0.d0(pz0Var)).f18341r.get(Q);
        if (tL_availableReaction != null) {
            d5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.d5 d5Var = this.f40401a;
        d5Var.setBounds((width - d5Var.f25304s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.f25304s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.f25304s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f40401a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40401a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40401a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }
}
