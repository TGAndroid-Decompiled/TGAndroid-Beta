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
public class kt extends FrameLayout implements org.telegram.messenger.ls, qt0 {
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
    public final dt P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final et f35407a;
    public final kg.k f35408b;
    public final xj0 f35409c;
    public ft d;
    public boolean f35410e;
    public rt0 f35411f;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean f35412n;
    public int f35413r;
    public int f35414s;
    public boolean f35415w;
    public int f35416x;
    public boolean f35417y;

    public kt(Context context, org.telegram.ui.xc xcVar, org.telegram.ui.pn pnVar) {
        this(context, xcVar, pnVar, 0, false, null);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f35415w || (i12 = this.L) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z9) {
                this.f35414s = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.f35414s).commit();
            } else {
                this.f35413r = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.f35413r).commit();
            }
        }
        boolean z11 = false;
        if (this.f35410e) {
            if (z9) {
                i10 = this.f35414s;
            } else {
                i10 = this.f35413r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22539n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f35417y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f22544q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f22544q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                rt0 rt0Var = this.f35411f;
                if (rt0Var != null) {
                    this.f35416x = layoutParams.height;
                    rt0Var.requestLayout();
                    this.f35411f.getHeight();
                    if (this.T != this.f35417y) {
                        p();
                    }
                }
            }
        }
        this.T = this.f35417y;
        int i16 = this.G;
        boolean z12 = true;
        et etVar = this.f35407a;
        if (i16 == i7 && this.H == z9) {
            if (b()) {
                if (etVar.isFocused() && i7 > 0) {
                    z11 = true;
                }
                this.f35415w = z11;
            }
            this.f35411f.getHeight();
            return;
        }
        this.G = i7;
        this.H = z9;
        boolean z13 = this.f35415w;
        if (!etVar.isFocused() || i7 <= 0) {
            z12 = false;
        }
        this.f35415w = z12;
        if (z12 && this.f35410e) {
            x(0);
        }
        if (this.f35416x != 0 && !(z10 = this.f35415w) && z10 != z13 && !this.f35410e) {
            this.f35416x = 0;
            this.f35411f.requestLayout();
        }
        if (this.f35415w && this.N) {
            this.N = false;
            org.telegram.messenger.g0.r(this.P);
        }
        this.f35411f.getHeight();
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
        org.telegram.messenger.g0.v1(this.f35407a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25009i4) {
            ft ftVar = this.d;
            if (ftVar != null) {
                ftVar.P.g1();
            }
            et etVar = this.f35407a;
            if (etVar != null) {
                int currentTextColor = etVar.getCurrentTextColor();
                etVar.setTextColor(-1);
                etVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z9;
        ft ftVar = this.d;
        if (ftVar != null && ftVar.f34032c1 != org.telegram.messenger.p10.f24467s0) {
            this.f35411f.removeView(ftVar);
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
        ft ftVar2 = new ft(this, this.h, this.I, context, b10, z9, this.M, this.S);
        this.d = ftVar2;
        ftVar2.f34030c = this.U;
        ftVar2.U0 = this.Q;
        ftVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ht(this));
        this.f35411f.addView(this.d);
    }

    public ys getEditText() {
        return this.f35407a;
    }

    public View getEmojiButton() {
        return this.f35408b;
    }

    public int getEmojiPadding() {
        return this.f35416x;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public gy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i7;
        int i10;
        Point point = org.telegram.messenger.g0.f22544q;
        if (point.x > point.y) {
            i7 = this.f35414s;
        } else {
            i7 = this.f35413r;
        }
        if (this.J) {
            i10 = org.telegram.messenger.g0.f22539n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f35417y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f35407a.getText();
    }

    public int h() {
        return i5.f();
    }

    public final void j() {
        ft ftVar;
        if (!this.f35410e && (ftVar = this.d) != null && ftVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.f35416x = 0;
        boolean z9 = this.f35417y;
        this.f35417y = false;
        if (z9) {
            ft ftVar2 = this.d;
            if (ftVar2 != null) {
                ftVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z9) {
        if (this.f35410e) {
            x(0);
        }
        if (z9) {
            ft ftVar = this.d;
            if (ftVar != null && ftVar.getVisibility() == 0 && !this.N) {
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
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27541w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z10 = this.f35417y;
        this.f35417y = false;
        if (z10) {
            ft ftVar2 = this.d;
            if (ftVar2 != null) {
                ftVar2.t(false);
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
        ft ftVar = this.d;
        if (ftVar != null && ftVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f35407a.length();
    }

    public final void o() {
        this.D = true;
        ft ftVar = this.d;
        if (ftVar != null) {
            ftVar.B();
        }
        rt0 rt0Var = this.f35411f;
        if (rt0Var != null) {
            rt0Var.f37750r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            et etVar = this.f35407a;
            etVar.requestFocus();
            org.telegram.messenger.g0.K3(etVar);
            if (!org.telegram.messenger.g0.D && !this.f35415w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.N = true;
                u();
                dt dtVar = this.P;
                org.telegram.messenger.g0.r(dtVar);
                org.telegram.messenger.g0.i3(dtVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.K = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.U = i7;
        ft ftVar = this.d;
        if (ftVar != null) {
            ftVar.f34030c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        int i7;
        float f10;
        int i10;
        int L;
        et etVar = this.f35407a;
        etVar.setEnabled(z9);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f35408b.setVisibility(i7);
        if (this.L == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z9) {
            if (org.telegram.messenger.hd.f22878a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.hd.f22878a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            etVar.setPadding(i10, 0, L, L2);
            return;
        }
        etVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f35407a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z9) {
        this.f35407a.setFocusable(z9);
    }

    public void setHint(CharSequence charSequence) {
        this.f35407a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f35407a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f35407a.setSelection(i7);
    }

    public void setSizeNotifierLayout(rt0 rt0Var) {
        rt0 rt0Var2 = this.f35411f;
        if (rt0Var2 != null) {
            rt0Var2.f37750r.remove(this);
        }
        this.f35411f = rt0Var;
        rt0Var.f37750r.add(this);
    }

    public void setSuggestionsEnabled(boolean z9) {
        int i7;
        et etVar = this.f35407a;
        int inputType = etVar.getInputType();
        if (!z9) {
            i7 = 524288 | inputType;
        } else {
            i7 = (-524289) & inputType;
        }
        if (etVar.getInputType() != i7) {
            etVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f35407a.setText(charSequence);
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
        et etVar = this.f35407a;
        etVar.requestFocus();
        org.telegram.messenger.g0.K3(etVar);
        if (this.E) {
            this.F = true;
        } else if (!org.telegram.messenger.g0.D && !this.f35415w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.N = true;
            dt dtVar = this.P;
            org.telegram.messenger.g0.r(dtVar);
            org.telegram.messenger.g0.i3(dtVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f35407a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        xj0 xj0Var = this.f35409c;
        int i11 = 0;
        if (i7 == 1) {
            ft ftVar = this.d;
            if (ftVar != null) {
                ftVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f35410e = true;
            this.R = 1.0f;
            ft ftVar2 = this.d;
            if (this.f35413r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35413r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35413r = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f35414s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f35414s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f35414s = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x > point.y) {
                i10 = this.f35414s;
            } else {
                i10 = this.f35413r;
            }
            if (this.J) {
                i11 = org.telegram.messenger.g0.f22539n;
            }
            int i12 = i10 + i11;
            if (this.f35417y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ftVar2.getLayoutParams();
            layoutParams.height = i12;
            ftVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f35407a);
            }
            rt0 rt0Var = this.f35411f;
            if (rt0Var != null) {
                this.f35416x = i12;
                rt0Var.requestLayout();
                xj0Var.a(2131231504, true);
                this.f35411f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.R = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f35408b != null) {
            if (this.L == 0) {
                xj0Var.a(2131232743, true);
            } else {
                xj0Var.a(2131231512, true);
            }
        }
        if (this.d != null) {
            this.f35410e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.R = 0.0f;
            }
        }
        rt0 rt0Var2 = this.f35411f;
        if (rt0Var2 != null) {
            if (i7 == 0) {
                this.f35416x = 0;
                this.R = 0.0f;
            }
            rt0Var2.requestLayout();
            this.f35411f.getHeight();
        }
    }

    public kt(Context context, rt0 rt0Var, org.telegram.ui.ActionBar.f2 f2Var, int i7, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new dt(this, 0);
        this.U = 2;
        this.I = z9;
        this.M = f6Var;
        this.L = i7;
        this.h = f2Var;
        this.f35411f = rt0Var;
        rt0Var.f37750r.add(this);
        et etVar = new et(this, context, f6Var, i7);
        this.f35407a = etVar;
        etVar.setImeOptions(268435456);
        etVar.setInputType(etVar.getInputType() | 16384);
        etVar.setFocusable(etVar.isEnabled());
        etVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        etVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(etVar, 30, i10, f6Var);
        if (i7 == 0) {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity((org.telegram.messenger.hd.f22878a0 ? 5 : 3) | 16);
            etVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.G(etVar, org.telegram.ui.ActionBar.k6.f27978k6, org.telegram.ui.ActionBar.k6.f27996l6, org.telegram.ui.ActionBar.k6.f28070p7, f6Var);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.H6, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, i10, f6Var);
            org.telegram.ui.ActionBar.r6.m(etVar, 36, org.telegram.ui.ActionBar.k6.f27968jg, f6Var);
            etVar.setPadding(org.telegram.messenger.hd.f22878a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.f22878a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z10 = org.telegram.messenger.hd.f22878a0;
            addView(etVar, c8.ha.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            etVar.setTextSize(1, 16.0f);
            etVar.setMaxLines(8);
            etVar.setGravity(19);
            etVar.setAllowTextEntitiesIntersection(true);
            etVar.setHintTextColor(-1929379841);
            etVar.setTextColor(-1);
            etVar.setCursorColor(-1);
            etVar.setBackground(null);
            etVar.setClipToPadding(false);
            etVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            etVar.setHandlesColor(-1);
            etVar.setHighlightColor(822083583);
            etVar.setLinkTextColor(-12147733);
            etVar.D = -1;
            etVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.f28145t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, org.telegram.ui.ActionBar.k6.f27957j5, f6Var);
            etVar.setBackground(null);
            etVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.f28145t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, org.telegram.ui.ActionBar.k6.f27957j5, f6Var);
            etVar.setBackground(null);
            etVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f35408b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xj0 xj0Var = new xj0(context);
        this.f35409c = xj0Var;
        kVar.setImageDrawable(xj0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131232743, false);
            addView(kVar, c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.f22878a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            xj0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.f27888f7, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(2131231512, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(kVar, h02, null, N, f6Var);
        kVar.setOnClickListener(new ah.g(this, rt0Var, f6Var, 25));
        kVar.setContentDescription(org.telegram.messenger.hd.M0(2131751197, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(jt jtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ft ftVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
