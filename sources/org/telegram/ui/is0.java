package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class is0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f46735a;
    public final TextView f46736b;
    public final ImageView f46737c;
    public final ImageView d;
    public boolean f46738e;
    public vs0 f46739f;
    public org.telegram.ui.Components.g5 h;
    public Drawable f46740n;

    public is0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f46735a = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        linearLayout.addView(k5Var, c8.ha.o(-1, -2));
        TextView textView = new TextView(context);
        this.f46736b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28240y6, f6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f46737c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ha.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232059);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.M6, f6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(vs0 vs0Var, boolean z9) {
        long longValue;
        boolean q10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q();
        ImageView imageView = this.d;
        if (q10 && vs0Var.f50823a == 12 && vs0Var.f50824b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.t10.h(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f());
            if (h == null) {
                longValue = 0;
            } else {
                longValue = h.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.b();
                this.h = null;
            }
        }
        this.f46739f = vs0Var;
        this.f46735a.l(vs0Var.f50825c, false);
        this.f46736b.setText(vs0Var.d);
        this.f46737c.setImageResource(vs0Var.f50824b);
        this.f46738e = z9;
    }

    public final void b(long j3, boolean z9) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f46740n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232310).mutate();
                this.f46740n = mutate;
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28183v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f46740n, z9);
            return;
        }
        this.h.j(j3, z9);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f33792s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f33792s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f33792s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28183v6, false)));
            this.h.draw(canvas);
        }
        if (this.f46738e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
