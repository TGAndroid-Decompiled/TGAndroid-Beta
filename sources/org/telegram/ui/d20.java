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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class d20 extends org.telegram.ui.ActionBar.r2 {
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
    public int P;
    public int Q;
    public final y10 f38714a;
    public final y10 f38715b;
    public org.telegram.ui.Components.mm0 f38716c;
    public Drawable d;
    public tg.x1 e;
    public boolean f38717f;
    public boolean h;
    public float f38718n;
    public int f38719r;
    public c20 f38720s;
    public float v;
    public final Canvas f38721w;
    public float f38722x;
    public bi.sc f38723y;

    public d20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.y6.Pj;
        int i11 = org.telegram.ui.ActionBar.y6.Qj;
        int i12 = org.telegram.ui.ActionBar.y6.Rj;
        int i13 = org.telegram.ui.ActionBar.y6.Sj;
        this.f38714a = new y10(i10, i11, i12, i13, null, 0);
        y10 y10Var = new y10(i10, i11, i12, i13, null, 1);
        this.f38715b = y10Var;
        this.f38721w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        y10Var.f48804n = true;
        this.P = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5);
        this.O = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f38720s = new c20(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
            if (j5Var2 != null && ((ActionBarLayout) j5Var2).S0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f38716c = new org.telegram.ui.Components.mm0(context, null);
        s4.c0 h02 = h0(context);
        this.F = h02;
        this.f38716c.setLayoutManager(h02);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.yz) {
            ((org.telegram.ui.Components.yz) c0Var).R = true;
        }
        s4.h0 g02 = g0();
        this.f38716c.setAdapter(g02);
        if (g02 instanceof org.telegram.ui.Components.j71) {
            org.telegram.ui.Components.mm0 mm0Var = this.f38716c;
            x10 x10Var = new x10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            mm0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new fi.d5(mm0Var, x10Var, sparseIntArray, 3), new org.telegram.ui.Components.vi(sparseIntArray, 2));
            mm0Var.w1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, dp, dp2, true);
        } else {
            this.f38716c.setSections(true);
        }
        this.f38716c.setClipToPadding(false);
        this.f38716c.j(new i3(this, 12));
        this.f38723y = new bi.sc(context);
        c20 c20Var = this.f38720s;
        tg.x1 i02 = i0();
        this.e = i02;
        c20Var.addView(i02, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        this.f38720s.addView(this.f38723y, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        e0();
        this.f38720s.addView(l0());
        this.fragmentView = this.f38720s;
        a20 a20Var = new a20(this, 0);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(a20Var);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setActionBarMenuOnItemClick(a20Var);
            this.actionBar.setForceSkipTouches(true);
        }
        t0();
        return this.fragmentView;
    }

    public void d0() {
        org.telegram.ui.Components.mm0 mm0Var = this.f38716c;
        if (mm0Var != null && this.F != null && this.P >= 0) {
            int i10 = this.Q;
            mm0Var.K(0);
            this.F.h1(this.P, i10);
            this.P = -1;
        }
    }

    public void e0() {
        this.f38720s.addView(this.f38716c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
    }

    public final void f0(String str, CharSequence charSequence, FrameLayout frameLayout, v5 v5Var) {
        bi.sc scVar = this.f38723y;
        FrameLayout frameLayout2 = (FrameLayout) scVar.e;
        FrameLayout frameLayout3 = (FrameLayout) scVar.d;
        ((TextView) scVar.f5423b).setText(str);
        org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) scVar.f5424c;
        z90Var.setText(charSequence);
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (v5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(v5Var, org.telegram.ui.Components.gb1.i(-1, -2, 1));
            frameLayout2.setClickable(v5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        scVar.requestLayout();
    }

    public abstract s4.h0 g0();

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(9, this), org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, org.telegram.ui.ActionBar.y6.Nj, org.telegram.ui.ActionBar.y6.Oj, org.telegram.ui.ActionBar.y6.Pj, org.telegram.ui.ActionBar.y6.Qj, org.telegram.ui.ActionBar.y6.Rj, org.telegram.ui.ActionBar.y6.Sj, org.telegram.ui.ActionBar.y6.Tj, org.telegram.ui.ActionBar.y6.Vj, org.telegram.ui.ActionBar.y6.Wj, org.telegram.ui.ActionBar.y6.Uj, org.telegram.ui.ActionBar.y6.Zj);
    }

    public s4.c0 h0(Context context) {
        if (this.G) {
            return new org.telegram.ui.Components.yz(this.f38716c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        }
        return new s4.c0();
    }

    public tg.x1 i0() {
        return new hi.e(getParentActivity(), 2);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.y6.I.q()) {
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

    public boolean j0() {
        return !(this instanceof bi.dd);
    }

    public View k0(Context context) {
        z10 z10Var = new z10(this, context, 0);
        z10Var.setTag(-33024);
        return z10Var;
    }

    public final FrameLayout l0() {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            return r5Var;
        }
        return this.actionBar;
    }

    public float m0() {
        return 0.0f;
    }

    public View n0() {
        return this.f38716c;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        u0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f38716c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        tg.x1 x1Var = this.e;
        if (x1Var != null) {
            x1Var.setPaused(true);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.O) {
                this.O = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            tg.x1 x1Var = this.e;
            if (x1Var != null && x1Var.f49119a != null && this.f38720s != null) {
                t0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void q0() {
        View view;
        int i10;
        org.telegram.ui.Components.mm0 mm0Var = this.f38716c;
        if (mm0Var != null && mm0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f38716c.getChildCount()) {
                    view = this.f38716c.getChildAt(i11);
                    this.f38716c.getClass();
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

    public final Paint r0(float f7, float f10) {
        int measuredWidth = this.f38720s.getMeasuredWidth();
        int measuredHeight = this.f38720s.getMeasuredHeight();
        y10 y10Var = this.f38715b;
        y10Var.d(0, (-f7) - ((this.f38720s.getMeasuredWidth() * 0.1f) * this.f38718n), 0, measuredWidth, -f10, measuredHeight);
        return y10Var.f48797f;
    }

    public final void s0() {
        if (this.f38720s.getMeasuredWidth() != 0 && this.f38720s.getMeasuredHeight() != 0 && this.f38723y != null) {
            this.f38714a.d(0, 0.0f, 0, this.f38720s.getMeasuredWidth(), 0.0f, this.f38720s.getMeasuredHeight());
            Canvas canvas = this.f38721w;
            canvas.save();
            canvas.scale(100.0f / this.f38720s.getMeasuredWidth(), 100.0f / this.f38720s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f38720s.getMeasuredWidth(), this.f38720s.getMeasuredHeight(), this.f38714a.f48797f);
            canvas.restore();
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
        u0(z10);
        return showDialog;
    }

    public final void t0() {
        if (this.f38723y != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23427h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Tj, false);
                    if (x02 != this.N) {
                        this.N = x02;
                        this.actionBar.y(x02, false);
                    }
                    int o10 = i0.a.o(x02, 60);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar.f22778p0 != o10) {
                        kVar.x(o10, false);
                    }
                }
                this.e.f49119a.g();
                bi.sc scVar = this.f38723y;
                if (scVar != null) {
                    TextView textView = (TextView) scVar.f5423b;
                    if (this.M) {
                        int i10 = org.telegram.ui.ActionBar.y6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
                        ((org.telegram.ui.Components.z90) this.f38723y.f5424c).setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
                        ((org.telegram.ui.Components.z90) this.f38723y.f5424c).setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
                    } else {
                        int i11 = org.telegram.ui.ActionBar.y6.Tj;
                        textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                        ((org.telegram.ui.Components.z90) this.f38723y.f5424c).setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                        ((org.telegram.ui.Components.z90) this.f38723y.f5424c).setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
                    }
                }
                s0();
            }
        }
    }

    public final void u0(boolean z10) {
        if (z10 != this.f38717f) {
            this.f38717f = z10;
            this.e.setPaused(z10);
            this.f38720s.invalidate();
        }
    }

    public boolean v0() {
        return this instanceof bi.dd;
    }

    public void o0(boolean z10) {
    }

    public void p0(float f7) {
    }
}
