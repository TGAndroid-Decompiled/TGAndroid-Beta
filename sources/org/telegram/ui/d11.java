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
public final class d11 extends FrameLayout {
    public final TextView f37269a;
    public final TextView f37270b;
    public final ImageView f37271c;
    public SharedConfig.ProxyInfo d;
    public Drawable f37272e;
    public final org.telegram.ui.Components.hp f37273f;
    public boolean h;
    public boolean f37274n;
    public int f37275r;
    public final ProxyListActivity f37276s;

    public d11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f37276s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f37269a = textView;
        b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
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
        float f9 = i12;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 56;
        }
        addView(textView, i7.f6.d(-2, -2.0f, i18, f9, 10.0f, i13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f37270b = textView2;
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
        addView(textView2, i7.f6.d(-2, -2.0f, i19, i16, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37271c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, i7.f6.d(48, 48.0f, i17 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new t50(this, 27));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 21, null);
        this.f37273f = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.f23153i7, org.telegram.ui.ActionBar.g6.f23118g7, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawBackgroundAsArc(14);
        hpVar.setVisibility(8);
        addView(hpVar, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int dp;
        float f9;
        int i10;
        if (this.f37274n == z10 && z11) {
            return;
        }
        this.f37274n = z10;
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
            this.f37269a.setTranslationX(f10);
            this.f37270b.setTranslationX(f10);
            ImageView imageView = this.f37271c;
            imageView.setTranslationX(f10);
            boolean z12 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z12) {
                dp2 = -dp2;
            }
            float f12 = dp2 + f10;
            org.telegram.ui.Components.hp hpVar = this.f37273f;
            hpVar.setTranslationX(f12);
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
            hpVar.setVisibility(i11);
            hpVar.setAlpha(1.0f);
            hpVar.setScaleX(1.0f);
            hpVar.setScaleY(1.0f);
            return;
        }
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f11).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        duration.addUpdateListener(new ag(this, f10, 4));
        duration.addListener(new p60(6, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d11.b():void");
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
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), b.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f37270b;
        if (z10) {
            if (this.f37272e == null) {
                this.f37272e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.f37272e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f37275r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f37272e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f37272e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.type == 2) {
            str = a4.w.q(new StringBuilder(), proxyInfo.address, " (WEB)");
        } else {
            str = proxyInfo.address + ":" + proxyInfo.port;
        }
        this.f37269a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f37270b.setText(charSequence);
    }
}
