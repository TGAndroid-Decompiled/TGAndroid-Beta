package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class m7 extends FrameLayout {
    public final org.telegram.ui.Components.lp f36212a;
    public final FrameLayout f36213b;
    public final TextView f36214c;
    public boolean d;
    public int e;
    public final int f36215f;
    public final i7 h;

    public m7(i7 i7Var, Context context, int i10) {
        super(context);
        this.f36215f = i10;
        this.h = i7Var;
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 21, null);
        this.f36212a = lpVar;
        lpVar.setDrawBackgroundAsArc(14);
        lpVar.b(org.telegram.ui.ActionBar.j6.f19997i7, org.telegram.ui.ActionBar.j6.f19961g7, org.telegram.ui.ActionBar.j6.f20032k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36213b = frameLayout;
        TextView textView = new TextView(context);
        this.f36214c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20085n6, false));
        if (LocaleController.isRTL) {
            addView(lpVar, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, k7.b6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, k7.b6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, k7.b6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(lpVar, k7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, k7.b6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.b6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, k7.b6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
            }
        }
    }
}
