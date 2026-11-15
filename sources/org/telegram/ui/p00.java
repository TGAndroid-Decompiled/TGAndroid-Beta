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
public abstract class p00 extends org.telegram.ui.ActionBar.e2 {
    public ah.a E;
    public int F;
    public v4.b0 G;
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
    public final m00 f50073a;
    public final m00 f50074b;
    public org.telegram.ui.Components.uj0 f50075c;
    public Drawable d;
    public ug.s1 f50076e;
    public boolean f50077f;
    public boolean h;
    public float f50078n;
    public int f50079r;
    public o00 f50080s;
    public float f50081w;
    public final Canvas f50082x;
    public float f50083y;

    public p00() {
        super(null);
        int i7 = org.telegram.ui.ActionBar.j6.Gk;
        int i10 = org.telegram.ui.ActionBar.j6.Hk;
        int i11 = org.telegram.ui.ActionBar.j6.Ik;
        int i12 = org.telegram.ui.ActionBar.j6.Jk;
        this.f50073a = new m00(i7, i10, i11, i12, null, 0);
        m00 m00Var = new m00(i7, i10, i11, i12, null, 1);
        this.f50074b = m00Var;
        this.f50082x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        m00Var.f58399n = true;
        this.Q = -1;
    }

    @Override
    public View createView(Context context) {
        int i7;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232729).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            i7 = 0;
        } else {
            i7 = org.telegram.messenger.g0.f23605m;
        }
        this.J = i7;
        this.f50080s = new o00(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
            if (o4Var2 != null && ((ActionBarLayout) o4Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f50075c = new org.telegram.ui.Components.uj0(context, null);
        v4.b0 l02 = l0(context);
        this.G = l02;
        this.f50075c.setLayoutManager(l02);
        v4.b0 b0Var = this.G;
        if (b0Var instanceof org.telegram.ui.Components.qy) {
            ((org.telegram.ui.Components.qy) b0Var).R = true;
        }
        v4.h0 k02 = k0();
        this.f50075c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.p41) {
            org.telegram.ui.Components.uj0 uj0Var = this.f50075c;
            l00 l00Var = new l00(this, 0);
            int L = org.telegram.messenger.g0.L(12.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            uj0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new hi.s4(uj0Var, l00Var, sparseIntArray, 3), new org.telegram.ui.Components.mi(sparseIntArray, 2));
            uj0Var.t1((org.telegram.messenger.a20) pair.first, (org.telegram.messenger.a20) pair.second, L, L2, true);
        } else {
            this.f50075c.setSections(true);
        }
        this.f50075c.setClipToPadding(false);
        this.f50075c.j(new g3(this, 12));
        this.E = new ah.a(context);
        o00 o00Var = this.f50080s;
        ug.s1 m0 = m0();
        this.f50076e = m0;
        o00Var.addView(m0, c8.ja.c(-2.0f, -1));
        this.f50080s.addView(this.E, c8.ja.c(-2.0f, -1));
        i0();
        this.f50080s.addView(p0());
        this.fragmentView = this.f50080s;
        lx lxVar = new lx(this, 4);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231240);
            this.simpleActionBar.setActionBarMenuOnItemClick(lxVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setActionBarMenuOnItemClick(lxVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(9, this), org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, org.telegram.ui.ActionBar.j6.Ek, org.telegram.ui.ActionBar.j6.Fk, org.telegram.ui.ActionBar.j6.Gk, org.telegram.ui.ActionBar.j6.Hk, org.telegram.ui.ActionBar.j6.Ik, org.telegram.ui.ActionBar.j6.Jk, org.telegram.ui.ActionBar.j6.Kk, org.telegram.ui.ActionBar.j6.Mk, org.telegram.ui.ActionBar.j6.Nk, org.telegram.ui.ActionBar.j6.Lk, org.telegram.ui.ActionBar.j6.Qk);
    }

    public void h0() {
        org.telegram.ui.Components.uj0 uj0Var = this.f50075c;
        if (uj0Var != null && this.G != null && this.Q >= 0) {
            int i7 = this.R;
            uj0Var.K(0);
            this.G.h1(this.Q, i7);
            this.Q = -1;
        }
    }

    public void i0() {
        this.f50080s.addView(this.f50075c, c8.ja.c(-1.0f, -1));
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.N && !org.telegram.ui.ActionBar.j6.I.q()) {
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

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        ah.a aVar = this.E;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f1057e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f1055b).setText(str);
        org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) aVar.f1056c;
        z70Var.setText(charSequence);
        z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, c8.ja.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, c8.ja.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract v4.h0 k0();

    public v4.b0 l0(Context context) {
        if (this.H) {
            return new org.telegram.ui.Components.qy((org.telegram.messenger.g0.L(68.0f) + this.J) - org.telegram.messenger.g0.L(16.0f), this.f50075c);
        }
        return new v4.b0();
    }

    public ug.s1 m0() {
        return new ki.f(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof di.lb);
    }

    public View o0(Context context) {
        rv rvVar = new rv(1, context, this);
        rvVar.setTag(-33024);
        return rvVar;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override
    public void onInsets(int i7, int i10, int i11, int i12) {
        this.f50075c.setPadding(0, 0, 0, i12);
    }

    @Override
    public void onPause() {
        super.onPause();
        ug.s1 s1Var = this.f50076e;
        if (s1Var != null) {
            s1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f50076e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            ug.s1 s1Var = this.f50076e;
            if (s1Var != null && s1Var.f58330a != null && this.f50080s != null) {
                x0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            return w4Var;
        }
        return this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.f50075c;
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
        int i7;
        org.telegram.ui.Components.uj0 uj0Var = this.f50075c;
        if (uj0Var != null && uj0Var.getChildCount() > 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f50075c.getChildCount()) {
                    view = this.f50075c.getChildAt(i10);
                    this.f50075c.getClass();
                    i7 = RecyclerView.R(view);
                    if (i7 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    i7 = -1;
                    break;
                }
            }
            if (view != null) {
                this.Q = i7;
                this.R = view.getTop();
            }
        }
    }

    public final Paint v0(float f10, float f11) {
        int measuredWidth = this.f50080s.getMeasuredWidth();
        int measuredHeight = this.f50080s.getMeasuredHeight();
        m00 m00Var = this.f50074b;
        m00Var.d(0, (-f10) - ((this.f50080s.getMeasuredWidth() * 0.1f) * this.f50078n), 0, measuredWidth, -f11, measuredHeight);
        return m00Var.f58392f;
    }

    public final void w0() {
        if (this.f50080s.getMeasuredWidth() != 0 && this.f50080s.getMeasuredHeight() != 0 && this.E != null) {
            int measuredWidth = this.f50080s.getMeasuredWidth();
            int measuredHeight = this.f50080s.getMeasuredHeight();
            m00 m00Var = this.f50073a;
            m00Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f50082x;
            canvas.save();
            canvas.scale(100.0f / this.f50080s.getMeasuredWidth(), 100.0f / this.f50080s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f50080s.getMeasuredWidth(), this.f50080s.getMeasuredHeight(), m00Var.f58392f);
            canvas.restore();
        }
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.L.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Kk, false);
                    if (x02 != this.O) {
                        this.O = x02;
                        this.actionBar.H(x02, false);
                    }
                    int o4 = i0.a.o(x02, 60);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar.f29308q0 != o4) {
                        kVar.F(o4, false);
                    }
                }
                this.f50076e.f58330a.g();
                ah.a aVar = this.E;
                if (aVar != null) {
                    TextView textView = (TextView) aVar.f1055b;
                    if (this.N) {
                        int i7 = org.telegram.ui.ActionBar.j6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
                        ((org.telegram.ui.Components.z70) this.E.f1056c).setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
                        ((org.telegram.ui.Components.z70) this.E.f1056c).setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
                    } else {
                        int i10 = org.telegram.ui.ActionBar.j6.Kk;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                        ((org.telegram.ui.Components.z70) this.E.f1056c).setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                        ((org.telegram.ui.Components.z70) this.E.f1056c).setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
                    }
                }
                w0();
            }
        }
    }

    public final void y0(boolean z10) {
        if (z10 != this.f50077f) {
            this.f50077f = z10;
            this.f50076e.setPaused(z10);
            this.f50080s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof di.lb;
    }

    public void s0(boolean z10) {
    }

    public void t0(float f10) {
    }
}
