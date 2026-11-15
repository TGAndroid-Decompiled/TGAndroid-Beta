package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class fs0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f47186a;
    public final TextView f47187b;
    public final ImageView f47188c;
    public final ImageView d;
    public boolean f47189e;
    public ss0 f47190f;
    public org.telegram.ui.Components.e5 h;
    public Drawable f47191n;

    public fs0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f47186a = j5Var;
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(15);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        linearLayout.addView(j5Var, c8.ja.o(-1, -2));
        TextView textView = new TextView(context);
        this.f47187b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ja.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.ja.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f47188c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ja.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232060);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.M6, e6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ss0 ss0Var, boolean z10) {
        long longValue;
        boolean q10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q();
        ImageView imageView = this.d;
        if (q10 && ss0Var.f51268a == 12 && ss0Var.f51269b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.q10.h(org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).f());
            if (h == null) {
                longValue = 0;
            } else {
                longValue = h.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.e5 e5Var = this.h;
            if (e5Var != null) {
                e5Var.b();
                this.h = null;
            }
        }
        this.f47190f = ss0Var;
        this.f47186a.l(ss0Var.f51270c, false);
        this.f47187b.setText(ss0Var.d);
        this.f47188c.setImageResource(ss0Var.f51269b);
        this.f47189e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f47191n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232311).mutate();
                this.f47191n = mutate;
                org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.f29184v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f47191n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f34197s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f34197s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f34197s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29184v6, false)));
            this.h.draw(canvas);
        }
        if (this.f47189e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.e5 e5Var = this.h;
        if (e5Var != null) {
            e5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.e5 e5Var = this.h;
        if (e5Var != null) {
            e5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
