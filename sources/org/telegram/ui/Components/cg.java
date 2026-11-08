package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cg extends View {
    public float f32578a;
    public long f32579b;
    public boolean f32580c;
    public boolean d;
    public boolean f32581e;
    public final zg0 f32582f;
    public boolean h;
    public boolean f32583n;
    public long f32584r;
    public final ChatActivityEnterView f32585s;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32585s = chatActivityEnterView;
        this.f32584r = -1L;
        zg0 zg0Var = new zg0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f32582f = zg0Var;
        zg0Var.f41007o0 = true;
        b();
    }

    public final void a() {
        this.f32581e = true;
        zg0 zg0Var = this.f32582f;
        zg0Var.T(true, 0.0f);
        if (this.d) {
            zg0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.k6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f32585s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sf);
        chatActivityEnterView.f31147w3.setColor(f02);
        zg0 zg0Var = this.f32582f;
        zg0Var.Z = true;
        zg0Var.Q(f02, "Cup Red");
        zg0Var.Q(f02, "Box Red");
        zg0Var.Q(f04, "Cup Grey");
        zg0Var.Q(f04, "Box Grey");
        zg0Var.Q(f04, "Box_Grey 2");
        zg0Var.Q(f04, "Line 1");
        zg0Var.Q(f04, "Line 2");
        zg0Var.Q(f04, "Line 3");
        zg0Var.Q(f03, "Line 1 Dup");
        zg0Var.Q(f03, "Line 2 Dup");
        zg0Var.Q(f03, "Line 3 Dup");
        zg0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z9 = this.f32581e;
        zg0 zg0Var = this.f32582f;
        if (z9) {
            zg0Var.start();
        }
        zg0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        zg0 zg0Var = this.f32582f;
        zg0Var.stop();
        zg0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32585s.f31147w3;
        boolean z9 = this.f32581e;
        zg0 zg0Var = this.f32582f;
        if (z9) {
            zg0Var.setAlpha((int) (this.f32578a * 255.0f));
        }
        paint.setAlpha((int) (this.f32578a * 255.0f));
        if (!this.f32583n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32579b;
            if (this.h) {
                this.f32578a = 1.0f;
            } else if (!this.f32580c && !this.f32581e) {
                float f10 = this.f32578a - (((float) j3) / 600.0f);
                this.f32578a = f10;
                if (f10 <= 0.0f) {
                    this.f32578a = 0.0f;
                    this.f32580c = true;
                }
            } else {
                float f11 = (((float) j3) / 600.0f) + this.f32578a;
                this.f32578a = f11;
                if (f11 >= 1.0f) {
                    this.f32578a = 1.0f;
                    this.f32580c = false;
                }
            }
            this.f32579b = currentTimeMillis;
        }
        if (this.f32581e) {
            zg0Var.draw(canvas);
        }
        if (!this.f32581e || !zg0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f32583n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32582f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
