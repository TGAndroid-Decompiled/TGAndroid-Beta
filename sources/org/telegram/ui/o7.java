package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class o7 extends FrameLayout {
    public final org.telegram.ui.Components.zp f42106a;
    public final FrameLayout f42107b;
    public final TextView f42108c;
    public boolean d;
    public int e;
    public final int f42109f;
    public final k7 h;

    public o7(k7 k7Var, Context context, int i10) {
        super(context);
        this.f42109f = i10;
        this.h = k7Var;
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 21, null);
        this.f42106a = zpVar;
        zpVar.setDrawBackgroundAsArc(14);
        zpVar.b(org.telegram.ui.ActionBar.y6.f23447i7, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23483k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42107b = frameLayout;
        TextView textView = new TextView(context);
        this.f42108c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23538n6, null);
        if (LocaleController.isRTL) {
            addView(zpVar, org.telegram.ui.Components.gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, org.telegram.ui.Components.gb1.h(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, org.telegram.ui.Components.gb1.h(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(zpVar, org.telegram.ui.Components.gb1.h(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, org.telegram.ui.Components.gb1.h(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, org.telegram.ui.Components.gb1.h(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
            }
        }
    }
}
