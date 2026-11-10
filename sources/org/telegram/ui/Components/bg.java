package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class bg extends View {
    public float f32251a;
    public long f32252b;
    public boolean f32253c;
    public boolean d;
    public boolean f32254e;
    public final zg0 f32255f;
    public boolean h;
    public boolean f32256n;
    public long f32257r;
    public final ChatActivityEnterView f32258s;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32258s = chatActivityEnterView;
        this.f32257r = -1L;
        zg0 zg0Var = new zg0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f32255f = zg0Var;
        zg0Var.f40980o0 = true;
        b();
    }

    public final void a() {
        this.f32254e = true;
        zg0 zg0Var = this.f32255f;
        zg0Var.T(true, 0.0f);
        if (this.d) {
            zg0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.m6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f32258s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Sf);
        chatActivityEnterView.f31163w3.setColor(f02);
        zg0 zg0Var = this.f32255f;
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
        boolean z9 = this.f32254e;
        zg0 zg0Var = this.f32255f;
        if (z9) {
            zg0Var.start();
        }
        zg0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        zg0 zg0Var = this.f32255f;
        zg0Var.stop();
        zg0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32258s.f31163w3;
        boolean z9 = this.f32254e;
        zg0 zg0Var = this.f32255f;
        if (z9) {
            zg0Var.setAlpha((int) (this.f32251a * 255.0f));
        }
        paint.setAlpha((int) (this.f32251a * 255.0f));
        if (!this.f32256n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32252b;
            if (this.h) {
                this.f32251a = 1.0f;
            } else if (!this.f32253c && !this.f32254e) {
                float f10 = this.f32251a - (((float) j3) / 600.0f);
                this.f32251a = f10;
                if (f10 <= 0.0f) {
                    this.f32251a = 0.0f;
                    this.f32253c = true;
                }
            } else {
                float f11 = (((float) j3) / 600.0f) + this.f32251a;
                this.f32251a = f11;
                if (f11 >= 1.0f) {
                    this.f32251a = 1.0f;
                    this.f32253c = false;
                }
            }
            this.f32252b = currentTimeMillis;
        }
        if (this.f32254e) {
            zg0Var.draw(canvas);
        }
        if (!this.f32254e || !zg0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f32256n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32255f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
