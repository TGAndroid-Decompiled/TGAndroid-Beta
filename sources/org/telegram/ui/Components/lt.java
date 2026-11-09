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
public class lt extends FrameLayout implements org.telegram.messenger.ls, st0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.i1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.g6 M;
    public boolean N;
    public boolean O;
    public final et P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final ft f35841a;
    public final kg.k f35842b;
    public final yj0 f35843c;
    public gt d;
    public boolean f35844e;
    public tt0 f35845f;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean f35846n;
    public int f35847r;
    public int f35848s;
    public boolean f35849w;
    public int f35850x;
    public boolean f35851y;

    public lt(Context context, org.telegram.ui.xc xcVar, org.telegram.ui.rn rnVar) {
        this(context, xcVar, rnVar, 0, false, null);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f35849w || (i12 = this.L) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z9) {
                this.f35848s = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.f35848s).commit();
            } else {
                this.f35847r = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.f35847r).commit();
            }
        }
        boolean z11 = false;
        if (this.f35844e) {
            if (z9) {
                i10 = this.f35848s;
            } else {
                i10 = this.f35847r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22558n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f35851y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f22563q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f22563q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                tt0 tt0Var = this.f35845f;
                if (tt0Var != null) {
                    this.f35850x = layoutParams.height;
                    tt0Var.requestLayout();
                    this.f35845f.getHeight();
                    if (this.T != this.f35851y) {
                        p();
                    }
                }
            }
        }
        this.T = this.f35851y;
        int i16 = this.G;
        boolean z12 = true;
        ft ftVar = this.f35841a;
        if (i16 == i7 && this.H == z9) {
            if (b()) {
                if (ftVar.isFocused() && i7 > 0) {
                    z11 = true;
                }
                this.f35849w = z11;
            }
            this.f35845f.getHeight();
            return;
        }
        this.G = i7;
        this.H = z9;
        boolean z13 = this.f35849w;
        if (!ftVar.isFocused() || i7 <= 0) {
            z12 = false;
        }
        this.f35849w = z12;
        if (z12 && this.f35844e) {
            x(0);
        }
        if (this.f35850x != 0 && !(z10 = this.f35849w) && z10 != z13 && !this.f35844e) {
            this.f35850x = 0;
            this.f35845f.requestLayout();
        }
        if (this.f35849w && this.N) {
            this.N = false;
            org.telegram.messenger.g0.r(this.P);
        }
        this.f35845f.getHeight();
    }

    public boolean a() {
        int i7 = this.L;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.j20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.f35841a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            gt gtVar = this.d;
            if (gtVar != null) {
                gtVar.P.g1();
            }
            ft ftVar = this.f35841a;
            if (ftVar != null) {
                int currentTextColor = ftVar.getCurrentTextColor();
                ftVar.setTextColor(-1);
                ftVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z9;
        gt gtVar = this.d;
        if (gtVar != null && gtVar.f34415c1 != org.telegram.messenger.p10.f24470s0) {
            this.f35845f.removeView(gtVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.L;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        gt gtVar2 = new gt(this, this.h, this.I, context, b10, z9, this.M, this.S);
        this.d = gtVar2;
        gtVar2.f34413c = this.U;
        gtVar2.U0 = this.Q;
        gtVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new jt(this));
        this.f35845f.addView(this.d);
    }

    public zs getEditText() {
        return this.f35841a;
    }

    public View getEmojiButton() {
        return this.f35842b;
    }

    public int getEmojiPadding() {
        return this.f35850x;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public hy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i7;
        int i10;
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            i7 = this.f35848s;
        } else {
            i7 = this.f35847r;
        }
        if (this.J) {
            i10 = org.telegram.messenger.g0.f22558n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f35851y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f35841a.getText();
    }

    public int h() {
        return i5.f();
    }

    public final void j() {
        gt gtVar;
        if (!this.f35844e && (gtVar = this.d) != null && gtVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f35850x = 0;
        boolean z9 = this.f35851y;
        this.f35851y = false;
        if (z9) {
            gt gtVar2 = this.d;
            if (gtVar2 != null) {
                gtVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z9) {
        if (this.f35844e) {
            x(0);
        }
        if (z9) {
            gt gtVar = this.d;
            if (gtVar != null && gtVar.getVisibility() == 0 && !this.N) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new z5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f35851y;
        this.f35851y = false;
        if (z10) {
            gt gtVar2 = this.d;
            if (gtVar2 != null) {
                gtVar2.t(false);
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
        gt gtVar = this.d;
        if (gtVar != null && gtVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f35841a.length();
    }

    public final void o() {
        this.D = true;
        gt gtVar = this.d;
        if (gtVar != null) {
            gtVar.B();
        }
        tt0 tt0Var = this.f35845f;
        if (tt0Var != null) {
            tt0Var.f38499r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            ft ftVar = this.f35841a;
            ftVar.requestFocus();
            org.telegram.messenger.g0.K3(ftVar);
            if (!org.telegram.messenger.g0.D && !this.f35849w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.N = true;
                u();
                et etVar = this.P;
                org.telegram.messenger.g0.r(etVar);
                org.telegram.messenger.g0.i3(etVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.K = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.U = i7;
        gt gtVar = this.d;
        if (gtVar != null) {
            gtVar.f34413c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        int i7;
        float f10;
        int i10;
        int L;
        ft ftVar = this.f35841a;
        ftVar.setEnabled(z9);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f35842b.setVisibility(i7);
        if (this.L == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z9) {
            if (org.telegram.messenger.id.f23157a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.id.f23157a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            ftVar.setPadding(i10, 0, L, L2);
            return;
        }
        ftVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f35841a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z9) {
        this.f35841a.setFocusable(z9);
    }

    public void setHint(CharSequence charSequence) {
        this.f35841a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f35841a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f35841a.setSelection(i7);
    }

    public void setSizeNotifierLayout(tt0 tt0Var) {
        tt0 tt0Var2 = this.f35845f;
        if (tt0Var2 != null) {
            tt0Var2.f38499r.remove(this);
        }
        this.f35845f = tt0Var;
        tt0Var.f38499r.add(this);
    }

    public void setSuggestionsEnabled(boolean z9) {
        int i7;
        ft ftVar = this.f35841a;
        int inputType = ftVar.getInputType();
        if (!z9) {
            i7 = 524288 | inputType;
        } else {
            i7 = (-524289) & inputType;
        }
        if (ftVar.getInputType() != i7) {
            ftVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f35841a.setText(charSequence);
    }

    public boolean t(int i7) {
        return true;
    }

    public final void v() {
        int i7;
        u();
        if (!org.telegram.messenger.g0.D && !this.E) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        x(i7);
        ft ftVar = this.f35841a;
        ftVar.requestFocus();
        org.telegram.messenger.g0.K3(ftVar);
        if (this.E) {
            this.F = true;
        } else if (!org.telegram.messenger.g0.D && !this.f35849w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.N = true;
            et etVar = this.P;
            org.telegram.messenger.g0.r(etVar);
            org.telegram.messenger.g0.i3(etVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f35841a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        yj0 yj0Var = this.f35843c;
        int i11 = 0;
        if (i7 == 1) {
            gt gtVar = this.d;
            if (gtVar != null) {
                gtVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f35844e = true;
            this.R = 1.0f;
            gt gtVar2 = this.d;
            if (this.f35847r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35847r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35847r = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f35848s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35848s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35848s = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                i10 = this.f35848s;
            } else {
                i10 = this.f35847r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22558n;
            }
            int i12 = i10 + i11;
            if (this.f35851y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gtVar2.getLayoutParams();
            layoutParams.height = i12;
            gtVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f35841a);
            }
            tt0 tt0Var = this.f35845f;
            if (tt0Var != null) {
                this.f35850x = i12;
                tt0Var.requestLayout();
                yj0Var.a(2131231504, true);
                this.f35845f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f35842b != null) {
            if (this.L == 0) {
                yj0Var.a(2131232743, true);
            } else {
                yj0Var.a(2131231512, true);
            }
        }
        if (this.d != null) {
            this.f35844e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        tt0 tt0Var2 = this.f35845f;
        if (tt0Var2 != null) {
            if (i7 == 0) {
                this.f35850x = 0;
                this.R = 0.0f;
            }
            tt0Var2.requestLayout();
            this.f35845f.getHeight();
        }
    }

    public lt(Context context, tt0 tt0Var, org.telegram.ui.ActionBar.f2 f2Var, int i7, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = true;
        this.P = new et(this, 0);
        this.U = 2;
        this.I = z9;
        this.M = g6Var;
        this.L = i7;
        this.h = f2Var;
        this.f35845f = tt0Var;
        tt0Var.f38499r.add(this);
        ft ftVar = new ft(this, context, g6Var, i7);
        this.f35841a = ftVar;
        ftVar.setImeOptions(268435456);
        ftVar.setInputType(ftVar.getInputType() | 16384);
        ftVar.setFocusable(ftVar.isEnabled());
        ftVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ftVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.l(ftVar, 30, i10, g6Var);
        if (i7 == 0) {
            ftVar.setTextSize(1, 18.0f);
            ftVar.setMaxLines(4);
            ftVar.setGravity((org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16);
            ftVar.setBackground(null);
            org.telegram.ui.ActionBar.s6.F(ftVar, org.telegram.ui.ActionBar.l6.f27994k6, org.telegram.ui.ActionBar.l6.f28012l6, org.telegram.ui.ActionBar.l6.f28086p7, g6Var);
            org.telegram.ui.ActionBar.s6.D(ftVar, org.telegram.ui.ActionBar.l6.H6, g6Var);
            org.telegram.ui.ActionBar.s6.U(ftVar, i10, g6Var);
            org.telegram.ui.ActionBar.s6.l(ftVar, 36, org.telegram.ui.ActionBar.l6.f27984jg, g6Var);
            ftVar.setPadding(org.telegram.messenger.id.f23157a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.id.f23157a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z10 = org.telegram.messenger.id.f23157a0;
            addView(ftVar, c8.ha.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            ftVar.setTextSize(1, 16.0f);
            ftVar.setMaxLines(8);
            ftVar.setGravity(19);
            ftVar.setAllowTextEntitiesIntersection(true);
            ftVar.setHintTextColor(-1929379841);
            ftVar.setTextColor(-1);
            ftVar.setCursorColor(-1);
            ftVar.setBackground(null);
            ftVar.setClipToPadding(false);
            ftVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            ftVar.setHandlesColor(-1);
            ftVar.setHighlightColor(822083583);
            ftVar.setLinkTextColor(-12147733);
            ftVar.D = -1;
            ftVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ftVar, c8.ha.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            ftVar.setTextSize(1, 18.0f);
            ftVar.setMaxLines(4);
            ftVar.setGravity(19);
            org.telegram.ui.ActionBar.s6.D(ftVar, org.telegram.ui.ActionBar.l6.f28161t5, g6Var);
            org.telegram.ui.ActionBar.s6.U(ftVar, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
            ftVar.setBackground(null);
            ftVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ftVar, c8.ha.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ftVar.setTextSize(1, 18.0f);
            ftVar.setMaxLines(4);
            ftVar.setGravity(19);
            org.telegram.ui.ActionBar.s6.D(ftVar, org.telegram.ui.ActionBar.l6.f28161t5, g6Var);
            org.telegram.ui.ActionBar.s6.U(ftVar, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
            ftVar.setBackground(null);
            ftVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ftVar, c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f35842b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        yj0 yj0Var = new yj0(context);
        this.f35843c = yj0Var;
        kVar.setImageDrawable(yj0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.s6.x(this, yj0Var, org.telegram.ui.ActionBar.l6.Le, g6Var, PorterDuff.Mode.MULTIPLY);
            yj0Var.a(2131232743, false);
            addView(kVar, c8.ha.d(48, 48.0f, (org.telegram.messenger.id.f23157a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            yj0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            yj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.s6.x(this, yj0Var, org.telegram.ui.ActionBar.l6.Le, g6Var, PorterDuff.Mode.MULTIPLY);
            yj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.s6.x(this, yj0Var, org.telegram.ui.ActionBar.l6.f27904f7, g6Var, PorterDuff.Mode.MULTIPLY);
            yj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.s6.x(this, yj0Var, org.telegram.ui.ActionBar.l6.Le, g6Var, PorterDuff.Mode.MULTIPLY);
            yj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(kVar, h02, null, M, g6Var);
        kVar.setOnClickListener(new ah.g(this, tt0Var, g6Var, 25));
        kVar.setContentDescription(org.telegram.messenger.id.M0(2131751196, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(kt ktVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, gt gtVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
