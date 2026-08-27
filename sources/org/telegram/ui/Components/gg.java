package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class gg extends View {

    public float f28616a;

    public long f28617b;

    public boolean f28618c;
    public boolean d;

    public boolean f28619e;

    public final oi0 f28620f;
    public boolean h;

    public final ChatActivityEnterView f28621n;

    public gg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f28621n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        oi0 oi0Var = new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f28620f = oi0Var;
        oi0Var.f31321l0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f23171jf;
        int i11 = ChatActivityEnterView.f26070i5;
        ChatActivityEnterView chatActivityEnterView = this.f28621n;
        int iI0 = chatActivityEnterView.i0(i10);
        int iI1 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Sd);
        chatActivityEnterView.f26170r3.setColor(iI0);
        oi0 oi0Var = this.f28620f;
        oi0Var.W = true;
        oi0Var.O(iI0, "Cup Red");
        oi0Var.O(iI0, "Box");
        oi0Var.O(iI1, "Line 1");
        oi0Var.O(iI1, "Line 2");
        oi0Var.O(iI1, "Line 3");
        oi0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f28619e;
        oi0 oi0Var = this.f28620f;
        if (z10) {
            oi0Var.start();
        }
        oi0Var.f31328r0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        oi0 oi0Var = this.f28620f;
        oi0Var.stop();
        oi0Var.f31328r0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28621n.f26170r3;
        boolean z10 = this.f28619e;
        oi0 oi0Var = this.f28620f;
        if (z10) {
            oi0Var.setAlpha((int) (this.f28616a * 255.0f));
        }
        paint.setAlpha((int) (this.f28616a * 255.0f));
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f28617b;
        if (this.h) {
            this.f28616a = 1.0f;
        } else if (this.f28618c || this.f28619e) {
            float f10 = (jCurrentTimeMillis / 600.0f) + this.f28616a;
            this.f28616a = f10;
            if (f10 >= 1.0f) {
                this.f28616a = 1.0f;
                this.f28618c = false;
            }
        } else {
            float f11 = this.f28616a - (jCurrentTimeMillis / 600.0f);
            this.f28616a = f11;
            if (f11 <= 0.0f) {
                this.f28616a = 0.0f;
                this.f28618c = true;
            }
        }
        this.f28617b = System.currentTimeMillis();
        if (this.f28619e) {
            oi0Var.draw(canvas);
        }
        if (!this.f28619e || !oi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28620f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
