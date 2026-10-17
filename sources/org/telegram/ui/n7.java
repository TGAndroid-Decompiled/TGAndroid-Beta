package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.xp f39359a;
    public final FrameLayout f39360b;
    public final TextView f39361c;
    public boolean d;
    public int e;
    public final int f39362f;
    public final j7 h;

    public n7(j7 j7Var, Context context, int i10) {
        super(context);
        this.f39362f = i10;
        this.h = j7Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 21, null);
        this.f39359a = xpVar;
        xpVar.setDrawBackgroundAsArc(14);
        xpVar.b(org.telegram.ui.ActionBar.h6.f21076i7, org.telegram.ui.ActionBar.h6.f21040g7, org.telegram.ui.ActionBar.h6.f21114k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39360b = frameLayout;
        TextView textView = new TextView(context);
        this.f39361c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n6, false));
        if (LocaleController.isRTL) {
            addView(xpVar, w7.z5.a(24.0f, 0.0f, 0.0f, 18.0f, 0.0f, 24, 21));
            addView(view, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 21));
            addView(frameLayout, w7.z5.a(-2.0f, 90.0f, 0.0f, 40.0f, 0.0f, -1, 0));
            addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 69, 19));
            return;
        }
        addView(xpVar, w7.z5.a(24.0f, 18.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        addView(view, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 19));
        addView(frameLayout, w7.z5.a(-2.0f, 48.0f, 0.0f, 90.0f, 0.0f, -1, 0));
        addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 21.0f, 0.0f, 69, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21107k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21107k0);
            }
        }
    }
}
