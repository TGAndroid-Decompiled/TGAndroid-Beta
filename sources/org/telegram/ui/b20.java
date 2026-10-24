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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class b20 extends org.telegram.ui.ActionBar.o2 {
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
    public int P;
    public int Q;
    public final y10 f35892a;
    public final y10 f35893b;
    public org.telegram.ui.Components.lm0 f35894c;
    public Drawable d;
    public sg.x1 e;
    public boolean f35895f;
    public boolean h;
    public float f35896n;
    public int f35897r;
    public a20 f35898s;
    public float v;
    public final Canvas f35899w;
    public float f35900x;
    public ai.cd f35901y;

    public b20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.k6.Pj;
        int i11 = org.telegram.ui.ActionBar.k6.Qj;
        int i12 = org.telegram.ui.ActionBar.k6.Rj;
        int i13 = org.telegram.ui.ActionBar.k6.Sj;
        this.f35892a = new y10(i10, i11, i12, i13, null, 0);
        y10 y10Var = new y10(i10, i11, i12, i13, null, 1);
        this.f35893b = y10Var;
        this.f35899w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        y10Var.f46625n = true;
        this.P = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        this.O = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f35898s = o0();
        org.telegram.ui.ActionBar.h5 h5Var2 = this.parentLayout;
        if (h5Var2 != null && ((ActionBarLayout) h5Var2).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f35894c = new org.telegram.ui.Components.lm0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.wz(this.f35894c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.b0();
        }
        this.f35894c.setLayoutManager(this.F);
        s4.b0 b0Var = this.F;
        if (b0Var instanceof org.telegram.ui.Components.wz) {
            ((org.telegram.ui.Components.wz) b0Var).R = true;
        }
        s4.g0 n02 = n0();
        this.f35894c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.a71) {
            org.telegram.ui.Components.lm0 lm0Var = this.f35894c;
            x10 x10Var = new x10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.lm0 lm0Var2 = this.f35894c;
            Objects.requireNonNull(lm0Var2);
            lm0Var.v1(x10Var, dp, dp2, new xt(lm0Var2, 10), true);
        } else {
            this.f35894c.setSections(true);
        }
        this.f35894c.setClipToPadding(false);
        this.f35894c.j(new j3(this, 11));
        this.f35901y = new ai.cd(context);
        a20 a20Var = this.f35898s;
        sg.x1 p02 = p0();
        this.e = p02;
        a20Var.addView(p02, w7.z5.c(-2.0f, -1));
        this.f35898s.addView(this.f35901y, w7.z5.c(-2.0f, -1));
        this.f35898s.addView(this.f35894c, w7.z5.c(-1.0f, -1));
        this.f35898s.addView(this.actionBar);
        this.fragmentView = this.f35898s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 28));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(9, this), org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, org.telegram.ui.ActionBar.k6.Nj, org.telegram.ui.ActionBar.k6.Oj, org.telegram.ui.ActionBar.k6.Pj, org.telegram.ui.ActionBar.k6.Qj, org.telegram.ui.ActionBar.k6.Rj, org.telegram.ui.ActionBar.k6.Sj, org.telegram.ui.ActionBar.k6.Tj, org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Uj, org.telegram.ui.ActionBar.k6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.k6.I.q()) {
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
        org.telegram.ui.Components.lm0 lm0Var = this.f35894c;
        if (lm0Var != null && this.F != null && this.P >= 0) {
            int i10 = this.Q;
            lm0Var.K(0);
            this.F.h1(this.P, i10);
            this.P = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, w5 w5Var) {
        ai.cd cdVar = this.f35901y;
        FrameLayout frameLayout2 = (FrameLayout) cdVar.e;
        FrameLayout frameLayout3 = (FrameLayout) cdVar.d;
        ((TextView) cdVar.f1112b).setText(str);
        org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) cdVar.f1113c;
        w90Var.setText(charSequence);
        w90Var.setMaxWidth(ei.x3.a(w90Var.getText(), w90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (w5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(w5Var, w7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(w5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        cdVar.requestLayout();
    }

    public abstract s4.g0 n0();

    public a20 o0() {
        return new a20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f35894c.setPadding(0, 0, 0, i13);
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

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.O) {
                this.O = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            sg.x1 x1Var = this.e;
            if (x1Var != null && x1Var.f46938a != null && this.f35898s != null) {
                w0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public sg.x1 p0() {
        return new gi.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        ai.jc jcVar = new ai.jc(this, context, 29);
        jcVar.setTag(-33024);
        return jcVar;
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
        org.telegram.ui.Components.lm0 lm0Var = this.f35894c;
        if (lm0Var != null && lm0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f35894c.getChildCount()) {
                    view = this.f35894c.getChildAt(i11);
                    this.f35894c.getClass();
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

    public final Paint u0(float f7, float f10) {
        int measuredWidth = this.f35898s.getMeasuredWidth();
        int measuredHeight = this.f35898s.getMeasuredHeight();
        y10 y10Var = this.f35893b;
        y10Var.d(0, (-f7) - ((this.f35898s.getMeasuredWidth() * 0.1f) * this.f35896n), 0, measuredWidth, -f10, measuredHeight);
        return y10Var.f46618f;
    }

    public final void v0() {
        if (this.f35898s.getMeasuredWidth() != 0 && this.f35898s.getMeasuredHeight() != 0 && this.f35901y != null) {
            this.f35892a.d(0, 0.0f, 0, this.f35898s.getMeasuredWidth(), 0.0f, this.f35898s.getMeasuredHeight());
            Canvas canvas = this.f35899w;
            canvas.save();
            canvas.scale(100.0f / this.f35898s.getMeasuredWidth(), 100.0f / this.f35898s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f35898s.getMeasuredWidth(), this.f35898s.getMeasuredHeight(), this.f35892a.f46618f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.f35901y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
            int i10 = org.telegram.ui.ActionBar.k6.Tj;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            if (x02 != this.N) {
                this.N = x02;
                this.actionBar.B(x02, false);
            }
            int o10 = i0.a.o(x02, 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f21073p0 != o10) {
                kVar.A(o10, false);
            }
            this.e.f46938a.g();
            ai.cd cdVar = this.f35901y;
            if (cdVar != null) {
                TextView textView = (TextView) cdVar.f1112b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.k6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                    ((org.telegram.ui.Components.w90) this.f35901y.f1113c).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                    ((org.telegram.ui.Components.w90) this.f35901y.f1113c).setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21243gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                    ((org.telegram.ui.Components.w90) this.f35901y.f1113c).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                    ((org.telegram.ui.Components.w90) this.f35901y.f1113c).setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21243gc, false));
                }
            }
            v0();
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f35895f) {
            this.f35895f = z10;
            this.e.setPaused(z10);
            this.f35898s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
