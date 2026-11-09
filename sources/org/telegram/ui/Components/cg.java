package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cg extends View {
    public float f32675a;
    public long f32676b;
    public boolean f32677c;
    public boolean d;
    public boolean f32678e;
    public final ah0 f32679f;
    public boolean h;
    public boolean f32680n;
    public long f32681r;
    public final ChatActivityEnterView f32682s;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32682s = chatActivityEnterView;
        this.f32681r = -1L;
        ah0 ah0Var = new ah0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f32679f = ah0Var;
        ah0Var.f31838o0 = true;
        b();
    }

    public final void a() {
        this.f32678e = true;
        ah0 ah0Var = this.f32679f;
        ah0Var.T(true, 0.0f);
        if (this.d) {
            ah0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.l6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f32682s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.Sf);
        chatActivityEnterView.f31152w3.setColor(f02);
        ah0 ah0Var = this.f32679f;
        ah0Var.Z = true;
        ah0Var.Q(f02, "Cup Red");
        ah0Var.Q(f02, "Box Red");
        ah0Var.Q(f04, "Cup Grey");
        ah0Var.Q(f04, "Box Grey");
        ah0Var.Q(f04, "Box_Grey 2");
        ah0Var.Q(f04, "Line 1");
        ah0Var.Q(f04, "Line 2");
        ah0Var.Q(f04, "Line 3");
        ah0Var.Q(f03, "Line 1 Dup");
        ah0Var.Q(f03, "Line 2 Dup");
        ah0Var.Q(f03, "Line 3 Dup");
        ah0Var.o();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z9 = this.f32678e;
        ah0 ah0Var = this.f32679f;
        if (z9) {
            ah0Var.start();
        }
        ah0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ah0 ah0Var = this.f32679f;
        ah0Var.stop();
        ah0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32682s.f31152w3;
        boolean z9 = this.f32678e;
        ah0 ah0Var = this.f32679f;
        if (z9) {
            ah0Var.setAlpha((int) (this.f32675a * 255.0f));
        }
        paint.setAlpha((int) (this.f32675a * 255.0f));
        if (!this.f32680n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32676b;
            if (this.h) {
                this.f32675a = 1.0f;
            } else if (!this.f32677c && !this.f32678e) {
                float f10 = this.f32675a - (((float) j3) / 600.0f);
                this.f32675a = f10;
                if (f10 <= 0.0f) {
                    this.f32675a = 0.0f;
                    this.f32677c = true;
                }
            } else {
                float f11 = (((float) j3) / 600.0f) + this.f32675a;
                this.f32675a = f11;
                if (f11 >= 1.0f) {
                    this.f32675a = 1.0f;
                    this.f32677c = false;
                }
            }
            this.f32676b = currentTimeMillis;
        }
        if (this.f32678e) {
            ah0Var.draw(canvas);
        }
        if (!this.f32678e || !ah0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f32680n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32679f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
