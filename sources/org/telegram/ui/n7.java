package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.vp f39749a;
    public final FrameLayout f39750b;
    public final TextView f39751c;
    public boolean d;
    public int e;
    public final int f39752f;
    public final j7 h;

    public n7(j7 j7Var, Context context, int i10) {
        super(context);
        this.f39752f = i10;
        this.h = j7Var;
        org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, 21, null);
        this.f39749a = vpVar;
        vpVar.setDrawBackgroundAsArc(14);
        vpVar.b(org.telegram.ui.ActionBar.k6.f21274i7, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21312k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39750b = frameLayout;
        TextView textView = new TextView(context);
        this.f39751c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21367n6, null);
        if (LocaleController.isRTL) {
            addView(vpVar, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.z5.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.z5.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.z5.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(vpVar, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.z5.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.z5.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            }
        }
    }
}
