package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public boolean F;
    public final int G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final org.telegram.ui.ActionBar.e6 N;
    public final org.telegram.ui.Components.u5 O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public vg.x0 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.k9 f29326a;
    public final ei.e4 f29327b;
    public final org.telegram.ui.ActionBar.k5 f29328c;
    public final wo d;
    public final org.telegram.ui.Components.u8 f29329e;
    public Object f29330f;
    public CharSequence h;
    public CharSequence f29331n;
    public boolean f29332r;
    public boolean f29333s;
    public final int f29334w;
    public final int f29335x;
    public String f29336y;

    public h4(Context context, int i3, int i10, boolean z10) {
        this(i3, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.u8 a(boolean z10) {
        float f10;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.g(8);
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        u8Var.f38691p = f10;
        u8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27825a8, false));
        return u8Var;
    }

    public static xp b(Context context, boolean z10) {
        xp xpVar = new xp(new gi.k3(new vg.x0(org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.zk, -1, -1, null), 5), context.getResources().getDrawable(2131232362), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            xpVar.f40441e = L;
            xpVar.f40442f = L2;
        }
        return xpVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z10, z11);
        } else if (this.f29334w == 2 && this.I != z10) {
            this.I = z10;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.H.addListener(new ii.v3(this, 24));
                this.H.setDuration(180L);
                this.H.setInterpolator(xq.f40453g);
                this.H.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.I) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.k9 k9Var = this.f29326a;
                k9Var.setScaleX(f10);
                if (!this.I) {
                    f11 = 1.0f;
                }
                k9Var.setScaleY(f11);
                if (!this.I) {
                    f12 = 0.0f;
                }
                this.J = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f29330f = obj;
        this.f29331n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.f29332r = false;
        this.f29333s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            org.telegram.ui.Components.k9 k9Var = this.f29326a;
            float height = (k9Var.getHeight() / 2.0f) + k9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (k9Var.getWidth() / 2.0f) + k9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.k6.f28171t0;
            int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.f28171t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f56911f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27863c8, e6Var));
                paint = this.V;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232242).mutate();
                this.U = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.U;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.U.setAlpha((int) (d * 255.0f));
            this.U.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.F = z10;
    }

    public final void f(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f29330f instanceof TLRPC.User) {
                requirementToContact = hp.s1(this.f29335x).J2(((TLRPC.User) this.f29330f).f27150id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z10 && this.Q == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.P = z10;
        this.Q = org.telegram.messenger.m5.k(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public wo getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f29330f;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f29328c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        float f11 = 0.0f;
        int i3 = (this.O.d(this.P) > 0.0f ? 1 : (this.O.d(this.P) == 0.0f ? 0 : -1));
        org.telegram.ui.ActionBar.e6 e6Var = this.N;
        if (i3 <= 0 && this.f29334w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W6, e6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.k9 k9Var = this.f29326a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = bd.f21784a0;
            int i10 = this.G;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.L) {
                org.telegram.ui.ActionBar.k6.f28020l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ug, e6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28020l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.d;
        if (woVar != null) {
            z10 = woVar.f40035a.f31334q;
        } else {
            z10 = this.I;
        }
        if (z10) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        Object obj = this.f29330f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f29330f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    @Override
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29328c;
        if (k5Var != null) {
            try {
                if (this.f29330f != null && !this.f29332r && !this.f29333s && (textColor = k5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    k5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.f29326a;
        if (k9Var != null) {
            k9Var.invalidate();
        }
        try {
            if (this.f29333s && k9Var != null) {
                Drawable t10 = k9Var.getImageReceiver().t();
                if (t10 instanceof org.telegram.ui.Components.u8) {
                    ((org.telegram.ui.Components.u8) t10).i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27825a8, false));
                    k9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f29335x = h10.f22829t0;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.N = e6Var;
        this.f29334w = i3;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.f29329e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29326a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = bd.f21784a0;
        addView(k9Var, mf.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 1);
        this.f29327b = e4Var;
        hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, z11 ? org.telegram.ui.ActionBar.k6.f27853bh : org.telegram.ui.ActionBar.k6.G6, e6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        e4Var.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        boolean z13 = bd.f21784a0;
        addView(e4Var, mf.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29328c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        boolean z14 = bd.f21784a0;
        addView(k5Var, mf.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i3 == 1) {
            wo woVar = new wo(21, context, e6Var);
            this.d = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z15 = bd.f21784a0;
            addView(woVar, mf.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i3 == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
