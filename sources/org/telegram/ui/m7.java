package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class m7 extends FrameLayout {
    public final org.telegram.ui.Components.np f38865a;
    public final FrameLayout f38866b;
    public final TextView f38867c;
    public boolean d;
    public int f38868e;
    public final int f38869f;
    public final i7 h;

    public m7(i7 i7Var, Context context, int i10) {
        super(context);
        this.f38869f = i10;
        this.h = i7Var;
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 21, null);
        this.f38865a = npVar;
        npVar.setDrawBackgroundAsArc(14);
        npVar.b(org.telegram.ui.ActionBar.k6.f21753i7, org.telegram.ui.ActionBar.k6.f21717g7, org.telegram.ui.ActionBar.k6.f21788k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38866b = frameLayout;
        TextView textView = new TextView(context);
        this.f38867c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21841n6, false));
        if (LocaleController.isRTL) {
            addView(npVar, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, k7.c6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, k7.c6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, k7.c6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(npVar, k7.c6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, k7.c6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.c6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, k7.c6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            }
        }
    }
}
