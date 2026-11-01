package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class wt extends FrameLayout implements org.telegram.messenger.vs, uu0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.m1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.p6 M;
    public boolean N;
    public boolean O;
    public final mg.c2 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final rt f32308a;
    public final ag.r f32309b;
    public final cl0 f32310c;
    public st d;
    public boolean e;
    public vu0 f32311f;
    public final org.telegram.ui.ActionBar.k2 h;
    public boolean f32312n;
    public int f32313r;
    public int f32314s;
    public boolean f32315w;
    public int f32316x;
    public boolean f32317y;

    public wt(Context context, org.telegram.ui.gd gdVar, org.telegram.ui.oo ooVar) {
        this(context, gdVar, ooVar, 0, false, null);
    }

    @Override
    public final void L(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && ((this.f32315w || (i13 = this.L) == 2 || i13 == 3) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1())) {
            if (z10) {
                this.f32314s = i10;
                org.telegram.messenger.wp.c1().edit().putInt("kbd_height_land3", this.f32314s).commit();
            } else {
                this.f32313r = i10;
                org.telegram.messenger.wp.c1().edit().putInt("kbd_height", this.f32313r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            if (z10) {
                i11 = this.f32314s;
            } else {
                i11 = this.f32313r;
            }
            if (this.J) {
                i12 = org.telegram.messenger.i0.f16167n;
            } else {
                i12 = 0;
            }
            int i14 = i11 + i12;
            if (this.f32317y) {
                i14 = Math.min(org.telegram.messenger.i0.L(200.0f) + i14, org.telegram.messenger.i0.f16172q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = org.telegram.messenger.i0.f16172q.x;
            if (i15 != i16 || layoutParams.height != i14) {
                layoutParams.width = i16;
                layoutParams.height = i14;
                this.d.setLayoutParams(layoutParams);
                vu0 vu0Var = this.f32311f;
                if (vu0Var != null) {
                    this.f32316x = layoutParams.height;
                    vu0Var.requestLayout();
                    this.f32311f.getHeight();
                    if (this.T != this.f32317y) {
                        p();
                    }
                }
            }
        }
        this.T = this.f32317y;
        int i17 = this.G;
        boolean z13 = true;
        rt rtVar = this.f32308a;
        if (i17 == i10 && this.H == z10) {
            if (b()) {
                if (rtVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.f32315w = z12;
            }
            this.f32311f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z14 = this.f32315w;
        if (!rtVar.isFocused() || i10 <= 0) {
            z13 = false;
        }
        this.f32315w = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.f32316x != 0 && !(z11 = this.f32315w) && z11 != z14 && !this.e) {
            this.f32316x = 0;
            this.f32311f.requestLayout();
        }
        if (this.f32315w && this.N) {
            this.N = false;
            org.telegram.messenger.i0.r(this.P);
        }
        this.f32311f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.f30;
    }

    public final void d() {
        org.telegram.messenger.i0.v1(this.f32308a);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14726i4) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.P.g1();
            }
            rt rtVar = this.f32308a;
            if (rtVar != null) {
                int currentTextColor = rtVar.getCurrentTextColor();
                rtVar.setTextColor(-1);
                rtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        st stVar = this.d;
        if (stVar != null && stVar.f31943c1 != org.telegram.messenger.e20.f15506s0) {
            this.f32311f.removeView(stVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        if (i10 != 2 && i10 != 3 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        st stVar2 = new st(this, this.h, this.I, context, b10, z10, this.M, this.S);
        this.d = stVar2;
        stVar2.f31941c = this.U;
        stVar2.U0 = this.Q;
        stVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.i0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ut(this));
        this.f32311f.addView(this.d);
    }

    public mt getEditText() {
        return this.f32308a;
    }

    public View getEmojiButton() {
        return this.f32309b;
    }

    public int getEmojiPadding() {
        return this.f32316x;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public vy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i10;
        int i11;
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            i10 = this.f32314s;
        } else {
            i10 = this.f32313r;
        }
        if (this.J) {
            i11 = org.telegram.messenger.i0.f16167n;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f32317y) {
            return Math.min(org.telegram.messenger.i0.L(200.0f) + i12, point.y);
        }
        return i12;
    }

    public Editable getText() {
        return this.f32308a.getText();
    }

    public int h() {
        return f5.f();
    }

    public final void j() {
        st stVar;
        if (!this.e && (stVar = this.d) != null && stVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f32316x = 0;
        boolean z10 = this.f32317y;
        this.f32317y = false;
        if (z10) {
            st stVar2 = this.d;
            if (stVar2 != null) {
                stVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            st stVar = this.d;
            if (stVar != null && stVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new nh.b(this, measuredHeight, 3));
                this.O = true;
                ofFloat.addListener(new w5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f32317y;
        this.f32317y = false;
        if (z11) {
            st stVar2 = this.d;
            if (stVar2 != null) {
                stVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        if (view == this.d) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        st stVar = this.d;
        if (stVar != null && stVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f32308a.length();
    }

    public final void o() {
        this.D = true;
        st stVar = this.d;
        if (stVar != null) {
            stVar.C();
        }
        vu0 vu0Var = this.f32311f;
        if (vu0Var != null) {
            vu0Var.f31918r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            rt rtVar = this.f32308a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
            if (!org.telegram.messenger.i0.D && !this.f32315w && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                this.N = true;
                u();
                mg.c2 c2Var = this.P;
                org.telegram.messenger.i0.r(c2Var);
                org.telegram.messenger.i0.h3(c2Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.m1 m1Var) {
        this.K = m1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        st stVar = this.d;
        if (stVar != null) {
            stVar.f31941c = i10;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i10;
        float f7;
        int i11;
        int L;
        rt rtVar = this.f32308a;
        rtVar.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f32309b.setVisibility(i10);
        if (this.L == 0) {
            f7 = 11.0f;
        } else {
            f7 = 8.0f;
        }
        int L2 = org.telegram.messenger.i0.L(f7);
        if (z10) {
            if (org.telegram.messenger.dd.X) {
                i11 = org.telegram.messenger.i0.L(40.0f);
            } else {
                i11 = 0;
            }
            if (org.telegram.messenger.dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(40.0f);
            }
            rtVar.setPadding(i11, 0, L, L2);
            return;
        }
        rtVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f32308a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f32308a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f32308a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.f32308a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.f32308a.setSelection(i10);
    }

    public void setSizeNotifierLayout(vu0 vu0Var) {
        vu0 vu0Var2 = this.f32311f;
        if (vu0Var2 != null) {
            vu0Var2.f31918r.remove(this);
        }
        this.f32311f = vu0Var;
        vu0Var.f31918r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i10;
        rt rtVar = this.f32308a;
        int inputType = rtVar.getInputType();
        if (!z10) {
            i10 = 524288 | inputType;
        } else {
            i10 = (-524289) & inputType;
        }
        if (rtVar.getInputType() != i10) {
            rtVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32308a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        int i10;
        u();
        if (!org.telegram.messenger.i0.D && !this.E) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        x(i10);
        rt rtVar = this.f32308a;
        rtVar.requestFocus();
        org.telegram.messenger.i0.J3(rtVar);
        if (this.E) {
            this.F = true;
        } else if (!org.telegram.messenger.i0.D && !this.f32315w && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            this.N = true;
            mg.c2 c2Var = this.P;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 100L);
        }
    }

    public final void w(int i10, int i11) {
        this.f32308a.setSelection(i10, i11);
    }

    public void x(int i10) {
        int i11;
        cl0 cl0Var = this.f32310c;
        int i12 = 0;
        if (i10 == 1) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.e = true;
            this.R = 1.0f;
            st stVar2 = this.d;
            if (this.f32313r <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.f32313r = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.f32313r = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                }
            }
            if (this.f32314s <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.f32314s = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.f32314s = org.telegram.messenger.wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                i11 = this.f32314s;
            } else {
                i11 = this.f32313r;
            }
            if (this.J) {
                i12 = org.telegram.messenger.i0.f16167n;
            }
            int i13 = i11 + i12;
            if (this.f32317y) {
                i13 = Math.min(org.telegram.messenger.i0.L(200.0f) + i13, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar2.getLayoutParams();
            layoutParams.height = i13;
            stVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                org.telegram.messenger.i0.v1(this.f32308a);
            }
            vu0 vu0Var = this.f32311f;
            if (vu0Var != null) {
                this.f32316x = i13;
                vu0Var.requestLayout();
                cl0Var.a(2131231505, true);
                this.f32311f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f32309b != null) {
            if (this.L == 0) {
                cl0Var.a(2131232740, true);
            } else {
                cl0Var.a(2131231513, true);
            }
        }
        if (this.d != null) {
            this.e = false;
            p();
            if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        vu0 vu0Var2 = this.f32311f;
        if (vu0Var2 != null) {
            if (i10 == 0) {
                this.f32316x = 0;
                this.R = 0.0f;
            }
            vu0Var2.requestLayout();
            this.f32311f.getHeight();
        }
    }

    public wt(Context context, vu0 vu0Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.E = true;
        this.P = new mg.c2(this, 28);
        this.U = 2;
        this.I = z10;
        this.M = p6Var;
        this.L = i10;
        this.h = k2Var;
        this.f32311f = vu0Var;
        vu0Var.f31918r.add(this);
        rt rtVar = new rt(this, context, p6Var, i10);
        this.f32308a = rtVar;
        rtVar.setImeOptions(268435456);
        rtVar.setInputType(rtVar.getInputType() | 16384);
        rtVar.setFocusable(rtVar.isEnabled());
        rtVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        rtVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(rtVar, 30, i11, p6Var);
        if (i10 == 0) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 16);
            rtVar.setBackground(null);
            org.telegram.ui.ActionBar.a7.G(rtVar, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, p6Var);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.H6, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, i11, p6Var);
            org.telegram.ui.ActionBar.a7.m(rtVar, 36, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
            rtVar.setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0, org.telegram.messenger.dd.X ? 0 : org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(11.0f));
            boolean z11 = org.telegram.messenger.dd.X;
            addView(rtVar, w7.b6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            rtVar.setTextSize(1, 16.0f);
            rtVar.setMaxLines(8);
            rtVar.setGravity(19);
            rtVar.setAllowTextEntitiesIntersection(true);
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setBackground(null);
            rtVar.setClipToPadding(false);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.setLinkTextColor(-12147733);
            rtVar.D = -1;
            rtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.f21223t5, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(12.0f));
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.f21223t5, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(12.0f));
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ag.r rVar = new ag.r(this, context);
        this.f32309b = rVar;
        rVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cl0 cl0Var = new cl0(context);
        this.f32310c = cl0Var;
        rVar.setImageDrawable(cl0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.y(this, cl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            cl0Var.a(2131232740, false);
            addView(rVar, w7.b6.d(48, 48.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            cl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            cl0Var.a(2131231513, false);
            addView(rVar, w7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.a7.y(this, cl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            cl0Var.a(2131231513, false);
            addView(rVar, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.a7.y(this, cl0Var, org.telegram.ui.ActionBar.t6.f7, p6Var, PorterDuff.Mode.MULTIPLY);
            cl0Var.a(2131231513, false);
            addView(rVar, w7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.a7.y(this, cl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            cl0Var.a(2131231513, false);
            addView(rVar, w7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        rVar.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(rVar, h02, null, N, p6Var);
        rVar.setOnClickListener(new ag.i(this, vu0Var, p6Var, 15));
        rVar.setContentDescription(org.telegram.messenger.dd.L0(2131751197, null));
    }

    public void c(float f7) {
    }

    public void setDelegate(vt vtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, st stVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
