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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;

public final class r4 extends FrameLayout {

    public static h00 f25206x;

    public final org.telegram.ui.Components.j6 f25207a;

    public final org.telegram.ui.Components.j6 f25208b;

    public final org.telegram.ui.Components.n9 f25209c;
    public final ShapeDrawable d;

    public boolean f25210e;

    public final org.telegram.ui.ActionBar.c6 f25211f;
    public boolean h;

    public CharSequence f25212n;

    public String f25213r;

    public String f25214s;
    public float v;

    public ValueAnimator f25215w;

    public r4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = 0.0f;
        this.f25211f = c6Var;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f25209c = n9Var;
        ShapeDrawable shapeDrawableK = org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = shapeDrawableK;
        n9Var.setBackground(shapeDrawableK);
        n9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25207a = j6Var;
        er erVar = er.h;
        j6Var.b(0.4f, 350L, erVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setEllipsizeByGradient(true);
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(j6Var);
        boolean z11 = LocaleController.isRTL;
        addView(j6Var, h7.z5.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25208b = j6Var2;
        j6Var2.setScaleProperty(0.6f);
        j6Var2.b(0.4f, 350L, erVar);
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        j6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z12 = LocaleController.isRTL;
        addView(j6Var2, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        n9Var.setAlpha(this.v);
        j6Var.setAlpha(this.v);
        j6Var2.setAlpha(this.v);
    }

    public static int a(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return -1351584;
        }
        if (i11 == 1) {
            return -868277;
        }
        if (i11 == 2) {
            return -12214795;
        }
        if (i11 == 3) {
            return -13187226;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1285237 : -12338729;
        }
        return -7900675;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z10, boolean z11) {
        StringBuilder sb2;
        String str;
        String string;
        String str2;
        CharSequence charSequenceReplaceEmoji;
        this.f25210e = z10;
        org.telegram.ui.Components.j6 j6Var = this.f25207a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.f25213r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.f25214s, tL_messageMediaVenue.title)) {
                charSequenceReplaceEmoji = this.f25212n;
            } else {
                charSequenceReplaceEmoji = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequenceReplaceEmoji = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequenceReplaceEmoji), j6Var.getPaint().getFontMetricsInt(), false);
                }
                this.f25213r = tL_messageMediaVenue.emoji;
                this.f25214s = tL_messageMediaVenue.title;
                this.f25212n = charSequenceReplaceEmoji;
            }
            j6Var.c(charSequenceReplaceEmoji, this.h && !LocaleController.isRTL && z11, true);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.f25208b;
        if (tL_messageMediaVenue != null) {
            j6Var2.c(tL_messageMediaVenue.address, this.h && !LocaleController.isRTL && z11, true);
        }
        int iA = a(i10);
        org.telegram.ui.Components.n9 n9Var = this.f25209c;
        if (tL_messageMediaVenue != null && (str2 = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str2) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable drawableMutate = getResources().getDrawable(R.drawable.pin).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, this.f25211f), PorterDuff.Mode.MULTIPLY));
                dq dqVar = new dq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), 0), drawableMutate);
                int iDp = AndroidUtilities.dp(42.0f);
                int iDp2 = AndroidUtilities.dp(42.0f);
                dqVar.h = iDp;
                dqVar.f27825n = iDp2;
                int iDp3 = AndroidUtilities.dp(24.0f);
                int iDp4 = AndroidUtilities.dp(24.0f);
                dqVar.f27823e = iDp3;
                dqVar.f27824f = iDp4;
                n9Var.setImageDrawable(dqVar);
            } else {
                n9Var.f(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(iA);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.f25215w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z12 = tL_messageMediaVenue == null;
        final float f10 = this.v;
        final float f11 = z12 ? 0.0f : 1.0f;
        final long jAbs = (long) (Math.abs(f10 - f11) * 150.0f);
        this.f25215w = ValueAnimator.ofFloat(f10, f11);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f25215w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r4 r4Var = this.f25049a;
                r4Var.getClass();
                float fElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime;
                long j10 = jAbs;
                float fLerp = AndroidUtilities.lerp(f10, f11, j10 > 0 ? Math.min(Math.max(fElapsedRealtime / j10, 0.0f), 1.0f) : 1.0f);
                r4Var.v = fLerp;
                r4Var.f25209c.setAlpha(fLerp);
                r4Var.f25207a.setAlpha(r4Var.v);
                r4Var.f25208b.setAlpha(r4Var.v);
                r4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.f25215w;
        if (z12) {
            jAbs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(jAbs);
        this.f25215w.start();
        n9Var.setAlpha(f10);
        j6Var.setAlpha(f10);
        j6Var2.setAlpha(f10);
        if (tL_messageMediaVenue == null) {
            try {
                try {
                    if (TextUtils.isEmpty(null)) {
                        setContentDescription(null);
                    } else {
                        sb2 = new StringBuilder();
                        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
                            sb2.append(tL_messageMediaVenue.title);
                        }
                        if (TextUtils.isEmpty(null) || tL_messageMediaVenue == null) {
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
                            string = sb2.toString();
                        } else {
                            string = null;
                        }
                        setContentDescription(string);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                setContentDescription(null);
            }
        } else {
            sb2 = new StringBuilder();
            if (tL_messageMediaVenue != null) {
                sb2.append(tL_messageMediaVenue.title);
            }
            if (TextUtils.isEmpty(null)) {
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
                string = sb2.toString();
            } else {
                string = null;
            }
            setContentDescription(string);
        }
        invalidate();
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.f25209c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h00 h00Var = f25206x;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25211f;
        if (h00Var == null) {
            h00 h00Var2 = new h00(getContext(), c6Var);
            f25206x = h00Var2;
            h00Var2.setIsSingleCell(true);
        }
        int iIndexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        h00 h00Var3 = f25206x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iDp = AndroidUtilities.dp(56.0f);
        h00Var3.K = measuredWidth;
        h00Var3.L = measuredHeight;
        h00Var3.M = iDp * (-iIndexOfChild);
        f25206x.setViewType(4);
        f25206x.d();
        f25206x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), rl.x(56.0f, getMeasuredHeight(), 2));
        f25206x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.f25210e) {
            Paint paintN = c6Var == null ? null : c6Var.N("paintDivider");
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, paintN);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f25210e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
