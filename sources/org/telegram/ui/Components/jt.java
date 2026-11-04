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
public class jt extends FrameLayout implements org.telegram.messenger.cs, pt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.h1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
    public boolean O;
    public boolean P;
    public final mi.b0 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final dt f35188a;
    public final lg.k f35189b;
    public final bk0 f35190c;
    public et d;
    public boolean f35191e;
    public qt0 f35192f;
    public final org.telegram.ui.ActionBar.d2 h;
    public boolean f35193n;
    public int f35194r;
    public int f35195s;
    public boolean f35196w;
    public int f35197x;
    public boolean f35198y;

    public jt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.ln lnVar) {
        this(context, wcVar, lnVar, 0, false, null);
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (i3 > org.telegram.messenger.g0.L(50.0f) && ((this.f35196w || (i12 = this.M) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.f35195s = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.f35195s).commit();
            } else {
                this.f35194r = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.f35194r).commit();
            }
        }
        boolean z12 = false;
        if (this.f35191e) {
            if (z10) {
                i10 = this.f35195s;
            } else {
                i10 = this.f35194r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f22603n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f35198y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f22608q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f22608q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                qt0 qt0Var = this.f35192f;
                if (qt0Var != null) {
                    this.f35197x = layoutParams.height;
                    qt0Var.requestLayout();
                    this.f35192f.getHeight();
                    if (this.U != this.f35198y) {
                        p();
                    }
                }
            }
        }
        this.U = this.f35198y;
        int i16 = this.H;
        boolean z13 = true;
        dt dtVar = this.f35188a;
        if (i16 == i3 && this.I == z10) {
            if (b()) {
                if (dtVar.isFocused() && i3 > 0) {
                    z12 = true;
                }
                this.f35196w = z12;
            }
            this.f35192f.getHeight();
            return;
        }
        this.H = i3;
        this.I = z10;
        boolean z14 = this.f35196w;
        if (!dtVar.isFocused() || i3 <= 0) {
            z13 = false;
        }
        this.f35196w = z13;
        if (z13 && this.f35191e) {
            x(0);
        }
        if (this.f35197x != 0 && !(z11 = this.f35196w) && z11 != z14 && !this.f35191e) {
            this.f35197x = 0;
            this.f35192f.requestLayout();
        }
        if (this.f35196w && this.O) {
            this.O = false;
            org.telegram.messenger.g0.r(this.Q);
        }
        this.f35192f.getHeight();
    }

    public boolean a() {
        int i3 = this.M;
        if (i3 != 2 && i3 != 3 && i3 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.c20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.f35188a);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            et etVar = this.d;
            if (etVar != null) {
                etVar.Q.g1();
            }
            dt dtVar = this.f35188a;
            if (dtVar != null) {
                int currentTextColor = dtVar.getCurrentTextColor();
                dtVar.setTextColor(-1);
                dtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        et etVar = this.d;
        if (etVar != null && etVar.f33529d1 != org.telegram.messenger.h10.f22829t0) {
            this.f35192f.removeView(etVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i3 = this.M;
        if (i3 != 2 && i3 != 3 && i3 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        et etVar2 = new et(this, this.h, this.J, context, b10, z10, this.N, this.T);
        this.d = etVar2;
        etVar2.f33525c = this.V;
        etVar2.V0 = this.R;
        etVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new gt(this));
        this.f35192f.addView(this.d);
    }

    public xs getEditText() {
        return this.f35188a;
    }

    public View getEmojiButton() {
        return this.f35189b;
    }

    public int getEmojiPadding() {
        return this.f35197x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public ey getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i3;
        int i10;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            i3 = this.f35195s;
        } else {
            i3 = this.f35194r;
        }
        if (this.K) {
            i10 = org.telegram.messenger.g0.f22603n;
        } else {
            i10 = 0;
        }
        int i11 = i3 + i10;
        if (this.f35198y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f35188a.getText();
    }

    public int h() {
        return g5.f();
    }

    public final void j() {
        et etVar;
        if (!this.f35191e && (etVar = this.d) != null && etVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.f35197x = 0;
        boolean z10 = this.f35198y;
        this.f35198y = false;
        if (z10) {
            et etVar2 = this.d;
            if (etVar2 != null) {
                etVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f35191e) {
            x(0);
        }
        if (z10) {
            et etVar = this.d;
            if (etVar != null && etVar.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.g2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f35198y;
        this.f35198y = false;
        if (z11) {
            et etVar2 = this.d;
            if (etVar2 != null) {
                etVar2.t(false);
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
        et etVar = this.d;
        if (etVar != null && etVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f35188a.length();
    }

    public final void o() {
        this.E = true;
        et etVar = this.d;
        if (etVar != null) {
            etVar.B();
        }
        qt0 qt0Var = this.f35192f;
        if (qt0Var != null) {
            qt0Var.f37537r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            dt dtVar = this.f35188a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
            if (!org.telegram.messenger.g0.D && !this.f35196w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.O = true;
                u();
                mi.b0 b0Var = this.Q;
                org.telegram.messenger.g0.r(b0Var);
                org.telegram.messenger.g0.i3(b0Var, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.h1 h1Var) {
        this.L = h1Var;
    }

    public void setEmojiViewCacheType(int i3) {
        this.V = i3;
        et etVar = this.d;
        if (etVar != null) {
            etVar.f33525c = i3;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i3;
        float f10;
        int i10;
        int L;
        dt dtVar = this.f35188a;
        dtVar.setEnabled(z10);
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f35189b.setVisibility(i3);
        if (this.M == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z10) {
            if (org.telegram.messenger.bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            dtVar.setPadding(i10, 0, L, L2);
            return;
        }
        dtVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f35188a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f35188a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f35188a.setHint(charSequence);
    }

    public void setMaxLines(int i3) {
        this.f35188a.setMaxLines(i3);
    }

    public void setSelection(int i3) {
        this.f35188a.setSelection(i3);
    }

    public void setSizeNotifierLayout(qt0 qt0Var) {
        qt0 qt0Var2 = this.f35192f;
        if (qt0Var2 != null) {
            qt0Var2.f37537r.remove(this);
        }
        this.f35192f = qt0Var;
        qt0Var.f37537r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i3;
        dt dtVar = this.f35188a;
        int inputType = dtVar.getInputType();
        if (!z10) {
            i3 = 524288 | inputType;
        } else {
            i3 = (-524289) & inputType;
        }
        if (dtVar.getInputType() != i3) {
            dtVar.setInputType(i3);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f35188a.setText(charSequence);
    }

    public boolean t(int i3) {
        return true;
    }

    public final void v() {
        int i3;
        u();
        if (!org.telegram.messenger.g0.D && !this.F) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        x(i3);
        dt dtVar = this.f35188a;
        dtVar.requestFocus();
        org.telegram.messenger.g0.K3(dtVar);
        if (this.F) {
            this.G = true;
        } else if (!org.telegram.messenger.g0.D && !this.f35196w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.O = true;
            mi.b0 b0Var = this.Q;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 100L);
        }
    }

    public final void w(int i3, int i10) {
        this.f35188a.setSelection(i3, i10);
    }

    public void x(int i3) {
        int i10;
        bk0 bk0Var = this.f35190c;
        int i11 = 0;
        if (i3 == 1) {
            et etVar = this.d;
            if (etVar != null) {
                etVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f35191e = true;
            this.S = 1.0f;
            et etVar2 = this.d;
            if (this.f35194r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35194r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35194r = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f35195s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35195s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35195s = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                i10 = this.f35195s;
            } else {
                i10 = this.f35194r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f22603n;
            }
            int i12 = i10 + i11;
            if (this.f35198y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) etVar2.getLayoutParams();
            layoutParams.height = i12;
            etVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f35188a);
            }
            qt0 qt0Var = this.f35192f;
            if (qt0Var != null) {
                this.f35197x = i12;
                qt0Var.requestLayout();
                bk0Var.a(2131231504, true);
                this.f35192f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.S = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f35189b != null) {
            if (this.M == 0) {
                bk0Var.a(2131232741, true);
            } else {
                bk0Var.a(2131231512, true);
            }
        }
        if (this.d != null) {
            this.f35191e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        qt0 qt0Var2 = this.f35192f;
        if (qt0Var2 != null) {
            if (i3 == 0) {
                this.f35197x = 0;
                this.S = 0.0f;
            }
            qt0Var2.requestLayout();
            this.f35192f.getHeight();
        }
    }

    public jt(Context context, qt0 qt0Var, org.telegram.ui.ActionBar.d2 d2Var, int i3, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = true;
        this.Q = new mi.b0(this, 29);
        this.V = 2;
        this.J = z10;
        this.N = e6Var;
        this.M = i3;
        this.h = d2Var;
        this.f35192f = qt0Var;
        qt0Var.f37537r.add(this);
        dt dtVar = new dt(this, context, e6Var, i3);
        this.f35188a = dtVar;
        dtVar.setImeOptions(268435456);
        dtVar.setInputType(dtVar.getInputType() | 16384);
        dtVar.setFocusable(dtVar.isEnabled());
        dtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        dtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(dtVar, 30, i10, e6Var);
        if (i3 == 0) {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity((org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16);
            dtVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.G(dtVar, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.H6, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, i10, e6Var);
            org.telegram.ui.ActionBar.r6.m(dtVar, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
            dtVar.setPadding(org.telegram.messenger.bd.f21784a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.bd.f21784a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.bd.f21784a0;
            addView(dtVar, b8.mf.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i3 == 2 || i3 == 3) {
            dtVar.setTextSize(1, 16.0f);
            dtVar.setMaxLines(8);
            dtVar.setGravity(19);
            dtVar.setAllowTextEntitiesIntersection(true);
            dtVar.setHintTextColor(-1929379841);
            dtVar.setTextColor(-1);
            dtVar.setCursorColor(-1);
            dtVar.setBackground(null);
            dtVar.setClipToPadding(false);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            dtVar.setHandlesColor(-1);
            dtVar.setHighlightColor(822083583);
            dtVar.setLinkTextColor(-12147733);
            dtVar.E = -1;
            dtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i3 == 4) {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.f28176t5, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            dtVar.setBackground(null);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.f28176t5, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            dtVar.setBackground(null);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        lg.k kVar = new lg.k(this, context);
        this.f35189b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bk0 bk0Var = new bk0(context);
        this.f35190c = bk0Var;
        kVar.setImageDrawable(bk0Var);
        if (i3 == 0) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(2131232741, false);
            addView(kVar, b8.mf.d(48, 48.0f, (org.telegram.messenger.bd.f21784a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i3 == 2 || i3 == 3) {
            bk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bk0Var.a(2131231512, false);
            addView(kVar, b8.mf.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i3 == 4) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(2131231512, false);
            addView(kVar, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i3 == 5) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.f27918f7, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(2131231512, false);
            addView(kVar, b8.mf.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(2131231512, false);
            addView(kVar, b8.mf.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(kVar, h02, null, N, e6Var);
        kVar.setOnClickListener(new ct(this, qt0Var, e6Var, 0));
        kVar.setContentDescription(org.telegram.messenger.bd.M0(2131751197, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(ht htVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, et etVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i3, int i10) {
    }
}
