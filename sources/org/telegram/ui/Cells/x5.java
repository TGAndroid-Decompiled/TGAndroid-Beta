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
public final class x5 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f20708a;
    public final TextView f20709b;
    public final TextView f20710c;
    public final View d;
    public final z5 e;

    public x5(z5 z5Var, Context context) {
        super(context);
        this.e = z5Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20708a = w9Var;
        addView(w9Var, w7.a6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.a6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f20709b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f20710c = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(-1);
        g10.setSingleLine(true);
        g10.setEllipsize(truncateAt);
        g10.setMaxLines(1);
        g10.setGravity(80);
        linearLayout.addView(g10, w7.a6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.a6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.w9 w9Var = this.f20708a;
        if (w9Var.getImageReceiver().hasNotThumb() && w9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        z5 z5Var = this.e;
        z5Var.e.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false));
        canvas.drawRect(0.0f, 0.0f, w9Var.getMeasuredWidth(), w9Var.getMeasuredHeight(), z5Var.e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
