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

public final class t5 extends FrameLayout {

    public final org.telegram.ui.Components.n9 f25671a;

    public final TextView f25672b;

    public final TextView f25673c;
    public final View d;

    public final v5 f25674e;

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f25674e = v5Var;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f25671a = n9Var;
        addView(n9Var, h7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, h7.z5.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f25672b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView textViewI = pa.i(linearLayout, textView, h7.z5.m(1.0f, 0, -1, 8, 0, 5), context);
        this.f25673c = textViewI;
        textViewI.setTextSize(1, 13.0f);
        textViewI.setTextColor(-1);
        textViewI.setSingleLine(true);
        textViewI.setEllipsize(truncateAt);
        textViewI.setMaxLines(1);
        textViewI.setGravity(80);
        linearLayout.addView(textViewI, h7.z5.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, h7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.n9 n9Var = this.f25671a;
        if (n9Var.getImageReceiver().hasNotThumb() && n9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        v5 v5Var = this.f25674e;
        v5Var.f25808e.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false));
        canvas.drawRect(0.0f, 0.0f, n9Var.getMeasuredWidth(), n9Var.getMeasuredHeight(), v5Var.f25808e);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
