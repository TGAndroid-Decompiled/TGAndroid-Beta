package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zr;
public final class t4 extends FrameLayout {
    public static z00 f23683x;
    public final org.telegram.ui.Components.o6 f23684a;
    public final org.telegram.ui.Components.o6 f23685b;
    public final org.telegram.ui.Components.u9 f23686c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.g6 f23687f;
    public boolean h;
    public CharSequence f23688n;
    public String f23689r;
    public String f23690s;
    public float v;
    public ValueAnimator f23691w;

    public t4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f23687f = g6Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f23686c = u9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        u9Var.setBackground(K);
        u9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
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
        addView(u9Var, w7.z5.d(42, 42.0f, i17, f7, 11.0f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f23684a = o6Var;
        zr zrVar = zr.h;
        o6Var.b(0.4f, 350L, zrVar);
        o6Var.setScaleProperty(0.6f);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.a0(o6Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        o6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        o6Var.setGravity(i11);
        o6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(o6Var);
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
        addView(o6Var, w7.z5.d(-1, 22.0f, i18, f11, 10.0f, i14, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f23685b = o6Var2;
        o6Var2.setScaleProperty(0.6f);
        o6Var2.b(0.4f, 350L, zrVar);
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.a0(o6Var2, org.telegram.ui.ActionBar.k6.A6, g6Var);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        o6Var2.setGravity(i15);
        boolean z12 = LocaleController.isRTL;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 16;
        } else {
            i16 = 73;
        }
        addView(o6Var2, w7.z5.d(-1, 20.0f, i19, i16, 35.0f, z12 ? 73 : 16, 0.0f));
        u9Var.setAlpha(this.v);
        o6Var.setAlpha(this.v);
        o6Var2.setAlpha(this.v);
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
        this.e = z10;
        org.telegram.ui.Components.o6 o6Var = this.f23684a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f23689r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f23690s, tL_messageMediaVenue.title)) {
                charSequence = this.f23688n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), o6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f23689r = tL_messageMediaVenue.emoji;
                this.f23690s = tL_messageMediaVenue.title;
                this.f23688n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            o6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.o6 o6Var2 = this.f23685b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !LocaleController.isRTL && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            o6Var2.c(str4, z14, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.u9 u9Var = this.f23686c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                u9Var.g(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.f21379ni, this.f23687f, PorterDuff.Mode.MULTIPLY);
                wq wqVar = new wq(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                wqVar.h = dp;
                wqVar.f32326n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                wqVar.e = dp3;
                wqVar.f32325f = dp4;
                u9Var.setImageDrawable(wqVar);
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
        ValueAnimator valueAnimator = this.f23691w;
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
        this.f23691w = ValueAnimator.ofFloat(f10, f11);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f23691w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                t4 t4Var = t4.this;
                t4Var.getClass();
                long j10 = abs;
                float f12 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j10), 0.0f), 1.0f);
                if (j10 > 0) {
                    f12 = min;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, f12);
                t4Var.v = lerp;
                t4Var.f23686c.setAlpha(lerp);
                t4Var.f23684a.setAlpha(t4Var.v);
                t4Var.f23685b.setAlpha(t4Var.v);
                t4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f23691w;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f23691w.start();
        u9Var.setAlpha(f10);
        o6Var.setAlpha(f10);
        o6Var2.setAlpha(f10);
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

    public org.telegram.ui.Components.u9 getImageView() {
        return this.f23686c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint d;
        float dp;
        float width;
        z00 z00Var = f23683x;
        org.telegram.ui.ActionBar.g6 g6Var = this.f23687f;
        if (z00Var == null) {
            z00 z00Var2 = new z00(getContext(), g6Var);
            f23683x = z00Var2;
            z00Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        z00 z00Var3 = f23683x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        z00Var3.O = measuredWidth;
        z00Var3.P = measuredHeight;
        z00Var3.Q = dp2 * (-i10);
        f23683x.setViewType(4);
        f23683x.updateColors();
        f23683x.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), tl.A(56.0f, getMeasuredHeight(), 2));
        f23683x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (g6Var == null) {
                d = null;
            } else {
                d = g6Var.d("paintDivider");
            }
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            Paint paint = d;
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
