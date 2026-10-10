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
    public final org.telegram.ui.Components.y9 f23673a;
    public final TextView f23674b;
    public final TextView f23675c;
    public final View d;
    public final y5 f23676e;

    public w5(y5 y5Var, Context context) {
        super(context);
        this.f23676e = y5Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23673a = y9Var;
        addView(y9Var, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.x5.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f23674b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f23675c = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setMaxLines(1);
        h.setGravity(80);
        linearLayout.addView(h, w7.x5.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
        addView(view, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.y9 y9Var = this.f23673a;
        if (y9Var.getImageReceiver().hasNotThumb() && y9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        y5 y5Var = this.f23676e;
        y5Var.f23778e.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.X9, false));
        canvas.drawRect(0.0f, 0.0f, y9Var.getMeasuredWidth(), y9Var.getMeasuredHeight(), y5Var.f23778e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
