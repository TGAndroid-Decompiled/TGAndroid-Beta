package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.Components.hp f39136a;
    public final FrameLayout f39137b;
    public final TextView f39138c;
    public boolean d;
    public int f39139e;
    public final int f39140f;
    public final e7 h;

    public i7(e7 e7Var, Context context, int i10) {
        super(context);
        this.f39140f = i10;
        this.h = e7Var;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 21, null);
        this.f39136a = hpVar;
        hpVar.setDrawBackgroundAsArc(14);
        hpVar.b(org.telegram.ui.ActionBar.g6.f23153i7, org.telegram.ui.ActionBar.g6.f23118g7, org.telegram.ui.ActionBar.g6.f23190k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39137b = frameLayout;
        TextView textView = new TextView(context);
        this.f39138c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false));
        if (LocaleController.isRTL) {
            addView(hpVar, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, i7.f6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, i7.f6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, i7.f6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(hpVar, i7.f6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, i7.f6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, i7.f6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, i7.f6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            }
        }
    }
}
