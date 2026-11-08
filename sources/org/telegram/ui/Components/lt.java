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
public class lt extends FrameLayout implements org.telegram.messenger.ls, qt0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.i1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.f6 M;
    public boolean N;
    public boolean O;
    public final et P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final ft f35777a;
    public final kg.k f35778b;
    public final xj0 f35779c;
    public gt d;
    public boolean f35780e;
    public rt0 f35781f;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean f35782n;
    public int f35783r;
    public int f35784s;
    public boolean f35785w;
    public int f35786x;
    public boolean f35787y;

    public lt(Context context, org.telegram.ui.xc xcVar, org.telegram.ui.pn pnVar) {
        this(context, xcVar, pnVar, 0, false, null);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f35785w || (i12 = this.L) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z9) {
                this.f35784s = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.f35784s).commit();
            } else {
                this.f35783r = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.f35783r).commit();
            }
        }
        boolean z11 = false;
        if (this.f35780e) {
            if (z9) {
                i10 = this.f35784s;
            } else {
                i10 = this.f35783r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22558n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f35787y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f22563q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f22563q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                rt0 rt0Var = this.f35781f;
                if (rt0Var != null) {
                    this.f35786x = layoutParams.height;
                    rt0Var.requestLayout();
                    this.f35781f.getHeight();
                    if (this.T != this.f35787y) {
                        p();
                    }
                }
            }
        }
        this.T = this.f35787y;
        int i16 = this.G;
        boolean z12 = true;
        ft ftVar = this.f35777a;
        if (i16 == i7 && this.H == z9) {
            if (b()) {
                if (ftVar.isFocused() && i7 > 0) {
                    z11 = true;
                }
                this.f35785w = z11;
            }
            this.f35781f.getHeight();
            return;
        }
        this.G = i7;
        this.H = z9;
        boolean z13 = this.f35785w;
        if (!ftVar.isFocused() || i7 <= 0) {
            z12 = false;
        }
        this.f35785w = z12;
        if (z12 && this.f35780e) {
            x(0);
        }
        if (this.f35786x != 0 && !(z10 = this.f35785w) && z10 != z13 && !this.f35780e) {
            this.f35786x = 0;
            this.f35781f.requestLayout();
        }
        if (this.f35785w && this.N) {
            this.N = false;
            org.telegram.messenger.g0.r(this.P);
        }
        this.f35781f.getHeight();
    }

    public boolean a() {
        int i7 = this.L;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.h20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.f35777a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            gt gtVar = this.d;
            if (gtVar != null) {
                gtVar.P.g1();
            }
            ft ftVar = this.f35777a;
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
        if (gtVar != null && gtVar.f34400c1 != org.telegram.messenger.p10.f24470s0) {
            this.f35781f.removeView(gtVar);
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
        gtVar2.f34398c = this.U;
        gtVar2.U0 = this.Q;
        gtVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new jt(this));
        this.f35781f.addView(this.d);
    }

    public zs getEditText() {
        return this.f35777a;
    }

    public View getEmojiButton() {
        return this.f35778b;
    }

    public int getEmojiPadding() {
        return this.f35786x;
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
            i7 = this.f35784s;
        } else {
            i7 = this.f35783r;
        }
        if (this.J) {
            i10 = org.telegram.messenger.g0.f22558n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f35787y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f35777a.getText();
    }

    public int h() {
        return i5.f();
    }

    public final void j() {
        gt gtVar;
        if (!this.f35780e && (gtVar = this.d) != null && gtVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f35786x = 0;
        boolean z9 = this.f35787y;
        this.f35787y = false;
        if (z9) {
            gt gtVar2 = this.d;
            if (gtVar2 != null) {
                gtVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z9) {
        if (this.f35780e) {
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
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f35787y;
        this.f35787y = false;
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
        return this.f35777a.length();
    }

    public final void o() {
        this.D = true;
        gt gtVar = this.d;
        if (gtVar != null) {
            gtVar.B();
        }
        rt0 rt0Var = this.f35781f;
        if (rt0Var != null) {
            rt0Var.f37770r.remove(this);
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
            ft ftVar = this.f35777a;
            ftVar.requestFocus();
            org.telegram.messenger.g0.K3(ftVar);
            if (!org.telegram.messenger.g0.D && !this.f35785w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
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
            gtVar.f34398c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        int i7;
        float f10;
        int i10;
        int L;
        ft ftVar = this.f35777a;
        ftVar.setEnabled(z9);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f35778b.setVisibility(i7);
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
        this.f35777a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z9) {
        this.f35777a.setFocusable(z9);
    }

    public void setHint(CharSequence charSequence) {
        this.f35777a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f35777a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f35777a.setSelection(i7);
    }

    public void setSizeNotifierLayout(rt0 rt0Var) {
        rt0 rt0Var2 = this.f35781f;
        if (rt0Var2 != null) {
            rt0Var2.f37770r.remove(this);
        }
        this.f35781f = rt0Var;
        rt0Var.f37770r.add(this);
    }

    public void setSuggestionsEnabled(boolean z9) {
        int i7;
        ft ftVar = this.f35777a;
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
        this.f35777a.setText(charSequence);
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
        ft ftVar = this.f35777a;
        ftVar.requestFocus();
        org.telegram.messenger.g0.K3(ftVar);
        if (this.E) {
            this.F = true;
        } else if (!org.telegram.messenger.g0.D && !this.f35785w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.N = true;
            et etVar = this.P;
            org.telegram.messenger.g0.r(etVar);
            org.telegram.messenger.g0.i3(etVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f35777a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        xj0 xj0Var = this.f35779c;
        int i11 = 0;
        if (i7 == 1) {
            gt gtVar = this.d;
            if (gtVar != null) {
                gtVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f35780e = true;
            this.R = 1.0f;
            gt gtVar2 = this.d;
            if (this.f35783r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35783r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35783r = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f35784s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35784s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35784s = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                i10 = this.f35784s;
            } else {
                i10 = this.f35783r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22558n;
            }
            int i12 = i10 + i11;
            if (this.f35787y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gtVar2.getLayoutParams();
            layoutParams.height = i12;
            gtVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f35777a);
            }
            rt0 rt0Var = this.f35781f;
            if (rt0Var != null) {
                this.f35786x = i12;
                rt0Var.requestLayout();
                xj0Var.a(2131231504, true);
                this.f35781f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f35778b != null) {
            if (this.L == 0) {
                xj0Var.a(2131232743, true);
            } else {
                xj0Var.a(2131231512, true);
            }
        }
        if (this.d != null) {
            this.f35780e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        rt0 rt0Var2 = this.f35781f;
        if (rt0Var2 != null) {
            if (i7 == 0) {
                this.f35786x = 0;
                this.R = 0.0f;
            }
            rt0Var2.requestLayout();
            this.f35781f.getHeight();
        }
    }

    public lt(Context context, rt0 rt0Var, org.telegram.ui.ActionBar.f2 f2Var, int i7, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new et(this, 0);
        this.U = 2;
        this.I = z9;
        this.M = f6Var;
        this.L = i7;
        this.h = f2Var;
        this.f35781f = rt0Var;
        rt0Var.f37770r.add(this);
        ft ftVar = new ft(this, context, f6Var, i7);
        this.f35777a = ftVar;
        ftVar.setImeOptions(268435456);
        ftVar.setInputType(ftVar.getInputType() | 16384);
        ftVar.setFocusable(ftVar.isEnabled());
        ftVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ftVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(ftVar, 30, i10, f6Var);
        if (i7 == 0) {
            ftVar.setTextSize(1, 18.0f);
            ftVar.setMaxLines(4);
            ftVar.setGravity((org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16);
            ftVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.G(ftVar, org.telegram.ui.ActionBar.k6.f27981k6, org.telegram.ui.ActionBar.k6.f27999l6, org.telegram.ui.ActionBar.k6.f28073p7, f6Var);
            org.telegram.ui.ActionBar.r6.E(ftVar, org.telegram.ui.ActionBar.k6.H6, f6Var);
            org.telegram.ui.ActionBar.r6.V(ftVar, i10, f6Var);
            org.telegram.ui.ActionBar.r6.m(ftVar, 36, org.telegram.ui.ActionBar.k6.f27971jg, f6Var);
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
            org.telegram.ui.ActionBar.r6.E(ftVar, org.telegram.ui.ActionBar.k6.f28148t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(ftVar, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
            ftVar.setBackground(null);
            ftVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ftVar, c8.ha.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ftVar.setTextSize(1, 18.0f);
            ftVar.setMaxLines(4);
            ftVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(ftVar, org.telegram.ui.ActionBar.k6.f28148t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(ftVar, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
            ftVar.setBackground(null);
            ftVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ftVar, c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f35778b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xj0 xj0Var = new xj0(context);
        this.f35779c = xj0Var;
        kVar.setImageDrawable(xj0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131232743, false);
            addView(kVar, c8.ha.d(48, 48.0f, (org.telegram.messenger.id.f23157a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            xj0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.f27891f7, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(kVar, h02, null, N, f6Var);
        kVar.setOnClickListener(new ah.g(this, rt0Var, f6Var, 25));
        kVar.setContentDescription(org.telegram.messenger.id.M0(2131751197, null));
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
