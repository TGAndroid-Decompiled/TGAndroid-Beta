package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v00;
public final class u4 extends FrameLayout {
    public static v00 f21634x;
    public final org.telegram.ui.Components.p6 f21635a;
    public final org.telegram.ui.Components.p6 f21636b;
    public final org.telegram.ui.Components.w9 f21637c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.d6 f21638f;
    public boolean h;
    public CharSequence f21639n;
    public String f21640r;
    public String f21641s;
    public float v;
    public ValueAnimator f21642w;

    public u4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.v = 0.0f;
        this.f21638f = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f21637c = w9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        w9Var.setBackground(K);
        w9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 15.0f;
        }
        if (z10) {
            f10 = 15.0f;
        } else {
            f10 = 0.0f;
        }
        addView(w9Var, w7.y5.d(42, 42.0f, i17, f7, 11.0f, f10, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f21635a = p6Var;
        sr srVar = sr.h;
        p6Var.b(0.4f, 350L, srVar);
        p6Var.setScaleProperty(0.6f);
        p6Var.setTextSize(AndroidUtilities.dp(16.0f));
        p6Var.setEllipsizeByGradient(true);
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        p6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        p6Var.setGravity(i11);
        p6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(p6Var);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z11) {
            i13 = 16;
        } else {
            i13 = 73;
        }
        float f11 = i13;
        if (z11) {
            i14 = 73;
        } else {
            i14 = 16;
        }
        addView(p6Var, w7.y5.d(-1, 22.0f, i18, f11, 10.0f, i14, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f21636b = p6Var2;
        p6Var2.setScaleProperty(0.6f);
        p6Var2.b(0.4f, 350L, srVar);
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var2.setEllipsizeByGradient(true);
        p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        p6Var2.setGravity(i15);
        boolean z12 = LocaleController.isRTL;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 16;
        } else {
            i16 = 73;
        }
        addView(p6Var2, w7.y5.d(-1, 20.0f, i19, i16, 35.0f, z12 ? 73 : 16, 0.0f));
        w9Var.setAlpha(this.v);
        p6Var.setAlpha(this.v);
        p6Var2.setAlpha(this.v);
    }

    public static int a(int i10) {
        int i11 = i10 % 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return -1285237;
                            }
                            return -12338729;
                        }
                        return -7900675;
                    }
                    return -13187226;
                }
                return -12214795;
            }
            return -868277;
        }
        return -1351584;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        final float f7;
        String str;
        String str2;
        String str3;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.e = z10;
        org.telegram.ui.Components.p6 p6Var = this.f21635a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f21640r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f21641s, tL_messageMediaVenue.title)) {
                charSequence = this.f21639n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), p6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f21640r = tL_messageMediaVenue.emoji;
                this.f21641s = tL_messageMediaVenue.title;
                this.f21639n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            p6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.p6 p6Var2 = this.f21636b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !LocaleController.isRTL && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            p6Var2.c(str4, z14, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.w9 w9Var = this.f21637c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                w9Var.f(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19252ni, this.f21638f), PorterDuff.Mode.MULTIPLY));
                rq rqVar = new rq(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                rqVar.h = dp;
                rqVar.f28032n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                rqVar.e = dp3;
                rqVar.f28031f = dp4;
                w9Var.setImageDrawable(rqVar);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        setClickable(z12);
        ValueAnimator valueAnimator = this.f21642w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f10 = this.v;
        if (z13) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final long abs = Math.abs(f10 - f7) * 150.0f;
        this.f21642w = ValueAnimator.ofFloat(f10, f7);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f21642w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                long j3 = abs;
                float f11 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j3), 0.0f), 1.0f);
                if (j3 > 0) {
                    f11 = min;
                }
                float lerp = AndroidUtilities.lerp(f10, f7, f11);
                u4Var.v = lerp;
                u4Var.f21637c.setAlpha(lerp);
                u4Var.f21635a.setAlpha(u4Var.v);
                u4Var.f21636b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f21642w;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f21642w.start();
        w9Var.setAlpha(f10);
        p6Var.setAlpha(f10);
        p6Var2.setAlpha(f10);
        if (tL_messageMediaVenue == null) {
            try {
            } catch (Exception unused) {
                setContentDescription(null);
            }
            if (TextUtils.isEmpty(null)) {
                setContentDescription(null);
                invalidate();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb2.append(tL_messageMediaVenue.title);
        }
        if (!TextUtils.isEmpty(null) || tL_messageMediaVenue == null) {
            str = null;
        } else {
            str = tL_messageMediaVenue.address;
        }
        if (!TextUtils.isEmpty(str)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((CharSequence) str);
        }
        if (sb2.length() > 0) {
            str2 = sb2.toString();
        } else {
            str2 = null;
        }
        setContentDescription(str2);
        invalidate();
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f21637c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint G;
        float dp;
        float width;
        v00 v00Var = f21634x;
        org.telegram.ui.ActionBar.d6 d6Var = this.f21638f;
        if (v00Var == null) {
            v00 v00Var2 = new v00(getContext(), d6Var);
            f21634x = v00Var2;
            v00Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        v00 v00Var3 = f21634x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        v00Var3.O = measuredWidth;
        v00Var3.P = measuredHeight;
        v00Var3.Q = dp2 * (-i10);
        f21634x.setViewType(4);
        f21634x.e();
        f21634x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), ok.A(56.0f, getMeasuredHeight(), 2));
        f21634x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (d6Var == null) {
                G = null;
            } else {
                G = d6Var.G("paintDivider");
            }
            if (G == null) {
                G = org.telegram.ui.ActionBar.h6.f19180k0;
            }
            Paint paint = G;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float height = getHeight() - 1;
            if (LocaleController.isRTL) {
                width = getWidth() - AndroidUtilities.dp(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(dp, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
