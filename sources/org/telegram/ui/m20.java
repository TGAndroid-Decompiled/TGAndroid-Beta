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
public abstract class m20 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public f2.j0 C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final Paint H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public final j20 f38939a;
    public final j20 f38940b;
    public org.telegram.ui.Components.tl0 f38941c;
    public Drawable d;
    public fg.p2 f38942e;
    public boolean f38943f;
    public boolean h;
    public float f38944n;
    public int f38945r;
    public l20 f38946s;
    public float v;
    public final Canvas f38947w;
    public float f38948x;
    public lg.a f38949y;

    public m20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.k6.Pj;
        int i11 = org.telegram.ui.ActionBar.k6.Qj;
        int i12 = org.telegram.ui.ActionBar.k6.Rj;
        int i13 = org.telegram.ui.ActionBar.k6.Sj;
        this.f38939a = new j20(i10, i11, i12, i13, null, 0);
        j20 j20Var = new j20(i10, i11, i12, i13, null, 1);
        this.f38940b = j20Var;
        this.f38947w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.B = -1;
        this.D = true;
        this.H = new Paint();
        j20Var.f6497n = true;
        this.K = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.F = i10;
        this.f38946s = o0();
        org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
        if (f5Var2 != null && ((ActionBarLayout) f5Var2).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f38941c = new org.telegram.ui.Components.tl0(context, null);
        if (this.D) {
            this.C = new org.telegram.ui.Components.rz(this.f38941c, (AndroidUtilities.dp(68.0f) + this.F) - AndroidUtilities.dp(16.0f));
        } else {
            this.C = new f2.j0();
        }
        this.f38941c.setLayoutManager(this.C);
        f2.j0 j0Var = this.C;
        if (j0Var instanceof org.telegram.ui.Components.rz) {
            ((org.telegram.ui.Components.rz) j0Var).R = true;
        }
        f2.p0 n02 = n0();
        this.f38941c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.x51) {
            org.telegram.ui.Components.tl0 tl0Var = this.f38941c;
            i20 i20Var = new i20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.tl0 tl0Var2 = this.f38941c;
            Objects.requireNonNull(tl0Var2);
            tl0Var.r1(i20Var, dp, dp2, new gu(tl0Var2, 10), true);
        } else {
            this.f38941c.setSections(true);
        }
        this.f38941c.setClipToPadding(false);
        this.f38941c.j(new l3(this, 11));
        this.f38949y = new lg.a(context);
        l20 l20Var = this.f38946s;
        fg.p2 p02 = p0();
        this.f38942e = p02;
        l20Var.addView(p02, k7.c6.c(-2.0f, -1));
        this.f38946s.addView(this.f38949y, k7.c6.c(-2.0f, -1));
        this.f38946s.addView(this.f38941c, k7.c6.c(-1.0f, -1));
        this.f38946s.addView(this.actionBar);
        this.fragmentView = this.f38946s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 12));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 15), org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, org.telegram.ui.ActionBar.k6.Nj, org.telegram.ui.ActionBar.k6.Oj, org.telegram.ui.ActionBar.k6.Pj, org.telegram.ui.ActionBar.k6.Qj, org.telegram.ui.ActionBar.k6.Rj, org.telegram.ui.ActionBar.k6.Sj, org.telegram.ui.ActionBar.k6.Tj, org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Uj, org.telegram.ui.ActionBar.k6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.J && !org.telegram.ui.ActionBar.k6.I.q()) {
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
        org.telegram.ui.Components.tl0 tl0Var = this.f38941c;
        if (tl0Var != null && this.C != null && this.K >= 0) {
            int i10 = this.L;
            tl0Var.K(0);
            this.C.h1(this.K, i10);
            this.K = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, w5 w5Var) {
        lg.a aVar = this.f38949y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f12531e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f12529b).setText(str);
        org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) aVar.f12530c;
        g90Var.setText(charSequence);
        g90Var.setMaxWidth(qh.f3.a(g90Var.getText(), g90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, k7.c6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (w5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(w5Var, k7.c6.e(-1, -2, 1));
            frameLayout2.setClickable(w5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.p0 n0();

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
        this.f38941c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        fg.p2 p2Var = this.f38942e;
        if (p2Var != null) {
            p2Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f38942e.setPaused(false);
    }

    public fg.p2 p0() {
        return new fg.h(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        fg.h0 h0Var = new fg.h0(this, context, 24);
        h0Var.setTag(-33024);
        return h0Var;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.tl0 tl0Var = this.f38941c;
        if (tl0Var != null && tl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f38941c.getChildCount()) {
                    view = this.f38941c.getChildAt(i11);
                    this.f38941c.getClass();
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
        int measuredWidth = this.f38946s.getMeasuredWidth();
        int measuredHeight = this.f38946s.getMeasuredHeight();
        j20 j20Var = this.f38940b;
        j20Var.d(0, (-f10) - ((this.f38946s.getMeasuredWidth() * 0.1f) * this.f38944n), 0, measuredWidth, -f11, measuredHeight);
        return j20Var.f6490f;
    }

    public final void u0() {
        if (this.f38946s.getMeasuredWidth() != 0 && this.f38946s.getMeasuredHeight() != 0 && this.f38949y != null) {
            int measuredWidth = this.f38946s.getMeasuredWidth();
            int measuredHeight = this.f38946s.getMeasuredHeight();
            j20 j20Var = this.f38939a;
            j20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f38947w;
            canvas.save();
            canvas.scale(100.0f / this.f38946s.getMeasuredWidth(), 100.0f / this.f38946s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f38946s.getMeasuredWidth(), this.f38946s.getMeasuredHeight(), j20Var.f6490f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f38949y != null && this.actionBar != null) {
            this.H.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.k6.Tj;
            kVar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
            this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 60), false);
            this.f38942e.f6501a.g();
            lg.a aVar = this.f38949y;
            if (aVar != null) {
                TextView textView = (TextView) aVar.f12529b;
                if (this.J) {
                    int i11 = org.telegram.ui.ActionBar.k6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    ((org.telegram.ui.Components.g90) this.f38949y.f12530c).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    ((org.telegram.ui.Components.g90) this.f38949y.f12530c).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21720gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    ((org.telegram.ui.Components.g90) this.f38949y.f12530c).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    ((org.telegram.ui.Components.g90) this.f38949y.f12530c).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21720gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z4) {
        if (z4 != this.f38943f) {
            this.f38943f = z4;
            this.f38942e.setPaused(z4);
            this.f38946s.invalidate();
        }
    }
}
