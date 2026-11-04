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
public final class fx0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView f45396a;
    public final TextView f45397b;
    public final ImageView f45398c;
    public org.telegram.messenger.zy d;
    public Drawable f45399e;
    public final org.telegram.ui.Components.wo f45400f;
    public boolean h;
    public boolean f45401n;
    public int f45402r;
    public final ProxyListActivity f45403s;

    public fx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f45403s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f45396a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
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
        addView(textView, b8.mf.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f45397b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.bd.f21784a0) {
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
        boolean z11 = org.telegram.messenger.bd.f21784a0;
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
        addView(textView2, b8.mf.d(-2, -2.0f, i18, i15, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45398c = imageView;
        imageView.setImageResource(2131232185);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131751336, null));
        if (org.telegram.messenger.bd.f21784a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, b8.mf.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new b40(this, 28));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f45400f = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.f27973i7, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawBackgroundAsArc(14);
        woVar.setVisibility(8);
        addView(woVar, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int L;
        float f10;
        int i3;
        if (this.f45401n == z10 && z11) {
            return;
        }
        this.f45401n = z10;
        if (org.telegram.messenger.bd.f21784a0) {
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
            this.f45396a.setTranslationX(f11);
            this.f45397b.setTranslationX(f11);
            ImageView imageView = this.f45398c;
            imageView.setTranslationX(f11);
            boolean z12 = org.telegram.messenger.bd.f21784a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z12) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.wo woVar = this.f45400f;
            woVar.setTranslationX(f13);
            if (z10) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i10 = 8;
            }
            woVar.setVisibility(i10);
            woVar.setAlpha(1.0f);
            woVar.setScaleX(1.0f);
            woVar.setScaleY(1.0f);
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
        duration.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        duration.addUpdateListener(new of(this, f11, 4));
        duration.addListener(new u40(6, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx0.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i3 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), org.telegram.messenger.camera.q.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f45397b;
        if (z10) {
            if (this.f45399e == null) {
                this.f45399e = getResources().getDrawable(2131232623).mutate();
            }
            Drawable drawable = this.f45399e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f45402r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.bd.f21784a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f45399e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f45399e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.zy zyVar) {
        String str;
        if (zyVar.f26993a.f56371a == 3) {
            str = a1.g.s(new StringBuilder(), zyVar.f26993a.f56372b, " (WEB)");
        } else {
            str = zyVar.f26993a.f56372b + ":" + zyVar.f26993a.f56373c;
        }
        this.f45396a.setText(str);
        this.d = zyVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f45397b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f45397b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.k6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f45402r) {
                    this.f45402r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f45399e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f45402r, PorterDuff.Mode.MULTIPLY));
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
