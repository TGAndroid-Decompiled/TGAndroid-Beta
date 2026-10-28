package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class o7 extends FrameLayout {
    public final org.telegram.ui.Components.aq f42001a;
    public final FrameLayout f42002b;
    public final TextView f42003c;
    public boolean d;
    public int e;
    public final int f42004f;
    public final k7 h;

    public o7(k7 k7Var, Context context, int i10) {
        super(context);
        this.f42004f = i10;
        this.h = k7Var;
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.f42001a = aqVar;
        aqVar.setDrawBackgroundAsArc(14);
        aqVar.b(org.telegram.ui.ActionBar.y6.f23450i7, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23486k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42002b = frameLayout;
        TextView textView = new TextView(context);
        this.f42003c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23541n6, null);
        if (LocaleController.isRTL) {
            addView(aqVar, org.telegram.ui.Components.kb1.h(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, org.telegram.ui.Components.kb1.h(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, org.telegram.ui.Components.kb1.h(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(aqVar, org.telegram.ui.Components.kb1.h(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, org.telegram.ui.Components.kb1.h(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, org.telegram.ui.Components.kb1.h(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            }
        }
    }
}
