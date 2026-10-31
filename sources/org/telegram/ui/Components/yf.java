package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class yf extends View {
    public float f32711a;
    public long f32712b;
    public boolean f32713c;
    public boolean d;
    public boolean e;
    public final bi0 f32714f;
    public boolean h;
    public boolean f32715n;
    public long f32716r;
    public final ChatActivityEnterView f32717s;

    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32717s = chatActivityEnterView;
        this.f32716r = -1L;
        bi0 bi0Var = new bi0(2131623975, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.f32714f = bi0Var;
        bi0Var.f24769o0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        bi0 bi0Var = this.f32714f;
        bi0Var.T(true, 0.0f);
        if (this.d) {
            bi0Var.start();
        }
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.t6.Xf;
        int i11 = ChatActivityEnterView.f23672s5;
        ChatActivityEnterView chatActivityEnterView = this.f32717s;
        int e02 = chatActivityEnterView.e0(i10);
        int e03 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Ge);
        int e04 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Sf);
        chatActivityEnterView.f23807w3.setColor(e02);
        bi0 bi0Var = this.f32714f;
        bi0Var.Z = true;
        bi0Var.Q(e02, "Cup Red");
        bi0Var.Q(e02, "Box Red");
        bi0Var.Q(e04, "Cup Grey");
        bi0Var.Q(e04, "Box Grey");
        bi0Var.Q(e04, "Box_Grey 2");
        bi0Var.Q(e04, "Line 1");
        bi0Var.Q(e04, "Line 2");
        bi0Var.Q(e04, "Line 3");
        bi0Var.Q(e03, "Line 1 Dup");
        bi0Var.Q(e03, "Line 2 Dup");
        bi0Var.Q(e03, "Line 3 Dup");
        bi0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        bi0 bi0Var = this.f32714f;
        if (z10) {
            bi0Var.start();
        }
        bi0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        bi0 bi0Var = this.f32714f;
        bi0Var.stop();
        bi0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32717s.f23807w3;
        boolean z10 = this.e;
        bi0 bi0Var = this.f32714f;
        if (z10) {
            bi0Var.setAlpha((int) (this.f32711a * 255.0f));
        }
        paint.setAlpha((int) (this.f32711a * 255.0f));
        if (!this.f32715n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32712b;
            if (this.h) {
                this.f32711a = 1.0f;
            } else if (!this.f32713c && !this.e) {
                float f7 = this.f32711a - (((float) j10) / 600.0f);
                this.f32711a = f7;
                if (f7 <= 0.0f) {
                    this.f32711a = 0.0f;
                    this.f32713c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f32711a;
                this.f32711a = f10;
                if (f10 >= 1.0f) {
                    this.f32711a = 1.0f;
                    this.f32713c = false;
                }
            }
            this.f32712b = currentTimeMillis;
        }
        if (this.e) {
            bi0Var.draw(canvas);
        }
        if (!this.e || !bi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.i0.L(5.0f), paint);
        }
        if (!this.f32715n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32714f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
