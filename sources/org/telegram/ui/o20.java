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
public abstract class o20 extends org.telegram.ui.ActionBar.n2 {
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
    public final k20 f35658a;
    public final k20 f35659b;
    public org.telegram.ui.Components.ml0 f35660c;
    public Drawable d;
    public rg.v1 e;
    public boolean f35661f;
    public boolean h;
    public float f35662n;
    public int f35663r;
    public n20 f35664s;
    public float v;
    public final Canvas f35665w;
    public float f35666x;
    public l20 f35667y;

    public o20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.f35658a = new k20(i10, i11, i12, i13, null, 0);
        k20 k20Var = new k20(i10, i11, i12, i13, null, 1);
        this.f35659b = k20Var;
        this.f35665w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        k20Var.f42514n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f35664s = o0();
        org.telegram.ui.ActionBar.c5 c5Var2 = this.parentLayout;
        if (c5Var2 != null && ((ActionBarLayout) c5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f35660c = new org.telegram.ui.Components.ml0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.qz(this.f35660c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.f35660c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.qz) {
            ((org.telegram.ui.Components.qz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.f35660c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.v51) {
            org.telegram.ui.Components.ml0 ml0Var = this.f35660c;
            j20 j20Var = new j20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.ml0 ml0Var2 = this.f35660c;
            Objects.requireNonNull(ml0Var2);
            ml0Var.r1(j20Var, dp, dp2, new eu(ml0Var2, 10), true);
        } else {
            this.f35660c.setSections(true);
        }
        this.f35660c.setClipToPadding(false);
        this.f35660c.j(new i3(this, 11));
        this.f35667y = new l20(context);
        n20 n20Var = this.f35664s;
        rg.v1 p02 = p0();
        this.e = p02;
        n20Var.addView(p02, w7.x5.c(-2.0f, -1));
        this.f35664s.addView(this.f35667y, w7.x5.c(-2.0f, -1));
        this.f35664s.addView(this.f35660c, w7.x5.c(-1.0f, -1));
        this.f35664s.addView(this.actionBar);
        this.fragmentView = this.f35664s;
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
        org.telegram.ui.Components.ml0 ml0Var = this.f35660c;
        if (ml0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            ml0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        l20 l20Var = this.f35667y;
        FrameLayout frameLayout2 = (FrameLayout) l20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) l20Var.d;
        ((TextView) l20Var.f34846b).setText(str);
        org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) l20Var.f34847c;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(ci.e4.a(d90Var.getText(), d90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.x5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, w7.x5.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        l20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public n20 o0() {
        return new n20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f35660c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.v1 v1Var = this.e;
        if (v1Var != null) {
            v1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public rg.v1 p0() {
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
        org.telegram.ui.Components.ml0 ml0Var = this.f35660c;
        if (ml0Var != null && ml0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f35660c.getChildCount()) {
                    view = this.f35660c.getChildAt(i11);
                    this.f35660c.getClass();
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
        int measuredWidth = this.f35664s.getMeasuredWidth();
        int measuredHeight = this.f35664s.getMeasuredHeight();
        k20 k20Var = this.f35659b;
        k20Var.d(0, (-f7) - ((this.f35664s.getMeasuredWidth() * 0.1f) * this.f35662n), 0, measuredWidth, -f10, measuredHeight);
        return k20Var.f42507f;
    }

    public final void u0() {
        if (this.f35664s.getMeasuredWidth() != 0 && this.f35664s.getMeasuredHeight() != 0 && this.f35667y != null) {
            int measuredWidth = this.f35664s.getMeasuredWidth();
            int measuredHeight = this.f35664s.getMeasuredHeight();
            k20 k20Var = this.f35658a;
            k20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35665w;
            canvas.save();
            canvas.scale(100.0f / this.f35664s.getMeasuredWidth(), 100.0f / this.f35664s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f35664s.getMeasuredWidth(), this.f35664s.getMeasuredHeight(), k20Var.f42507f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f35667y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.h6.Tj;
            kVar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
            this.actionBar.A(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 60), false);
            this.e.f42473a.g();
            l20 l20Var = this.f35667y;
            if (l20Var != null) {
                TextView textView = (TextView) l20Var.f34846b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    ((org.telegram.ui.Components.d90) this.f35667y.f34847c).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    ((org.telegram.ui.Components.d90) this.f35667y.f34847c).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    ((org.telegram.ui.Components.d90) this.f35667y.f34847c).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    ((org.telegram.ui.Components.d90) this.f35667y.f34847c).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f35661f) {
            this.f35661f = z10;
            this.e.setPaused(z10);
            this.f35664s.invalidate();
        }
    }
}
