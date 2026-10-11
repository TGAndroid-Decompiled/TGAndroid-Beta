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
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class o20 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public s4.d0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final k20 f40424a;
    public final k20 f40425b;
    public org.telegram.ui.Components.rm0 f40426c;
    public Drawable d;
    public rg.w1 f40427e;
    public boolean f40428f;
    public boolean h;
    public float f40429n;
    public int f40430r;
    public n20 f40431s;
    public float v;
    public final Canvas f40432w;
    public float f40433x;
    public l20 f40434y;

    public o20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.f40424a = new k20(i10, i11, i12, i13, null, 0);
        k20 k20Var = new k20(i10, i11, i12, i13, null, 1);
        this.f40425b = k20Var;
        this.f40432w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        k20Var.f47310n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f40431s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f40426c = new org.telegram.ui.Components.rm0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.g00(this.f40426c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.d0();
        }
        this.f40426c.setLayoutManager(this.F);
        s4.d0 d0Var = this.F;
        if (d0Var instanceof org.telegram.ui.Components.g00) {
            ((org.telegram.ui.Components.g00) d0Var).R = true;
        }
        s4.i0 n02 = n0();
        this.f40426c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.d71) {
            org.telegram.ui.Components.rm0 rm0Var = this.f40426c;
            j20 j20Var = new j20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.rm0 rm0Var2 = this.f40426c;
            Objects.requireNonNull(rm0Var2);
            rm0Var.r1(j20Var, dp, dp2, new fu(rm0Var2, 10), true);
        } else {
            this.f40426c.setSections(true);
        }
        this.f40426c.setClipToPadding(false);
        this.f40426c.j(new h3(this, 11));
        this.f40434y = new l20(context);
        n20 n20Var = this.f40431s;
        rg.w1 p02 = p0();
        this.f40427e = p02;
        n20Var.addView(p02, w7.x5.d(-2.0f, -1));
        this.f40431s.addView(this.f40434y, w7.x5.d(-2.0f, -1));
        this.f40431s.addView(this.f40426c, w7.x5.d(-1.0f, -1));
        this.f40431s.addView(this.actionBar);
        this.fragmentView = this.f40431s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 25));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 15), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.h6.I.q()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void l0() {
        org.telegram.ui.Components.rm0 rm0Var = this.f40426c;
        if (rm0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            rm0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        l20 l20Var = this.f40434y;
        FrameLayout frameLayout2 = (FrameLayout) l20Var.f39527e;
        FrameLayout frameLayout3 = (FrameLayout) l20Var.d;
        ((TextView) l20Var.f39525b).setText(str);
        org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) l20Var.f39526c;
        ea0Var.setText(charSequence);
        ea0Var.setMaxWidth(ci.d4.a(ea0Var.getText(), ea0Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.x5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, w7.x5.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        l20Var.requestLayout();
    }

    public abstract s4.i0 n0();

    public n20 o0() {
        return new n20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f40426c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.w1 w1Var = this.f40427e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f40427e.setPaused(false);
    }

    public rg.w1 p0() {
        return new ei.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        ci.bb bbVar = new ci.bb(this, context, 29);
        bbVar.setTag(-33024);
        return bbVar;
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

    public final void t0() {
        View view;
        int i10;
        org.telegram.ui.Components.rm0 rm0Var = this.f40426c;
        if (rm0Var != null && rm0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f40426c.getChildCount()) {
                    view = this.f40426c.getChildAt(i11);
                    this.f40426c.getClass();
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
                this.N = i10;
                this.O = view.getTop();
            }
        }
    }

    public final Paint u0(float f7, float f10) {
        int measuredWidth = this.f40431s.getMeasuredWidth();
        int measuredHeight = this.f40431s.getMeasuredHeight();
        k20 k20Var = this.f40425b;
        k20Var.d(0, (-f7) - ((this.f40431s.getMeasuredWidth() * 0.1f) * this.f40429n), 0, measuredWidth, -f10, measuredHeight);
        return k20Var.f47303f;
    }

    public final void v0() {
        if (this.f40431s.getMeasuredWidth() != 0 && this.f40431s.getMeasuredHeight() != 0 && this.f40434y != null) {
            int measuredWidth = this.f40431s.getMeasuredWidth();
            int measuredHeight = this.f40431s.getMeasuredHeight();
            k20 k20Var = this.f40424a;
            k20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f40432w;
            canvas.save();
            canvas.scale(100.0f / this.f40431s.getMeasuredWidth(), 100.0f / this.f40431s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f40431s.getMeasuredWidth(), this.f40431s.getMeasuredHeight(), k20Var.f47303f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.f40434y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.h6.Tj;
            kVar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
            this.actionBar.C(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 60), false);
            this.f40427e.f47627a.g();
            l20 l20Var = this.f40434y;
            if (l20Var != null) {
                TextView textView = (TextView) l20Var.f39525b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.ea0) this.f40434y.f39526c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.ea0) this.f40434y.f39526c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.ea0) this.f40434y.f39526c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.ea0) this.f40434y.f39526c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
                }
            }
            v0();
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f40428f) {
            this.f40428f = z10;
            this.f40427e.setPaused(z10);
            this.f40431s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
