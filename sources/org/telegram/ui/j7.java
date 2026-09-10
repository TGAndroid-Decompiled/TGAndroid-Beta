package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j7 extends FrameLayout {
    public final org.telegram.ui.Components.tp f34043a;
    public final FrameLayout f34044b;
    public final TextView f34045c;
    public boolean d;
    public int e;
    public final int f34046f;
    public final f7 h;

    public j7(f7 f7Var, Context context, int i10) {
        super(context);
        this.f34046f = i10;
        this.h = f7Var;
        org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 21, null);
        this.f34043a = tpVar;
        tpVar.setDrawBackgroundAsArc(14);
        tpVar.b(org.telegram.ui.ActionBar.j6.f18018i7, org.telegram.ui.ActionBar.j6.f17983g7, org.telegram.ui.ActionBar.j6.f18056k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34044b = frameLayout;
        TextView textView = new TextView(context);
        this.f34045c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false));
        if (LocaleController.isRTL) {
            addView(tpVar, w7.a6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.a6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.a6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.a6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(tpVar, w7.a6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.a6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.a6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.a6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            }
        }
    }
}
