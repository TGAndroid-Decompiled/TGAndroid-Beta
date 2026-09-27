package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.pp f35833a;
    public final FrameLayout f35834b;
    public final TextView f35835c;
    public boolean d;
    public int e;
    public final int f35836f;
    public final j7 h;

    public n7(j7 j7Var, Context context, int i10) {
        super(context);
        this.f35836f = i10;
        this.h = j7Var;
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(context, 21, null);
        this.f35833a = ppVar;
        ppVar.setDrawBackgroundAsArc(14);
        ppVar.b(org.telegram.ui.ActionBar.i6.f19148i7, org.telegram.ui.ActionBar.i6.f19112g7, org.telegram.ui.ActionBar.i6.f19186k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35834b = frameLayout;
        TextView textView = new TextView(context);
        this.f35835c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19242n6, false));
        if (LocaleController.isRTL) {
            addView(ppVar, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.y5.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.y5.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.y5.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(ppVar, w7.y5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.y5.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.y5.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f19179k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f19179k0);
            }
        }
    }
}
