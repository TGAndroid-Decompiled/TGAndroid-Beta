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
public final class nx0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView f48158a;
    public final TextView f48159b;
    public final ImageView f48160c;
    public org.telegram.messenger.hz d;
    public Drawable f48161e;
    public final org.telegram.ui.Components.wo f48162f;
    public boolean h;
    public boolean f48163n;
    public int f48164r;
    public final ProxyListActivity f48165s;

    public nx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f48165s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f48158a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        boolean z9 = org.telegram.messenger.id.f23157a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z9) {
            i11 = 56;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (z9) {
            i12 = 21;
        } else {
            i12 = 56;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f48159b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.id.f23157a0) {
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
        boolean z10 = org.telegram.messenger.id.f23157a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z10) {
            i15 = 56;
        } else {
            i15 = 21;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i18, i15, 35.0f, z10 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f48160c = imageView;
        imageView.setImageResource(2131232185);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131751336, null));
        if (org.telegram.messenger.id.f23157a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new g40(this, 28));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f48162f = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
        woVar.setDrawBackgroundAsArc(14);
        woVar.setVisibility(8);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z9, boolean z10) {
        int L;
        float f10;
        int i7;
        if (this.f48163n == z9 && z10) {
            return;
        }
        this.f48163n = z9;
        if (org.telegram.messenger.id.f23157a0) {
            L = -org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f11 = L;
        int i10 = 0;
        float f12 = 0.0f;
        if (!z10) {
            if (!z9) {
                f11 = 0.0f;
            }
            this.f48158a.setTranslationX(f11);
            this.f48159b.setTranslationX(f11);
            ImageView imageView = this.f48160c;
            imageView.setTranslationX(f11);
            boolean z11 = org.telegram.messenger.id.f23157a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z11) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.wo woVar = this.f48162f;
            woVar.setTranslationX(f13);
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            imageView.setVisibility(i7);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z9) {
                i10 = 8;
            }
            woVar.setVisibility(i10);
            woVar.setAlpha(1.0f);
            woVar.setScaleX(1.0f);
            woVar.setScaleY(1.0f);
            return;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f12).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.xq.f40366f);
        duration.addUpdateListener(new sf(this, f11, 4));
        duration.addListener(new z40(6, this, z9));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nx0.b():void");
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
        if (org.telegram.messenger.id.f23157a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.id.f23157a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z9) {
        TextView textView = this.f48159b;
        if (z9) {
            if (this.f48161e == null) {
                this.f48161e = getResources().getDrawable(2131232625).mutate();
            }
            Drawable drawable = this.f48161e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f48164r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.id.f23157a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f48161e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f48161e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.hz hzVar) {
        String str;
        if (hzVar.f22994a.f56915a == 3) {
            str = a8.p0.s(new StringBuilder(), hzVar.f22994a.f56916b, " (WEB)");
        } else {
            str = hzVar.f22994a.f56916b + ":" + hzVar.f22994a.f56917c;
        }
        this.f48158a.setText(str);
        this.d = hzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f48159b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f48159b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.k6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f48164r) {
                    this.f48164r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f48161e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f48164r, PorterDuff.Mode.MULTIPLY));
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
