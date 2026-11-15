package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.fp f48604a;
    public final FrameLayout f48605b;
    public final TextView f48606c;
    public boolean d;
    public int f48607e;
    public final int f48608f;
    public final g7 h;

    public k7(g7 g7Var, Context context, int i7) {
        super(context);
        this.f48608f = i7;
        this.h = g7Var;
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(21, context, null);
        this.f48604a = fpVar;
        fpVar.setDrawBackgroundAsArc(14);
        fpVar.b(org.telegram.ui.ActionBar.j6.i7, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48605b = frameLayout;
        TextView textView = new TextView(context);
        this.f48606c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29031n6, null);
        if (org.telegram.messenger.hd.f24101a0) {
            addView(fpVar, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, c8.ja.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, c8.ja.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, c8.ja.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(fpVar, c8.ja.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, c8.ja.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ja.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, c8.ja.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.hd.f24101a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            }
        }
    }
}
