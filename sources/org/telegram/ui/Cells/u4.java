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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k10;
public final class u4 extends FrameLayout {
    public static k10 f23489x;
    public final org.telegram.ui.Components.r6 f23490a;
    public final org.telegram.ui.Components.r6 f23491b;
    public final org.telegram.ui.Components.y9 f23492c;
    public final ShapeDrawable d;
    public boolean f23493e;
    public final org.telegram.ui.ActionBar.e6 f23494f;
    public boolean h;
    public CharSequence f23495n;
    public String f23496r;
    public String f23497s;
    public float v;
    public ValueAnimator f23498w;

    public u4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f23494f = e6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23492c = y9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        y9Var.setBackground(K);
        y9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
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
        addView(y9Var, w7.x5.a(42.0f, f7, 11.0f, f10, 0.0f, 42, i17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f23490a = r6Var;
        is isVar = is.h;
        r6Var.b(0.4f, 350L, isVar);
        r6Var.setScaleProperty(0.6f);
        r6Var.setTextSize(AndroidUtilities.dp(16.0f));
        r6Var.setEllipsizeByGradient(true);
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        r6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        r6Var.setGravity(i11);
        r6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(r6Var);
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
        addView(r6Var, w7.x5.a(22.0f, f11, 10.0f, i14, 0.0f, -1, i18));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f23491b = r6Var2;
        r6Var2.setScaleProperty(0.6f);
        r6Var2.b(0.4f, 350L, isVar);
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var2.setEllipsizeByGradient(true);
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        r6Var2.setGravity(i15);
        boolean z12 = LocaleController.isRTL;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 16;
        } else {
            i16 = 73;
        }
        addView(r6Var2, w7.x5.a(20.0f, i16, 35.0f, z12 ? 73 : 16, 0.0f, -1, i19));
        y9Var.setAlpha(this.v);
        r6Var.setAlpha(this.v);
        r6Var2.setAlpha(this.v);
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
        float f7;
        String str;
        String str2;
        String str3;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.f23493e = z10;
        org.telegram.ui.Components.r6 r6Var = this.f23490a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f23496r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f23497s, tL_messageMediaVenue.title)) {
                charSequence = this.f23495n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), r6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f23496r = tL_messageMediaVenue.emoji;
                this.f23497s = tL_messageMediaVenue.title;
                this.f23495n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            r6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.r6 r6Var2 = this.f23491b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !LocaleController.isRTL && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            r6Var2.c(str4, z14, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.y9 y9Var = this.f23492c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                y9Var.f(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20996ni, this.f23494f), PorterDuff.Mode.MULTIPLY));
                fr frVar = new fr(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                frVar.h = dp;
                frVar.f26500n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                frVar.f26498e = dp3;
                frVar.f26499f = dp4;
                y9Var.setImageDrawable(frVar);
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
        ValueAnimator valueAnimator = this.f23498w;
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
        final float f11 = f7;
        final long abs = Math.abs(f10 - f11) * 150.0f;
        this.f23498w = ValueAnimator.ofFloat(f10, f11);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f23498w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                long j3 = abs;
                float f12 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j3), 0.0f), 1.0f);
                if (j3 > 0) {
                    f12 = min;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, f12);
                u4Var.v = lerp;
                u4Var.f23492c.setAlpha(lerp);
                u4Var.f23490a.setAlpha(u4Var.v);
                u4Var.f23491b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f23498w;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f23498w.start();
        y9Var.setAlpha(f10);
        r6Var.setAlpha(f10);
        r6Var2.setAlpha(f10);
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

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f23492c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint F;
        float dp;
        float width;
        k10 k10Var = f23489x;
        org.telegram.ui.ActionBar.e6 e6Var = this.f23494f;
        if (k10Var == null) {
            k10 k10Var2 = new k10(getContext(), e6Var);
            f23489x = k10Var2;
            k10Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        k10 k10Var3 = f23489x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        k10Var3.O = measuredWidth;
        k10Var3.P = measuredHeight;
        k10Var3.Q = dp2 * (-i10);
        f23489x.setViewType(4);
        f23489x.e();
        f23489x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), bi.A(56.0f, getMeasuredHeight(), 2));
        f23489x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f23493e) {
            if (e6Var == null) {
                F = null;
            } else {
                F = e6Var.F("paintDivider");
            }
            if (F == null) {
                F = org.telegram.ui.ActionBar.i6.f20923k0;
            }
            Paint paint = F;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f23493e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
