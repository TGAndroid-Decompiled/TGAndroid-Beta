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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq;
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public ug.b1 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.q9 f30762a;
    public final fi.u3 f30763b;
    public final org.telegram.ui.ActionBar.n5 f30764c;
    public final mp d;
    public final org.telegram.ui.Components.b9 f30765e;
    public Object f30766f;
    public CharSequence h;
    public CharSequence f30767n;
    public boolean f30768r;
    public boolean f30769s;
    public final int f30770w;
    public final int f30771x;
    public String f30772y;

    public h4(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.b9 a(boolean z10) {
        float f10;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.g(8);
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        b9Var.f33601p = f10;
        b9Var.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29340a8, false));
        return b9Var;
    }

    public static mq b(Context context, boolean z10) {
        mq mqVar = new mq(new hi.l3(new ug.b1(org.telegram.ui.ActionBar.n6.Dk, org.telegram.ui.ActionBar.n6.Ck, -1, -1, null), 5), context.getResources().getDrawable(2131232364), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            mqVar.f37610e = L;
            mqVar.f37611f = L2;
        }
        return mqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.a(z10, z11);
        } else if (this.f30770w == 2 && this.I != z10) {
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
                this.H.setInterpolator(lr.f37209g);
                this.H.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.I) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.q9 q9Var = this.f30762a;
                q9Var.setScaleX(f10);
                if (!this.I) {
                    f11 = 1.0f;
                }
                q9Var.setScaleY(f11);
                if (!this.I) {
                    f12 = 0.0f;
                }
                this.J = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f30766f = obj;
        this.f30767n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.f30768r = false;
        this.f30769s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            org.telegram.ui.Components.q9 q9Var = this.f30762a;
            float height = (q9Var.getHeight() / 2.0f) + q9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (q9Var.getWidth() / 2.0f) + q9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.n6.f29687t0;
            int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
            org.telegram.ui.ActionBar.i6 i6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.n6.f29687t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new ug.b1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f58606f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29380c8, i6Var));
                paint = this.V;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232244).mutate();
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
            } else if (this.f30766f instanceof TLRPC.User) {
                requirementToContact = org.telegram.messenger.mp.u1(this.f30771x).P2(((TLRPC.User) this.f30766f).f28554id);
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

    public mp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f30766f;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
        return this.f30764c;
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
        if (i7 <= 0 && this.f30770w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W6, i6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.q9 q9Var = this.f30762a;
            canvas.drawCircle((q9Var.getMeasuredWidth() / 2) + q9Var.getLeft(), (q9Var.getMeasuredHeight() / 2) + q9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = gd.f24216a0;
            int i10 = this.G;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int measuredWidth = getMeasuredWidth();
            if (gd.f24216a0) {
                f11 = i10 + 72;
            }
            int L2 = measuredWidth - org.telegram.messenger.g0.L(f11);
            if (this.L) {
                org.telegram.ui.ActionBar.n6.f29538l0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xg, i6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29538l0);
                return;
            }
            canvas.drawRect(L, getMeasuredHeight() - 1, L2, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mp mpVar = this.d;
        if (mpVar != null) {
            z10 = mpVar.f37598a.f32838q;
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
        Object obj = this.f30766f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f30766f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.setEnabled(z10);
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f30764c;
        if (n5Var != null) {
            try {
                if (this.f30766f != null && !this.f30768r && !this.f30769s && (textColor = n5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    n5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.f30762a;
        if (q9Var != null) {
            q9Var.invalidate();
        }
        try {
            if (this.f30769s && q9Var != null) {
                Drawable t6 = q9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.b9) {
                    ((org.telegram.ui.Components.b9) t6).i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29340a8, false));
                    q9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        this.f30771x = j10.f24773t0;
        this.O = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        this.N = i6Var;
        this.f30770w = i7;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.f30765e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30762a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = gd.f24216a0;
        addView(q9Var, c8.ma.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 1);
        this.f30763b = u3Var;
        ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, z11 ? org.telegram.ui.ActionBar.n6.f29425eh : org.telegram.ui.ActionBar.n6.G6, i6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        u3Var.setGravity((gd.f24216a0 ? 5 : 3) | 48);
        boolean z13 = gd.f24216a0;
        addView(u3Var, c8.ma.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30764c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setGravity((gd.f24216a0 ? 5 : 3) | 48);
        boolean z14 = gd.f24216a0;
        addView(n5Var, c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            mp mpVar = new mp(21, context, i6Var);
            this.d = mpVar;
            mpVar.b(-1, org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.f29526k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            boolean z15 = gd.f24216a0;
            addView(mpVar, c8.ma.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
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
