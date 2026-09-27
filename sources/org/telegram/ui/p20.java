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
public abstract class p20 extends org.telegram.ui.ActionBar.o2 {
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
    public final l20 f36303a;
    public final l20 f36304b;
    public org.telegram.ui.Components.yl0 f36305c;
    public Drawable d;
    public rg.w1 e;
    public boolean f36306f;
    public boolean h;
    public float f36307n;
    public int f36308r;
    public o20 f36309s;
    public float v;
    public final Canvas f36310w;
    public float f36311x;
    public m20 f36312y;

    public p20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.i6.Pj;
        int i11 = org.telegram.ui.ActionBar.i6.Qj;
        int i12 = org.telegram.ui.ActionBar.i6.Rj;
        int i13 = org.telegram.ui.ActionBar.i6.Sj;
        this.f36303a = new l20(i10, i11, i12, i13, null, 0);
        l20 l20Var = new l20(i10, i11, i12, i13, null, 1);
        this.f36304b = l20Var;
        this.f36310w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        l20Var.f42892n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f36309s = o0();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (d5Var2 != null && ((ActionBarLayout) d5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f36305c = new org.telegram.ui.Components.yl0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.rz(this.f36305c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.f36305c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.rz) {
            ((org.telegram.ui.Components.rz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.f36305c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.l61) {
            org.telegram.ui.Components.yl0 yl0Var = this.f36305c;
            k20 k20Var = new k20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.yl0 yl0Var2 = this.f36305c;
            Objects.requireNonNull(yl0Var2);
            yl0Var.s1(k20Var, dp, dp2, new au(yl0Var2, 12), true);
        } else {
            this.f36305c.setSections(true);
        }
        this.f36305c.setClipToPadding(false);
        this.f36305c.j(new j3(this, 11));
        this.f36312y = new m20(context);
        o20 o20Var = this.f36309s;
        rg.w1 p02 = p0();
        this.e = p02;
        o20Var.addView(p02, w7.y5.c(-2.0f, -1));
        this.f36309s.addView(this.f36312y, w7.y5.c(-2.0f, -1));
        this.f36309s.addView(this.f36305c, w7.y5.c(-1.0f, -1));
        this.f36309s.addView(this.actionBar);
        this.fragmentView = this.f36309s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 25));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new e(this, 15), org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, org.telegram.ui.ActionBar.i6.Nj, org.telegram.ui.ActionBar.i6.Oj, org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, org.telegram.ui.ActionBar.i6.Tj, org.telegram.ui.ActionBar.i6.Vj, org.telegram.ui.ActionBar.i6.Wj, org.telegram.ui.ActionBar.i6.Uj, org.telegram.ui.ActionBar.i6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.i6.I.q()) {
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
        org.telegram.ui.Components.yl0 yl0Var = this.f36305c;
        if (yl0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            yl0Var.L(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, u5 u5Var) {
        m20 m20Var = this.f36312y;
        FrameLayout frameLayout2 = (FrameLayout) m20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) m20Var.d;
        ((TextView) m20Var.f35494b).setText(str);
        org.telegram.ui.Components.p90 p90Var = (org.telegram.ui.Components.p90) m20Var.f35495c;
        p90Var.setText(charSequence);
        p90Var.setMaxWidth(ci.e4.a(p90Var.getText(), p90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.y5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (u5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(u5Var, w7.y5.e(-1, -2, 1));
            frameLayout2.setClickable(u5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        m20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public o20 o0() {
        return new o20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f36305c.setPadding(0, 0, 0, i13);
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
        ci.ab abVar = new ci.ab(this, context, 29);
        abVar.setTag(-33024);
        return abVar;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.yl0 yl0Var = this.f36305c;
        if (yl0Var != null && yl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f36305c.getChildCount()) {
                    view = this.f36305c.getChildAt(i11);
                    this.f36305c.getClass();
                    i10 = RecyclerView.S(view);
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
        int measuredWidth = this.f36309s.getMeasuredWidth();
        int measuredHeight = this.f36309s.getMeasuredHeight();
        l20 l20Var = this.f36304b;
        l20Var.d(0, (-f7) - ((this.f36309s.getMeasuredWidth() * 0.1f) * this.f36307n), 0, measuredWidth, -f10, measuredHeight);
        return l20Var.f42885f;
    }

    public final void u0() {
        if (this.f36309s.getMeasuredWidth() != 0 && this.f36309s.getMeasuredHeight() != 0 && this.f36312y != null) {
            int measuredWidth = this.f36309s.getMeasuredWidth();
            int measuredHeight = this.f36309s.getMeasuredHeight();
            l20 l20Var = this.f36303a;
            l20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f36310w;
            canvas.save();
            canvas.scale(100.0f / this.f36309s.getMeasuredWidth(), 100.0f / this.f36309s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f36309s.getMeasuredWidth(), this.f36309s.getMeasuredHeight(), l20Var.f42885f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f36312y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.i6.Tj;
            lVar.E(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
            this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 60), false);
            this.e.f42860a.g();
            m20 m20Var = this.f36312y;
            if (m20Var != null) {
                TextView textView = (TextView) m20Var.f35494b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    ((org.telegram.ui.Components.p90) this.f36312y.f35495c).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    ((org.telegram.ui.Components.p90) this.f36312y.f35495c).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    ((org.telegram.ui.Components.p90) this.f36312y.f35495c).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    ((org.telegram.ui.Components.p90) this.f36312y.f35495c).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f36306f) {
            this.f36306f = z10;
            this.e.setPaused(z10);
            this.f36309s.invalidate();
        }
    }
}
