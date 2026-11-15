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
import java.util.HashSet;
public final class mx0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView f49329a;
    public final TextView f49330b;
    public final ImageView f49331c;
    public org.telegram.messenger.fz d;
    public Drawable f49332e;
    public final org.telegram.ui.Components.fp f49333f;
    public boolean h;
    public boolean f49334n;
    public int f49335r;
    public final ProxyListActivity f49336s;

    public mx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f49336s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f49329a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        boolean z10 = org.telegram.messenger.hd.f24104a0;
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
        addView(textView, c8.ja.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f49330b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f24104a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.hd.f24104a0;
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
        addView(textView2, c8.ja.d(-2, -2.0f, i18, i15, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f49331c = imageView;
        imageView.setImageResource(2131232186);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131751335, null));
        if (org.telegram.messenger.hd.f24104a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, c8.ja.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new g40(this, 28));
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(21, context, null);
        this.f49333f = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.i7, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawBackgroundAsArc(14);
        fpVar.setVisibility(8);
        addView(fpVar, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.f24104a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int L;
        float f10;
        int i7;
        if (this.f49334n == z10 && z11) {
            return;
        }
        this.f49334n = z10;
        if (org.telegram.messenger.hd.f24104a0) {
            L = -org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f11 = L;
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f49329a.setTranslationX(f11);
            this.f49330b.setTranslationX(f11);
            ImageView imageView = this.f49331c;
            imageView.setTranslationX(f11);
            boolean z12 = org.telegram.messenger.hd.f24104a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z12) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.fp fpVar = this.f49333f;
            fpVar.setTranslationX(f13);
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            imageView.setVisibility(i7);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i10 = 8;
            }
            fpVar.setVisibility(i10);
            fpVar.setAlpha(1.0f);
            fpVar.setScaleX(1.0f);
            fpVar.setScaleY(1.0f);
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
        duration.setInterpolator(org.telegram.ui.Components.er.f34419f);
        duration.addUpdateListener(new pf(this, f11, 4));
        duration.addListener(new z20(7, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mx0.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (org.telegram.messenger.hd.f24104a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.i20.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f49330b;
        if (z10) {
            if (this.f49332e == null) {
                this.f49332e = getResources().getDrawable(2131232626).mutate();
            }
            Drawable drawable = this.f49332e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f49335r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.hd.f24104a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f49332e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f49332e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.fz fzVar) {
        String str;
        if (fzVar.f23577a.f60041a == 3) {
            str = a8.p0.s(new StringBuilder(), fzVar.f23577a.f60042b, " (WEB)");
        } else {
            str = fzVar.f23577a.f60042b + ":" + fzVar.f23577a.f60043c;
        }
        this.f49329a.setText(str);
        this.d = fzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f49330b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f49330b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.j6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f49335r) {
                    this.f49335r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f49332e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f49335r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
