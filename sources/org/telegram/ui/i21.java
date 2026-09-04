package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class i21 extends FrameLayout {
    public final TextView f37171a;
    public final TextView f37172b;
    public final ImageView f37173c;
    public SharedConfig.ProxyInfo d;
    public Drawable f37174e;
    public final org.telegram.ui.Components.mp f37175f;
    public boolean h;
    public boolean f37176n;
    public int f37177r;
    public final ProxyListActivity f37178s;

    public i21(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f37178s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f37171a = textView;
        org.telegram.messenger.wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 48;
        if (z10) {
            i12 = 56;
        } else {
            i12 = 21;
        }
        float f7 = i12;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 56;
        }
        addView(textView, w7.x5.d(-2, -2.0f, i18, f7, 10.0f, i13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f37172b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i19 = i15 | 48;
        if (z11) {
            i16 = 56;
        } else {
            i16 = 21;
        }
        addView(textView2, w7.x5.d(-2, -2.0f, i19, i16, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37173c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, w7.x5.d(48, 48.0f, i17 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new l60(this, 26));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 21, null);
        this.f37175f = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.f20754i7, org.telegram.ui.ActionBar.j6.f20719g7, org.telegram.ui.ActionBar.j6.f20792k7);
        mpVar.setDrawBackgroundAsArc(14);
        mpVar.setVisibility(8);
        addView(mpVar, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int dp;
        float f7;
        int i10;
        if (this.f37176n == z10 && z11) {
            return;
        }
        this.f37176n = z10;
        if (LocaleController.isRTL) {
            dp = -AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f10 = dp;
        int i11 = 0;
        float f11 = 0.0f;
        if (!z11) {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f37171a.setTranslationX(f10);
            this.f37172b.setTranslationX(f10);
            ImageView imageView = this.f37173c;
            imageView.setTranslationX(f10);
            boolean z12 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z12) {
                dp2 = -dp2;
            }
            float f12 = dp2 + f10;
            org.telegram.ui.Components.mp mpVar = this.f37175f;
            mpVar.setTranslationX(f12);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i11 = 8;
            }
            mpVar.setVisibility(i11);
            mpVar.setAlpha(1.0f);
            mpVar.setScaleX(1.0f);
            mpVar.setScaleY(1.0f);
            return;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f11).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.pr.f29466f);
        duration.addUpdateListener(new ng(this, f10, 4));
        duration.addListener(new e50(7, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i21.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.wl.C(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f37172b;
        if (z10) {
            if (this.f37174e == null) {
                this.f37174e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.f37174e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f37177r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f37174e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f37174e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.settings.f9478a == 3) {
            str = a4.a.s(new StringBuilder(), proxyInfo.settings.f9479b, " (WEB)");
        } else {
            str = proxyInfo.settings.f9479b + ":" + proxyInfo.settings.f9480c;
        }
        this.f37171a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f37172b.setText(charSequence);
    }
}
