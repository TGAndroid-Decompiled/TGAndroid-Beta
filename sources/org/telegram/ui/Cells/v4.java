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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
public final class v4 extends FrameLayout {
    public static t00 f21670x;
    public final org.telegram.ui.Components.o6 f21671a;
    public final org.telegram.ui.Components.o6 f21672b;
    public final org.telegram.ui.Components.v9 f21673c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.f6 f21674f;
    public boolean h;
    public CharSequence f21675n;
    public String f21676r;
    public String f21677s;
    public float v;
    public ValueAnimator f21678w;

    public v4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f21674f = f6Var;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f21673c = v9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        v9Var.setBackground(K);
        v9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
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
        addView(v9Var, w7.y5.d(42, 42.0f, i17, f7, 11.0f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f21671a = o6Var;
        qr qrVar = qr.h;
        o6Var.b(0.4f, 350L, qrVar);
        o6Var.setScaleProperty(0.6f);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setEllipsizeByGradient(true);
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        o6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        o6Var.setGravity(i11);
        o6Var.getDrawable().G = AndroidUtilities.displaySize.x;
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
        addView(o6Var, w7.y5.d(-1, 22.0f, i18, f11, 10.0f, i14, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f21672b = o6Var2;
        o6Var2.setScaleProperty(0.6f);
        o6Var2.b(0.4f, 350L, qrVar);
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var2.setEllipsizeByGradient(true);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
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
        addView(o6Var2, w7.y5.d(-1, 20.0f, i19, i16, 35.0f, z12 ? 73 : 16, 0.0f));
        v9Var.setAlpha(this.v);
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
        final float f7;
        String str;
        String str2;
        String str3;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.e = z10;
        org.telegram.ui.Components.o6 o6Var = this.f21671a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f21676r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f21677s, tL_messageMediaVenue.title)) {
                charSequence = this.f21675n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), o6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f21676r = tL_messageMediaVenue.emoji;
                this.f21677s = tL_messageMediaVenue.title;
                this.f21675n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            o6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.o6 o6Var2 = this.f21672b;
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
        org.telegram.ui.Components.v9 v9Var = this.f21673c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                v9Var.f(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19288ni, this.f21674f), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                pqVar.h = dp;
                pqVar.f27423n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                pqVar.e = dp3;
                pqVar.f27422f = dp4;
                v9Var.setImageDrawable(pqVar);
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
        ValueAnimator valueAnimator = this.f21678w;
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
        this.f21678w = ValueAnimator.ofFloat(f10, f7);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f21678w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v4 v4Var = v4.this;
                v4Var.getClass();
                long j3 = abs;
                float f11 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j3), 0.0f), 1.0f);
                if (j3 > 0) {
                    f11 = min;
                }
                float lerp = AndroidUtilities.lerp(f10, f7, f11);
                v4Var.v = lerp;
                v4Var.f21673c.setAlpha(lerp);
                v4Var.f21671a.setAlpha(v4Var.v);
                v4Var.f21672b.setAlpha(v4Var.v);
                v4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f21678w;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f21678w.start();
        v9Var.setAlpha(f10);
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

    public org.telegram.ui.Components.v9 getImageView() {
        return this.f21673c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint G;
        float dp;
        float width;
        t00 t00Var = f21670x;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21674f;
        if (t00Var == null) {
            t00 t00Var2 = new t00(getContext(), f6Var);
            f21670x = t00Var2;
            t00Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        t00 t00Var3 = f21670x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        t00Var3.O = measuredWidth;
        t00Var3.P = measuredHeight;
        t00Var3.Q = dp2 * (-i10);
        f21670x.setViewType(4);
        f21670x.e();
        f21670x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), rk.z(56.0f, getMeasuredHeight(), 2));
        f21670x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (f6Var == null) {
                G = null;
            } else {
                G = f6Var.G("paintDivider");
            }
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.f19216k0;
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
