package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.m5 f47087a;
    public final ey0 f47088b;

    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.f47088b = ey0Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, ey0Var.getResourceProvider());
        textView.setText(org.telegram.messenger.gd.M0(2131751339, null));
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f47087a = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        ey0 ey0Var = this.f47088b;
        String S = org.telegram.messenger.ri.d0(ey0.d0(ey0Var)).S();
        org.telegram.ui.Components.m5 m5Var = this.f47087a;
        if (S != null && S.startsWith("animated_")) {
            try {
                m5Var.j(Long.parseLong(S.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(ey0.e0(ey0Var)).f26635r.get(S);
        if (tL_availableReaction != null) {
            m5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.m5 m5Var = this.f47087a;
        m5Var.setBounds((width - m5Var.f37364s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.f37364s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.f37364s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f47087a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47087a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47087a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
