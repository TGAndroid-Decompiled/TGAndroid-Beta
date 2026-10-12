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
public final class n21 extends FrameLayout {
    public final TextView f38406a;
    public final TextView f38407b;
    public final ImageView f38408c;
    public SharedConfig.ProxyInfo d;
    public Drawable e;
    public final org.telegram.ui.Components.aq f38409f;
    public boolean h;
    public boolean f38410n;
    public int f38411r;
    public final ProxyListActivity f38412s;

    public n21(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f38412s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f38406a = textView;
        org.telegram.messenger.yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
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
        addView(textView, w7.a6.a(-2.0f, f7, 10.0f, i13, 0.0f, -2, i18));
        TextView textView2 = new TextView(context);
        this.f38407b = textView2;
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
        addView(textView2, w7.a6.a(-2.0f, i16, 35.0f, z11 ? 21 : 56, 0.0f, -2, i19));
        ImageView imageView = new ImageView(context);
        this.f38408c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, w7.a6.a(48.0f, 8.0f, 8.0f, 8.0f, 0.0f, 48, i17 | 48));
        imageView.setOnClickListener(new t60(this, 25));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.f38409f = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.f19991i7, org.telegram.ui.ActionBar.g6.f19955g7, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawBackgroundAsArc(14);
        aqVar.setVisibility(8);
        addView(aqVar, w7.a6.a(24.0f, 16.0f, 0.0f, 8.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int dp;
        float f7;
        int i10;
        if (this.f38410n == z10 && z11) {
            return;
        }
        this.f38410n = z10;
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
            this.f38406a.setTranslationX(f10);
            this.f38407b.setTranslationX(f10);
            ImageView imageView = this.f38408c;
            imageView.setTranslationX(f10);
            boolean z12 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z12) {
                dp2 = -dp2;
            }
            float f12 = dp2 + f10;
            org.telegram.ui.Components.aq aqVar = this.f38409f;
            aqVar.setTranslationX(f12);
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
            aqVar.setVisibility(i11);
            aqVar.setAlpha(1.0f);
            aqVar.setScaleX(1.0f);
            aqVar.setScaleY(1.0f);
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
        duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
        duration.addUpdateListener(new qg(this, f10, 4));
        duration.addListener(new i50(7, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n21.b():void");
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
        float f7 = dp;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.yh.D(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f38407b;
        if (z10) {
            if (this.e == null) {
                this.e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f38411r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.settings.f43650a == 3) {
            str = a1.g.s(new StringBuilder(), proxyInfo.settings.f43651b, " (WEB)");
        } else {
            str = proxyInfo.settings.f43651b + ":" + proxyInfo.settings.f43652c;
        }
        this.f38406a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f38407b.setText(charSequence);
    }
}
