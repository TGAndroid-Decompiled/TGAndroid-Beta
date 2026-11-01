package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class yf extends View {
    public float f32827a;
    public long f32828b;
    public boolean f32829c;
    public boolean d;
    public boolean e;
    public final ci0 f32830f;
    public boolean h;
    public boolean f32831n;
    public long f32832r;
    public final ChatActivityEnterView f32833s;

    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32833s = chatActivityEnterView;
        this.f32832r = -1L;
        ci0 ci0Var = new ci0(2131623975, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.f32830f = ci0Var;
        ci0Var.f25148o0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        ci0 ci0Var = this.f32830f;
        ci0Var.T(true, 0.0f);
        if (this.d) {
            ci0Var.start();
        }
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.t6.Xf;
        int i11 = ChatActivityEnterView.f23673s5;
        ChatActivityEnterView chatActivityEnterView = this.f32833s;
        int e02 = chatActivityEnterView.e0(i10);
        int e03 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Ge);
        int e04 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Sf);
        chatActivityEnterView.f23808w3.setColor(e02);
        ci0 ci0Var = this.f32830f;
        ci0Var.Z = true;
        ci0Var.Q(e02, "Cup Red");
        ci0Var.Q(e02, "Box Red");
        ci0Var.Q(e04, "Cup Grey");
        ci0Var.Q(e04, "Box Grey");
        ci0Var.Q(e04, "Box_Grey 2");
        ci0Var.Q(e04, "Line 1");
        ci0Var.Q(e04, "Line 2");
        ci0Var.Q(e04, "Line 3");
        ci0Var.Q(e03, "Line 1 Dup");
        ci0Var.Q(e03, "Line 2 Dup");
        ci0Var.Q(e03, "Line 3 Dup");
        ci0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ci0 ci0Var = this.f32830f;
        if (z10) {
            ci0Var.start();
        }
        ci0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ci0 ci0Var = this.f32830f;
        ci0Var.stop();
        ci0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32833s.f23808w3;
        boolean z10 = this.e;
        ci0 ci0Var = this.f32830f;
        if (z10) {
            ci0Var.setAlpha((int) (this.f32827a * 255.0f));
        }
        paint.setAlpha((int) (this.f32827a * 255.0f));
        if (!this.f32831n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32828b;
            if (this.h) {
                this.f32827a = 1.0f;
            } else if (!this.f32829c && !this.e) {
                float f7 = this.f32827a - (((float) j10) / 600.0f);
                this.f32827a = f7;
                if (f7 <= 0.0f) {
                    this.f32827a = 0.0f;
                    this.f32829c = true;
                }
            } else {
                float f10 = (((float) j10) / 600.0f) + this.f32827a;
                this.f32827a = f10;
                if (f10 >= 1.0f) {
                    this.f32827a = 1.0f;
                    this.f32829c = false;
                }
            }
            this.f32828b = currentTimeMillis;
        }
        if (this.e) {
            ci0Var.draw(canvas);
        }
        if (!this.e || !ci0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.i0.L(5.0f), paint);
        }
        if (!this.f32831n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32830f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
