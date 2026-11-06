package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cg extends View {
    public float f32547a;
    public long f32548b;
    public boolean f32549c;
    public boolean d;
    public boolean f32550e;
    public final zg0 f32551f;
    public boolean h;
    public boolean f32552n;
    public long f32553r;
    public final ChatActivityEnterView f32554s;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32554s = chatActivityEnterView;
        this.f32553r = -1L;
        zg0 zg0Var = new zg0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f32551f = zg0Var;
        zg0Var.f40988o0 = true;
        b();
    }

    public final void a() {
        this.f32550e = true;
        zg0 zg0Var = this.f32551f;
        zg0Var.T(true, 0.0f);
        if (this.d) {
            zg0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.k6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f32554s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sf);
        chatActivityEnterView.f31143w3.setColor(f02);
        zg0 zg0Var = this.f32551f;
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
        boolean z9 = this.f32550e;
        zg0 zg0Var = this.f32551f;
        if (z9) {
            zg0Var.start();
        }
        zg0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        zg0 zg0Var = this.f32551f;
        zg0Var.stop();
        zg0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32554s.f31143w3;
        boolean z9 = this.f32550e;
        zg0 zg0Var = this.f32551f;
        if (z9) {
            zg0Var.setAlpha((int) (this.f32547a * 255.0f));
        }
        paint.setAlpha((int) (this.f32547a * 255.0f));
        if (!this.f32552n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32548b;
            if (this.h) {
                this.f32547a = 1.0f;
            } else if (!this.f32549c && !this.f32550e) {
                float f10 = this.f32547a - (((float) j3) / 600.0f);
                this.f32547a = f10;
                if (f10 <= 0.0f) {
                    this.f32547a = 0.0f;
                    this.f32549c = true;
                }
            } else {
                float f11 = (((float) j3) / 600.0f) + this.f32547a;
                this.f32547a = f11;
                if (f11 >= 1.0f) {
                    this.f32547a = 1.0f;
                    this.f32549c = false;
                }
            }
            this.f32548b = currentTimeMillis;
        }
        if (this.f32550e) {
            zg0Var.draw(canvas);
        }
        if (!this.f32550e || !zg0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f32552n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32551f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
