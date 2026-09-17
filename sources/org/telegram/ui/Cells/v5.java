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
public final class v5 extends FrameLayout {
    public final org.telegram.ui.Components.u9 f21483a;
    public final TextView f21484b;
    public final TextView f21485c;
    public final View d;
    public final x5 e;

    public v5(x5 x5Var, Context context) {
        super(context);
        this.e = x5Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f21483a = u9Var;
        addView(u9Var, w7.x5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.x5.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f21484b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f21485c = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setMaxLines(1);
        h.setGravity(80);
        linearLayout.addView(h, w7.x5.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.x5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.u9 u9Var = this.f21483a;
        if (u9Var.getImageReceiver().hasNotThumb() && u9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        x5 x5Var = this.e;
        x5Var.e.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false));
        canvas.drawRect(0.0f, 0.0f, u9Var.getMeasuredWidth(), u9Var.getMeasuredHeight(), x5Var.e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
