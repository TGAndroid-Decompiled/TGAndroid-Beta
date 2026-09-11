package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.mp f37945a;
    public final FrameLayout f37946b;
    public final TextView f37947c;
    public boolean d;
    public int f37948e;
    public final int f37949f;
    public final g7 h;

    public k7(g7 g7Var, Context context, int i10) {
        super(context);
        this.f37949f = i10;
        this.h = g7Var;
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 21, null);
        this.f37945a = mpVar;
        mpVar.setDrawBackgroundAsArc(14);
        mpVar.b(org.telegram.ui.ActionBar.j6.f20754i7, org.telegram.ui.ActionBar.j6.f20719g7, org.telegram.ui.ActionBar.j6.f20792k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37946b = frameLayout;
        TextView textView = new TextView(context);
        this.f37947c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20846n6, false));
        if (LocaleController.isRTL) {
            addView(mpVar, w7.x5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.x5.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.x5.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.x5.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(mpVar, w7.x5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.x5.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.x5.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
            }
        }
    }
}
