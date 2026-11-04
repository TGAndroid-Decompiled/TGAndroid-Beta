package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.wz;
public final class w extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.ActionBar.z5 {
    public static final int M = 0;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final org.telegram.ui.ActionBar.e6 L;
    public boolean f30760a;
    public int f30761b;
    public int f30762c;
    public int d;
    public final int f30763e;
    public org.telegram.ui.Components.l5 f30764f;
    public StaticLayout h;
    public final int f30765n;
    public org.telegram.ui.Components.l5 f30766r;
    public StaticLayout f30767s;
    public final ImageView f30768w;
    public zi f30769x;
    public boolean f30770y;

    public w(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.f30763e = org.telegram.messenger.g0.L(9.0f);
        this.f30765n = org.telegram.messenger.g0.L(29.0f);
        int i11 = h10.f22829t0;
        this.E = i11;
        setWillNotDraw(false);
        this.L = e6Var;
        this.J = i3;
        ImageView imageView = new ImageView(context);
        this.f30768w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, e6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, mf.d(42, 42.0f, i10 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new ai.t(11));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.I = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.f27979id, org.telegram.ui.ActionBar.k6.f27995jd);
        this.F = org.telegram.messenger.z5.q(i11).k();
        setFocusable(true);
        if (i3 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i3 = this.G;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i3 = this.H;
        if (i3 < 0) {
            return 4;
        }
        if (i3 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z10) {
        b(true, z10);
    }

    @Override
    public final void M(String str) {
        this.I.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i3 = this.G;
        int i10 = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (i3 == 0) {
            if (this.H == 0) {
                org.telegram.messenger.w7.G(i10).X(this.f30769x.F0(), this.f30769x, 1, 0);
            }
            MediaController B = MediaController.B();
            zi ziVar = this.f30769x;
            int indexOf = B.S0.indexOf(ziVar);
            if (indexOf == -1) {
                z10 = B.S(ziVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.f30761b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 1) {
            if (MediaController.B().R(this.f30769x, true)) {
                this.G = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i3 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).X(this.f30769x.F0(), this.f30769x, 1, 0);
            this.G = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i3 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.f30769x.F0());
            this.G = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(boolean, boolean):void");
    }

    public zi getMessageObject() {
        return this.f30769x;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void i(long j10, long j11) {
        this.I.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f30761b != 0) {
            if (this.H != 1) {
                b(false, true);
            }
        } else if (this.G != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.e();
        this.f30764f = org.telegram.ui.Components.p5.update(0, this, this.f30764f, this.h);
        this.f30766r = org.telegram.ui.Components.p5.update(0, this, this.f30766r, this.f30767s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        org.telegram.messenger.z5.q(this.E).v(this);
        org.telegram.ui.Components.p5.release(this, this.f30764f);
        org.telegram.ui.Components.p5.release(this, this.f30766r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint W0;
        float f10;
        int i3;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.f30768w;
        float f11 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (bd.f21784a0) {
                f10 = 16.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (bd.f21784a0 && imageView.getVisibility() == 0) {
                i3 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i3 = 0;
            }
            canvas.translate(L + i3, this.f30763e);
            this.h.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.h, this.f30764f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f30767s;
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.k6.f27934g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
            canvas.save();
            if (!bd.f21784a0) {
                f11 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (bd.f21784a0 && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L2 + i10, this.f30765n);
            this.f30767s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f30767s, this.f30766r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wd, e6Var);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f30770y && (W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var)) != null) {
            if (bd.f21784a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30769x.J3()) {
            accessibilityNodeInfo.setText(bd.a0("AccDescrMusicInfo", null, 2131754832, this.f30769x.x1(true), this.f30769x.z1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f30767s.getText()));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        this.f30767s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            String z12 = this.f30769x.z1(true);
            CharSequence ellipsize = TextUtils.ellipsize(z12.replace('\n', ' '), org.telegram.ui.ActionBar.k6.f27914f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.f27914f3.measureText(z12)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.f30769x.Y1, e6Var);
            if (x12 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = x12;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.k6.f27914f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f30764f = org.telegram.ui.Components.p5.update(0, this, this.f30764f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.f30769x.x1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(wz.d(this.f30769x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.k6.f27934g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.f30769x.Y1, e6Var);
            if (x13 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = x13;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.k6.f27934g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f30767s = staticLayout2;
            this.f30766r = org.telegram.ui.Components.p5.update(0, this, this.f30766r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        int L2 = org.telegram.messenger.g0.L(52.0f);
        if (bd.f21784a0) {
            L = org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i3), L2);
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        int L3 = org.telegram.messenger.g0.L(4.0f) + L;
        this.f30762c = L3;
        int L4 = org.telegram.messenger.g0.L(6.0f);
        this.d = L4;
        this.I.r(L3, L4, org.telegram.messenger.g0.L(48.0f) + L, org.telegram.messenger.g0.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        zi ziVar;
        int i3;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (ziVar = this.f30769x) != null && this.f30761b != 0) {
                if (ziVar.Q3()) {
                    i3 = org.telegram.ui.ActionBar.k6.Bc;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(i3, this.L));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
