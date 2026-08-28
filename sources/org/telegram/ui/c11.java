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
public final class c11 extends FrameLayout {
    public final TextView f37037a;
    public final TextView f37038b;
    public final ImageView f37039c;
    public SharedConfig.ProxyInfo d;
    public Drawable f37040e;
    public final org.telegram.ui.Components.dp f37041f;
    public boolean h;
    public boolean f37042n;
    public int f37043r;
    public final ProxyListActivity f37044s;

    public c11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f37044s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f37037a = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z10) {
            i11 = 56;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (z10) {
            i12 = 21;
        } else {
            i12 = 56;
        }
        addView(textView, g7.e6.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f37038b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z11) {
            i15 = 56;
        } else {
            i15 = 21;
        }
        addView(textView2, g7.e6.d(-2, -2.0f, i18, i15, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37039c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, g7.e6.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new q50(this, 27));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.f37041f = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.f23093i7, org.telegram.ui.ActionBar.f6.f23056g7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawBackgroundAsArc(14);
        dpVar.setVisibility(8);
        addView(dpVar, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int dp;
        float f10;
        int i9;
        if (this.f37042n == z10 && z11) {
            return;
        }
        this.f37042n = z10;
        if (LocaleController.isRTL) {
            dp = -AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f11 = dp;
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f37037a.setTranslationX(f11);
            this.f37038b.setTranslationX(f11);
            ImageView imageView = this.f37039c;
            imageView.setTranslationX(f11);
            boolean z12 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z12) {
                dp2 = -dp2;
            }
            float f13 = dp2 + f11;
            org.telegram.ui.Components.dp dpVar = this.f37041f;
            dpVar.setTranslationX(f13);
            if (z10) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            imageView.setVisibility(i9);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i10 = 8;
            }
            dpVar.setVisibility(i10);
            dpVar.setAlpha(1.0f);
            dpVar.setScaleX(1.0f);
            dpVar.setScaleY(1.0f);
            return;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f12).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        duration.addUpdateListener(new cg(this, f11, 4));
        duration.addListener(new n60(6, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c11.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(20.0f);
        } else {
            i9 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), org.telegram.messenger.ll.C(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f37038b;
        if (z10) {
            if (this.f37040e == null) {
                this.f37040e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.f37040e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f37043r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f37040e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f37040e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        this.f37037a.setText(proxyInfo.address + ":" + proxyInfo.port);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f37038b.setText(charSequence);
    }
}
