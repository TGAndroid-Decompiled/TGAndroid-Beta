package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.op f34956a;
    public final FrameLayout f34957b;
    public final TextView f34958c;
    public boolean d;
    public int e;
    public final int f34959f;
    public final g7 h;

    public k7(g7 g7Var, Context context, int i10) {
        super(context);
        this.f34959f = i10;
        this.h = g7Var;
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 21, null);
        this.f34956a = opVar;
        opVar.setDrawBackgroundAsArc(14);
        opVar.b(org.telegram.ui.ActionBar.h6.f19150i7, org.telegram.ui.ActionBar.h6.f19115g7, org.telegram.ui.ActionBar.h6.f19188k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34957b = frameLayout;
        TextView textView = new TextView(context);
        this.f34958c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false));
        if (LocaleController.isRTL) {
            addView(opVar, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.y5.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.y5.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.y5.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(opVar, w7.y5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.y5.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.y5.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
            }
        }
    }
}
