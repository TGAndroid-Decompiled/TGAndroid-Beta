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
public class rt extends FrameLayout implements org.telegram.messenger.is, rt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.i1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
    public boolean O;
    public boolean P;
    public final zj Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final mt f39056a;
    public final kg.k f39057b;
    public final ck0 f39058c;
    public nt d;
    public boolean f39059e;
    public st0 f39060f;
    public final org.telegram.ui.ActionBar.e2 h;
    public boolean f39061n;
    public int f39062r;
    public int f39063s;
    public boolean f39064w;
    public int f39065x;
    public boolean f39066y;

    public rt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.qn qnVar) {
        this(context, wcVar, qnVar, 0, false, null);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.f39064w || (i12 = this.M) == 2 || i12 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.f39063s = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.f39063s).commit();
            } else {
                this.f39062r = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.f39062r).commit();
            }
        }
        boolean z12 = false;
        if (this.f39059e) {
            if (z10) {
                i10 = this.f39063s;
            } else {
                i10 = this.f39062r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f23604n;
            } else {
                i11 = 0;
            }
            int i13 = i10 + i11;
            if (this.f39066y) {
                i13 = Math.min(org.telegram.messenger.g0.L(200.0f) + i13, org.telegram.messenger.g0.f23609q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = org.telegram.messenger.g0.f23609q.x;
            if (i14 != i15 || layoutParams.height != i13) {
                layoutParams.width = i15;
                layoutParams.height = i13;
                this.d.setLayoutParams(layoutParams);
                st0 st0Var = this.f39060f;
                if (st0Var != null) {
                    this.f39065x = layoutParams.height;
                    st0Var.requestLayout();
                    this.f39060f.getHeight();
                    if (this.U != this.f39066y) {
                        p();
                    }
                }
            }
        }
        this.U = this.f39066y;
        int i16 = this.H;
        boolean z13 = true;
        mt mtVar = this.f39056a;
        if (i16 == i7 && this.I == z10) {
            if (b()) {
                if (mtVar.isFocused() && i7 > 0) {
                    z12 = true;
                }
                this.f39064w = z12;
            }
            this.f39060f.getHeight();
            return;
        }
        this.H = i7;
        this.I = z10;
        boolean z14 = this.f39064w;
        if (!mtVar.isFocused() || i7 <= 0) {
            z13 = false;
        }
        this.f39064w = z13;
        if (z13 && this.f39059e) {
            x(0);
        }
        if (this.f39065x != 0 && !(z11 = this.f39064w) && z11 != z14 && !this.f39059e) {
            this.f39065x = 0;
            this.f39060f.requestLayout();
        }
        if (this.f39064w && this.O) {
            this.O = false;
            org.telegram.messenger.g0.r(this.Q);
        }
        this.f39060f.getHeight();
    }

    public boolean a() {
        int i7 = this.M;
        if (i7 != 2 && i7 != 3 && i7 != 5) {
            return false;
        }
        return true;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.h20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.f39056a);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            nt ntVar = this.d;
            if (ntVar != null) {
                ntVar.Q.g1();
            }
            mt mtVar = this.f39056a;
            if (mtVar != null) {
                int currentTextColor = mtVar.getCurrentTextColor();
                mtVar.setTextColor(-1);
                mtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        boolean z10;
        nt ntVar = this.d;
        if (ntVar != null && ntVar.f36941d1 != org.telegram.messenger.m10.f24934t0) {
            this.f39060f.removeView(ntVar);
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
        nt ntVar2 = new nt(this, this.h, this.J, context, b10, z10, this.N, this.T);
        this.d = ntVar2;
        ntVar2.f36936c = this.V;
        ntVar2.V0 = this.R;
        ntVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pt(this));
        this.f39060f.addView(this.d);
    }

    public ft getEditText() {
        return this.f39056a;
    }

    public View getEmojiButton() {
        return this.f39057b;
    }

    public int getEmojiPadding() {
        return this.f39065x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public ly getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        int i7;
        int i10;
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            i7 = this.f39063s;
        } else {
            i7 = this.f39062r;
        }
        if (this.K) {
            i10 = org.telegram.messenger.g0.f23604n;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f39066y) {
            return Math.min(org.telegram.messenger.g0.L(200.0f) + i11, point.y);
        }
        return i11;
    }

    public Editable getText() {
        return this.f39056a.getText();
    }

    public int h() {
        return g5.f();
    }

    public final void j() {
        nt ntVar;
        if (!this.f39059e && (ntVar = this.d) != null && ntVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.f39065x = 0;
        boolean z10 = this.f39066y;
        this.f39066y = false;
        if (z10) {
            nt ntVar2 = this.d;
            if (ntVar2 != null) {
                ntVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.f39059e) {
            x(0);
        }
        if (z10) {
            nt ntVar = this.d;
            if (ntVar != null && ntVar.getVisibility() == 0 && !this.O) {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                ofFloat.start();
            } else {
                j();
            }
        }
        boolean z11 = this.f39066y;
        this.f39066y = false;
        if (z11) {
            nt ntVar2 = this.d;
            if (ntVar2 != null) {
                ntVar2.t(false);
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
        nt ntVar = this.d;
        if (ntVar != null && ntVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int n() {
        return this.f39056a.length();
    }

    public final void o() {
        this.E = true;
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.B();
        }
        st0 st0Var = this.f39060f;
        if (st0Var != null) {
            st0Var.f39421r.remove(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            mt mtVar = this.f39056a;
            mtVar.requestFocus();
            org.telegram.messenger.g0.J3(mtVar);
            if (!org.telegram.messenger.g0.D && !this.f39064w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                this.O = true;
                u();
                zj zjVar = this.Q;
                org.telegram.messenger.g0.r(zjVar);
                org.telegram.messenger.g0.i3(zjVar, 100L);
            }
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.L = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.f36936c = i7;
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        int i7;
        float f10;
        int i10;
        int L;
        mt mtVar = this.f39056a;
        mtVar.setEnabled(z10);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f39057b.setVisibility(i7);
        if (this.M == 0) {
            f10 = 11.0f;
        } else {
            f10 = 8.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10);
        if (z10) {
            if (org.telegram.messenger.hd.f24101a0) {
                i10 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i10 = 0;
            }
            if (org.telegram.messenger.hd.f24101a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(40.0f);
            }
            mtVar.setPadding(i10, 0, L, L2);
            return;
        }
        mtVar.setPadding(0, 0, 0, L2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f39056a.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z10) {
        this.f39056a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.f39056a.setHint(charSequence);
    }

    public void setMaxLines(int i7) {
        this.f39056a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.f39056a.setSelection(i7);
    }

    public void setSizeNotifierLayout(st0 st0Var) {
        st0 st0Var2 = this.f39060f;
        if (st0Var2 != null) {
            st0Var2.f39421r.remove(this);
        }
        this.f39060f = st0Var;
        st0Var.f39421r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        int i7;
        mt mtVar = this.f39056a;
        int inputType = mtVar.getInputType();
        if (!z10) {
            i7 = 524288 | inputType;
        } else {
            i7 = (-524289) & inputType;
        }
        if (mtVar.getInputType() != i7) {
            mtVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f39056a.setText(charSequence);
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
        mt mtVar = this.f39056a;
        mtVar.requestFocus();
        org.telegram.messenger.g0.J3(mtVar);
        if (this.F) {
            this.G = true;
        } else if (!org.telegram.messenger.g0.D && !this.f39064w && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.O = true;
            zj zjVar = this.Q;
            org.telegram.messenger.g0.r(zjVar);
            org.telegram.messenger.g0.i3(zjVar, 100L);
        }
    }

    public final void w(int i7, int i10) {
        this.f39056a.setSelection(i7, i10);
    }

    public void x(int i7) {
        int i10;
        ck0 ck0Var = this.f39058c;
        int i11 = 0;
        if (i7 == 1) {
            nt ntVar = this.d;
            if (ntVar != null) {
                ntVar.getVisibility();
            }
            f();
            this.d.setVisibility(0);
            this.f39059e = true;
            this.S = 1.0f;
            nt ntVar2 = this.d;
            if (this.f39062r <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f39062r = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f39062r = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f39063s <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f39063s = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f39063s = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                i10 = this.f39063s;
            } else {
                i10 = this.f39062r;
            }
            if (this.K) {
                i11 = org.telegram.messenger.g0.f23604n;
            }
            int i12 = i10 + i11;
            if (this.f39066y) {
                i12 = Math.min(org.telegram.messenger.g0.L(200.0f) + i12, point.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ntVar2.getLayoutParams();
            layoutParams.height = i12;
            ntVar2.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.g0.v1(this.f39056a);
            }
            st0 st0Var = this.f39060f;
            if (st0Var != null) {
                this.f39065x = i12;
                st0Var.requestLayout();
                ck0Var.a(2131231504, true);
                this.f39060f.getHeight();
            }
            p();
            this.d.setAlpha(1.0f);
            this.S = 1.0f;
            c(0.0f);
            return;
        }
        if (this.f39057b != null) {
            if (this.M == 0) {
                ck0Var.a(2131232744, true);
            } else {
                ck0Var.a(2131231512, true);
            }
        }
        if (this.d != null) {
            this.f39059e = false;
            p();
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                this.d.setVisibility(8);
                this.S = 0.0f;
            }
        }
        st0 st0Var2 = this.f39060f;
        if (st0Var2 != null) {
            if (i7 == 0) {
                this.f39065x = 0;
                this.S = 0.0f;
            }
            st0Var2.requestLayout();
            this.f39060f.getHeight();
        }
    }

    public rt(Context context, st0 st0Var, org.telegram.ui.ActionBar.e2 e2Var, int i7, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = true;
        this.Q = new zj(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = e6Var;
        this.M = i7;
        this.h = e2Var;
        this.f39060f = st0Var;
        st0Var.f39421r.add(this);
        mt mtVar = new mt(this, context, e6Var, i7);
        this.f39056a = mtVar;
        mtVar.setImeOptions(268435456);
        mtVar.setInputType(mtVar.getInputType() | 16384);
        mtVar.setFocusable(mtVar.isEnabled());
        mtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        mtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.l(mtVar, 30, i10, e6Var);
        if (i7 == 0) {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity((org.telegram.messenger.hd.f24101a0 ? 5 : 3) | 16);
            mtVar.setBackground(null);
            org.telegram.ui.ActionBar.q6.F(mtVar, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.H6, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, i10, e6Var);
            org.telegram.ui.ActionBar.q6.l(mtVar, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
            mtVar.setPadding(org.telegram.messenger.hd.f24101a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.f24101a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.hd.f24101a0;
            addView(mtVar, c8.ja.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            mtVar.setTextSize(1, 16.0f);
            mtVar.setMaxLines(8);
            mtVar.setGravity(19);
            mtVar.setAllowTextEntitiesIntersection(true);
            mtVar.setHintTextColor(-1929379841);
            mtVar.setTextColor(-1);
            mtVar.setCursorColor(-1);
            mtVar.setBackground(null);
            mtVar.setClipToPadding(false);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            mtVar.setHandlesColor(-1);
            mtVar.setHighlightColor(822083583);
            mtVar.setLinkTextColor(-12147733);
            mtVar.E = -1;
            mtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity(19);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.f29145t5, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            mtVar.setBackground(null);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity(19);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.f29145t5, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            mtVar.setBackground(null);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.f39057b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ck0 ck0Var = new ck0(context);
        this.f39058c = ck0Var;
        kVar.setImageDrawable(ck0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(2131232744, false);
            addView(kVar, c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.f24101a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            ck0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ck0Var.a(2131231512, false);
            addView(kVar, c8.ja.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(2131231512, false);
            addView(kVar, c8.ja.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.f28888f7, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(2131231512, false);
            addView(kVar, c8.ja.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(2131231512, false);
            addView(kVar, c8.ja.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(kVar, h02, null, M, e6Var);
        kVar.setOnClickListener(new lt(this, st0Var, e6Var, 0));
        kVar.setContentDescription(org.telegram.messenger.hd.M0(2131751196, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(qt qtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, nt ntVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
