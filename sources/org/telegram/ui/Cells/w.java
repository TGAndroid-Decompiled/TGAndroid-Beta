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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qs;
import org.telegram.ui.y00;
public final class w extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.ActionBar.k6 {
    public static final int L = 0;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.p6 K;
    public boolean f23341a;
    public int f23342b;
    public int f23343c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.k5 f23344f;
    public StaticLayout h;
    public final int f23345n;
    public org.telegram.ui.Components.k5 f23346r;
    public StaticLayout f23347s;
    public final ImageView f23348w;
    public kj f23349x;
    public boolean f23350y;

    public w(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        this.e = org.telegram.messenger.i0.L(9.0f);
        this.f23345n = org.telegram.messenger.i0.L(29.0f);
        int i12 = e20.f15506s0;
        this.D = i12;
        setWillNotDraw(false);
        this.K = p6Var;
        this.I = i10;
        ImageView imageView = new ImageView(context);
        this.f23348w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231245);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21096m6, p6Var, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        if (dd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, w7.b6.d(42, 42.0f, i11 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bh.c(3));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.f21027id, org.telegram.ui.ActionBar.t6.f21046jd);
        this.E = org.telegram.messenger.b6.q(i12).k();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.G;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void D(boolean z10) {
        b(true, z10);
    }

    @Override
    public final void N(String str) {
        this.H.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i10 = this.F;
        int i11 = this.D;
        RadialProgress2 radialProgress2 = this.H;
        if (i10 == 0) {
            if (this.G == 0) {
                org.telegram.messenger.b8.G(i11).X(this.f23349x.F0(), this.f23349x, 1, 0);
            }
            MediaController B = MediaController.B();
            kj kjVar = this.f23349x;
            int indexOf = B.R0.indexOf(kjVar);
            if (indexOf == -1) {
                z10 = B.S(kjVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.f23342b == 2 && this.G != 1) {
                    this.G = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.F = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.B().R(this.f23349x, true)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.b8.G(i11).X(this.f23349x.F0(), this.f23349x, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            org.telegram.messenger.b8.G(i11).f(this.f23349x.F0());
            this.F = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.b(boolean, boolean):void");
    }

    public kj getMessageObject() {
        return this.f23349x;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void i(long j10, long j11) {
        this.H.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.f23342b != 0) {
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
        this.f23344f = org.telegram.ui.Components.o5.update(0, this, this.f23344f, this.h);
        this.f23346r = org.telegram.ui.Components.o5.update(0, this, this.f23346r, this.f23347s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        org.telegram.messenger.b6.q(this.D).v(this);
        org.telegram.ui.Components.o5.release(this, this.f23344f);
        org.telegram.ui.Components.o5.release(this, this.f23346r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint W0;
        float f7;
        int i10;
        StaticLayout staticLayout = this.h;
        int i11 = 0;
        ImageView imageView = this.f23348w;
        float f10 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (dd.X) {
                f7 = 16.0f;
            } else {
                f7 = org.telegram.messenger.i0.C;
            }
            int L2 = org.telegram.messenger.i0.L(f7);
            if (dd.X && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.i0.L(32.0f);
            } else {
                i10 = 0;
            }
            canvas.translate(L2 + i10, this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.h, this.f23344f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f23347s;
        org.telegram.ui.ActionBar.p6 p6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.t6.f20983g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var));
            canvas.save();
            if (!dd.X) {
                f10 = org.telegram.messenger.i0.C;
            }
            int L3 = org.telegram.messenger.i0.L(f10);
            if (dd.X && imageView.getVisibility() == 0) {
                i11 = org.telegram.messenger.i0.L(32.0f);
            }
            canvas.translate(L3 + i11, this.f23345n);
            this.f23347s.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f23347s, this.f23346r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wd, p6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f23350y && (W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var)) != null) {
            if (dd.X) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getHeight(), W0);
            } else {
                canvas.drawRect(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getHeight() - 1, getWidth(), getHeight(), W0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23349x.I3()) {
            accessibilityNodeInfo.setText(dd.a0("AccDescrMusicInfo", null, 2131754832, this.f23349x.x1(true), this.f23349x.z1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f23347s.getText()));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L2;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.p6 p6Var = this.K;
        this.f23347s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C)) - org.telegram.messenger.i0.L(48.0f);
        try {
            String z12 = this.f23349x.z1(true);
            CharSequence ellipsize = TextUtils.ellipsize(z12.replace('\n', ' '), org.telegram.ui.ActionBar.t6.f20964f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.t6.f20964f3.measureText(z12)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.i0.x1(ellipsize, this.f23349x.Y1, p6Var);
            if (x12 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = x12;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.t6.f20964f3, size + org.telegram.messenger.i0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f23344f = org.telegram.ui.Components.o5.update(0, this, this.f23344f, staticLayout);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            CharSequence replace = this.f23349x.x1(true).replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(y00.d(this.f23349x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.t6.f20983g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.i0.x1(ellipsize2, this.f23349x.Y1, p6Var);
            if (x13 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = x13;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.t6.f20983g3, size + org.telegram.messenger.i0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f23347s = staticLayout2;
            this.f23346r = org.telegram.ui.Components.o5.update(0, this, this.f23346r, staticLayout2);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
        int L3 = org.telegram.messenger.i0.L(52.0f);
        if (dd.X) {
            L2 = org.telegram.messenger.m5.z(8.0f, View.MeasureSpec.getSize(i10), L3);
        } else {
            L2 = org.telegram.messenger.i0.L(8.0f);
        }
        int L4 = org.telegram.messenger.i0.L(4.0f) + L2;
        this.f23343c = L4;
        int L5 = org.telegram.messenger.i0.L(6.0f);
        this.d = L5;
        this.H.r(L4, L5, org.telegram.messenger.i0.L(48.0f) + L2, org.telegram.messenger.i0.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        kj kjVar;
        int i10;
        try {
            RadialProgress2 radialProgress2 = this.H;
            if (radialProgress2 != null && (kjVar = this.f23349x) != null && this.f23342b != 0) {
                if (kjVar.P3()) {
                    i10 = org.telegram.ui.ActionBar.t6.Bc;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.We;
                }
                radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(i10, this.K));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
