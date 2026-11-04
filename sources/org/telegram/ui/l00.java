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
public abstract class l00 extends org.telegram.ui.ActionBar.d2 {
    public bh.a E;
    public int F;
    public u4.b0 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Paint L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final i00 f47061a;
    public final i00 f47062b;
    public org.telegram.ui.Components.tj0 f47063c;
    public Drawable d;
    public vg.t1 f47064e;
    public boolean f47065f;
    public boolean h;
    public float f47066n;
    public int f47067r;
    public k00 f47068s;
    public float f47069w;
    public final Canvas f47070x;
    public float f47071y;

    public l00() {
        super(null);
        int i3 = org.telegram.ui.ActionBar.k6.Dk;
        int i10 = org.telegram.ui.ActionBar.k6.Ek;
        int i11 = org.telegram.ui.ActionBar.k6.Fk;
        int i12 = org.telegram.ui.ActionBar.k6.Gk;
        this.f47061a = new i00(i3, i10, i11, i12, null, 0);
        i00 i00Var = new i00(i3, i10, i11, i12, null, 1);
        this.f47062b = i00Var;
        this.f47070x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        i00Var.f56918n = true;
        this.Q = -1;
    }

    @Override
    public View createView(Context context) {
        int i3;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232726).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            i3 = 0;
        } else {
            i3 = org.telegram.messenger.g0.f22602m;
        }
        this.J = i3;
        this.f47068s = new k00(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
            if (q4Var2 != null && ((ActionBarLayout) q4Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f47063c = new org.telegram.ui.Components.tj0(context, null);
        u4.b0 l02 = l0(context);
        this.G = l02;
        this.f47063c.setLayoutManager(l02);
        u4.b0 b0Var = this.G;
        if (b0Var instanceof org.telegram.ui.Components.jy) {
            ((org.telegram.ui.Components.jy) b0Var).R = true;
        }
        u4.h0 k02 = k0();
        this.f47063c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.f41) {
            org.telegram.ui.Components.tj0 tj0Var = this.f47063c;
            h00 h00Var = new h00(this, 0);
            int L = org.telegram.messenger.g0.L(12.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            tj0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new gi.s4(tj0Var, h00Var, sparseIntArray, 3), new org.telegram.ui.Components.di(sparseIntArray, 2));
            tj0Var.t1((org.telegram.messenger.v10) pair.first, (org.telegram.messenger.v10) pair.second, L, L2, true);
        } else {
            this.f47063c.setSections(true);
        }
        this.f47063c.setClipToPadding(false);
        this.f47063c.j(new h3(this, 12));
        this.E = new bh.a(context);
        k00 k00Var = this.f47068s;
        vg.t1 m0 = m0();
        this.f47064e = m0;
        k00Var.addView(m0, b8.mf.c(-2.0f, -1));
        this.f47068s.addView(this.E, b8.mf.c(-2.0f, -1));
        i0();
        this.f47068s.addView(p0());
        this.fragmentView = this.f47068s;
        hx hxVar = new hx(this, 4);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231240);
            this.simpleActionBar.setActionBarMenuOnItemClick(hxVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setActionBarMenuOnItemClick(hxVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(9, this), org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.Bk, org.telegram.ui.ActionBar.k6.Ck, org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, org.telegram.ui.ActionBar.k6.Hk, org.telegram.ui.ActionBar.k6.Jk, org.telegram.ui.ActionBar.k6.Kk, org.telegram.ui.ActionBar.k6.Ik, org.telegram.ui.ActionBar.k6.Nk);
    }

    public void h0() {
        org.telegram.ui.Components.tj0 tj0Var = this.f47063c;
        if (tj0Var != null && this.G != null && this.Q >= 0) {
            int i3 = this.R;
            tj0Var.K(0);
            this.G.h1(this.Q, i3);
            this.Q = -1;
        }
    }

    public void i0() {
        this.f47068s.addView(this.f47063c, b8.mf.c(-1.0f, -1));
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.N && !org.telegram.ui.ActionBar.k6.I.q()) {
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

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        bh.a aVar = this.E;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f3301e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f3299b).setText(str);
        org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) aVar.f3300c;
        s70Var.setText(charSequence);
        s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, b8.mf.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, b8.mf.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract u4.h0 k0();

    public u4.b0 l0(Context context) {
        if (this.H) {
            return new org.telegram.ui.Components.jy((org.telegram.messenger.g0.L(68.0f) + this.J) - org.telegram.messenger.g0.L(16.0f), this.f47063c);
        }
        return new u4.b0();
    }

    public vg.t1 m0() {
        return new ii.f(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof ci.wb);
    }

    public View o0(Context context) {
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(2, context, this);
        r0Var.setTag(-33024);
        return r0Var;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override
    public void onInsets(int i3, int i10, int i11, int i12) {
        this.f47063c.setPadding(0, 0, 0, i12);
    }

    @Override
    public void onPause() {
        super.onPause();
        vg.t1 t1Var = this.f47064e;
        if (t1Var != null) {
            t1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f47064e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            vg.t1 t1Var = this.f47064e;
            if (t1Var != null && t1Var.f56857a != null && this.f47068s != null) {
                x0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            return y4Var;
        }
        return this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.f47063c;
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
        y0(z10);
        return showDialog;
    }

    public void u0() {
        View view;
        int i3;
        org.telegram.ui.Components.tj0 tj0Var = this.f47063c;
        if (tj0Var != null && tj0Var.getChildCount() > 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f47063c.getChildCount()) {
                    view = this.f47063c.getChildAt(i10);
                    this.f47063c.getClass();
                    i3 = RecyclerView.R(view);
                    if (i3 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    i3 = -1;
                    break;
                }
            }
            if (view != null) {
                this.Q = i3;
                this.R = view.getTop();
            }
        }
    }

    public final Paint v0(float f10, float f11) {
        int measuredWidth = this.f47068s.getMeasuredWidth();
        int measuredHeight = this.f47068s.getMeasuredHeight();
        i00 i00Var = this.f47062b;
        i00Var.d(0, (-f10) - ((this.f47068s.getMeasuredWidth() * 0.1f) * this.f47066n), 0, measuredWidth, -f11, measuredHeight);
        return i00Var.f56911f;
    }

    public final void w0() {
        if (this.f47068s.getMeasuredWidth() != 0 && this.f47068s.getMeasuredHeight() != 0 && this.E != null) {
            int measuredWidth = this.f47068s.getMeasuredWidth();
            int measuredHeight = this.f47068s.getMeasuredHeight();
            i00 i00Var = this.f47061a;
            i00Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f47070x;
            canvas.save();
            canvas.scale(100.0f / this.f47068s.getMeasuredWidth(), 100.0f / this.f47068s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f47068s.getMeasuredWidth(), this.f47068s.getMeasuredHeight(), i00Var.f56911f);
            canvas.restore();
        }
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.L.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hk, false);
                    if (x02 != this.O) {
                        this.O = x02;
                        this.actionBar.D(x02, false);
                    }
                    int o10 = i0.a.o(x02, 60);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar.f27732q0 != o10) {
                        kVar.C(o10, false);
                    }
                }
                this.f47064e.f56857a.g();
                bh.a aVar = this.E;
                if (aVar != null) {
                    TextView textView = (TextView) aVar.f3299b;
                    if (this.N) {
                        int i3 = org.telegram.ui.ActionBar.k6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
                        ((org.telegram.ui.Components.s70) this.E.f3300c).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
                        ((org.telegram.ui.Components.s70) this.E.f3300c).setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
                    } else {
                        int i10 = org.telegram.ui.ActionBar.k6.Hk;
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                        ((org.telegram.ui.Components.s70) this.E.f3300c).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                        ((org.telegram.ui.Components.s70) this.E.f3300c).setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
                    }
                }
                w0();
            }
        }
    }

    public final void y0(boolean z10) {
        if (z10 != this.f47065f) {
            this.f47065f = z10;
            this.f47064e.setPaused(z10);
            this.f47068s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof ci.wb;
    }

    public void s0(boolean z10) {
    }

    public void t0(float f10) {
    }
}
