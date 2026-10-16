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
    public final org.telegram.ui.Components.z9 f22385a;
    public final TextView f22386b;
    public final TextView f22387c;
    public final View d;
    public final y5 e;

    public w5(y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f22385a = z9Var;
        addView(z9Var, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.z5.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f22386b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f22387c = i10;
        i10.setTextSize(1, 13.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(true);
        i10.setEllipsize(truncateAt);
        i10.setMaxLines(1);
        i10.setGravity(80);
        linearLayout.addView(i10, w7.z5.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
        addView(view, w7.z5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.z9 z9Var = this.f22385a;
        if (z9Var.getImageReceiver().hasNotThumb() && z9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        y5 y5Var = this.e;
        y5Var.e.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.X9, false));
        canvas.drawRect(0.0f, 0.0f, z9Var.getMeasuredWidth(), z9Var.getMeasuredHeight(), y5Var.e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
