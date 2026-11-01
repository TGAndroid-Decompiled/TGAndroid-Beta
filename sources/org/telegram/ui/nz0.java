package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class nz0 extends FrameLayout {
    public final org.telegram.ui.Components.d5 f39993a;
    public final oz0 f39994b;

    public nz0(oz0 oz0Var, Context context) {
        super(context);
        this.f39994b = oz0Var;
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.G6, oz0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.dd.L0(2131751351, null));
        addView(g10, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f39993a = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        oz0 oz0Var = this.f39994b;
        String Q = org.telegram.messenger.vi.b0(oz0.d0(oz0Var)).Q();
        org.telegram.ui.Components.d5 d5Var = this.f39993a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                d5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(oz0.e0(oz0Var)).f18670r.get(Q);
        if (tL_availableReaction != null) {
            d5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.d5 d5Var = this.f39993a;
        d5Var.setBounds((width - d5Var.f25375s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.f25375s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.f25375s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f39993a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39993a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39993a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }
}
