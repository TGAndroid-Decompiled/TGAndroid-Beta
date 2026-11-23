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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lq;
public final class i4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public boolean F;
    public final int G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final org.telegram.ui.ActionBar.i6 N;
    public final org.telegram.ui.Components.c6 O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public ug.a1 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.p9 f30897a;
    public final fi.u3 f30898b;
    public final org.telegram.ui.ActionBar.n5 f30899c;
    public final lp d;
    public final org.telegram.ui.Components.a9 f30900e;
    public Object f30901f;
    public CharSequence h;
    public CharSequence f30902n;
    public boolean f30903r;
    public boolean f30904s;
    public final int f30905w;
    public final int f30906x;
    public String f30907y;

    public i4(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.a9 a(boolean z10) {
        float f10;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.g(8);
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        a9Var.f33433p = f10;
        a9Var.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29395a8, false));
        return a9Var;
    }

    public static lq b(Context context, boolean z10) {
        lq lqVar = new lq(new hi.t3(new ug.a1(org.telegram.ui.ActionBar.n6.Dk, org.telegram.ui.ActionBar.n6.Ck, -1, -1, null), 5), context.getResources().getDrawable(2131232367), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            lqVar.f37198e = L;
            lqVar.f37199f = L2;
        }
        return lqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        lp lpVar = this.d;
        if (lpVar != null) {
            lpVar.a(z10, z11);
        } else if (this.f30905w == 2 && this.I != z10) {
            this.I = z10;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.H.addListener(new ki.n3(this, 24));
                this.H.setDuration(180L);
                this.H.setInterpolator(kr.f36859g);
                this.H.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.I) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.p9 p9Var = this.f30897a;
                p9Var.setScaleX(f10);
                if (!this.I) {
                    f11 = 1.0f;
                }
                p9Var.setScaleY(f11);
                if (!this.I) {
                    f12 = 0.0f;
                }
                this.J = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f30901f = obj;
        this.f30902n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.f30903r = false;
        this.f30904s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            org.telegram.ui.Components.p9 p9Var = this.f30897a;
            float height = (p9Var.getHeight() / 2.0f) + p9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (p9Var.getWidth() / 2.0f) + p9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.n6.f29742t0;
            int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
            org.telegram.ui.ActionBar.i6 i6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.n6.f29742t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new ug.a1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f58727f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29435c8, i6Var));
                paint = this.V;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232247).mutate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f30901f instanceof TLRPC.User) {
                requirementToContact = mp.u1(this.f30906x).P2(((TLRPC.User) this.f30901f).f28641id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z10 && this.Q == org.telegram.messenger.n5.k(requirementToContact)) {
            return;
        }
        this.P = z10;
        this.Q = org.telegram.messenger.n5.k(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public lp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f30901f;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
        return this.f30899c;
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
        int i7 = (this.O.d(this.P) > 0.0f ? 1 : (this.O.d(this.P) == 0.0f ? 0 : -1));
        org.telegram.ui.ActionBar.i6 i6Var = this.N;
        if (i7 <= 0 && this.f30905w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W6, i6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.p9 p9Var = this.f30897a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = gd.f24314a0;
            int i10 = this.G;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.L) {
                org.telegram.ui.ActionBar.n6.f29593l0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xg, i6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29593l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lp lpVar = this.d;
        if (lpVar != null) {
            z10 = lpVar.f37189a.f32938q;
        } else {
            z10 = this.I;
        }
        if (z10) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        Object obj = this.f30901f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f30901f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        lp lpVar = this.d;
        if (lpVar != null) {
            lpVar.setEnabled(z10);
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f30899c;
        if (n5Var != null) {
            try {
                if (this.f30901f != null && !this.f30903r && !this.f30904s && (textColor = n5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    n5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.p9 p9Var = this.f30897a;
        if (p9Var != null) {
            p9Var.invalidate();
        }
        try {
            if (this.f30904s && p9Var != null) {
                Drawable t6 = p9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.a9) {
                    ((org.telegram.ui.Components.a9) t6).i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29395a8, false));
                    p9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public i4(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        this.f30906x = i10.f24637t0;
        this.O = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        this.N = i6Var;
        this.f30905w = i7;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.f30900e = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f30897a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = gd.f24314a0;
        addView(p9Var, c8.na.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 1);
        this.f30898b = u3Var;
        ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, z11 ? org.telegram.ui.ActionBar.n6.f29480eh : org.telegram.ui.ActionBar.n6.G6, i6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        u3Var.setGravity((gd.f24314a0 ? 5 : 3) | 48);
        boolean z13 = gd.f24314a0;
        addView(u3Var, c8.na.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30899c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setGravity((gd.f24314a0 ? 5 : 3) | 48);
        boolean z14 = gd.f24314a0;
        addView(n5Var, c8.na.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            lp lpVar = new lp(21, context, i6Var);
            this.d = lpVar;
            lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z15 = gd.f24314a0;
            addView(lpVar, c8.na.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i7 == 2) {
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
