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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hs;
public final class g4 extends FrameLayout {
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.e6 M;
    public final org.telegram.ui.Components.g6 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public rg.a1 S;
    public Drawable T;
    public Paint U;
    public final org.telegram.ui.Components.y9 f22122a;
    public final ai.a6 f22123b;
    public final org.telegram.ui.ActionBar.j5 f22124c;
    public final dq d;
    public final org.telegram.ui.Components.j9 f22125e;
    public Object f22126f;
    public CharSequence h;
    public CharSequence f22127n;
    public boolean f22128r;
    public boolean f22129s;
    public final int v;
    public final int f22130w;
    public String f22131x;
    public int f22132y;

    public g4(int i10, int i11, Context context, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.j9 a(boolean z10) {
        float f7;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.g(8);
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.1f;
        }
        j9Var.f27652p = f7;
        j9Var.i(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.T7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20742a8, false));
        return j9Var;
    }

    public static fr b(Context context, boolean z10) {
        fr frVar = new fr(new ci.c4(new rg.a1(org.telegram.ui.ActionBar.i6.Mj, org.telegram.ui.ActionBar.i6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            frVar.f26466e = dp;
            frVar.f26467f = dp2;
        }
        return frVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.a(z10, z11);
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
                this.G.addListener(new org.telegram.ui.t4(this, 7));
                this.G.setDuration(180L);
                this.G.setInterpolator(hs.f27119g);
                this.G.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.H) {
                    f7 = 0.82f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.Components.y9 y9Var = this.f22122a;
                y9Var.setScaleX(f7);
                if (!this.H) {
                    f10 = 1.0f;
                }
                y9Var.setScaleY(f10);
                if (!this.H) {
                    f11 = 0.0f;
                }
                this.I = f11;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f22126f = obj;
        this.f22127n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f22128r = false;
        this.f22129s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e7 = this.N.e(this.O);
        if (e7 > 0.0f) {
            org.telegram.ui.Components.y9 y9Var = this.f22122a;
            float height = (y9Var.getHeight() / 2.0f) + y9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (y9Var.getWidth() / 2.0f) + y9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.i6.f21086t0;
            int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e7, org.telegram.ui.ActionBar.i6.f21086t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new rg.a1(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, this.M);
                }
                this.S.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.S.f47177f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20782c8, e6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e7, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.T;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (height - (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.T.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + width), (int) (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + height));
            this.T.setAlpha((int) (e7 * 255.0f));
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
            } else if (this.f22126f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f22130w).isUserContactBlocked(((TLRPC.User) this.f22126f).f20185id);
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

    public dq getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f22126f;
    }

    public org.telegram.ui.ActionBar.j5 getStatusTextView() {
        return this.f22124c;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.M;
        if (i10 <= 0 && this.v == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W6, e6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.y9 y9Var = this.f22122a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.I) + AndroidUtilities.dp(18.0f), paint);
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
                org.telegram.ui.ActionBar.i6.f20939l0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20860gg, e6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20939l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.U0("paintDivider", e6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dq dqVar = this.d;
        if (dqVar != null) {
            z10 = dqVar.f25790a.f24097q;
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
        Object obj = this.f22126f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f22126f)) {
            f7 = 50.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public g4(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f22130w = UserConfig.selectedAccount;
        this.N = new org.telegram.ui.Components.g6(this, 0L, 350L, hs.h);
        this.M = e6Var;
        this.v = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.f22125e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22122a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(y9Var, w7.x5.a(46.0f, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f, 46, (z12 ? 5 : 3) | 48));
        ai.a6 a6Var = new ai.a6(context, 1);
        this.f22123b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(z11 ? org.telegram.ui.ActionBar.i6.f20990ng : org.telegram.ui.ActionBar.i6.G6, e6Var));
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextSize(16);
        a6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(a6Var, w7.x5.a(20.0f, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f, -1, (z13 ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22124c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(j5Var, w7.x5.a(20.0f, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f, -1, (z14 ? 5 : 3) | 48));
        if (i10 == 1) {
            dq dqVar = new dq(context, 21, e6Var);
            this.d = dqVar;
            dqVar.b(-1, org.telegram.ui.ActionBar.i6.f20797d6, org.telegram.ui.ActionBar.i6.f20926k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(dqVar, w7.x5.a(24.0f, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f, 24, (z15 ? 5 : 3) | 48));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
