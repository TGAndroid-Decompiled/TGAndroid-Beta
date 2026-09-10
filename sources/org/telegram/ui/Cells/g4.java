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
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wr;
public final class g4 extends FrameLayout {
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final org.telegram.ui.Components.d6 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public qg.c1 S;
    public Drawable T;
    public Paint U;
    public final org.telegram.ui.Components.w9 f19186a;
    public final f4 f19187b;
    public final org.telegram.ui.ActionBar.l5 f19188c;
    public final tp d;
    public final org.telegram.ui.Components.g9 e;
    public Object f19189f;
    public CharSequence h;
    public CharSequence f19190n;
    public boolean f19191r;
    public boolean f19192s;
    public final int v;
    public final int f19193w;
    public String f19194x;
    public int f19195y;

    public g4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.g9 a(boolean z10) {
        float f7;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.g(8);
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.1f;
        }
        g9Var.f23286p = f7;
        g9Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17873a8, false));
        return g9Var;
    }

    public static vq b(Context context, boolean z10) {
        vq vqVar = new vq(new bi.w4(new qg.c1(org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            vqVar.e = dp;
            vqVar.f28576f = dp2;
        }
        return vqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.a(z10, z11);
        } else if (this.v == 2 && this.H != z10) {
            this.H = z10;
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new r(this, 3));
                this.G.addListener(new bi.h(this, 27));
                this.G.setDuration(180L);
                this.G.setInterpolator(wr.f28820g);
                this.G.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.H) {
                    f7 = 0.82f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.Components.w9 w9Var = this.f19186a;
                w9Var.setScaleX(f7);
                if (!this.H) {
                    f10 = 1.0f;
                }
                w9Var.setScaleY(f10);
                if (!this.H) {
                    f11 = 0.0f;
                }
                this.I = f11;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f19189f = obj;
        this.f19190n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f19191r = false;
        this.f19192s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e = this.N.e(this.O);
        if (e > 0.0f) {
            org.telegram.ui.Components.w9 w9Var = this.f19186a;
            float height = (w9Var.getHeight() / 2.0f) + w9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (w9Var.getWidth() / 2.0f) + w9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.j6.f18212t0;
            int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.j6.f18212t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.M);
                }
                this.S.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.S.f40690f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17912c8, f6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.T;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * e)), (int) (height - (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f) * e)), (int) (((this.T.getIntrinsicWidth() / 2.0f) * 0.875f * e) + width), (int) (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f * e) + height));
            this.T.setAlpha((int) (e * 255.0f));
            this.T.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.E = z10;
    }

    public final void f(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f19189f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f19193w).isUserContactBlocked(((TLRPC.User) this.f19189f).f17342id);
            }
        }
        if (this.O == DialogObject.isPremiumBlocked(requirementToContact) && this.P == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.O = DialogObject.isPremiumBlocked(requirementToContact);
        this.P = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.N.f(this.O, true);
        invalidate();
    }

    public tp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f19189f;
    }

    public org.telegram.ui.ActionBar.l5 getStatusTextView() {
        return this.f19188c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        float e = this.N.e(this.O);
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        float f10 = 0.0f;
        if (e <= 0.0f && this.v == 2 && (this.H || this.I > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W6, f6Var);
            Paint paint = this.J;
            paint.setColor(v02);
            org.telegram.ui.Components.w9 w9Var = this.f19186a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.I) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.E) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.F;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = i10 + 72;
            }
            int dp = AndroidUtilities.dp(f7);
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                f10 = i10 + 72;
            }
            int dp2 = measuredWidth - AndroidUtilities.dp(f10);
            if (this.K) {
                org.telegram.ui.ActionBar.j6.f18069l0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17990gg, f6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18069l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        tp tpVar = this.d;
        if (tpVar != null) {
            z10 = tpVar.f27462a.f21057q;
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
        Object obj = this.f19189f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f19189f)) {
            f7 = 50.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public g4(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.f19193w = UserConfig.selectedAccount;
        this.N = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        this.M = f6Var;
        this.v = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19186a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(w9Var, w7.a6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        f4 f4Var = new f4(context, 0);
        this.f19187b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.f18117ng : org.telegram.ui.ActionBar.j6.G6, f6Var));
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setTextSize(16);
        f4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(f4Var, w7.a6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19188c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(l5Var, w7.a6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            tp tpVar = new tp(context, 21, f6Var);
            this.d = tpVar;
            tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(tpVar, w7.a6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
