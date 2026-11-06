package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cg extends View {
    public float f32556a;
    public long f32557b;
    public boolean f32558c;
    public boolean d;
    public boolean f32559e;
    public final zg0 f32560f;
    public boolean h;
    public boolean f32561n;
    public long f32562r;
    public final ChatActivityEnterView f32563s;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32563s = chatActivityEnterView;
        this.f32562r = -1L;
        zg0 zg0Var = new zg0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f32560f = zg0Var;
        zg0Var.f40943o0 = true;
        b();
    }

    public final void a() {
        this.f32559e = true;
        zg0 zg0Var = this.f32560f;
        zg0Var.T(true, 0.0f);
        if (this.d) {
            zg0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.k6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f32563s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sf);
        chatActivityEnterView.f31142w3.setColor(f02);
        zg0 zg0Var = this.f32560f;
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
        boolean z9 = this.f32559e;
        zg0 zg0Var = this.f32560f;
        if (z9) {
            zg0Var.start();
        }
        zg0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        zg0 zg0Var = this.f32560f;
        zg0Var.stop();
        zg0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32563s.f31142w3;
        boolean z9 = this.f32559e;
        zg0 zg0Var = this.f32560f;
        if (z9) {
            zg0Var.setAlpha((int) (this.f32556a * 255.0f));
        }
        paint.setAlpha((int) (this.f32556a * 255.0f));
        if (!this.f32561n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32557b;
            if (this.h) {
                this.f32556a = 1.0f;
            } else if (!this.f32558c && !this.f32559e) {
                float f10 = this.f32556a - (((float) j3) / 600.0f);
                this.f32556a = f10;
                if (f10 <= 0.0f) {
                    this.f32556a = 0.0f;
                    this.f32558c = true;
                }
            } else {
                float f11 = (((float) j3) / 600.0f) + this.f32556a;
                this.f32556a = f11;
                if (f11 >= 1.0f) {
                    this.f32556a = 1.0f;
                    this.f32558c = false;
                }
            }
            this.f32557b = currentTimeMillis;
        }
        if (this.f32559e) {
            zg0Var.draw(canvas);
        }
        if (!this.f32559e || !zg0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (!this.f32561n) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32560f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
