package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.wo f47126a;
    public final FrameLayout f47127b;
    public final TextView f47128c;
    public boolean d;
    public int f47129e;
    public final int f47130f;
    public final h7 h;

    public l7(h7 h7Var, Context context, int i3) {
        super(context);
        this.f47130f = i3;
        this.h = h7Var;
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f47126a = woVar;
        woVar.setDrawBackgroundAsArc(14);
        woVar.b(org.telegram.ui.ActionBar.k6.f27973i7, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47127b = frameLayout;
        TextView textView = new TextView(context);
        this.f47128c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28062n6, null);
        if (org.telegram.messenger.bd.f21784a0) {
            addView(woVar, b8.mf.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, b8.mf.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, b8.mf.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, b8.mf.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(woVar, b8.mf.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, b8.mf.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, b8.mf.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, b8.mf.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.bd.f21784a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            }
        }
    }
}
