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
public abstract class n20 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public f2.i0 C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final Paint H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public final k20 f36316a;
    public final k20 f36317b;
    public org.telegram.ui.Components.rl0 f36318c;
    public Drawable d;
    public eg.q2 e;
    public boolean f36319f;
    public boolean h;
    public float f36320n;
    public int f36321r;
    public m20 f36322s;
    public float v;
    public final Canvas f36323w;
    public float f36324x;
    public kg.a f36325y;

    public n20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.j6.Pj;
        int i11 = org.telegram.ui.ActionBar.j6.Qj;
        int i12 = org.telegram.ui.ActionBar.j6.Rj;
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        this.f36316a = new k20(i10, i11, i12, i13, null, 0);
        k20 k20Var = new k20(i10, i11, i12, i13, null, 1);
        this.f36317b = k20Var;
        this.f36323w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.B = -1;
        this.D = true;
        this.H = new Paint();
        k20Var.f5453n = true;
        this.K = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.F = i10;
        this.f36322s = o0();
        org.telegram.ui.ActionBar.e5 e5Var2 = this.parentLayout;
        if (e5Var2 != null && ((ActionBarLayout) e5Var2).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f36318c = new org.telegram.ui.Components.rl0(context, null);
        if (this.D) {
            this.C = new org.telegram.ui.Components.pz(this.f36318c, (AndroidUtilities.dp(68.0f) + this.F) - AndroidUtilities.dp(16.0f));
        } else {
            this.C = new f2.i0();
        }
        this.f36318c.setLayoutManager(this.C);
        f2.i0 i0Var = this.C;
        if (i0Var instanceof org.telegram.ui.Components.pz) {
            ((org.telegram.ui.Components.pz) i0Var).R = true;
        }
        f2.o0 n02 = n0();
        this.f36318c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.w51) {
            org.telegram.ui.Components.rl0 rl0Var = this.f36318c;
            j20 j20Var = new j20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.rl0 rl0Var2 = this.f36318c;
            Objects.requireNonNull(rl0Var2);
            rl0Var.q1(j20Var, dp, dp2, new hu(rl0Var2, 10), true);
        } else {
            this.f36318c.setSections(true);
        }
        this.f36318c.setClipToPadding(false);
        this.f36318c.j(new n3(this, 11));
        this.f36325y = new kg.a(context);
        m20 m20Var = this.f36322s;
        eg.q2 p02 = p0();
        this.e = p02;
        m20Var.addView(p02, k7.b6.c(-2.0f, -1));
        this.f36322s.addView(this.f36325y, k7.b6.c(-2.0f, -1));
        this.f36322s.addView(this.f36318c, k7.b6.c(-1.0f, -1));
        this.f36322s.addView(this.actionBar);
        this.fragmentView = this.f36322s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 12));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 15), org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Nj, org.telegram.ui.ActionBar.j6.Oj, org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, org.telegram.ui.ActionBar.j6.Tj, org.telegram.ui.ActionBar.j6.Vj, org.telegram.ui.ActionBar.j6.Wj, org.telegram.ui.ActionBar.j6.Uj, org.telegram.ui.ActionBar.j6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.J && !org.telegram.ui.ActionBar.j6.I.q()) {
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
        org.telegram.ui.Components.rl0 rl0Var = this.f36318c;
        if (rl0Var != null && this.C != null && this.K >= 0) {
            int i10 = this.L;
            rl0Var.K(0);
            this.C.h1(this.K, i10);
            this.K = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, y5 y5Var) {
        kg.a aVar = this.f36325y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f10519b).setText(str);
        org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) aVar.f10520c;
        f90Var.setText(charSequence);
        f90Var.setMaxWidth(ph.f3.a(f90Var.getText(), f90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, k7.b6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (y5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(y5Var, k7.b6.e(-1, -2, 1));
            frameLayout2.setClickable(y5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.o0 n0();

    public m20 o0() {
        return new m20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f36318c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        eg.q2 q2Var = this.e;
        if (q2Var != null) {
            q2Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public eg.q2 p0() {
        return new eg.h(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        eg.h0 h0Var = new eg.h0(this, context, 24);
        h0Var.setTag(-33024);
        return h0Var;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.rl0 rl0Var = this.f36318c;
        if (rl0Var != null && rl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f36318c.getChildCount()) {
                    view = this.f36318c.getChildAt(i11);
                    this.f36318c.getClass();
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
                this.K = i10;
                this.L = view.getTop();
            }
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z4;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        w0(z4);
        return showDialog;
    }

    public final Paint t0(float f10, float f11) {
        int measuredWidth = this.f36322s.getMeasuredWidth();
        int measuredHeight = this.f36322s.getMeasuredHeight();
        k20 k20Var = this.f36317b;
        k20Var.d(0, (-f10) - ((this.f36322s.getMeasuredWidth() * 0.1f) * this.f36320n), 0, measuredWidth, -f11, measuredHeight);
        return k20Var.f5446f;
    }

    public final void u0() {
        if (this.f36322s.getMeasuredWidth() != 0 && this.f36322s.getMeasuredHeight() != 0 && this.f36325y != null) {
            int measuredWidth = this.f36322s.getMeasuredWidth();
            int measuredHeight = this.f36322s.getMeasuredHeight();
            k20 k20Var = this.f36316a;
            k20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f36323w;
            canvas.save();
            canvas.scale(100.0f / this.f36322s.getMeasuredWidth(), 100.0f / this.f36322s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f36322s.getMeasuredWidth(), this.f36322s.getMeasuredHeight(), k20Var.f5446f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f36325y != null && this.actionBar != null) {
            this.H.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.Tj;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
            this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 60), false);
            this.e.f5457a.g();
            kg.a aVar = this.f36325y;
            if (aVar != null) {
                TextView textView = (TextView) aVar.f10519b;
                if (this.J) {
                    int i11 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.f90) this.f36325y.f10520c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.f90) this.f36325y.f10520c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19941gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.f90) this.f36325y.f10520c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.f90) this.f36325y.f10520c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19941gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z4) {
        if (z4 != this.f36319f) {
            this.f36319f = z4;
            this.e.setPaused(z4);
            this.f36322s.invalidate();
        }
    }
}
