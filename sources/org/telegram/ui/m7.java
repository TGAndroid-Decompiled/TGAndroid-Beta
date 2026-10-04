package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class m7 extends FrameLayout {
    public final org.telegram.ui.Components.qp f38439a;
    public final FrameLayout f38440b;
    public final TextView f38441c;
    public boolean d;
    public int f38442e;
    public final int f38443f;
    public final i7 h;

    public m7(i7 i7Var, Context context, int i10) {
        super(context);
        this.f38443f = i10;
        this.h = i7Var;
        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(context, 21, null);
        this.f38439a = qpVar;
        qpVar.setDrawBackgroundAsArc(14);
        qpVar.b(org.telegram.ui.ActionBar.i6.f20909i7, org.telegram.ui.ActionBar.i6.f20873g7, org.telegram.ui.ActionBar.i6.f20947k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38440b = frameLayout;
        TextView textView = new TextView(context);
        this.f38441c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21003n6, false));
        if (LocaleController.isRTL) {
            addView(qpVar, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.z5.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.z5.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.z5.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(qpVar, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.z5.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.z5.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20940k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20940k0);
            }
        }
    }
}
