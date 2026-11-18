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
public class wt extends FrameLayout implements org.telegram.messenger.fs, zt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.j1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.i6 N;
    public boolean O;
    public boolean P;
    public final gk Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final rt f41786a;
    public final kg.k f41787b;
    public final kk0 f41788c;
    public st d;
    public boolean f41789e;
    public au0 f41790f;
    public final org.telegram.ui.ActionBar.h2 h;
    public boolean f41791n;
    public int f41792r;
    public int f41793s;
    public boolean f41794w;
    public int f41795x;
    public boolean f41796y;

    public wt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.rn rnVar) {
        this(context, wcVar, rnVar, 0, false, null);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f41794w || (i12 = this.M) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.f41793s = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.f41793s).commit();
            } else {
                this.f41792r = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.f41792r).commit();
            }
        }
        boolean z12 = false;
        if (this.f41789e) {
            if (z10) {
                i10 = this.f41793s;
            } else {
                i10 = this.f41792r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f24116n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f41796y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f24121q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f24121q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                au0 au0Var = this.f41790f;
                if (au0Var != null) {
                    this.f41795x = layoutParams.height;
                    au0Var.requestLayout();
                    this.f41790f.getHeight();
                    if (this.U != this.f41796y) {
                        p();
                    }
                }
            }
        }
        this.U = this.f41796y;
        int i16 = this.H;
        boolean z13 = true;
        rt rtVar = this.f41786a;
        if (i16 == i7 && this.I == z10) {
            if (b()) {
                if (rtVar.isFocused() && i7 > 0) {
                    z12 = true;
                }
                this.f41794w = z12;
            }
            this.f41790f.getHeight();
            return;
        }
        this.H = i7;
        this.I = z10;
        boolean z14 = this.f41794w;
        if (!rtVar.isFocused() || i7 <= 0) {
            z13 = false;
        }
        this.f41794w = z13;
        if (z13 && this.f41789e) {
            x(0);
        }
        if (this.f41795x != 0 && !(z11 = this.f41794w) && z11 != z14 && !this.f41789e) {
            this.f41795x = 0;
            this.f41790f.requestLayout();
        }
        if (this.f41794w && this.O) {
            this.O = false;
            org.telegram.messenger.g0.r(this.Q);
        }
        this.f41790f.getHeight();
    }

    public boolean a() {
        int i7 = this.M;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.k20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.f41786a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25145k4) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.Q.g1();
            }
            rt rtVar = this.f41786a;
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
        if (stVar != null && stVar.f39345d1 != org.telegram.messenger.j10.f24773t0) {
            this.f41790f.removeView(stVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.M;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        st stVar2 = new st(this, this.h, this.J, context, b10, z10, this.N, this.T);
        this.d = stVar2;
        stVar2.f39340c = this.V;
        stVar2.V0 = this.R;
        stVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ut(this));
        this.f41790f.addView(this.d);
    }

    public mt getEditText() {
        return this.f41786a;
    }

    public View getEmojiButton() {
        return this.f41787b;
    }

    public int getEmojiPadding() {
        return this.f41795x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public ry getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i7;
        int i10;
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            i7 = this.f41793s;
        } else {
            i7 = this.f41792r;
        }
        if (this.K) {
            i10 = org.telegram.messenger.g0.f24116n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f41796y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f41786a.getText();
    }

    public int h() {
        return o5.f();
    }

    public final void j() {
        st stVar;
        if (!this.f41789e && (stVar = this.d) != null && stVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.f41795x = 0;
        boolean z10 = this.f41796y;
        this.f41796y = false;
        if (z10) {
            st stVar2 = this.d;
            if (stVar2 != null) {
                stVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f41789e) {
            x(0);
        }
        if (z10) {
            st stVar = this.d;
            if (stVar != null && stVar.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.k2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f41796y;
        this.f41796y = false;
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
        return this.f41786a.length();
    }

    public final void o() {
        this.E = true;
        st stVar = this.d;
        if (stVar != null) {
            stVar.B();
        }
        au0 au0Var = this.f41790f;
        if (au0Var != null) {
            au0Var.f33465r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25145k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25145k4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            rt rtVar = this.f41786a;
            rtVar.requestFocus();
            org.telegram.messenger.g0.I3(rtVar);
            if (!org.telegram.messenger.g0.D && !this.f41794w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.O = true;
                u();
                gk gkVar = this.Q;
                org.telegram.messenger.g0.r(gkVar);
                org.telegram.messenger.g0.h3(gkVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.j1 j1Var) {
        this.L = j1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        st stVar = this.d;
        if (stVar != null) {
            stVar.f39340c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i7;
        float f10;
        int i10;
        int L;
        rt rtVar = this.f41786a;
        rtVar.setEnabled(z10);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f41787b.setVisibility(i7);
        if (this.M == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z10) {
            if (org.telegram.messenger.gd.f24216a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.gd.f24216a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            rtVar.setPadding(i10, 0, L, L2);
            return;
        }
        rtVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f41786a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f41786a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f41786a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f41786a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f41786a.setSelection(i7);
    }

    public void setSizeNotifierLayout(au0 au0Var) {
        au0 au0Var2 = this.f41790f;
        if (au0Var2 != null) {
            au0Var2.f33465r.remove(this);
        }
        this.f41790f = au0Var;
        au0Var.f33465r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i7;
        rt rtVar = this.f41786a;
        int inputType = rtVar.getInputType();
        if (!z10) {
            i7 = 524288 | inputType;
        } else {
            i7 = (-524289) & inputType;
        }
        if (rtVar.getInputType() != i7) {
            rtVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f41786a.setText(charSequence);
    }

    public boolean t(int i7) {
        return true;
    }

    public final void v() {
        int i7;
        u();
        if (!org.telegram.messenger.g0.D && !this.F) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        x(i7);
        rt rtVar = this.f41786a;
        rtVar.requestFocus();
        org.telegram.messenger.g0.I3(rtVar);
        if (this.F) {
            this.G = true;
        } else if (!org.telegram.messenger.g0.D && !this.f41794w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.O = true;
            gk gkVar = this.Q;
            org.telegram.messenger.g0.r(gkVar);
            org.telegram.messenger.g0.h3(gkVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f41786a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        kk0 kk0Var = this.f41788c;
        int i11 = 0;
        if (i7 == 1) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f41789e = true;
            this.S = 1.0f;
            st stVar2 = this.d;
            if (this.f41792r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f41792r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f41792r = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f41793s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f41793s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f41793s = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24121q;
            if (point.x > point.y) {
                i10 = this.f41793s;
            } else {
                i10 = this.f41792r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f24116n;
            }
            int i12 = i10 + i11;
            if (this.f41796y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar2.getLayoutParams();
            layoutParams.height = i12;
            stVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f41786a);
            }
            au0 au0Var = this.f41790f;
            if (au0Var != null) {
                this.f41795x = i12;
                au0Var.requestLayout();
                kk0Var.a(2131231505, true);
                this.f41790f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.S = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f41787b != null) {
            if (this.M == 0) {
                kk0Var.a(2131232745, true);
            } else {
                kk0Var.a(2131231513, true);
            }
        }
        if (this.d != null) {
            this.f41789e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        au0 au0Var2 = this.f41790f;
        if (au0Var2 != null) {
            if (i7 == 0) {
                this.f41795x = 0;
                this.S = 0.0f;
            }
            au0Var2.requestLayout();
            this.f41790f.getHeight();
        }
    }

    public wt(Context context, au0 au0Var, org.telegram.ui.ActionBar.h2 h2Var, int i7, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = true;
        this.Q = new gk(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = i6Var;
        this.M = i7;
        this.h = h2Var;
        this.f41790f = au0Var;
        au0Var.f33465r.add(this);
        rt rtVar = new rt(this, context, i6Var, i7);
        this.f41786a = rtVar;
        rtVar.setImeOptions(268435456);
        rtVar.setInputType(rtVar.getInputType() | 16384);
        rtVar.setFocusable(rtVar.isEnabled());
        rtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(rtVar, 30, i10, i6Var);
        if (i7 == 0) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity((org.telegram.messenger.gd.f24216a0 ? 5 : 3) | 16);
            rtVar.setBackground(null);
            org.telegram.ui.ActionBar.u6.F(rtVar, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, i6Var);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.H6, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, i10, i6Var);
            org.telegram.ui.ActionBar.u6.l(rtVar, 36, org.telegram.ui.ActionBar.n6.f29569mg, i6Var);
            rtVar.setPadding(org.telegram.messenger.gd.f24216a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.gd.f24216a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.gd.f24216a0;
            addView(rtVar, c8.ma.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            rtVar.setTextSize(1, 16.0f);
            rtVar.setMaxLines(8);
            rtVar.setGravity(19);
            rtVar.setAllowTextEntitiesIntersection(true);
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setBackground(null);
            rtVar.setClipToPadding(false);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.setLinkTextColor(-12147733);
            rtVar.E = -1;
            rtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.f29692t5, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.f29692t5, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f41787b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        kk0 kk0Var = new kk0(context);
        this.f41788c = kk0Var;
        kVar.setImageDrawable(kk0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(2131232745, false);
            addView(kVar, c8.ma.d(48, 48.0f, (org.telegram.messenger.gd.f24216a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            kk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            kk0Var.a(2131231513, false);
            addView(kVar, c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(2131231513, false);
            addView(kVar, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.f29435f7, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(2131231513, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(2131231513, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(kVar, h02, null, M, i6Var);
        kVar.setOnClickListener(new qt(this, au0Var, i6Var, 0));
        kVar.setContentDescription(org.telegram.messenger.gd.M0(2131751185, null));
    }

    public void c(float f10) {
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

    public void q(int i7, int i10) {
    }
}
