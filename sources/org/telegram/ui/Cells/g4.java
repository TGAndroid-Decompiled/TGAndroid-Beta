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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
public final class g4 extends FrameLayout {
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.c6 M;
    public final org.telegram.ui.Components.g6 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public sg.a1 S;
    public Drawable T;
    public Paint U;
    public final org.telegram.ui.Components.z9 f21205a;
    public final bi.l5 f21206b;
    public final org.telegram.ui.ActionBar.h5 f21207c;
    public final aq d;
    public final org.telegram.ui.Components.k9 e;
    public Object f21208f;
    public CharSequence h;
    public CharSequence f21209n;
    public boolean f21210r;
    public boolean f21211s;
    public final int v;
    public final int f21212w;
    public String f21213x;
    public int f21214y;

    public g4(int i10, int i11, Context context, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.k9 a(boolean z10) {
        float f7;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.g(8);
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.1f;
        }
        k9Var.f26627p = f7;
        k9Var.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.T7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19844a8, false));
        return k9Var;
    }

    public static cr b(Context context, boolean z10) {
        cr crVar = new cr(new di.c4(new sg.a1(org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            crVar.e = dp;
            crVar.f24194f = dp2;
        }
        return crVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        aq aqVar = this.d;
        if (aqVar != null) {
            aqVar.a(z10, z11);
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
                this.G.addListener(new org.telegram.ui.u0(this, 10));
                this.G.setDuration(180L);
                this.G.setInterpolator(es.f24772g);
                this.G.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.H) {
                    f7 = 0.82f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.Components.z9 z9Var = this.f21205a;
                z9Var.setScaleX(f7);
                if (!this.H) {
                    f10 = 1.0f;
                }
                z9Var.setScaleY(f10);
                if (!this.H) {
                    f11 = 0.0f;
                }
                this.I = f11;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f21208f = obj;
        this.f21209n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f21210r = false;
        this.f21211s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e = this.N.e(this.O);
        if (e > 0.0f) {
            org.telegram.ui.Components.z9 z9Var = this.f21205a;
            float height = (z9Var.getHeight() / 2.0f) + z9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (z9Var.getWidth() / 2.0f) + z9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.g6.f20191t0;
            int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.g6.f20191t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new sg.a1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.M);
                }
                this.S.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.S.f45117f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19884c8, c6Var));
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
            } else if (this.f21208f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f21212w).isUserContactBlocked(((TLRPC.User) this.f21208f).f19363id);
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

    public aq getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f21208f;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f21207c;
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
        int i10 = (this.N.e(this.O) > 0.0f ? 1 : (this.N.e(this.O) == 0.0f ? 0 : -1));
        org.telegram.ui.ActionBar.c6 c6Var = this.M;
        if (i10 <= 0 && this.v == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W6, c6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.z9 z9Var = this.f21205a;
            canvas.drawCircle((z9Var.getMeasuredWidth() / 2) + z9Var.getLeft(), (z9Var.getMeasuredHeight() / 2) + z9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.I) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.E) {
            boolean z10 = LocaleController.isRTL;
            int i11 = this.F;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = i11 + 72;
            }
            int dp = AndroidUtilities.dp(f7);
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                f10 = i11 + 72;
            }
            int dp2 = measuredWidth - AndroidUtilities.dp(f10);
            if (this.K) {
                org.telegram.ui.ActionBar.g6.f20041l0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19964gg, c6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f20041l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.U0("paintDivider", c6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aq aqVar = this.d;
        if (aqVar != null) {
            z10 = aqVar.f23604a.f23092q;
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
        Object obj = this.f21208f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f21208f)) {
            f7 = 50.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        aq aqVar = this.d;
        if (aqVar != null) {
            aqVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public g4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f21212w = UserConfig.selectedAccount;
        this.N = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        this.M = c6Var;
        this.v = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21205a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(z9Var, w7.a6.a(46.0f, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f, 46, (z12 ? 5 : 3) | 48));
        bi.l5 l5Var = new bi.l5(context, 1);
        this.f21206b = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(z11 ? org.telegram.ui.ActionBar.g6.f20094ng : org.telegram.ui.ActionBar.g6.G6, c6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(l5Var, w7.a6.a(20.0f, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f, -1, (z13 ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21207c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var, w7.a6.a(20.0f, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f, -1, (z14 ? 5 : 3) | 48));
        if (i10 == 1) {
            aq aqVar = new aq(context, 21, c6Var);
            this.d = aqVar;
            aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(aqVar, w7.a6.a(24.0f, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f, 24, (z15 ? 5 : 3) | 48));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
