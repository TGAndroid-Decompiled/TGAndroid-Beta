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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
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
    public ug.z0 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.i9 f30385a;
    public final fi.w3 f30386b;
    public final org.telegram.ui.ActionBar.j5 f30387c;
    public final fp d;
    public final org.telegram.ui.Components.t8 f30388e;
    public Object f30389f;
    public CharSequence h;
    public CharSequence f30390n;
    public boolean f30391r;
    public boolean f30392s;
    public final int f30393w;
    public final int f30394x;
    public String f30395y;

    public h4(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.t8 a(boolean z10) {
        float f10;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.g(8);
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        t8Var.f39598p = f10;
        t8Var.i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28793a8, false));
        return t8Var;
    }

    public static fq b(Context context, boolean z10) {
        fq fqVar = new fq(new hi.k3(new ug.z0(org.telegram.ui.ActionBar.j6.Dk, org.telegram.ui.ActionBar.j6.Ck, -1, -1, null), 5), context.getResources().getDrawable(2131232363), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            fqVar.f34676e = L;
            fqVar.f34677f = L2;
        }
        return fqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        fp fpVar = this.d;
        if (fpVar != null) {
            fpVar.a(z10, z11);
        } else if (this.f30393w == 2 && this.I != z10) {
            this.I = z10;
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.H.addListener(new ki.s3(this, 24));
                this.H.setDuration(180L);
                this.H.setInterpolator(er.f34420g);
                this.H.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.I) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.i9 i9Var = this.f30385a;
                i9Var.setScaleX(f10);
                if (!this.I) {
                    f11 = 1.0f;
                }
                i9Var.setScaleY(f11);
                if (!this.I) {
                    f12 = 0.0f;
                }
                this.J = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f30389f = obj;
        this.f30390n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.f30391r = false;
        this.f30392s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            org.telegram.ui.Components.i9 i9Var = this.f30385a;
            float height = (i9Var.getHeight() / 2.0f) + i9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (i9Var.getWidth() / 2.0f) + i9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.j6.f29140t0;
            int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.j6.f29140t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f58392f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28833c8, e6Var));
                paint = this.V;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232243).mutate();
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
            } else if (this.f30389f instanceof TLRPC.User) {
                requirementToContact = np.s1(this.f30394x).J2(((TLRPC.User) this.f30389f).f28200id);
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

    public fp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f30389f;
    }

    public org.telegram.ui.ActionBar.j5 getStatusTextView() {
        return this.f30387c;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.N;
        if (i7 <= 0 && this.f30393w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W6, e6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.i9 i9Var = this.f30385a;
            canvas.drawCircle((i9Var.getMeasuredWidth() / 2) + i9Var.getLeft(), (i9Var.getMeasuredHeight() / 2) + i9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = hd.f24104a0;
            int i10 = this.G;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.L) {
                org.telegram.ui.ActionBar.j6.f28991l0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xg, e6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28991l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fp fpVar = this.d;
        if (fpVar != null) {
            z10 = fpVar.f34667a.f32441q;
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
        Object obj = this.f30389f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f30389f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        fp fpVar = this.d;
        if (fpVar != null) {
            fpVar.setEnabled(z10);
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f30387c;
        if (j5Var != null) {
            try {
                if (this.f30389f != null && !this.f30391r && !this.f30392s && (textColor = j5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    j5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.i9 i9Var = this.f30385a;
        if (i9Var != null) {
            i9Var.invalidate();
        }
        try {
            if (this.f30392s && i9Var != null) {
                Drawable t6 = i9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.t8) {
                    ((org.telegram.ui.Components.t8) t6).i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28793a8, false));
                    i9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f30394x = m10.f24940t0;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.N = e6Var;
        this.f30393w = i7;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.f30388e = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30385a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = hd.f24104a0;
        addView(i9Var, c8.ja.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        fi.w3 w3Var = new fi.w3(context, 1);
        this.f30386b = w3Var;
        ns.i(w3Var);
        org.telegram.ui.ActionBar.q6.X(w3Var, z11 ? org.telegram.ui.ActionBar.j6.f28878eh : org.telegram.ui.ActionBar.j6.G6, e6Var);
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setTextSize(16);
        w3Var.setGravity((hd.f24104a0 ? 5 : 3) | 48);
        boolean z13 = hd.f24104a0;
        addView(w3Var, c8.ja.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30387c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setGravity((hd.f24104a0 ? 5 : 3) | 48);
        boolean z14 = hd.f24104a0;
        addView(j5Var, c8.ja.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            fp fpVar = new fp(21, context, e6Var);
            this.d = fpVar;
            fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(3);
            boolean z15 = hd.f24104a0;
            addView(fpVar, c8.ja.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
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
