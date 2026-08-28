package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
public final class w5 extends FrameLayout {
    public final org.telegram.ui.Components.o9 f25899a;
    public final TextView f25900b;
    public final TextView f25901c;
    public final View d;
    public final y5 f25902e;

    public w5(y5 y5Var, Context context) {
        super(context);
        this.f25902e = y5Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f25899a = o9Var;
        addView(o9Var, g7.e6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, g7.e6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f25900b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f25901c = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setMaxLines(1);
        h.setGravity(80);
        linearLayout.addView(h, g7.e6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
        addView(view, g7.e6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.o9 o9Var = this.f25899a;
        if (o9Var.getImageReceiver().hasNotThumb() && o9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        y5 y5Var = this.f25902e;
        y5Var.f25994e.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.X9, false));
        canvas.drawRect(0.0f, 0.0f, o9Var.getMeasuredWidth(), o9Var.getMeasuredHeight(), y5Var.f25994e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
