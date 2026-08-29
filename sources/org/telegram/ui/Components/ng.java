package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ng extends View {
    public float f30975a;
    public long f30976b;
    public boolean f30977c;
    public boolean d;
    public boolean f30978e;
    public final xi0 f30979f;
    public boolean h;
    public final ChatActivityEnterView f30980n;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30980n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        xi0 xi0Var = new xi0(i10, j7.l1.k(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f30979f = xi0Var;
        xi0Var.f34746l0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f23179jf;
        int i11 = ChatActivityEnterView.f26085i5;
        ChatActivityEnterView chatActivityEnterView = this.f30980n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Sd);
        chatActivityEnterView.f26185r3.setColor(i02);
        xi0 xi0Var = this.f30979f;
        xi0Var.W = true;
        xi0Var.O(i02, "Cup Red");
        xi0Var.O(i02, "Box");
        xi0Var.O(i03, "Line 1");
        xi0Var.O(i03, "Line 2");
        xi0Var.O(i03, "Line 3");
        xi0Var.m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f30978e;
        xi0 xi0Var = this.f30979f;
        if (z10) {
            xi0Var.start();
        }
        xi0Var.f34753r0 = this;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f30979f;
        xi0Var.stop();
        xi0Var.f34753r0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f30980n.f26185r3;
        boolean z10 = this.f30978e;
        xi0 xi0Var = this.f30979f;
        if (z10) {
            xi0Var.setAlpha((int) (this.f30975a * 255.0f));
        }
        paint.setAlpha((int) (this.f30975a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.f30976b;
        if (this.h) {
            this.f30975a = 1.0f;
        } else if (!this.f30977c && !this.f30978e) {
            float f9 = this.f30975a - (((float) currentTimeMillis) / 600.0f);
            this.f30975a = f9;
            if (f9 <= 0.0f) {
                this.f30975a = 0.0f;
                this.f30977c = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f30975a;
            this.f30975a = f10;
            if (f10 >= 1.0f) {
                this.f30975a = 1.0f;
                this.f30977c = false;
            }
        }
        this.f30976b = System.currentTimeMillis();
        if (this.f30978e) {
            xi0Var.draw(canvas);
        }
        if (!this.f30978e || !xi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30979f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
