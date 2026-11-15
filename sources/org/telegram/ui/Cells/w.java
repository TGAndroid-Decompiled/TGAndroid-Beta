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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ls;
import org.telegram.ui.zz;
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
    public boolean f31836a;
    public int f31837b;
    public int f31838c;
    public int d;
    public final int f31839e;
    public org.telegram.ui.Components.l5 f31840f;
    public StaticLayout h;
    public final int f31841n;
    public org.telegram.ui.Components.l5 f31842r;
    public StaticLayout f31843s;
    public final ImageView f31844w;
    public gj f31845x;
    public boolean f31846y;

    public w(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.f31839e = org.telegram.messenger.g0.L(9.0f);
        this.f31841n = org.telegram.messenger.g0.L(29.0f);
        int i11 = m10.f24940t0;
        this.E = i11;
        setWillNotDraw(false);
        this.L = e6Var;
        this.J = i7;
        ImageView imageView = new ImageView(context);
        this.f31844w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29014m6, e6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M2, e6Var);
        if (hd.f24104a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, c8.ja.d(42, 42.0f, i10 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bi.o(10));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.I = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.j6.Ze, org.telegram.ui.ActionBar.j6.f28800af, org.telegram.ui.ActionBar.j6.f29003ld, org.telegram.ui.ActionBar.j6.f29019md);
        this.F = org.telegram.messenger.z5.q(i11).k();
        setFocusable(true);
        if (i7 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ls(), 0, 1, 0);
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
                org.telegram.messenger.w7.G(i10).W(this.f31845x.F0(), this.f31845x, 1, 0);
            }
            MediaController B = MediaController.B();
            gj gjVar = this.f31845x;
            int indexOf = B.S0.indexOf(gjVar);
            if (indexOf == -1) {
                z10 = B.S(gjVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.f31837b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 1) {
            if (MediaController.B().R(this.f31845x, true)) {
                this.G = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).W(this.f31845x.F0(), this.f31845x, 1, 0);
            this.G = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.f31845x.F0());
            this.G = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(boolean, boolean):void");
    }

    public gj getMessageObject() {
        return this.f31845x;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void i(long j3, long j10) {
        this.I.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f31837b != 0) {
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
        this.f31840f = org.telegram.ui.Components.p5.update(0, this, this.f31840f, this.h);
        this.f31842r = org.telegram.ui.Components.p5.update(0, this, this.f31842r, this.f31843s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        org.telegram.messenger.z5.q(this.E).v(this);
        org.telegram.ui.Components.p5.release(this, this.f31840f);
        org.telegram.ui.Components.p5.release(this, this.f31842r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint W0;
        float f10;
        int i7;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.f31844w;
        float f11 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (hd.f24104a0) {
                f10 = 16.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (hd.f24104a0 && imageView.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i7 = 0;
            }
            canvas.translate(L + i7, this.f31839e);
            this.h.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.h, this.f31840f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f31843s;
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.j6.f28901g3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var));
            canvas.save();
            if (!hd.f24104a0) {
                f11 = org.telegram.messenger.g0.C;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            if (hd.f24104a0 && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L2 + i10, this.f31841n);
            this.f31843s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f31843s, this.f31842r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zd, e6Var);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f31846y && (W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var)) != null) {
            if (hd.f24104a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f31845x.I3()) {
            accessibilityNodeInfo.setText(hd.a0("AccDescrMusicInfo", null, 2131754832, this.f31845x.w1(true), this.f31845x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f31843s.getText()));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        this.f31843s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            String y12 = this.f31845x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y12.replace('\n', ' '), org.telegram.ui.ActionBar.j6.f28884f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.j6.f28884f3.measureText(y12)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.f31845x.f23776a2, e6Var);
            if (x12 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = x12;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.j6.f28884f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f31840f = org.telegram.ui.Components.p5.update(0, this, this.f31840f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.f31845x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(zz.d(this.f31845x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.j6.f28901g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.f31845x.f23776a2, e6Var);
            if (x13 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = x13;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.j6.f28901g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f31843s = staticLayout2;
            this.f31842r = org.telegram.ui.Components.p5.update(0, this, this.f31842r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        int L2 = org.telegram.messenger.g0.L(52.0f);
        if (hd.f24104a0) {
            L = org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i7), L2);
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        int L3 = org.telegram.messenger.g0.L(4.0f) + L;
        this.f31838c = L3;
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
        gj gjVar;
        int i7;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (gjVar = this.f31845x) != null && this.f31837b != 0) {
                if (gjVar.P3()) {
                    i7 = org.telegram.ui.ActionBar.j6.Ec;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.Ze;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.j6.w0(i7, this.L));
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
