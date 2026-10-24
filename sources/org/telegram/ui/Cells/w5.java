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
import org.telegram.messenger.tl;
public final class w5 extends FrameLayout {
    public final org.telegram.ui.Components.u9 f23910a;
    public final TextView f23911b;
    public final TextView f23912c;
    public final View d;
    public final y5 e;

    public w5(y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f23910a = u9Var;
        addView(u9Var, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.z5.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f23911b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f7 = tl.f(linearLayout, textView, w7.z5.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f23912c = f7;
        f7.setTextSize(1, 13.0f);
        f7.setTextColor(-1);
        f7.setSingleLine(true);
        f7.setEllipsize(truncateAt);
        f7.setMaxLines(1);
        f7.setGravity(80);
        linearLayout.addView(f7, w7.z5.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
        addView(view, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.u9 u9Var = this.f23910a;
        if (u9Var.getImageReceiver().hasNotThumb() && u9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        y5 y5Var = this.e;
        y5Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false));
        canvas.drawRect(0.0f, 0.0f, u9Var.getMeasuredWidth(), u9Var.getMeasuredHeight(), y5Var.e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
