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
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.a00;
public final class w extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.ActionBar.b6 {
    public static final int L = 0;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.g6 K;
    public boolean f30689a;
    public int f30690b;
    public int f30691c;
    public int d;
    public final int f30692e;
    public org.telegram.ui.Components.n5 f30693f;
    public StaticLayout h;
    public final int f30694n;
    public org.telegram.ui.Components.n5 f30695r;
    public StaticLayout f30696s;
    public final ImageView f30697w;
    public ij f30698x;
    public boolean f30699y;

    public w(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        this.f30692e = org.telegram.messenger.g0.L(9.0f);
        this.f30694n = org.telegram.messenger.g0.L(29.0f);
        int i11 = p10.f24470s0;
        this.D = i11;
        setWillNotDraw(false);
        this.K = g6Var;
        this.I = i7;
        ImageView imageView = new ImageView(context);
        this.f30697w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28030m6, g6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
        y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        if (id.f23157a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, c8.ha.d(42, 42.0f, i10 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bi.l1(7));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.l6.We, org.telegram.ui.ActionBar.l6.Xe, org.telegram.ui.ActionBar.l6.f27963id, org.telegram.ui.ActionBar.l6.f27981jd);
        this.E = org.telegram.messenger.z5.q(i11).k();
        setFocusable(true);
        if (i7 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i7 = this.F;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i7 = this.G;
        if (i7 < 0) {
            return 4;
        }
        if (i7 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z9) {
        b(true, z9);
    }

    @Override
    public final void M(String str) {
        this.H.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z9;
        int i7 = this.F;
        int i10 = this.D;
        RadialProgress2 radialProgress2 = this.H;
        if (i7 == 0) {
            if (this.G == 0) {
                org.telegram.messenger.w7.G(i10).W(this.f30698x.F0(), this.f30698x, 1, 0);
            }
            MediaController B = MediaController.B();
            ij ijVar = this.f30698x;
            int indexOf = B.R0.indexOf(ijVar);
            if (indexOf == -1) {
                z9 = B.S(ijVar);
            } else {
                B.T(indexOf);
                z9 = true;
            }
            if (z9) {
                if (this.f30690b == 2 && this.G != 1) {
                    this.G = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.F = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 1) {
            if (MediaController.B().R(this.f30698x, true)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).W(this.f30698x.F0(), this.f30698x, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.f30698x.F0());
            this.F = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(boolean, boolean):void");
    }

    public ij getMessageObject() {
        return this.f30698x;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j3, long j10) {
        this.H.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f30690b != 0) {
            if (this.G != 1) {
                b(false, true);
            }
        } else if (this.F != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.e();
        this.f30693f = org.telegram.ui.Components.r5.update(0, this, this.f30693f, this.h);
        this.f30695r = org.telegram.ui.Components.r5.update(0, this, this.f30695r, this.f30696s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        org.telegram.messenger.z5.q(this.D).v(this);
        org.telegram.ui.Components.r5.release(this, this.f30693f);
        org.telegram.ui.Components.r5.release(this, this.f30695r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint W0;
        float f10;
        int i7;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.f30697w;
        float f11 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (id.f23157a0) {
                f10 = 16.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f10);
            if (id.f23157a0 && imageView.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i7 = 0;
            }
            canvas.translate(L2 + i7, this.f30692e);
            this.h.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.h, this.f30693f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f30696s;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.l6.f27917g3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28275z6, g6Var));
            canvas.save();
            if (!id.f23157a0) {
                f11 = org.telegram.messenger.g0.C;
            }
            int L3 = org.telegram.messenger.g0.L(f11);
            if (id.f23157a0 && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L3 + i10, this.f30694n);
            this.f30696s.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f30696s, this.f30695r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wd, g6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f30699y && (W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", g6Var)) != null) {
            if (id.f23157a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30698x.I3()) {
            accessibilityNodeInfo.setText(id.a0("AccDescrMusicInfo", null, 2131754832, this.f30698x.w1(true), this.f30698x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f30696s.getText()));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L2;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        this.f30696s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            String y12 = this.f30698x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y12.replace('\n', ' '), org.telegram.ui.ActionBar.l6.f27900f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.l6.f27900f3.measureText(y12)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.f30698x.Y1, g6Var);
            if (x12 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = x12;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.l6.f27900f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f30693f = org.telegram.ui.Components.r5.update(0, this, this.f30693f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.f30698x.w1(true).replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(a00.d(this.f30698x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.l6.f27917g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.f30698x.Y1, g6Var);
            if (x13 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = x13;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.l6.f27917g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f30696s = staticLayout2;
            this.f30695r = org.telegram.ui.Components.r5.update(0, this, this.f30695r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        int L3 = org.telegram.messenger.g0.L(52.0f);
        if (id.f23157a0) {
            L2 = org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i7), L3);
        } else {
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        int L4 = org.telegram.messenger.g0.L(4.0f) + L2;
        this.f30691c = L4;
        int L5 = org.telegram.messenger.g0.L(6.0f);
        this.d = L5;
        this.H.r(L4, L5, org.telegram.messenger.g0.L(48.0f) + L2, org.telegram.messenger.g0.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        ij ijVar;
        int i7;
        try {
            RadialProgress2 radialProgress2 = this.H;
            if (radialProgress2 != null && (ijVar = this.f30698x) != null && this.f30690b != 0) {
                if (ijVar.P3()) {
                    i7 = org.telegram.ui.ActionBar.l6.Bc;
                } else {
                    i7 = org.telegram.ui.ActionBar.l6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.l6.w0(i7, this.K));
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
    public final void o(long j3, long j10) {
    }
}
