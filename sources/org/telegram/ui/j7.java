package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j7 extends FrameLayout {
    public final org.telegram.ui.Components.dq f38884a;
    public final FrameLayout f38885b;
    public final TextView f38886c;
    public boolean d;
    public int f38887e;
    public final int f38888f;
    public final f7 h;

    public j7(f7 f7Var, Context context, int i10) {
        super(context);
        this.f38888f = i10;
        this.h = f7Var;
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(context, 21, null);
        this.f38884a = dqVar;
        dqVar.setDrawBackgroundAsArc(14);
        dqVar.b(org.telegram.ui.ActionBar.i6.f20893i7, org.telegram.ui.ActionBar.i6.f20858g7, org.telegram.ui.ActionBar.i6.f20930k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38885b = frameLayout;
        TextView textView = new TextView(context);
        this.f38886c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20986n6, false));
        if (LocaleController.isRTL) {
            addView(dqVar, w7.x5.a(24.0f, 0.0f, 0.0f, 18.0f, 0.0f, 24, 21));
            addView(view, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 21));
            addView(frameLayout, w7.x5.a(-2.0f, 90.0f, 0.0f, 40.0f, 0.0f, -1, 0));
            addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 69, 19));
            return;
        }
        addView(dqVar, w7.x5.a(24.0f, 18.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        addView(view, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 19));
        addView(frameLayout, w7.x5.a(-2.0f, 48.0f, 0.0f, 90.0f, 0.0f, -1, 0));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 21.0f, 0.0f, 69, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
            }
        }
    }
}
