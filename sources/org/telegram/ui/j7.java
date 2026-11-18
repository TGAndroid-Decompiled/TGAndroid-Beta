package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class j7 extends FrameLayout {
    public final org.telegram.ui.Components.mp f48889a;
    public final FrameLayout f48890b;
    public final TextView f48891c;
    public boolean d;
    public int f48892e;
    public final int f48893f;
    public final f7 h;

    public j7(f7 f7Var, Context context, int i7) {
        super(context);
        this.f48893f = i7;
        this.h = f7Var;
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(21, context, null);
        this.f48889a = mpVar;
        mpVar.setDrawBackgroundAsArc(14);
        mpVar.b(org.telegram.ui.ActionBar.n6.i7, org.telegram.ui.ActionBar.n6.f29452g7, org.telegram.ui.ActionBar.n6.f29526k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48890b = frameLayout;
        TextView textView = new TextView(context);
        this.f48891c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29578n6, null);
        if (org.telegram.messenger.gd.f24216a0) {
            addView(mpVar, c8.ma.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, c8.ma.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, c8.ma.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, c8.ma.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(mpVar, c8.ma.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, c8.ma.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ma.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, c8.ma.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.gd.f24216a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
            }
        }
    }
}
