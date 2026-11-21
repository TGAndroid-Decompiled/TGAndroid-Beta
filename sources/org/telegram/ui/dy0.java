package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.n5 f47076a;
    public final ey0 f47077b;

    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.f47077b = ey0Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, ey0Var.getResourceProvider());
        textView.setText(org.telegram.messenger.gd.N0(2131751338, null));
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f47076a = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        ey0 ey0Var = this.f47077b;
        String S = org.telegram.messenger.ri.d0(ey0.d0(ey0Var)).S();
        org.telegram.ui.Components.n5 n5Var = this.f47076a;
        if (S != null && S.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(S.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(ey0.e0(ey0Var)).f26661r.get(S);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.f47076a;
        n5Var.setBounds((width - n5Var.f37776s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - n5Var.f37776s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + n5Var.f37776s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f47076a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47076a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47076a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
