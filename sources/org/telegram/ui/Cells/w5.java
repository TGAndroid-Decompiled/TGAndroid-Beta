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
import org.telegram.ui.yh;
public final class w5 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f22540a;
    public final TextView f22541b;
    public final TextView f22542c;
    public final View d;
    public final y5 e;

    public w5(y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f22540a = p9Var;
        addView(p9Var, k7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, k7.b6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f22541b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f22542c = j10;
        j10.setTextSize(1, 13.0f);
        j10.setTextColor(-1);
        j10.setSingleLine(true);
        j10.setEllipsize(truncateAt);
        j10.setMaxLines(1);
        j10.setGravity(80);
        linearLayout.addView(j10, k7.b6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, k7.b6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.p9 p9Var = this.f22540a;
        if (p9Var.getImageReceiver().hasNotThumb() && p9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        y5 y5Var = this.e;
        y5Var.e.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false));
        canvas.drawRect(0.0f, 0.0f, p9Var.getMeasuredWidth(), p9Var.getMeasuredHeight(), y5Var.e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
