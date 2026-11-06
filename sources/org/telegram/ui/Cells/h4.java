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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final org.telegram.ui.Components.w5 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public ug.y0 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.l9 f29259a;
    public final di.d4 f29260b;
    public final org.telegram.ui.ActionBar.k5 f29261c;
    public final wo d;
    public final org.telegram.ui.Components.w8 f29262e;
    public Object f29263f;
    public CharSequence h;
    public CharSequence f29264n;
    public boolean f29265r;
    public boolean f29266s;
    public final int f29267w;
    public final int f29268x;
    public String f29269y;

    public h4(Context context, int i7, int i10, boolean z9) {
        this(i7, i10, context, null, z9, false);
    }

    public static org.telegram.ui.Components.w8 a(boolean z9) {
        float f10;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.g(8);
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        w8Var.f39920p = f10;
        w8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27794a8, false));
        return w8Var;
    }

    public static xp b(Context context, boolean z9) {
        xp xpVar = new xp(new fi.l3(new ug.y0(org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.zk, -1, -1, null), 5), context.getResources().getDrawable(2131232362), 0, 0);
        if (z9) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            xpVar.f40334e = L;
            xpVar.f40335f = L2;
        }
        return xpVar;
    }

    public final void c(boolean z9, boolean z10) {
        float f10;
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, z10);
        } else if (this.f29267w == 2 && this.H != z9) {
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
                this.G.setInterpolator(xq.f40346g);
                this.G.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.H) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.l9 l9Var = this.f29259a;
                l9Var.setScaleX(f10);
                if (!this.H) {
                    f11 = 1.0f;
                }
                l9Var.setScaleY(f11);
                if (!this.H) {
                    f12 = 0.0f;
                }
                this.I = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f29263f = obj;
        this.f29264n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f29265r = false;
        this.f29266s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.N.d(this.O);
        if (d > 0.0f) {
            org.telegram.ui.Components.l9 l9Var = this.f29259a;
            float height = (l9Var.getHeight() / 2.0f) + l9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (l9Var.getWidth() / 2.0f) + l9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.k6.f28140t0;
            int i7 = org.telegram.ui.ActionBar.k6.f27849d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.f28140t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.M);
                }
                this.S.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.S.f56776f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27833c8, f6Var));
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
            } else if (this.f29263f instanceof TLRPC.User) {
                requirementToContact = qp.s1(this.f29268x).J2(((TLRPC.User) this.f29263f).f27102id);
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
        return this.f29263f;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f29261c;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        if (i7 <= 0 && this.f29267w == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W6, f6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.l9 l9Var = this.f29259a;
            canvas.drawCircle((l9Var.getMeasuredWidth() / 2) + l9Var.getLeft(), (l9Var.getMeasuredHeight() / 2) + l9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.I) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.E) {
            boolean z9 = hd.f22878a0;
            int i10 = this.F;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (hd.f22878a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.K) {
                org.telegram.ui.ActionBar.k6.f27991l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ug, f6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27991l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.d;
        if (woVar != null) {
            z9 = woVar.f40058a.f31259q;
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
        Object obj = this.f29263f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f29263f)) {
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f29261c;
        if (k5Var != null) {
            try {
                if (this.f29263f != null && !this.f29265r && !this.f29266s && (textColor = k5Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    k5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.f29259a;
        if (l9Var != null) {
            l9Var.invalidate();
        }
        try {
            if (this.f29266s && l9Var != null) {
                Drawable t6 = l9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.w8) {
                    ((org.telegram.ui.Components.w8) t6).i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27794a8, false));
                    l9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.f29268x = p10.f24467s0;
        this.N = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.M = f6Var;
        this.f29267w = i7;
        this.K = z10;
        this.E = false;
        this.F = i10;
        this.L = z9;
        this.f29262e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29259a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = hd.f22878a0;
        addView(l9Var, c8.ha.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 13, 6.0f, z11 ? i10 + 13 : 0.0f, 0.0f));
        di.d4 d4Var = new di.d4(context, 1);
        this.f29260b = d4Var;
        qs.i(d4Var);
        org.telegram.ui.ActionBar.r6.Y(d4Var, z10 ? org.telegram.ui.ActionBar.k6.f27822bh : org.telegram.ui.ActionBar.k6.G6, f6Var);
        d4Var.setTypeface(org.telegram.messenger.g0.o());
        d4Var.setTextSize(16);
        d4Var.setGravity((hd.f22878a0 ? 5 : 3) | 48);
        boolean z12 = hd.f22878a0;
        addView(d4Var, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, (z12 ? 28 : 72) + i10, 10.0f, (z12 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29261c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((hd.f22878a0 ? 5 : 3) | 48);
        boolean z13 = hd.f22878a0;
        addView(k5Var, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 32.0f, (z13 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            wo woVar = new wo(21, context, f6Var);
            this.d = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27849d6, org.telegram.ui.ActionBar.k6.f27979k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z14 = hd.f22878a0;
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
