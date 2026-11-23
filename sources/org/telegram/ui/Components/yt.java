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
public class yt extends FrameLayout implements org.telegram.messenger.gs, cu0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.i1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.h6 N;
    public boolean O;
    public boolean P;
    public final ik Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final tt f42495a;
    public final kg.k f42496b;
    public final mk0 f42497c;
    public ut d;
    public boolean f42498e;
    public du0 f42499f;
    public final org.telegram.ui.ActionBar.g2 h;
    public boolean f42500n;
    public int f42501r;
    public int f42502s;
    public boolean f42503w;
    public int f42504x;
    public boolean f42505y;

    public yt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.rn rnVar) {
        this(context, wcVar, rnVar, 0, false, null);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f42503w || (i12 = this.M) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.f42502s = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height_land3", this.f42502s).commit();
            } else {
                this.f42501r = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height", this.f42501r).commit();
            }
        }
        boolean z12 = false;
        if (this.f42498e) {
            if (z10) {
                i10 = this.f42502s;
            } else {
                i10 = this.f42501r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f24005n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f42505y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f24010q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f24010q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                du0 du0Var = this.f42499f;
                if (du0Var != null) {
                    this.f42504x = layoutParams.height;
                    du0Var.requestLayout();
                    this.f42499f.getHeight();
                    if (this.U != this.f42505y) {
                        p();
                    }
                }
            }
        }
        this.U = this.f42505y;
        int i16 = this.H;
        boolean z13 = true;
        tt ttVar = this.f42495a;
        if (i16 == i7 && this.I == z10) {
            if (b()) {
                if (ttVar.isFocused() && i7 > 0) {
                    z12 = true;
                }
                this.f42503w = z12;
            }
            this.f42499f.getHeight();
            return;
        }
        this.H = i7;
        this.I = z10;
        boolean z14 = this.f42503w;
        if (!ttVar.isFocused() || i7 <= 0) {
            z13 = false;
        }
        this.f42503w = z13;
        if (z13 && this.f42498e) {
            x(0);
        }
        if (this.f42504x != 0 && !(z11 = this.f42503w) && z11 != z14 && !this.f42498e) {
            this.f42504x = 0;
            this.f42499f.requestLayout();
        }
        if (this.f42503w && this.O) {
            this.O = false;
            org.telegram.messenger.g0.r(this.Q);
        }
        this.f42499f.getHeight();
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
        org.telegram.messenger.g0.v1(this.f42495a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25306l4) {
            ut utVar = this.d;
            if (utVar != null) {
                utVar.Q.g1();
            }
            tt ttVar = this.f42495a;
            if (ttVar != null) {
                int currentTextColor = ttVar.getCurrentTextColor();
                ttVar.setTextColor(-1);
                ttVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        ut utVar = this.d;
        if (utVar != null && utVar.f40074d1 != org.telegram.messenger.k10.f24932t0) {
            this.f42499f.removeView(utVar);
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
        ut utVar2 = new ut(this, this.h, this.J, context, b10, z10, this.N, this.T);
        this.d = utVar2;
        utVar2.f40069c = this.V;
        utVar2.V0 = this.R;
        utVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new wt(this));
        this.f42499f.addView(this.d);
    }

    public ot getEditText() {
        return this.f42495a;
    }

    public View getEmojiButton() {
        return this.f42496b;
    }

    public int getEmojiPadding() {
        return this.f42504x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public ty getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i7;
        int i10;
        Point point = org.telegram.messenger.g0.f24010q;
        if (point.x > point.y) {
            i7 = this.f42502s;
        } else {
            i7 = this.f42501r;
        }
        if (this.K) {
            i10 = org.telegram.messenger.g0.f24005n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f42505y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f42495a.getText();
    }

    public int h() {
        return p5.f();
    }

    public final void j() {
        ut utVar;
        if (!this.f42498e && (utVar = this.d) != null && utVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.f42504x = 0;
        boolean z10 = this.f42505y;
        this.f42505y = false;
        if (z10) {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                utVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f42498e) {
            x(0);
        }
        if (z10) {
            ut utVar = this.d;
            if (utVar != null && utVar.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new y(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f42505y;
        this.f42505y = false;
        if (z11) {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                utVar2.t(false);
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
        ut utVar = this.d;
        if (utVar != null && utVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f42495a.length();
    }

    public final void o() {
        this.E = true;
        ut utVar = this.d;
        if (utVar != null) {
            utVar.B();
        }
        du0 du0Var = this.f42499f;
        if (du0Var != null) {
            du0Var.f34564r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            tt ttVar = this.f42495a;
            ttVar.requestFocus();
            org.telegram.messenger.g0.I3(ttVar);
            if (!org.telegram.messenger.g0.D && !this.f42503w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.O = true;
                u();
                ik ikVar = this.Q;
                org.telegram.messenger.g0.r(ikVar);
                org.telegram.messenger.g0.h3(ikVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.L = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        ut utVar = this.d;
        if (utVar != null) {
            utVar.f40069c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i7;
        float f10;
        int i10;
        int L;
        tt ttVar = this.f42495a;
        ttVar.setEnabled(z10);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f42496b.setVisibility(i7);
        if (this.M == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z10) {
            if (org.telegram.messenger.hd.f24408a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.hd.f24408a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            ttVar.setPadding(i10, 0, L, L2);
            return;
        }
        ttVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f42495a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f42495a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f42495a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f42495a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f42495a.setSelection(i7);
    }

    public void setSizeNotifierLayout(du0 du0Var) {
        du0 du0Var2 = this.f42499f;
        if (du0Var2 != null) {
            du0Var2.f34564r.remove(this);
        }
        this.f42499f = du0Var;
        du0Var.f34564r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i7;
        tt ttVar = this.f42495a;
        int inputType = ttVar.getInputType();
        if (!z10) {
            i7 = 524288 | inputType;
        } else {
            i7 = (-524289) & inputType;
        }
        if (ttVar.getInputType() != i7) {
            ttVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f42495a.setText(charSequence);
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
        tt ttVar = this.f42495a;
        ttVar.requestFocus();
        org.telegram.messenger.g0.I3(ttVar);
        if (this.F) {
            this.G = true;
        } else if (!org.telegram.messenger.g0.D && !this.f42503w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.O = true;
            ik ikVar = this.Q;
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f42495a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        mk0 mk0Var = this.f42497c;
        int i11 = 0;
        if (i7 == 1) {
            ut utVar = this.d;
            if (utVar != null) {
                utVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f42498e = true;
            this.S = 1.0f;
            ut utVar2 = this.d;
            if (this.f42501r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f42501r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f42501r = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f42502s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f42502s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f42502s = org.telegram.messenger.np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24010q;
            if (point.x > point.y) {
                i10 = this.f42502s;
            } else {
                i10 = this.f42501r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f24005n;
            }
            int i12 = i10 + i11;
            if (this.f42505y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) utVar2.getLayoutParams();
            layoutParams.height = i12;
            utVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f42495a);
            }
            du0 du0Var = this.f42499f;
            if (du0Var != null) {
                this.f42504x = i12;
                du0Var.requestLayout();
                mk0Var.a(2131231505, true);
                this.f42499f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.S = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f42496b != null) {
            if (this.M == 0) {
                mk0Var.a(2131232745, true);
            } else {
                mk0Var.a(2131231513, true);
            }
        }
        if (this.d != null) {
            this.f42498e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        du0 du0Var2 = this.f42499f;
        if (du0Var2 != null) {
            if (i7 == 0) {
                this.f42504x = 0;
                this.S = 0.0f;
            }
            du0Var2.requestLayout();
            this.f42499f.getHeight();
        }
    }

    public yt(Context context, du0 du0Var, org.telegram.ui.ActionBar.g2 g2Var, int i7, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.F = true;
        this.Q = new ik(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = h6Var;
        this.M = i7;
        this.h = g2Var;
        this.f42499f = du0Var;
        du0Var.f34564r.add(this);
        tt ttVar = new tt(this, context, h6Var, i7);
        this.f42495a = ttVar;
        ttVar.setImeOptions(268435456);
        ttVar.setInputType(ttVar.getInputType() | 16384);
        ttVar.setFocusable(ttVar.isEnabled());
        ttVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ttVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.l(ttVar, 30, i10, h6Var);
        if (i7 == 0) {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity((org.telegram.messenger.hd.f24408a0 ? 5 : 3) | 16);
            ttVar.setBackground(null);
            org.telegram.ui.ActionBar.t6.F(ttVar, org.telegram.ui.ActionBar.m6.f29476k6, org.telegram.ui.ActionBar.m6.f29494l6, org.telegram.ui.ActionBar.m6.f29568p7, h6Var);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.H6, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, i10, h6Var);
            org.telegram.ui.ActionBar.t6.l(ttVar, 36, org.telegram.ui.ActionBar.m6.f29520mg, h6Var);
            ttVar.setPadding(org.telegram.messenger.hd.f24408a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.f24408a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.hd.f24408a0;
            addView(ttVar, c8.na.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            ttVar.setTextSize(1, 16.0f);
            ttVar.setMaxLines(8);
            ttVar.setGravity(19);
            ttVar.setAllowTextEntitiesIntersection(true);
            ttVar.setHintTextColor(-1929379841);
            ttVar.setTextColor(-1);
            ttVar.setCursorColor(-1);
            ttVar.setBackground(null);
            ttVar.setClipToPadding(false);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            ttVar.setHandlesColor(-1);
            ttVar.setHighlightColor(822083583);
            ttVar.setLinkTextColor(-12147733);
            ttVar.E = -1;
            ttVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ttVar, c8.na.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity(19);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.f29643t5, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, org.telegram.ui.ActionBar.m6.f29455j5, h6Var);
            ttVar.setBackground(null);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ttVar, c8.na.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity(19);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.f29643t5, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, org.telegram.ui.ActionBar.m6.f29455j5, h6Var);
            ttVar.setBackground(null);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ttVar, c8.na.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f42496b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mk0 mk0Var = new mk0(context);
        this.f42497c = mk0Var;
        kVar.setImageDrawable(mk0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(2131232745, false);
            addView(kVar, c8.na.d(48, 48.0f, (org.telegram.messenger.hd.f24408a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            mk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            mk0Var.a(2131231513, false);
            addView(kVar, c8.na.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(2131231513, false);
            addView(kVar, c8.na.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.f29386f7, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(2131231513, false);
            addView(kVar, c8.na.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(2131231513, false);
            addView(kVar, c8.na.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(kVar, h02, null, M, h6Var);
        kVar.setOnClickListener(new st(this, du0Var, h6Var, 0));
        kVar.setContentDescription(org.telegram.messenger.hd.N0(2131751184, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(xt xtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ut utVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
