package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class by0 extends FrameLayout {
    public final org.telegram.ui.Components.m5 f46663a;
    public final cy0 f46664b;

    public by0(cy0 cy0Var, Context context) {
        super(context);
        this.f46664b = cy0Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, cy0Var.getResourceProvider());
        textView.setText(org.telegram.messenger.gd.N0(2131751338, null));
        addView(textView, c8.na.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f46663a = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        cy0 cy0Var = this.f46664b;
        String S = org.telegram.messenger.ri.d0(cy0.d0(cy0Var)).S();
        org.telegram.ui.Components.m5 m5Var = this.f46663a;
        if (S != null && S.startsWith("animated_")) {
            try {
                m5Var.j(Long.parseLong(S.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(cy0.e0(cy0Var)).f26734r.get(S);
        if (tL_availableReaction != null) {
            m5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.m5 m5Var = this.f46663a;
        m5Var.setBounds((width - m5Var.f37379s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.f37379s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.f37379s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f46663a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46663a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46663a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
