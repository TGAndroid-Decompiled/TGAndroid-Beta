package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class p10 extends org.telegram.ui.ActionBar.k2 {
    public m10 D;
    public int E;
    public s4.a0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final l10 f40415a;
    public final l10 f40416b;
    public org.telegram.ui.Components.tk0 f40417c;
    public Drawable d;
    public kg.g2 e;
    public boolean f40418f;
    public boolean h;
    public float f40419n;
    public int f40420r;
    public o10 f40421s;
    public float f40422w;
    public final Canvas f40423x;
    public float f40424y;

    public p10() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.t6.Dk;
        int i11 = org.telegram.ui.ActionBar.t6.Ek;
        int i12 = org.telegram.ui.ActionBar.t6.Fk;
        int i13 = org.telegram.ui.ActionBar.t6.Gk;
        this.f40415a = new l10(i10, i11, i12, i13, null, 0);
        l10 l10Var = new l10(i10, i11, i12, i13, null, 1);
        this.f40416b = l10Var;
        this.f40423x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        l10Var.f11149n = true;
        this.P = -1;
    }

    public static org.telegram.ui.ActionBar.l Y(p10 p10Var) {
        return p10Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l Z(p10 p10Var) {
        return p10Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.p6 a0(p10 p10Var) {
        return p10Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.z4 b0(p10 p10Var) {
        return p10Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 c0(p10 p10Var) {
        return p10Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 d0(p10 p10Var) {
        return p10Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.l e0(p10 p10Var) {
        return p10Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l f0(p10 p10Var) {
        return p10Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232725).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5);
        this.O = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            i10 = 0;
        } else {
            i10 = org.telegram.messenger.i0.f16020m;
        }
        this.I = i10;
        this.f40421s = new o10(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
            if (z4Var2 != null && ((ActionBarLayout) z4Var2).S0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f40417c = new org.telegram.ui.Components.tk0(context, null);
        s4.a0 k02 = k0(context);
        this.F = k02;
        this.f40417c.setLayoutManager(k02);
        s4.a0 a0Var = this.F;
        if (a0Var instanceof org.telegram.ui.Components.az) {
            ((org.telegram.ui.Components.az) a0Var).R = true;
        }
        s4.g0 j02 = j0();
        this.f40417c.setAdapter(j02);
        if (j02 instanceof org.telegram.ui.Components.p51) {
            org.telegram.ui.Components.tk0 tk0Var = this.f40417c;
            k10 k10Var = new k10(this, 0);
            int L = org.telegram.messenger.i0.L(12.0f);
            float L2 = org.telegram.messenger.i0.L(16.0f);
            tk0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new org.telegram.ui.Components.i(tk0Var, k10Var, sparseIntArray, 2), new org.telegram.ui.Components.di(sparseIntArray, 2));
            tk0Var.t1((org.telegram.messenger.r20) pair.first, (org.telegram.messenger.r20) pair.second, L, L2, true);
        } else {
            this.f40417c.setSections(true);
        }
        this.f40417c.setClipToPadding(false);
        this.f40417c.j(new h3(this, 12));
        this.D = new m10(context);
        o10 o10Var = this.f40421s;
        kg.g2 l02 = l0();
        this.e = l02;
        o10Var.addView(l02, w7.b6.c(-2.0f, -1));
        this.f40421s.addView(this.D, w7.b6.c(-2.0f, -1));
        h0();
        this.f40421s.addView(o0());
        this.fragmentView = this.f40421s;
        ar arVar = new ar(this, 24);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231241);
            this.simpleActionBar.setActionBarMenuOnItemClick(arVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231241);
            this.actionBar.setActionBarMenuOnItemClick(arVar);
            this.actionBar.setForceSkipTouches(true);
        }
        w0();
        return this.fragmentView;
    }

    public void g0() {
        org.telegram.ui.Components.tk0 tk0Var = this.f40417c;
        if (tk0Var != null && this.F != null && this.P >= 0) {
            int i10 = this.Q;
            tk0Var.K(0);
            this.F.h1(this.P, i10);
            this.P = -1;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(9, this), org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, org.telegram.ui.ActionBar.t6.Bk, org.telegram.ui.ActionBar.t6.Ck, org.telegram.ui.ActionBar.t6.Dk, org.telegram.ui.ActionBar.t6.Ek, org.telegram.ui.ActionBar.t6.Fk, org.telegram.ui.ActionBar.t6.Gk, org.telegram.ui.ActionBar.t6.Hk, org.telegram.ui.ActionBar.t6.Jk, org.telegram.ui.ActionBar.t6.Kk, org.telegram.ui.ActionBar.t6.Ik, org.telegram.ui.ActionBar.t6.Nk);
    }

    public void h0() {
        this.f40421s.addView(this.f40417c, w7.b6.c(-1.0f, -1));
    }

    public final void i0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        m10 m10Var = this.D;
        FrameLayout frameLayout2 = (FrameLayout) m10Var.e;
        FrameLayout frameLayout3 = (FrameLayout) m10Var.d;
        ((TextView) m10Var.f39451b).setText(str);
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) m10Var.f39452c;
        p80Var.setText(charSequence);
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.b6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, w7.b6.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        m10Var.requestLayout();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.t6.I.q()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public abstract s4.g0 j0();

    public s4.a0 k0(Context context) {
        if (this.G) {
            return new org.telegram.ui.Components.az((org.telegram.messenger.i0.L(68.0f) + this.I) - org.telegram.messenger.i0.L(16.0f), this.f40417c);
        }
        return new s4.a0();
    }

    public kg.g2 l0() {
        return new kg.g(getParentActivity(), 2);
    }

    public boolean m0() {
        return !(this instanceof rh.h8);
    }

    public View n0(Context context) {
        bi.t0 t0Var = new bi.t0(this, context, 26);
        t0Var.setTag(-33024);
        return t0Var;
    }

    public final FrameLayout o0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            return i5Var;
        }
        return this.actionBar;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f40417c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        kg.g2 g2Var = this.e;
        if (g2Var != null) {
            g2Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.O) {
                this.O = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            kg.g2 g2Var = this.e;
            if (g2Var != null && g2Var.f11092a != null && this.f40421s != null) {
                w0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public float p0() {
        return 0.0f;
    }

    public View q0() {
        return this.f40417c;
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z10;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0(z10);
        return showDialog;
    }

    public void t0() {
        View view;
        int i10;
        org.telegram.ui.Components.tk0 tk0Var = this.f40417c;
        if (tk0Var != null && tk0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f40417c.getChildCount()) {
                    view = this.f40417c.getChildAt(i11);
                    this.f40417c.getClass();
                    i10 = RecyclerView.R(view);
                    if (i10 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i11++;
                } else {
                    view = null;
                    i10 = -1;
                    break;
                }
            }
            if (view != null) {
                this.P = i10;
                this.Q = view.getTop();
            }
        }
    }

    public final Paint u0(float f7, float f10) {
        int measuredWidth = this.f40421s.getMeasuredWidth();
        int measuredHeight = this.f40421s.getMeasuredHeight();
        l10 l10Var = this.f40416b;
        l10Var.d(0, (-f7) - ((this.f40421s.getMeasuredWidth() * 0.1f) * this.f40419n), 0, measuredWidth, -f10, measuredHeight);
        return l10Var.f11142f;
    }

    public final void v0() {
        if (this.f40421s.getMeasuredWidth() != 0 && this.f40421s.getMeasuredHeight() != 0 && this.D != null) {
            this.f40415a.d(0, 0.0f, 0, this.f40421s.getMeasuredWidth(), 0.0f, this.f40421s.getMeasuredHeight());
            Canvas canvas = this.f40423x;
            canvas.save();
            canvas.scale(100.0f / this.f40421s.getMeasuredWidth(), 100.0f / this.f40421s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f40421s.getMeasuredWidth(), this.f40421s.getMeasuredHeight(), this.f40415a.f11142f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.D != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hk, false);
                    if (x02 != this.N) {
                        this.N = x02;
                        this.actionBar.D(x02, false);
                    }
                    int o10 = i0.b.o(x02, 60);
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar.f20501p0 != o10) {
                        lVar.C(o10, false);
                    }
                }
                this.e.f11092a.g();
                m10 m10Var = this.D;
                if (m10Var != null) {
                    TextView textView = (TextView) m10Var.f39451b;
                    if (this.M) {
                        int i10 = org.telegram.ui.ActionBar.t6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                        ((org.telegram.ui.Components.p80) this.D.f39452c).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                        ((org.telegram.ui.Components.p80) this.D.f39452c).setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
                    } else {
                        int i11 = org.telegram.ui.ActionBar.t6.Hk;
                        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                        ((org.telegram.ui.Components.p80) this.D.f39452c).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                        ((org.telegram.ui.Components.p80) this.D.f39452c).setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
                    }
                }
                v0();
            }
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f40418f) {
            this.f40418f = z10;
            this.e.setPaused(z10);
            this.f40421s.invalidate();
        }
    }

    public boolean y0() {
        return this instanceof rh.h8;
    }

    public void r0(boolean z10) {
    }

    public void s0(float f7) {
    }
}
