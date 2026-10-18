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
public abstract class a20 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public s4.b0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final w10 f35240a;
    public final w10 f35241b;
    public org.telegram.ui.Components.im0 f35242c;
    public Drawable d;
    public sg.x1 e;
    public boolean f35243f;
    public boolean h;
    public float f35244n;
    public int f35245r;
    public z10 f35246s;
    public float v;
    public final Canvas f35247w;
    public float f35248x;
    public ai.bd f35249y;

    public a20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.f35240a = new w10(i10, i11, i12, i13, null, 0);
        w10 w10Var = new w10(i10, i11, i12, i13, null, 1);
        this.f35241b = w10Var;
        this.f35247w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        w10Var.f46191n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f35246s = o0();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (d5Var2 != null && ((ActionBarLayout) d5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f35242c = new org.telegram.ui.Components.im0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.yz(this.f35242c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.b0();
        }
        this.f35242c.setLayoutManager(this.F);
        s4.b0 b0Var = this.F;
        if (b0Var instanceof org.telegram.ui.Components.yz) {
            ((org.telegram.ui.Components.yz) b0Var).R = true;
        }
        s4.g0 n02 = n0();
        this.f35242c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.s61) {
            org.telegram.ui.Components.im0 im0Var = this.f35242c;
            v10 v10Var = new v10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.im0 im0Var2 = this.f35242c;
            Objects.requireNonNull(im0Var2);
            im0Var.r1(v10Var, dp, dp2, new wt(im0Var2, 10), true);
        } else {
            this.f35242c.setSections(true);
        }
        this.f35242c.setClipToPadding(false);
        this.f35242c.j(new k3(this, 11));
        this.f35249y = new ai.bd(context);
        z10 z10Var = this.f35246s;
        sg.x1 p02 = p0();
        this.e = p02;
        z10Var.addView(p02, w7.z5.c(-2.0f, -1));
        this.f35246s.addView(this.f35249y, w7.z5.c(-2.0f, -1));
        this.f35246s.addView(this.f35242c, w7.z5.c(-1.0f, -1));
        this.f35246s.addView(this.actionBar);
        this.fragmentView = this.f35246s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 28));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 15), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
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
        org.telegram.ui.Components.im0 im0Var = this.f35242c;
        if (im0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            im0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, x5 x5Var) {
        ai.bd bdVar = this.f35249y;
        FrameLayout frameLayout2 = (FrameLayout) bdVar.e;
        FrameLayout frameLayout3 = (FrameLayout) bdVar.d;
        ((TextView) bdVar.f1048b).setText(str);
        org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) bdVar.f1049c;
        x90Var.setText(charSequence);
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (x5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(x5Var, w7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(x5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        bdVar.requestLayout();
    }

    public abstract s4.g0 n0();

    public z10 o0() {
        return new z10(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f35242c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        sg.x1 x1Var = this.e;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public sg.x1 p0() {
        return new gi.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        x10 x10Var = new x10(this, context, 0);
        x10Var.setTag(-33024);
        return x10Var;
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
        org.telegram.ui.Components.im0 im0Var = this.f35242c;
        if (im0Var != null && im0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f35242c.getChildCount()) {
                    view = this.f35242c.getChildAt(i11);
                    this.f35242c.getClass();
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
        int measuredWidth = this.f35246s.getMeasuredWidth();
        int measuredHeight = this.f35246s.getMeasuredHeight();
        w10 w10Var = this.f35241b;
        w10Var.d(0, (-f7) - ((this.f35246s.getMeasuredWidth() * 0.1f) * this.f35244n), 0, measuredWidth, -f10, measuredHeight);
        return w10Var.f46184f;
    }

    public final void v0() {
        if (this.f35246s.getMeasuredWidth() != 0 && this.f35246s.getMeasuredHeight() != 0 && this.f35249y != null) {
            int measuredWidth = this.f35246s.getMeasuredWidth();
            int measuredHeight = this.f35246s.getMeasuredHeight();
            w10 w10Var = this.f35240a;
            w10Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f35247w;
            canvas.save();
            canvas.scale(100.0f / this.f35246s.getMeasuredWidth(), 100.0f / this.f35246s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f35246s.getMeasuredWidth(), this.f35246s.getMeasuredHeight(), w10Var.f46184f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.f35249y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.h6.Tj;
            kVar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
            this.actionBar.B(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 60), false);
            this.e.f46497a.g();
            ai.bd bdVar = this.f35249y;
            if (bdVar != null) {
                TextView textView = (TextView) bdVar.f1048b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.x90) this.f35249y.f1049c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.x90) this.f35249y.f1049c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21045gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.x90) this.f35249y.f1049c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.x90) this.f35249y.f1049c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21045gc, false));
                }
            }
            v0();
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f35243f) {
            this.f35243f = z10;
            this.e.setPaused(z10);
            this.f35246s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
