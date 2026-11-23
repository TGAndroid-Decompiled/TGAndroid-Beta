package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.lp f49354a;
    public final FrameLayout f49355b;
    public final TextView f49356c;
    public boolean d;
    public int f49357e;
    public final int f49358f;
    public final g7 h;

    public k7(g7 g7Var, Context context, int i7) {
        super(context);
        this.f49358f = i7;
        this.h = g7Var;
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(21, context, null);
        this.f49354a = lpVar;
        lpVar.setDrawBackgroundAsArc(14);
        lpVar.b(org.telegram.ui.ActionBar.n6.i7, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.f29581k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49355b = frameLayout;
        TextView textView = new TextView(context);
        this.f49356c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29633n6, null);
        if (org.telegram.messenger.gd.f24314a0) {
            addView(lpVar, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, c8.na.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, c8.na.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, c8.na.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(lpVar, c8.na.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, c8.na.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.na.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, c8.na.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.gd.f24314a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            }
        }
    }
}
