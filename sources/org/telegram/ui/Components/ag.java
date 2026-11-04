package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ag extends View {
    public float f31831a;
    public long f31832b;
    public boolean f31833c;
    public boolean d;
    public boolean f31834e;
    public final ch0 f31835f;
    public boolean h;
    public boolean f31836n;
    public long f31837r;
    public final ChatActivityEnterView f31838s;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f31838s = chatActivityEnterView;
        this.f31837r = -1L;
        ch0 ch0Var = new ch0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f31835f = ch0Var;
        ch0Var.f32738p0 = true;
        b();
    }

    public final void a() {
        this.f31834e = true;
        ch0 ch0Var = this.f31835f;
        ch0Var.T(true, 0.0f);
        if (this.d) {
            ch0Var.start();
        }
    }

    public final void b() {
        int i3 = org.telegram.ui.ActionBar.k6.Xf;
        int i10 = ChatActivityEnterView.f31082t5;
        ChatActivityEnterView chatActivityEnterView = this.f31838s;
        int f02 = chatActivityEnterView.f0(i3);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sf);
        chatActivityEnterView.f31223x3.setColor(f02);
        ch0 ch0Var = this.f31835f;
        ch0Var.f32719a0 = true;
        ch0Var.Q(f02, "Cup Red");
        ch0Var.Q(f02, "Box Red");
        ch0Var.Q(f04, "Cup Grey");
        ch0Var.Q(f04, "Box Grey");
        ch0Var.Q(f04, "Box_Grey 2");
        ch0Var.Q(f04, "Line 1");
        ch0Var.Q(f04, "Line 2");
        ch0Var.Q(f04, "Line 3");
        ch0Var.Q(f03, "Line 1 Dup");
        ch0Var.Q(f03, "Line 2 Dup");
        ch0Var.Q(f03, "Line 3 Dup");
        ch0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.f31834e;
        ch0 ch0Var = this.f31835f;
        if (z10) {
            ch0Var.start();
        }
        ch0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ch0 ch0Var = this.f31835f;
        ch0Var.stop();
        ch0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f31838s.f31223x3;
        boolean z10 = this.f31834e;
        ch0 ch0Var = this.f31835f;
        if (z10) {
            ch0Var.setAlpha((int) (this.f31831a * 255.0f));
        }
        paint.setAlpha((int) (this.f31831a * 255.0f));
        if (!this.f31836n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f31832b;
            if (this.h) {
                this.f31831a = 1.0f;
            } else if (!this.f31833c && !this.f31834e) {
                float f10 = this.f31831a - (((float) j10) / 600.0f);
                this.f31831a = f10;
                if (f10 <= 0.0f) {
                    this.f31831a = 0.0f;
                    this.f31833c = true;
                }
            } else {
                float f11 = (((float) j10) / 600.0f) + this.f31831a;
                this.f31831a = f11;
                if (f11 >= 1.0f) {
                    this.f31831a = 1.0f;
                    this.f31833c = false;
                }
            }
            this.f31832b = currentTimeMillis;
        }
        if (this.f31834e) {
            ch0Var.draw(canvas);
        }
        if (!this.f31834e || !ch0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f31836n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f31835f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
