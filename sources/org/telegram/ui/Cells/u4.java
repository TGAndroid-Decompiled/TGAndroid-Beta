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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
public final class u4 extends FrameLayout {
    public static e00 f25734x;
    public final org.telegram.ui.Components.j6 f25735a;
    public final org.telegram.ui.Components.j6 f25736b;
    public final org.telegram.ui.Components.o9 f25737c;
    public final ShapeDrawable d;
    public boolean f25738e;
    public final org.telegram.ui.ActionBar.b6 f25739f;
    public boolean h;
    public CharSequence f25740n;
    public String f25741r;
    public String f25742s;
    public float v;
    public ValueAnimator f25743w;

    public u4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.v = 0.0f;
        this.f25739f = b6Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f25737c = o9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        o9Var.setBackground(K);
        o9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i16 = i9 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 15.0f;
        }
        if (z10) {
            f11 = 15.0f;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(42, 42.0f, i16, f10, 11.0f, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25735a = j6Var;
        gr grVar = gr.h;
        j6Var.b(0.4f, 350L, grVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setEllipsizeByGradient(true);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        j6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j6Var.setGravity(i10);
        j6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(j6Var);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            i12 = 16;
        } else {
            i12 = 73;
        }
        float f12 = i12;
        if (z11) {
            i13 = 73;
        } else {
            i13 = 16;
        }
        addView(j6Var, g7.e6.d(-1, 22.0f, i17, f12, 10.0f, i13, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25736b = j6Var2;
        j6Var2.setScaleProperty(0.6f);
        j6Var2.b(0.4f, 350L, grVar);
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        j6Var2.setGravity(i14);
        boolean z12 = LocaleController.isRTL;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 16;
        } else {
            i15 = 73;
        }
        addView(j6Var2, g7.e6.d(-1, 20.0f, i18, i15, 35.0f, z12 ? 73 : 16, 0.0f));
        o9Var.setAlpha(this.v);
        j6Var.setAlpha(this.v);
        j6Var2.setAlpha(this.v);
    }

    public static int a(int i9) {
        int i10 = i9 % 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
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

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        final float f10;
        String str;
        String str2;
        String str3;
        boolean z14;
        CharSequence charSequence;
        boolean z15;
        this.f25738e = z10;
        org.telegram.ui.Components.j6 j6Var = this.f25735a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f25741r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f25742s, tL_messageMediaVenue.title)) {
                charSequence = this.f25740n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), j6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f25741r = tL_messageMediaVenue.emoji;
                this.f25742s = tL_messageMediaVenue.title;
                this.f25740n = charSequence;
            }
            if (this.h && !LocaleController.isRTL && z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            j6Var.c(charSequence, z15, true);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.f25736b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !LocaleController.isRTL && z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            j6Var2.c(str4, z14, true);
        }
        int a2 = a(i9);
        org.telegram.ui.Components.o9 o9Var = this.f25737c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                o9Var.f(tL_messageMediaVenue.icon, null, null);
            } else {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, this.f25739f), PorterDuff.Mode.MULTIPLY));
                fq fqVar = new fq(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                fqVar.h = dp;
                fqVar.f28547n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                fqVar.f28545e = dp3;
                fqVar.f28546f = dp4;
                o9Var.setImageDrawable(fqVar);
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
        ValueAnimator valueAnimator = this.f25743w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        final float f11 = this.v;
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final long abs = Math.abs(f11 - f10) * 150.0f;
        this.f25743w = ValueAnimator.ofFloat(f11, f10);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f25743w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                u4Var.f25737c.setAlpha(lerp);
                u4Var.f25735a.setAlpha(u4Var.v);
                u4Var.f25736b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f25743w;
        if (z13) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.f25743w.start();
        o9Var.setAlpha(f11);
        j6Var.setAlpha(f11);
        j6Var2.setAlpha(f11);
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

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f25737c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        Paint O;
        float dp;
        float width;
        e00 e00Var = f25734x;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25739f;
        if (e00Var == null) {
            e00 e00Var2 = new e00(getContext(), b6Var);
            f25734x = e00Var2;
            e00Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i9 = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i9 = 0;
        }
        e00 e00Var3 = f25734x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(56.0f);
        e00Var3.K = measuredWidth;
        e00Var3.L = measuredHeight;
        e00Var3.M = dp2 * (-i9);
        f25734x.setViewType(4);
        f25734x.d();
        f25734x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), ll.y(56.0f, getMeasuredHeight(), 2));
        f25734x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f25738e) {
            if (b6Var == null) {
                O = null;
            } else {
                O = b6Var.O("paintDivider");
            }
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint = O;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f25738e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
