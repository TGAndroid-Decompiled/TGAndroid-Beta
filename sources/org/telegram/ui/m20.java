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
public abstract class m20 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public s4.c0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final i20 f35434a;
    public final i20 f35435b;
    public org.telegram.ui.Components.wl0 f35436c;
    public Drawable d;
    public rg.w1 e;
    public boolean f35437f;
    public boolean h;
    public float f35438n;
    public int f35439r;
    public l20 f35440s;
    public float v;
    public final Canvas f35441w;
    public float f35442x;
    public j20 f35443y;

    public m20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.f35434a = new i20(i10, i11, i12, i13, null, 0);
        i20 i20Var = new i20(i10, i11, i12, i13, null, 1);
        this.f35435b = i20Var;
        this.f35441w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        i20Var.f42833n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19115h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f35440s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f35436c = new org.telegram.ui.Components.wl0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.qz(this.f35436c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.f35436c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.qz) {
            ((org.telegram.ui.Components.qz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.f35436c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.j61) {
            org.telegram.ui.Components.wl0 wl0Var = this.f35436c;
            h20 h20Var = new h20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.wl0 wl0Var2 = this.f35436c;
            Objects.requireNonNull(wl0Var2);
            wl0Var.r1(h20Var, dp, dp2, new du(wl0Var2, 10), true);
        } else {
            this.f35436c.setSections(true);
        }
        this.f35436c.setClipToPadding(false);
        this.f35436c.j(new i3(this, 11));
        this.f35443y = new j20(context);
        l20 l20Var = this.f35440s;
        rg.w1 p02 = p0();
        this.e = p02;
        l20Var.addView(p02, w7.y5.c(-2.0f, -1));
        this.f35440s.addView(this.f35443y, w7.y5.c(-2.0f, -1));
        this.f35440s.addView(this.f35436c, w7.y5.c(-1.0f, -1));
        this.f35440s.addView(this.actionBar);
        this.fragmentView = this.f35440s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 25));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new e(this, 15), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
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
        org.telegram.ui.Components.wl0 wl0Var = this.f35436c;
        if (wl0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            wl0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, s5 s5Var) {
        j20 j20Var = this.f35443y;
        FrameLayout frameLayout2 = (FrameLayout) j20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) j20Var.d;
        ((TextView) j20Var.f34614b).setText(str);
        org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) j20Var.f34615c;
        n90Var.setText(charSequence);
        n90Var.setMaxWidth(ci.e4.a(n90Var.getText(), n90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.y5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (s5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(s5Var, w7.y5.e(-1, -2, 1));
            frameLayout2.setClickable(s5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        j20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public l20 o0() {
        return new l20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f35436c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
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

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.wl0 wl0Var = this.f35436c;
        if (wl0Var != null && wl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f35436c.getChildCount()) {
                    view = this.f35436c.getChildAt(i11);
                    this.f35436c.getClass();
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

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z10;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0(z10);
        return showDialog;
    }

    public final Paint t0(float f7, float f10) {
        int measuredWidth = this.f35440s.getMeasuredWidth();
        int measuredHeight = this.f35440s.getMeasuredHeight();
        i20 i20Var = this.f35435b;
        i20Var.d(0, (-f7) - ((this.f35440s.getMeasuredWidth() * 0.1f) * this.f35438n), 0, measuredWidth, -f10, measuredHeight);
        return i20Var.f42826f;
    }

    public final void u0() {
        if (this.f35440s.getMeasuredWidth() != 0 && this.f35440s.getMeasuredHeight() != 0 && this.f35443y != null) {
            int measuredWidth = this.f35440s.getMeasuredWidth();
            int measuredHeight = this.f35440s.getMeasuredHeight();
            i20 i20Var = this.f35434a;
            i20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35441w;
            canvas.save();
            canvas.scale(100.0f / this.f35440s.getMeasuredWidth(), 100.0f / this.f35440s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f35440s.getMeasuredWidth(), this.f35440s.getMeasuredHeight(), i20Var.f42826f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f35443y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19115h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.h6.Tj;
            kVar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
            this.actionBar.A(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 60), false);
            this.e.f42801a.g();
            j20 j20Var = this.f35443y;
            if (j20Var != null) {
                TextView textView = (TextView) j20Var.f34614b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    ((org.telegram.ui.Components.n90) this.f35443y.f34615c).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    ((org.telegram.ui.Components.n90) this.f35443y.f34615c).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    ((org.telegram.ui.Components.n90) this.f35443y.f34615c).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    ((org.telegram.ui.Components.n90) this.f35443y.f34615c).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f35437f) {
            this.f35437f = z10;
            this.e.setPaused(z10);
            this.f35440s.invalidate();
        }
    }
}
