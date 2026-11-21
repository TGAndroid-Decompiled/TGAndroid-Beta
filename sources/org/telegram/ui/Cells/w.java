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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.us;
import org.telegram.ui.c00;
public final class w extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.ActionBar.b6 {
    public static final int M = 0;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final org.telegram.ui.ActionBar.h6 L;
    public boolean f32225a;
    public int f32226b;
    public int f32227c;
    public int d;
    public final int f32228e;
    public org.telegram.ui.Components.u5 f32229f;
    public StaticLayout h;
    public final int f32230n;
    public org.telegram.ui.Components.u5 f32231r;
    public StaticLayout f32232s;
    public final ImageView f32233w;
    public fj f32234x;
    public boolean f32235y;

    public w(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        this.f32228e = org.telegram.messenger.g0.L(9.0f);
        this.f32230n = org.telegram.messenger.g0.L(29.0f);
        int i11 = j10.f24798t0;
        this.E = i11;
        setWillNotDraw(false);
        this.L = h6Var;
        this.J = i7;
        ImageView imageView = new ImageView(context);
        this.f32233w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29543m6, h6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.m6.f29470i6;
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M2, h6Var);
        if (gd.f24241a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, c8.ma.d(42, 42.0f, i10 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bi.o(12));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, h6Var);
        this.I = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.m6.Ze, org.telegram.ui.ActionBar.m6.f29329af, org.telegram.ui.ActionBar.m6.f29532ld, org.telegram.ui.ActionBar.m6.f29548md);
        this.F = org.telegram.messenger.a6.q(i11).k();
        setFocusable(true);
        if (i7 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new us(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i7 = this.G;
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
        int i7 = this.H;
        if (i7 < 0) {
            return 4;
        }
        if (i7 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void C(boolean z10) {
        b(true, z10);
    }

    @Override
    public final void N(String str) {
        this.I.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i7 = this.G;
        int i10 = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (i7 == 0) {
            if (this.H == 0) {
                org.telegram.messenger.w7.G(i10).W(this.f32234x.F0(), this.f32234x, 1, 0);
            }
            MediaController B = MediaController.B();
            fj fjVar = this.f32234x;
            int indexOf = B.S0.indexOf(fjVar);
            if (indexOf == -1) {
                z10 = B.S(fjVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.f32226b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 1) {
            if (MediaController.B().R(this.f32234x, true)) {
                this.G = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).W(this.f32234x.F0(), this.f32234x, 1, 0);
            this.G = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.f32234x.F0());
            this.G = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(boolean, boolean):void");
    }

    public fj getMessageObject() {
        return this.f32234x;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void i(long j3, long j10) {
        this.I.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f32226b != 0) {
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
        this.f32229f = org.telegram.ui.Components.y5.update(0, this, this.f32229f, this.h);
        this.f32231r = org.telegram.ui.Components.y5.update(0, this, this.f32231r, this.f32232s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        org.telegram.messenger.a6.q(this.E).v(this);
        org.telegram.ui.Components.y5.release(this, this.f32229f);
        org.telegram.ui.Components.y5.release(this, this.f32231r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint W0;
        float f10;
        int i7;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.f32233w;
        float f11 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (gd.f24241a0) {
                f10 = 16.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (gd.f24241a0 && imageView.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i7 = 0;
            }
            canvas.translate(L + i7, this.f32228e);
            this.h.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.h, this.f32229f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f32232s;
        org.telegram.ui.ActionBar.h6 h6Var = this.L;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.m6.f29430g3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29789z6, h6Var));
            canvas.save();
            if (!gd.f24241a0) {
                f11 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (gd.f24241a0 && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L2 + i10, this.f32230n);
            this.f32232s.draw(canvas);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f32232s, this.f32231r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zd, h6Var);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f32235y && (W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var)) != null) {
            if (gd.f24241a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32234x.I3()) {
            accessibilityNodeInfo.setText(gd.a0("AccDescrMusicInfo", null, 2131754831, this.f32234x.w1(true), this.f32234x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f32232s.getText()));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.h6 h6Var = this.L;
        this.f32232s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            String y12 = this.f32234x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y12.replace('\n', ' '), org.telegram.ui.ActionBar.m6.f29413f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.m6.f29413f3.measureText(y12)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.f32234x.f23950a2, h6Var);
            if (x12 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = x12;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.m6.f29413f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f32229f = org.telegram.ui.Components.y5.update(0, this, this.f32229f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.f32234x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(c00.d(this.f32234x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.m6.f29430g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.f32234x.f23950a2, h6Var);
            if (x13 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = x13;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.m6.f29430g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f32232s = staticLayout2;
            this.f32231r = org.telegram.ui.Components.y5.update(0, this, this.f32231r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        int L2 = org.telegram.messenger.g0.L(52.0f);
        if (gd.f24241a0) {
            L = org.telegram.messenger.f3.z(8.0f, View.MeasureSpec.getSize(i7), L2);
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        int L3 = org.telegram.messenger.g0.L(4.0f) + L;
        this.f32227c = L3;
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
        fj fjVar;
        int i7;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (fjVar = this.f32234x) != null && this.f32226b != 0) {
                if (fjVar.P3()) {
                    i7 = org.telegram.ui.ActionBar.m6.Ec;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.Ze;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.m6.w0(i7, this.L));
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
