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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
public final class e4 extends FrameLayout {
    public boolean A;
    public final int B;
    public ValueAnimator C;
    public boolean D;
    public float E;
    public final Paint F;
    public final boolean G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.c6 I;
    public final org.telegram.ui.Components.d6 J;
    public boolean K;
    public long L;
    public TL_account.requirementToContactPremium M;
    public boolean N;
    public cg.r1 O;
    public Drawable P;
    public Paint Q;
    public final org.telegram.ui.Components.t9 f24277a;
    public final gg.c f24278b;
    public final org.telegram.ui.ActionBar.h5 f24279c;
    public final hp d;
    public final org.telegram.ui.Components.e9 f24280e;
    public Object f24281f;
    public CharSequence h;
    public CharSequence f24282n;
    public boolean f24283r;
    public boolean f24284s;
    public final int v;
    public final int f24285w;
    public String f24286x;
    public int f24287y;

    public e4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.e9 a(boolean z10) {
        float f9;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.g(8);
        if (z10) {
            f9 = 0.8f;
        } else {
            f9 = 1.1f;
        }
        e9Var.f27964p = f9;
        e9Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23010a8, false));
        return e9Var;
    }

    public static jq b(Context context, boolean z10) {
        jq jqVar = new jq(new bg.m1(new cg.r1(org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Lj, -1, -1, null), 4), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            jqVar.f29787e = dp;
            jqVar.f29788f = dp2;
        }
        return jqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f9;
        hp hpVar = this.d;
        if (hpVar != null) {
            hpVar.a(z10, z11);
        } else if (this.v == 2 && this.D != z10) {
            this.D = z10;
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.C = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.C.addListener(new nh.q5(this, 15));
                this.C.setDuration(180L);
                this.C.setInterpolator(jr.f29801g);
                this.C.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.D) {
                    f9 = 0.82f;
                } else {
                    f9 = 1.0f;
                }
                org.telegram.ui.Components.t9 t9Var = this.f24277a;
                t9Var.setScaleX(f9);
                if (!this.D) {
                    f10 = 1.0f;
                }
                t9Var.setScaleY(f10);
                if (!this.D) {
                    f11 = 0.0f;
                }
                this.E = f11;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f24281f = obj;
        this.f24282n = charSequence2;
        this.h = charSequence;
        this.A = false;
        this.f24283r = false;
        this.f24284s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e10 = this.J.e(this.K);
        if (e10 > 0.0f) {
            org.telegram.ui.Components.t9 t9Var = this.f24277a;
            float height = (t9Var.getHeight() / 2.0f) + t9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (t9Var.getWidth() / 2.0f) + t9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.g6.f23340t0;
            int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.I;
            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e10, org.telegram.ui.ActionBar.g6.f23340t0);
            if (this.M == null) {
                if (this.O == null) {
                    this.O = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.I);
                }
                this.O.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.O.f3319f;
            } else {
                if (this.Q == null) {
                    this.Q = new Paint();
                }
                this.Q.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23046c8, c6Var));
                paint = this.Q;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e10, paint);
            if (this.P == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.P;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * e10)), (int) (height - (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f) * e10)), (int) (((this.P.getIntrinsicWidth() / 2.0f) * 0.875f * e10) + width), (int) (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f * e10) + height));
            this.P.setAlpha((int) (e10 * 255.0f));
            this.P.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.A = z10;
    }

    public final void f(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.N) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.M;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f24281f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f24285w).isUserContactBlocked(((TLRPC.User) this.f24281f).f22539id);
            }
        }
        if (this.K == DialogObject.isPremiumBlocked(requirementToContact) && this.L == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.K = DialogObject.isPremiumBlocked(requirementToContact);
        this.L = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.J.f(this.K, true);
        invalidate();
    }

    public hp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f24281f;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24279c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        super.onDraw(canvas);
        float e10 = this.J.e(this.K);
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        float f10 = 0.0f;
        if (e10 <= 0.0f && this.v == 2 && (this.D || this.E > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W6, c6Var);
            Paint paint = this.F;
            paint.setColor(v02);
            org.telegram.ui.Components.t9 t9Var = this.f24277a;
            canvas.drawCircle((t9Var.getMeasuredWidth() / 2) + t9Var.getLeft(), (t9Var.getMeasuredHeight() / 2) + t9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.E) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.A) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.B;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = i10 + 72;
            }
            int dp = AndroidUtilities.dp(f9);
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                f10 = i10 + 72;
            }
            int dp2 = measuredWidth - AndroidUtilities.dp(f10);
            if (this.G) {
                org.telegram.ui.ActionBar.g6.f23201l0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23126gg, c6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23201l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hp hpVar = this.d;
        if (hpVar != null) {
            z10 = hpVar.f29211a.f26324q;
        } else {
            z10 = this.D;
        }
        if (z10) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        Object obj = this.f24281f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f24281f)) {
            f9 = 50.0f;
        } else {
            f9 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        hp hpVar = this.d;
        if (hpVar != null) {
            hpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public e4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24285w = UserConfig.selectedAccount;
        this.J = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.I = c6Var;
        this.v = i10;
        this.G = z11;
        this.A = false;
        this.B = i11;
        this.H = z10;
        this.f24280e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24277a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(t9Var, i7.f6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        gg.c cVar = new gg.c(context, 2);
        this.f24278b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.f23251ng : org.telegram.ui.ActionBar.g6.G6, c6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(cVar, i7.f6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24279c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var, i7.f6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            hp hpVar = new hp(context, 21, c6Var);
            this.d = hpVar;
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
