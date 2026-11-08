package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.wo f47128a;
    public final FrameLayout f47129b;
    public final TextView f47130c;
    public boolean d;
    public int f47131e;
    public final int f47132f;
    public final g7 h;

    public k7(g7 g7Var, Context context, int i7) {
        super(context);
        this.f47132f = i7;
        this.h = g7Var;
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f47128a = woVar;
        woVar.setDrawBackgroundAsArc(14);
        woVar.b(org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47129b = frameLayout;
        TextView textView = new TextView(context);
        this.f47130c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28034n6, null);
        if (org.telegram.messenger.id.f23157a0) {
            addView(woVar, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, c8.ha.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, c8.ha.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, c8.ha.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(woVar, c8.ha.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, c8.ha.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ha.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, c8.ha.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.id.f23157a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
            }
        }
    }
}
