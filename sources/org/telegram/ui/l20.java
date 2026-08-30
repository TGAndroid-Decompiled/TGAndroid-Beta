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
public abstract class l20 extends org.telegram.ui.ActionBar.p2 {
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
    public final i20 f35879a;
    public final i20 f35880b;
    public org.telegram.ui.Components.sl0 f35881c;
    public Drawable d;
    public eg.q2 e;
    public boolean f35882f;
    public boolean h;
    public float f35883n;
    public int f35884r;
    public k20 f35885s;
    public float v;
    public final Canvas f35886w;
    public float f35887x;
    public kg.a f35888y;

    public l20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.j6.Pj;
        int i11 = org.telegram.ui.ActionBar.j6.Qj;
        int i12 = org.telegram.ui.ActionBar.j6.Rj;
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        this.f35879a = new i20(i10, i11, i12, i13, null, 0);
        i20 i20Var = new i20(i10, i11, i12, i13, null, 1);
        this.f35880b = i20Var;
        this.f35886w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.B = -1;
        this.D = true;
        this.H = new Paint();
        i20Var.f5464n = true;
        this.K = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.F = i10;
        this.f35885s = o0();
        org.telegram.ui.ActionBar.e5 e5Var2 = this.parentLayout;
        if (e5Var2 != null && ((ActionBarLayout) e5Var2).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f35881c = new org.telegram.ui.Components.sl0(context, null);
        if (this.D) {
            this.C = new org.telegram.ui.Components.pz(this.f35881c, (AndroidUtilities.dp(68.0f) + this.F) - AndroidUtilities.dp(16.0f));
        } else {
            this.C = new f2.i0();
        }
        this.f35881c.setLayoutManager(this.C);
        f2.i0 i0Var = this.C;
        if (i0Var instanceof org.telegram.ui.Components.pz) {
            ((org.telegram.ui.Components.pz) i0Var).R = true;
        }
        f2.o0 n02 = n0();
        this.f35881c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.w51) {
            org.telegram.ui.Components.sl0 sl0Var = this.f35881c;
            h20 h20Var = new h20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.sl0 sl0Var2 = this.f35881c;
            Objects.requireNonNull(sl0Var2);
            sl0Var.r1(h20Var, dp, dp2, new fu(sl0Var2, 10), true);
        } else {
            this.f35881c.setSections(true);
        }
        this.f35881c.setClipToPadding(false);
        this.f35881c.j(new l3(this, 11));
        this.f35888y = new kg.a(context);
        k20 k20Var = this.f35885s;
        eg.q2 p02 = p0();
        this.e = p02;
        k20Var.addView(p02, k7.b6.c(-2.0f, -1));
        this.f35885s.addView(this.f35888y, k7.b6.c(-2.0f, -1));
        this.f35885s.addView(this.f35881c, k7.b6.c(-1.0f, -1));
        this.f35885s.addView(this.actionBar);
        this.fragmentView = this.f35885s;
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
        org.telegram.ui.Components.sl0 sl0Var = this.f35881c;
        if (sl0Var != null && this.C != null && this.K >= 0) {
            int i10 = this.L;
            sl0Var.K(0);
            this.C.h1(this.K, i10);
            this.K = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, w5 w5Var) {
        kg.a aVar = this.f35888y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f10409b).setText(str);
        org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) aVar.f10410c;
        e90Var.setText(charSequence);
        e90Var.setMaxWidth(ph.f3.a(e90Var.getText(), e90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, k7.b6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (w5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(w5Var, k7.b6.e(-1, -2, 1));
            frameLayout2.setClickable(w5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.o0 n0();

    public k20 o0() {
        return new k20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f35881c.setPadding(0, 0, 0, i13);
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
        org.telegram.ui.Components.sl0 sl0Var = this.f35881c;
        if (sl0Var != null && sl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f35881c.getChildCount()) {
                    view = this.f35881c.getChildAt(i11);
                    this.f35881c.getClass();
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
        int measuredWidth = this.f35885s.getMeasuredWidth();
        int measuredHeight = this.f35885s.getMeasuredHeight();
        i20 i20Var = this.f35880b;
        i20Var.d(0, (-f10) - ((this.f35885s.getMeasuredWidth() * 0.1f) * this.f35883n), 0, measuredWidth, -f11, measuredHeight);
        return i20Var.f5457f;
    }

    public final void u0() {
        if (this.f35885s.getMeasuredWidth() != 0 && this.f35885s.getMeasuredHeight() != 0 && this.f35888y != null) {
            int measuredWidth = this.f35885s.getMeasuredWidth();
            int measuredHeight = this.f35885s.getMeasuredHeight();
            i20 i20Var = this.f35879a;
            i20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35886w;
            canvas.save();
            canvas.scale(100.0f / this.f35885s.getMeasuredWidth(), 100.0f / this.f35885s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f35885s.getMeasuredWidth(), this.f35885s.getMeasuredHeight(), i20Var.f5457f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f35888y != null && this.actionBar != null) {
            this.H.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.Tj;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
            this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 60), false);
            this.e.f5468a.g();
            kg.a aVar = this.f35888y;
            if (aVar != null) {
                TextView textView = (TextView) aVar.f10409b;
                if (this.J) {
                    int i11 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.e90) this.f35888y.f10410c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.e90) this.f35888y.f10410c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.e90) this.f35888y.f10410c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.e90) this.f35888y.f10410c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z4) {
        if (z4 != this.f35882f) {
            this.f35882f = z4;
            this.e.setPaused(z4);
            this.f35885s.invalidate();
        }
    }
}
