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
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
public final class f4 extends FrameLayout {
    public boolean B;
    public final int C;
    public ValueAnimator D;
    public boolean E;
    public float F;
    public final Paint G;
    public final boolean H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final org.telegram.ui.Components.z5 K;
    public boolean L;
    public long M;
    public TL_account.requirementToContactPremium N;
    public boolean O;
    public eg.q1 P;
    public Drawable Q;
    public Paint R;
    public final org.telegram.ui.Components.p9 f21019a;
    public final ig.c f21020b;
    public final org.telegram.ui.ActionBar.k5 f21021c;
    public final kp d;
    public final org.telegram.ui.Components.z8 e;
    public Object f21022f;
    public CharSequence h;
    public CharSequence f21023n;
    public boolean f21024r;
    public boolean f21025s;
    public final int v;
    public final int f21026w;
    public String f21027x;
    public int f21028y;

    public f4(Context context, int i10, int i11, boolean z4) {
        this(i10, i11, context, null, z4, false);
    }

    public static org.telegram.ui.Components.z8 a(boolean z4) {
        float f10;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.g(8);
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        z8Var.f31293p = f10;
        z8Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19828a8, false));
        return z8Var;
    }

    public static mq b(Context context, boolean z4) {
        mq mqVar = new mq(new dg.k1(new eg.q1(org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z4) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            mqVar.e = dp;
            mqVar.f27112f = dp2;
        }
        return mqVar;
    }

    public final void c(boolean z4, boolean z10) {
        float f10;
        kp kpVar = this.d;
        if (kpVar != null) {
            kpVar.a(z4, z10);
        } else if (this.v == 2 && this.E != z4) {
            this.E = z4;
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.D.addListener(new org.telegram.ui.u5(this, 6));
                this.D.setDuration(180L);
                this.D.setInterpolator(mr.f27123g);
                this.D.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.E) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.p9 p9Var = this.f21019a;
                p9Var.setScaleX(f10);
                if (!this.E) {
                    f11 = 1.0f;
                }
                p9Var.setScaleY(f11);
                if (!this.E) {
                    f12 = 0.0f;
                }
                this.F = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f21022f = obj;
        this.f21023n = charSequence2;
        this.h = charSequence;
        this.B = false;
        this.f21024r = false;
        this.f21025s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e = this.K.e(this.L);
        if (e > 0.0f) {
            org.telegram.ui.Components.p9 p9Var = this.f21019a;
            float height = (p9Var.getHeight() / 2.0f) + p9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (p9Var.getWidth() / 2.0f) + p9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.j6.f20160t0;
            int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.j6.f20160t0);
            if (this.N == null) {
                if (this.P == null) {
                    this.P = new eg.q1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.J);
                }
                this.P.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.P.f5446f;
            } else {
                if (this.R == null) {
                    this.R = new Paint();
                }
                this.R.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19865c8, f6Var));
                paint = this.R;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e, paint);
            if (this.Q == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.Q = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.Q;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * e)), (int) (height - (((this.Q.getIntrinsicHeight() / 2.0f) * 0.875f) * e)), (int) (((this.Q.getIntrinsicWidth() / 2.0f) * 0.875f * e) + width), (int) (((this.Q.getIntrinsicHeight() / 2.0f) * 0.875f * e) + height));
            this.Q.setAlpha((int) (e * 255.0f));
            this.Q.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z4) {
        d(tLObject, str, str2);
        this.B = z4;
    }

    public final void f(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.O) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.N;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f21022f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f21026w).isUserContactBlocked(((TLRPC.User) this.f21022f).f19306id);
            }
        }
        if (this.L == DialogObject.isPremiumBlocked(requirementToContact) && this.M == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.L = DialogObject.isPremiumBlocked(requirementToContact);
        this.M = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.K.f(this.L, true);
        invalidate();
    }

    public kp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f21022f;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f21021c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        float e = this.K.e(this.L);
        org.telegram.ui.ActionBar.f6 f6Var = this.J;
        float f11 = 0.0f;
        if (e <= 0.0f && this.v == 2 && (this.E || this.F > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W6, f6Var);
            Paint paint = this.G;
            paint.setColor(v02);
            org.telegram.ui.Components.p9 p9Var = this.f21019a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.F) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.B) {
            boolean z4 = LocaleController.isRTL;
            int i10 = this.C;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = i10 + 72;
            }
            int dp = AndroidUtilities.dp(f10);
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                f11 = i10 + 72;
            }
            int dp2 = measuredWidth - AndroidUtilities.dp(f11);
            if (this.H) {
                org.telegram.ui.ActionBar.j6.f20019l0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19945gg, f6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20019l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        kp kpVar = this.d;
        if (kpVar != null) {
            z4 = kpVar.f26377a.f22938q;
        } else {
            z4 = this.E;
        }
        if (z4) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        Object obj = this.f21022f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f21022f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z4) {
        kp kpVar = this.d;
        if (kpVar != null) {
            kpVar.setEnabled(z4);
        }
    }

    public void setDrawDivider(boolean z4) {
        this.B = z4;
        invalidate();
    }

    public void setForbiddenCheck(boolean z4) {
        this.d.setForbidden(z4);
    }

    public f4(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.f21026w = UserConfig.selectedAccount;
        this.K = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
        this.J = f6Var;
        this.v = i10;
        this.H = z10;
        this.B = false;
        this.C = i11;
        this.I = z4;
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f21019a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(p9Var, k7.b6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i11 + 13, 6.0f, z11 ? i11 + 13 : 0.0f, 0.0f));
        ig.c cVar = new ig.c(context, 2);
        this.f21020b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.f20069ng : org.telegram.ui.ActionBar.j6.G6, f6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(cVar, k7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, (z12 ? 28 : 72) + i11, 10.0f, (z12 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f21021c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(k5Var, k7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 32.0f, (z13 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            kp kpVar = new kp(context, 21, f6Var);
            this.d = kpVar;
            kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            boolean z14 = LocaleController.isRTL;
            addView(kpVar, k7.b6.d(24, 24.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : i11 + 40, 33.0f, z14 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
