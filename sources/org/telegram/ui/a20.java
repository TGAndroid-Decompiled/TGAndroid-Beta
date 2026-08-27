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
    public int A;
    public f2.k0 B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final Paint G;
    public int H;
    public boolean I;
    public int J;
    public int K;

    public final x10 f36340a;

    public final x10 f36341b;

    public org.telegram.ui.Components.zk0 f36342c;
    public Drawable d;

    public ag.k3 f36343e;

    public boolean f36344f;
    public boolean h;

    public float f36345n;

    public int f36346r;

    public z10 f36347s;
    public float v;

    public final Canvas f36348w;

    public float f36349x;

    public gg.a f36350y;

    public a20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.g6.Pj;
        int i11 = org.telegram.ui.ActionBar.g6.Qj;
        int i12 = org.telegram.ui.ActionBar.g6.Rj;
        int i13 = org.telegram.ui.ActionBar.g6.Sj;
        this.f36340a = new x10(i10, i11, i12, i13, null, 0);
        x10 x10Var = new x10(i10, i11, i12, i13, null, 1);
        this.f36341b = x10Var;
        this.f36348w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.A = -1;
        this.C = true;
        this.G = new Paint();
        x10Var.f465n = true;
        this.J = -1;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable drawableMutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        this.E = (b5Var == null || !((ActionBarLayout) b5Var).I0) ? AndroidUtilities.statusBarHeight : 0;
        this.f36347s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f36342c = new org.telegram.ui.Components.zk0(context, null);
        if (this.C) {
            this.B = new org.telegram.ui.Components.dz(this.f36342c, (AndroidUtilities.dp(68.0f) + this.E) - AndroidUtilities.dp(16.0f));
        } else {
            this.B = new f2.k0();
        }
        this.f36342c.setLayoutManager(this.B);
        f2.k0 k0Var = this.B;
        if (k0Var instanceof org.telegram.ui.Components.dz) {
            ((org.telegram.ui.Components.dz) k0Var).R = true;
        }
        f2.q0 q0VarN0 = n0();
        this.f36342c.setAdapter(q0VarN0);
        if (q0VarN0 instanceof org.telegram.ui.Components.b51) {
            org.telegram.ui.Components.zk0 zk0Var = this.f36342c;
            w10 w10Var = new w10(this, 0);
            int iDp = AndroidUtilities.dp(12.0f);
            float fDp = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.zk0 zk0Var2 = this.f36342c;
            Objects.requireNonNull(zk0Var2);
            zk0Var.r1(w10Var, iDp, fDp, new zt(zk0Var2, 10), true);
        } else {
            this.f36342c.setSections(true);
        }
        this.f36342c.setClipToPadding(false);
        this.f36342c.j(new m3(this, 11));
        this.f36350y = new gg.a(context);
        z10 z10Var = this.f36347s;
        ag.k3 k3VarP0 = p0();
        this.f36343e = k3VarP0;
        z10Var.addView(k3VarP0, h7.z5.c(-2.0f, -1));
        this.f36347s.addView(this.f36350y, h7.z5.c(-2.0f, -1));
        this.f36347s.addView(this.f36342c, h7.z5.c(-1.0f, -1));
        this.f36347s.addView(this.actionBar);
        this.fragmentView = this.f36347s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 21));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 15), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.I && !org.telegram.ui.ActionBar.g6.I.q();
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
        org.telegram.ui.Components.zk0 zk0Var = this.f36342c;
        if (zk0Var == null || this.B == null || this.J < 0) {
            return;
        }
        int i10 = this.K;
        zk0Var.K(0);
        this.B.h1(this.J, i10);
        this.J = -1;
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        gg.a aVar = this.f36350y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f7076e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f7074b).setText(str);
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) aVar.f7075c;
        p80Var.setText(charSequence);
        p80Var.setMaxWidth(lh.w3.a(p80Var.getText(), p80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, h7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, h7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.q0 n0();

    public z10 o0() {
        return new z10(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f36342c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        ag.k3 k3Var = this.f36343e;
        if (k3Var != null) {
            k3Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f36343e.setPaused(false);
    }

    public ag.k3 p0() {
        return new ag.j(getParentActivity(), 4);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        ag.s0 s0Var = new ag.s0(this, context, 28);
        s0Var.setTag(-33024);
        return s0Var;
    }

    public final void s0() {
        View childAt;
        int iR;
        org.telegram.ui.Components.zk0 zk0Var = this.f36342c;
        if (zk0Var == null || zk0Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f36342c.getChildCount()) {
                childAt = null;
                iR = -1;
                break;
            }
            childAt = this.f36342c.getChildAt(i10);
            this.f36342c.getClass();
            iR = RecyclerView.R(childAt);
            if (iR >= 0 && childAt.getTop() < Integer.MAX_VALUE) {
                childAt.getTop();
                break;
            }
            i10++;
        }
        if (childAt != null) {
            this.J = iR;
            this.K = childAt.getTop();
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        Dialog dialogShowDialog = super.showDialog(dialog);
        w0(dialogShowDialog != null);
        return dialogShowDialog;
    }

    public final Paint t0(float f10, float f11) {
        int measuredWidth = this.f36347s.getMeasuredWidth();
        int measuredHeight = this.f36347s.getMeasuredHeight();
        x10 x10Var = this.f36341b;
        x10Var.d(0, (-f10) - ((this.f36347s.getMeasuredWidth() * 0.1f) * this.f36345n), 0, measuredWidth, -f11, measuredHeight);
        return x10Var.f458f;
    }

    public final void u0() {
        if (this.f36347s.getMeasuredWidth() == 0 || this.f36347s.getMeasuredHeight() == 0 || this.f36350y == null) {
            return;
        }
        int measuredWidth = this.f36347s.getMeasuredWidth();
        int measuredHeight = this.f36347s.getMeasuredHeight();
        x10 x10Var = this.f36340a;
        x10Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.f36348w;
        canvas.save();
        canvas.scale(100.0f / this.f36347s.getMeasuredWidth(), 100.0f / this.f36347s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.f36347s.getMeasuredWidth(), this.f36347s.getMeasuredHeight(), x10Var.f458f);
        canvas.restore();
    }

    public final void v0() {
        if (this.f36350y == null || this.actionBar == null) {
            return;
        }
        this.G.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.Tj;
        kVar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 60), false);
        this.f36343e.f540a.g();
        gg.a aVar = this.f36350y;
        if (aVar != null) {
            TextView textView = (TextView) aVar.f7074b;
            if (this.I) {
                int i11 = org.telegram.ui.ActionBar.g6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                ((org.telegram.ui.Components.p80) this.f36350y.f7075c).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                ((org.telegram.ui.Components.p80) this.f36350y.f7075c).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
            } else {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                ((org.telegram.ui.Components.p80) this.f36350y.f7075c).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                ((org.telegram.ui.Components.p80) this.f36350y.f7075c).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
            }
        }
        u0();
    }

    public final void w0(boolean z10) {
        if (z10 != this.f36344f) {
            this.f36344f = z10;
            this.f36343e.setPaused(z10);
            this.f36347s.invalidate();
        }
    }
}
