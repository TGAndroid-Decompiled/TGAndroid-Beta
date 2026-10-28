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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class k4 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.u6 M;
    public final org.telegram.ui.Components.h6 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public tg.a1 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.y9 f24323a;
    public final di.l4 f24324b;
    public final org.telegram.ui.ActionBar.b6 f24325c;
    public final aq d;
    public final org.telegram.ui.Components.j9 e;
    public Object f24326f;
    public CharSequence h;
    public CharSequence f24327n;
    public boolean f24328r;
    public boolean f24329s;
    public final int v;
    public final int f24330w;
    public String f24331x;
    public int f24332y;

    public k4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.j9 a(boolean z10) {
        float f7;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.g(8);
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.1f;
        }
        j9Var.f29558p = f7;
        j9Var.i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23301a8, false));
        return j9Var;
    }

    public static ar b(Context context, boolean z10) {
        ar arVar = new ar(new fi.u3(new tg.a1(org.telegram.ui.ActionBar.y6.Mj, org.telegram.ui.ActionBar.y6.Lj, -1, -1, null), 4), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            arVar.e = dp;
            arVar.f26642f = dp2;
        }
        return arVar;
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
                ofFloat.addUpdateListener(new r(this, 4));
                this.G.addListener(new kg.e(this, 14));
                this.G.setDuration(180L);
                this.G.setInterpolator(ds.f27531g);
                this.G.start();
            } else {
                float f10 = 0.82f;
                float f11 = 1.0f;
                if (this.H) {
                    f7 = 0.82f;
                } else {
                    f7 = 1.0f;
                }
                org.telegram.ui.Components.y9 y9Var = this.f24323a;
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
        this.f24326f = obj;
        this.f24327n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.f24328r = false;
        this.f24329s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e = this.N.e(this.O);
        if (e > 0.0f) {
            org.telegram.ui.Components.y9 y9Var = this.f24323a;
            float height = (y9Var.getHeight() / 2.0f) + y9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (y9Var.getWidth() / 2.0f) + y9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.y6.f23649t0;
            int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
            org.telegram.ui.ActionBar.u6 u6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.y6.f23649t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, this.M);
                }
                this.S.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.S.f48832f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23340c8, u6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k4.f(int):void");
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f24326f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.f24330w).isUserContactBlocked(((TLRPC.User) this.f24326f).f22177id);
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
        return this.f24326f;
    }

    public org.telegram.ui.ActionBar.b6 getStatusTextView() {
        return this.f24325c;
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
        org.telegram.ui.ActionBar.u6 u6Var = this.M;
        if (i10 <= 0 && this.v == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W6, u6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.y9 y9Var = this.f24323a;
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
                org.telegram.ui.ActionBar.y6.f23499l0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gg, u6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23499l0);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, dp2, getMeasuredHeight(), org.telegram.ui.ActionBar.y6.V0("paintDivider", u6Var));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aq aqVar = this.d;
        if (aqVar != null) {
            z10 = aqVar.f26634a.f26091q;
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
        Object obj = this.f24326f;
        if ((obj instanceof String) && !"premium".equalsIgnoreCase((String) obj) && !"miniapps".equalsIgnoreCase((String) this.f24326f)) {
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

    @Override
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24325c;
        if (b6Var != null) {
            try {
                if (this.f24326f != null && !this.f24328r && !this.f24329s && (textColor = b6Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    b6Var.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        org.telegram.ui.Components.y9 y9Var = this.f24323a;
        if (y9Var != null) {
            y9Var.invalidate();
        }
        try {
            if (this.f24329s && y9Var != null) {
                Drawable drawable = y9Var.getImageReceiver().getDrawable();
                if (drawable instanceof org.telegram.ui.Components.j9) {
                    ((org.telegram.ui.Components.j9) drawable).i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23301a8, false));
                    y9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public k4(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        this.f24330w = UserConfig.selectedAccount;
        this.N = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.M = u6Var;
        this.v = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f24323a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(y9Var, kb1.h(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        di.l4 l4Var = new di.l4(context, 1);
        this.f24324b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        org.telegram.ui.ActionBar.f7.Y(l4Var, z11 ? org.telegram.ui.ActionBar.y6.f23551ng : org.telegram.ui.ActionBar.y6.G6, u6Var);
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setTextSize(16);
        l4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(l4Var, kb1.h(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24325c = b6Var;
        b6Var.setTextSize(14);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(b6Var, kb1.h(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            aq aqVar = new aq(context, 21, u6Var);
            this.d = aqVar;
            aqVar.b(-1, org.telegram.ui.ActionBar.y6.f23357d6, org.telegram.ui.ActionBar.y6.f23486k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(aqVar, kb1.h(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
