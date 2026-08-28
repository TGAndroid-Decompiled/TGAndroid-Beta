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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
public final class g4 extends FrameLayout {
    public boolean A;
    public final int B;
    public ValueAnimator C;
    public boolean D;
    public float E;
    public final Paint F;
    public final boolean G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.b6 I;
    public final org.telegram.ui.Components.y5 J;
    public boolean K;
    public long L;
    public TL_account.requirementToContactPremium M;
    public boolean N;
    public zf.z0 O;
    public Drawable P;
    public Paint Q;
    public final org.telegram.ui.Components.o9 f24381a;
    public final dg.c f24382b;
    public final org.telegram.ui.ActionBar.h5 f24383c;
    public final dp d;
    public final org.telegram.ui.Components.z8 f24384e;
    public Object f24385f;
    public CharSequence h;
    public CharSequence f24386n;
    public boolean f24387r;
    public boolean f24388s;
    public final int v;
    public final int f24389w;
    public String f24390x;
    public int f24391y;

    public g4(Context context, int i9, int i10, boolean z10) {
        this(i9, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.z8 a(boolean z10) {
        float f10;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.g(8);
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.1f;
        }
        z8Var.f35234p = f10;
        z8Var.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.T7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22948a8, false));
        return z8Var;
    }

    public static fq b(Context context, boolean z10) {
        fq fqVar = new fq(new kh.w3(new zf.z0(org.telegram.ui.ActionBar.f6.Mj, org.telegram.ui.ActionBar.f6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            fqVar.f28545e = dp;
            fqVar.f28546f = dp2;
        }
        return fqVar;
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        dp dpVar = this.d;
        if (dpVar != null) {
            dpVar.a(z10, z11);
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
                this.C.addListener(new mh.x(this, 13));
                this.C.setDuration(180L);
                this.C.setInterpolator(gr.f28845g);
                this.C.start();
            } else {
                float f11 = 0.82f;
                float f12 = 1.0f;
                if (this.D) {
                    f10 = 0.82f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.ui.Components.o9 o9Var = this.f24381a;
                o9Var.setScaleX(f10);
                if (!this.D) {
                    f11 = 1.0f;
                }
                o9Var.setScaleY(f11);
                if (!this.D) {
                    f12 = 0.0f;
                }
                this.E = f12;
            }
            invalidate();
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f24385f = obj;
        this.f24386n = charSequence2;
        this.h = charSequence;
        this.A = false;
        this.f24387r = false;
        this.f24388s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e10 = this.J.e(this.K);
        if (e10 > 0.0f) {
            org.telegram.ui.Components.o9 o9Var = this.f24381a;
            float height = (o9Var.getHeight() / 2.0f) + o9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (o9Var.getWidth() / 2.0f) + o9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.f6.f23279t0;
            int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
            org.telegram.ui.ActionBar.b6 b6Var = this.I;
            paint2.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e10, org.telegram.ui.ActionBar.f6.f23279t0);
            if (this.M == null) {
                if (this.O == null) {
                    this.O = new zf.z0(org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, -1, -1, this.I);
                }
                this.O.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.O.f50792f;
            } else {
                if (this.Q == null) {
                    this.Q = new Paint();
                }
                this.Q.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22985c8, b6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.N) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.M;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f24385f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f24389w).isUserContactBlocked(((TLRPC.User) this.f24385f).f22527id);
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

    public dp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f24385f;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24383c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        float e10 = this.J.e(this.K);
        org.telegram.ui.ActionBar.b6 b6Var = this.I;
        float f11 = 0.0f;
        if (e10 <= 0.0f && this.v == 2 && (this.D || this.E > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W6, b6Var);
            Paint paint = this.F;
            paint.setColor(v02);
            org.telegram.ui.Components.o9 o9Var = this.f24381a;
            canvas.drawCircle((o9Var.getMeasuredWidth() / 2) + o9Var.getLeft(), (o9Var.getMeasuredHeight() / 2) + o9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.E) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.A) {
            boolean z10 = LocaleController.isRTL;
            int i9 = this.B;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = i9 + 72;
            }
            int dp = AndroidUtilities.dp(f10);
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                f11 = i9 + 72;
            }
            int dp2 = measuredWidth - AndroidUtilities.dp(f11);
            if (this.G) {
                org.telegram.ui.ActionBar.f6.f23139l0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23065gg, b6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23139l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dp dpVar = this.d;
        if (dpVar != null) {
            z10 = dpVar.f27781a.f26313q;
        } else {
            z10 = this.D;
        }
        if (z10) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        Object obj = this.f24385f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f24385f)) {
            f10 = 50.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        dp dpVar = this.d;
        if (dpVar != null) {
            dpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public g4(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.f24389w = UserConfig.selectedAccount;
        this.J = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.I = b6Var;
        this.v = i9;
        this.G = z11;
        this.A = false;
        this.B = i10;
        this.H = z10;
        this.f24384e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24381a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        dg.c cVar = new dg.c(context, 2);
        this.f24382b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(z11 ? org.telegram.ui.ActionBar.f6.f23188ng : org.telegram.ui.ActionBar.f6.G6, b6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(cVar, g7.e6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24383c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var, g7.e6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i9 == 1) {
            dp dpVar = new dp(context, 21, b6Var);
            this.d = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i9 == 2) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
