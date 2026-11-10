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
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int D;
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.h6 M;
    public final org.telegram.ui.Components.v5 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public ug.y0 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.k9 f29277a;
    public final di.e4 f29278b;
    public final org.telegram.ui.ActionBar.m5 f29279c;
    public final wo d;
    public final org.telegram.ui.Components.v8 f29280e;
    public Object f29281f;
    public CharSequence h;
    public CharSequence f29282n;
    public boolean f29283r;
    public boolean f29284s;
    public final int f29285w;
    public final int f29286x;
    public String f29287y;

    public h4(Context context, int i7, int i10, boolean z9) {
        this(i7, i10, context, null, z9, false);
    }

    public static org.telegram.ui.Components.v8 a(boolean z9) {
        float f10;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.g(8);
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        v8Var.f38925p = f10;
        v8Var.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27835a8, false));
        return v8Var;
    }

    public static xp b(Context context, boolean z9) {
        xp xpVar = new xp(new fi.l3(new ug.y0(org.telegram.ui.ActionBar.m6.Ak, org.telegram.ui.ActionBar.m6.zk, -1, -1, null), 5), context.getResources().getDrawable(2131232362), 0, 0);
        if (z9) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            xpVar.f40377e = L;
            xpVar.f40378f = L2;
        }
        return xpVar;
    }

    public final void c(boolean z9, boolean z10) {
        float f10;
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, z10);
        } else if (this.f29285w == 2 && this.H != z9) {
            this.H = z9;
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.G.addListener(new m.a(this, 23));
                this.G.setDuration(180L);
                this.G.setInterpolator(wq.f40047g);
                this.G.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.H) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.k9 k9Var = this.f29277a;
                k9Var.setScaleX(f10);
                if (!this.H) {
                    f11 = 1.0f;
                }
                k9Var.setScaleY(f11);
                if (!this.H) {
                    f12 = 0.0f;
                }
                this.I = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f29281f = obj;
        this.f29282n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f29283r = false;
        this.f29284s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.N.d(this.O);
        if (d > 0.0f) {
            org.telegram.ui.Components.k9 k9Var = this.f29277a;
            float height = (k9Var.getHeight() / 2.0f) + k9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (k9Var.getWidth() / 2.0f) + k9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.m6.f28181t0;
            int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
            org.telegram.ui.ActionBar.h6 h6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.m6.f28181t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new ug.y0(org.telegram.ui.ActionBar.m6.zk, org.telegram.ui.ActionBar.m6.Ak, -1, -1, this.M);
                }
                this.S.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.S.f56877f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27874c8, h6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232242).mutate();
                this.T = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.T;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.T.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.T.setAlpha((int) (d * 255.0f));
            this.T.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z9) {
        d(tLObject, str, str2);
        this.E = z9;
    }

    public final void f(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f29281f instanceof TLRPC.User) {
                requirementToContact = qp.s1(this.f29286x).J2(((TLRPC.User) this.f29281f).f27109id);
            }
        }
        boolean z9 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.O == z9 && this.P == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.O = z9;
        this.P = org.telegram.messenger.m5.k(requirementToContact);
        this.N.f(this.O, true);
        invalidate();
    }

    public wo getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f29281f;
    }

    public org.telegram.ui.ActionBar.m5 getStatusTextView() {
        return this.f29279c;
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
        int i7 = (this.N.d(this.O) > 0.0f ? 1 : (this.N.d(this.O) == 0.0f ? 0 : -1));
        org.telegram.ui.ActionBar.h6 h6Var = this.M;
        if (i7 <= 0 && this.f29285w == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W6, h6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.k9 k9Var = this.f29277a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.I) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.E) {
            boolean z9 = id.f23161a0;
            int i10 = this.F;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.K) {
                org.telegram.ui.ActionBar.m6.f28032l0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ug, h6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28032l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.d;
        if (woVar != null) {
            z9 = woVar.f40026a.f31279q;
        } else {
            z9 = this.H;
        }
        if (z9) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        Object obj = this.f29281f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f29281f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z9) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.setEnabled(z9);
        }
    }

    public void setDrawDivider(boolean z9) {
        this.E = z9;
        invalidate();
    }

    public void setForbiddenCheck(boolean z9) {
        this.d.setForbidden(z9);
    }

    @Override
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.m5 m5Var = this.f29279c;
        if (m5Var != null) {
            try {
                if (this.f29281f != null && !this.f29283r && !this.f29284s && (textColor = m5Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    m5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.f29277a;
        if (k9Var != null) {
            k9Var.invalidate();
        }
        try {
            if (this.f29284s && k9Var != null) {
                Drawable t6 = k9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.v8) {
                    ((org.telegram.ui.Components.v8) t6).i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27835a8, false));
                    k9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        this.f29286x = p10.f24474s0;
        this.N = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
        this.M = h6Var;
        this.f29285w = i7;
        this.K = z10;
        this.E = false;
        this.F = i10;
        this.L = z9;
        this.f29280e = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29277a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = id.f23161a0;
        addView(k9Var, c8.ha.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 13, 6.0f, z11 ? i10 + 13 : 0.0f, 0.0f));
        di.e4 e4Var = new di.e4(context, 1);
        this.f29278b = e4Var;
        qs.i(e4Var);
        org.telegram.ui.ActionBar.t6.X(e4Var, z10 ? org.telegram.ui.ActionBar.m6.f27863bh : org.telegram.ui.ActionBar.m6.G6, h6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        e4Var.setGravity((id.f23161a0 ? 5 : 3) | 48);
        boolean z12 = id.f23161a0;
        addView(e4Var, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, (z12 ? 28 : 72) + i10, 10.0f, (z12 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f29279c = m5Var;
        m5Var.setTextSize(14);
        m5Var.setGravity((id.f23161a0 ? 5 : 3) | 48);
        boolean z13 = id.f23161a0;
        addView(m5Var, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 32.0f, (z13 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            wo woVar = new wo(21, context, h6Var);
            this.d = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28020k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z14 = id.f23161a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : i10 + 40, 33.0f, z14 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i7 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
