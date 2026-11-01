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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
public final class j4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.p6 M;
    public final org.telegram.ui.Components.t5 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public kg.k1 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.g9 f22075a;
    public final og.c f22076b;
    public final org.telegram.ui.ActionBar.u5 f22077c;
    public final ep d;
    public final org.telegram.ui.Components.r8 e;
    public Object f22078f;
    public CharSequence h;
    public CharSequence f22079n;
    public boolean f22080r;
    public boolean f22081s;
    public final int f22082w;
    public final int f22083x;
    public String f22084y;

    public j4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.r8 a(boolean z10) {
        float f7;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.g(8);
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.1f;
        }
        r8Var.f29927p = f7;
        r8Var.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20874a8, false));
        return r8Var;
    }

    public static eq b(Context context, boolean z10) {
        eq eqVar = new eq(new jg.x0(new kg.k1(org.telegram.ui.ActionBar.t6.Ak, org.telegram.ui.ActionBar.t6.zk, -1, -1, null), 5), context.getResources().getDrawable(2131232361), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.i0.L(18.0f);
            int L2 = org.telegram.messenger.i0.L(18.0f);
            eqVar.e = L;
            eqVar.f25904f = L2;
        }
        return eqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, z11);
        } else if (this.f22082w == 2 && this.H != z10) {
            this.H = z10;
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.G.addListener(new org.telegram.ui.s9(this, 4));
                this.G.setDuration(180L);
                this.G.setInterpolator(gr.f26524g);
                this.G.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.H) {
                    f7 = 0.82f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.Components.g9 g9Var = this.f22075a;
                g9Var.setScaleX(f7);
                if (!this.H) {
                    f10 = 1.0f;
                }
                g9Var.setScaleY(f10);
                if (!this.H) {
                    f11 = 0.0f;
                }
                this.I = f11;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f22078f = obj;
        this.f22079n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f22080r = false;
        this.f22081s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.N.d(this.O);
        if (d > 0.0f) {
            org.telegram.ui.Components.g9 g9Var = this.f22075a;
            float height = (g9Var.getHeight() / 2.0f) + g9Var.getY() + org.telegram.messenger.i0.L(18.0f);
            float width = (g9Var.getWidth() / 2.0f) + g9Var.getX() + org.telegram.messenger.i0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.t6.f21218t0;
            int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.p6 p6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.i0.L(11.33f) * d, org.telegram.ui.ActionBar.t6.f21218t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, this.M);
                }
                this.S.d((int) (width - org.telegram.messenger.i0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.i0.L(10.0f)), (int) (org.telegram.messenger.i0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.i0.L(10.0f) + height));
                paint = this.S.f11143f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20913c8, p6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.i0.L(10.0f) * d, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232241).mutate();
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

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.E = z10;
    }

    public final void f(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f22078f instanceof TLRPC.User) {
                requirementToContact = wp.r1(this.f22083x).H2(((TLRPC.User) this.f22078f).f19943id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.O == z10 && this.P == org.telegram.messenger.o5.k(requirementToContact)) {
            return;
        }
        this.O = z10;
        this.P = org.telegram.messenger.o5.k(requirementToContact);
        this.N.f(this.O, true);
        invalidate();
    }

    public ep getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f22078f;
    }

    public org.telegram.ui.ActionBar.u5 getStatusTextView() {
        return this.f22077c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        float f10 = 0.0f;
        int i10 = (this.N.d(this.O) > 0.0f ? 1 : (this.N.d(this.O) == 0.0f ? 0 : -1));
        org.telegram.ui.ActionBar.p6 p6Var = this.M;
        if (i10 <= 0 && this.f22082w == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W6, p6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.g9 g9Var = this.f22075a;
            canvas.drawCircle((g9Var.getMeasuredWidth() / 2) + g9Var.getLeft(), (g9Var.getMeasuredHeight() / 2) + g9Var.getTop(), (org.telegram.messenger.i0.L(4.0f) * this.I) + org.telegram.messenger.i0.L(18.0f), paint);
        }
        if (this.E) {
            boolean z10 = dd.X;
            int i11 = this.F;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = i11 + 72;
            }
            int L = org.telegram.messenger.i0.L(f7);
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                f10 = i11 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.i0.L(f10);
            if (this.K) {
                org.telegram.ui.ActionBar.t6.f21073l0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ug, p6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21073l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.d;
        if (epVar != null) {
            z10 = epVar.f25895a.f23920q;
        } else {
            z10 = this.H;
        }
        if (z10) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        Object obj = this.f22078f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f22078f)) {
            f7 = 50.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        ep epVar = this.d;
        if (epVar != null) {
            epVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    @Override
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22077c;
        if (u5Var != null) {
            try {
                if (this.f22078f != null && !this.f22080r && !this.f22081s && (textColor = u5Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    u5Var.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.f22075a;
        if (g9Var != null) {
            g9Var.invalidate();
        }
        try {
            if (this.f22081s && g9Var != null) {
                Drawable t10 = g9Var.getImageReceiver().t();
                if (t10 instanceof org.telegram.ui.Components.r8) {
                    ((org.telegram.ui.Components.r8) t10).i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20874a8, false));
                    g9Var.invalidate();
                }
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public j4(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.f22083x = e20.f15506s0;
        this.N = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.M = p6Var;
        this.f22082w = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22075a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z12 = dd.X;
        addView(g9Var, w7.b6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        og.c cVar = new og.c(context, 1);
        this.f22076b = cVar;
        at.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, z11 ? org.telegram.ui.ActionBar.t6.f20902bh : org.telegram.ui.ActionBar.t6.G6, p6Var);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setTextSize(16);
        cVar.setGravity((dd.X ? 5 : 3) | 48);
        boolean z13 = dd.X;
        addView(cVar, w7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f22077c = u5Var;
        u5Var.setTextSize(14);
        u5Var.setGravity((dd.X ? 5 : 3) | 48);
        boolean z14 = dd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            ep epVar = new ep(21, context, p6Var);
            this.d = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.f21060k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z15 = dd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
