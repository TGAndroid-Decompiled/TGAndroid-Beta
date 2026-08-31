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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u00;
public final class u4 extends FrameLayout {
    public static u00 f24197x;
    public final org.telegram.ui.Components.k6 f24198a;
    public final org.telegram.ui.Components.k6 f24199b;
    public final org.telegram.ui.Components.p9 f24200c;
    public final ShapeDrawable d;
    public boolean f24201e;
    public final org.telegram.ui.ActionBar.g6 f24202f;
    public boolean h;
    public CharSequence f24203n;
    public String f24204r;
    public String f24205s;
    public float v;
    public ValueAnimator f24206w;

    public u4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.v = 0.0f;
        this.f24202f = g6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f24200c = p9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        p9Var.setBackground(K);
        p9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 15.0f;
        }
        if (z4) {
            f11 = 15.0f;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.c6.d(42, 42.0f, i17, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.f24198a = k6Var;
        pr prVar = pr.h;
        k6Var.b(0.4f, 350L, prVar);
        k6Var.setScaleProperty(0.6f);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setEllipsizeByGradient(true);
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        k6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k6Var.setGravity(i11);
        k6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(k6Var);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z10) {
            i13 = 16;
        } else {
            i13 = 73;
        }
        float f12 = i13;
        if (z10) {
            i14 = 73;
        } else {
            i14 = 16;
        }
        addView(k6Var, k7.c6.d(-1, 22.0f, i18, f12, 10.0f, i14, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.f24199b = k6Var2;
        k6Var2.setScaleProperty(0.6f);
        k6Var2.b(0.4f, 350L, prVar);
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var2.setEllipsizeByGradient(true);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        k6Var2.setGravity(i15);
        boolean z11 = LocaleController.isRTL;
        int i19 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i16 = 16;
        } else {
            i16 = 73;
        }
        addView(k6Var2, k7.c6.d(-1, 20.0f, i19, i16, 35.0f, z11 ? 73 : 16, 0.0f));
        p9Var.setAlpha(this.v);
        k6Var.setAlpha(this.v);
        k6Var2.setAlpha(this.v);
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

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        final float f10;
        String str;
        String str2;
        String str3;
        boolean z13;
        CharSequence charSequence;
        boolean z14;
        this.f24201e = z4;
        org.telegram.ui.Components.k6 k6Var = this.f24198a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f24204r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f24205s, tL_messageMediaVenue.title)) {
                charSequence = this.f24203n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), k6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f24204r = tL_messageMediaVenue.emoji;
                this.f24205s = tL_messageMediaVenue.title;
                this.f24203n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z10) {
                z14 = true;
            } else {
                z14 = false;
            }
            k6Var.c(charSequence, z14, true);
        }
        org.telegram.ui.Components.k6 k6Var2 = this.f24199b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !LocaleController.isRTL && z10) {
                z13 = true;
            } else {
                z13 = false;
            }
            k6Var2.c(str4, z13, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.p9 p9Var = this.f24200c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                p9Var.f(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ni, this.f24202f), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                pqVar.h = dp;
                pqVar.f30170n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                pqVar.f30168e = dp3;
                pqVar.f30169f = dp4;
                p9Var.setImageDrawable(pqVar);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setClickable(z11);
        ValueAnimator valueAnimator = this.f24206w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        final float f11 = this.v;
        if (z12) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final long abs = Math.abs(f11 - f10) * 150.0f;
        this.f24206w = ValueAnimator.ofFloat(f11, f10);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f24206w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                long j10 = abs;
                float f12 = 1.0f;
                float min = Math.min(Math.max(((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) / ((float) j10), 0.0f), 1.0f);
                if (j10 > 0) {
                    f12 = min;
                }
                float lerp = AndroidUtilities.lerp(f11, f10, f12);
                u4Var.v = lerp;
                u4Var.f24200c.setAlpha(lerp);
                u4Var.f24198a.setAlpha(u4Var.v);
                u4Var.f24199b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f24206w;
        if (z12) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f24206w.start();
        p9Var.setAlpha(f11);
        k6Var.setAlpha(f11);
        k6Var2.setAlpha(f11);
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
        StringBuilder sb = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb.append(tL_messageMediaVenue.title);
        }
        if (!TextUtils.isEmpty(null) || tL_messageMediaVenue == null) {
            str = null;
        } else {
            str = tL_messageMediaVenue.address;
        }
        if (!TextUtils.isEmpty(str)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append((CharSequence) str);
        }
        if (sb.length() > 0) {
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        setContentDescription(str2);
        invalidate();
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f24200c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint F;
        float dp;
        float width;
        u00 u00Var = f24197x;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24202f;
        if (u00Var == null) {
            u00 u00Var2 = new u00(getContext(), g6Var);
            f24197x = u00Var2;
            u00Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i10 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i10 = 0;
        }
        u00 u00Var3 = f24197x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        u00Var3.L = measuredWidth;
        u00Var3.M = measuredHeight;
        u00Var3.N = dp2 * (-i10);
        f24197x.setViewType(4);
        f24197x.e();
        f24197x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), org.telegram.ui.b.x(56.0f, getMeasuredHeight(), 2));
        f24197x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f24201e) {
            if (g6Var == null) {
                F = null;
            } else {
                F = g6Var.F("paintDivider");
            }
            if (F == null) {
                F = org.telegram.ui.ActionBar.k6.f21779k0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24201e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z4) {
        this.h = z4;
    }
}
