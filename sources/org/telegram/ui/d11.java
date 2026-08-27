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

    public final TextView f37232a;

    public final TextView f37233b;

    public final ImageView f37234c;
    public SharedConfig.ProxyInfo d;

    public Drawable f37235e;

    public final org.telegram.ui.Components.bp f37236f;
    public boolean h;

    public boolean f37237n;

    public int f37238r;

    public final ProxyListActivity f37239s;

    public d11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.f37239s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f37232a = textView;
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 10.0f, z10 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.f37233b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 56 : 21, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37234c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new u50(this, 27));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 21, null);
        this.f37236f = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23145i7, org.telegram.ui.ActionBar.g6.f23109g7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawBackgroundAsArc(14);
        bpVar.setVisibility(8);
        addView(bpVar, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f37237n == z10 && z11) {
            return;
        }
        this.f37237n = z10;
        float fDp = LocaleController.isRTL ? -AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
            duration.addUpdateListener(new dg(this, fDp, 4));
            duration.addListener(new n40(7, this, z10));
            duration.start();
            return;
        }
        if (!z10) {
            fDp = 0.0f;
        }
        this.f37232a.setTranslationX(fDp);
        this.f37233b.setTranslationX(fDp);
        ImageView imageView = this.f37234c;
        imageView.setTranslationX(fDp);
        boolean z12 = LocaleController.isRTL;
        int iDp = AndroidUtilities.dp(32.0f);
        if (!z12) {
            iDp = -iDp;
        }
        float f10 = iDp + fDp;
        org.telegram.ui.Components.bp bpVar = this.f37236f;
        bpVar.setTranslationX(f10);
        imageView.setVisibility(z10 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        bpVar.setVisibility(z10 ? 0 : 8);
        bpVar.setAlpha(1.0f);
        bpVar.setScaleX(1.0f);
        bpVar.setScaleY(1.0f);
    }

    public final void b() {
        int i10;
        SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
        SharedConfig.ProxyInfo proxyInfo2 = this.d;
        TextView textView = this.f37233b;
        if (proxyInfo == proxyInfo2) {
            ProxyListActivity proxyListActivity = this.f37239s;
            if (proxyListActivity.d) {
                int i11 = proxyListActivity.f36101c;
                if (i11 == 3 || i11 == 5) {
                    i10 = org.telegram.ui.ActionBar.g6.f23320s6;
                    if (proxyInfo2.ping != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.rl.j(R.string.Connected, ", ", sb2);
                        sb2.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(LocaleController.getString(R.string.Connected));
                    }
                    SharedConfig.ProxyInfo proxyInfo3 = this.d;
                    if (!proxyInfo3.checking && !proxyInfo3.available) {
                        proxyInfo3.availableCheckTime = 0L;
                    }
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f23441z6;
                    textView.setText(LocaleController.getString(R.string.Connecting));
                }
            } else if (proxyInfo2.checking) {
                textView.setText(LocaleController.getString(R.string.Checking));
                i10 = org.telegram.ui.ActionBar.g6.f23441z6;
            } else if (proxyInfo2.available) {
                if (proxyInfo2.ping != 0) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.Available, ", ", sb3);
                    sb3.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                    textView.setText(sb3.toString());
                } else {
                    textView.setText(LocaleController.getString(R.string.Available));
                }
                i10 = org.telegram.ui.ActionBar.g6.f23391w6;
            } else {
                textView.setText(LocaleController.getString(R.string.Unavailable));
                i10 = org.telegram.ui.ActionBar.g6.f23269p7;
            }
        } else if (proxyInfo2.checking) {
            textView.setText(LocaleController.getString(R.string.Checking));
            i10 = org.telegram.ui.ActionBar.g6.f23441z6;
        } else if (proxyInfo2.available) {
            if (proxyInfo2.ping != 0) {
                StringBuilder sb4 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.Available, ", ", sb4);
                sb4.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                textView.setText(sb4.toString());
            } else {
                textView.setText(LocaleController.getString(R.string.Available));
            }
            i10 = org.telegram.ui.ActionBar.g6.f23391w6;
        } else {
            textView.setText(LocaleController.getString(R.string.Unavailable));
            i10 = org.telegram.ui.ActionBar.g6.f23269p7;
        }
        this.f37238r = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        textView.setTag(Integer.valueOf(i10));
        textView.setTextColor(this.f37238r);
        Drawable drawable = this.f37235e;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.f37238r, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.rl.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f37233b;
        if (!z10) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (this.f37235e == null) {
            this.f37235e = getResources().getDrawable(R.drawable.proxy_check).mutate();
        }
        Drawable drawable = this.f37235e;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.f37238r, PorterDuff.Mode.MULTIPLY));
        }
        if (LocaleController.isRTL) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f37235e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.f37235e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        this.f37232a.setText(proxyInfo.address + ":" + proxyInfo.port);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f37233b.setText(charSequence);
    }
}
