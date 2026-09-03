package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class o7 extends FrameLayout {
    public final org.telegram.ui.Components.kp f36666a;
    public final FrameLayout f36667b;
    public final TextView f36668c;
    public boolean d;
    public int e;
    public final int f36669f;
    public final k7 h;

    public o7(k7 k7Var, Context context, int i10) {
        super(context);
        this.f36669f = i10;
        this.h = k7Var;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(context, 21, null);
        this.f36666a = kpVar;
        kpVar.setDrawBackgroundAsArc(14);
        kpVar.b(org.telegram.ui.ActionBar.j6.f19972i7, org.telegram.ui.ActionBar.j6.f19936g7, org.telegram.ui.ActionBar.j6.f20007k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36667b = frameLayout;
        TextView textView = new TextView(context);
        this.f36668c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20060n6, false));
        if (LocaleController.isRTL) {
            addView(kpVar, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, k7.b6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, k7.b6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, k7.b6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(kpVar, k7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, k7.b6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.b6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, k7.b6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
            }
        }
    }
}
