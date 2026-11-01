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
public final class bz0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView f36135a;
    public final TextView f36136b;
    public final ImageView f36137c;
    public org.telegram.messenger.tz d;
    public Drawable e;
    public final org.telegram.ui.Components.ep f36138f;
    public boolean h;
    public boolean f36139n;
    public int f36140r;
    public final ProxyListActivity f36141s;

    public bz0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f36141s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f36135a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        boolean z10 = org.telegram.messenger.dd.X;
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
        addView(textView, w7.b6.d(-2, -2.0f, i18, f7, 10.0f, i13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f36136b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.dd.X;
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
        addView(textView2, w7.b6.d(-2, -2.0f, i19, i16, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f36137c = imageView;
        imageView.setImageResource(2131232184);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131751336, null));
        if (org.telegram.messenger.dd.X) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, w7.b6.d(48, 48.0f, i17 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new e50(this, 28));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.f36138f = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.f21022i7, org.telegram.ui.ActionBar.t6.f20987g7, org.telegram.ui.ActionBar.t6.f21060k7);
        epVar.setDrawBackgroundAsArc(14);
        epVar.setVisibility(8);
        addView(epVar, w7.b6.d(24, 24.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int L;
        float f7;
        int i10;
        if (this.f36139n == z10 && z11) {
            return;
        }
        this.f36139n = z10;
        if (org.telegram.messenger.dd.X) {
            L = -org.telegram.messenger.i0.L(32.0f);
        } else {
            L = org.telegram.messenger.i0.L(32.0f);
        }
        float f10 = L;
        int i11 = 0;
        float f11 = 0.0f;
        if (!z11) {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f36135a.setTranslationX(f10);
            this.f36136b.setTranslationX(f10);
            ImageView imageView = this.f36137c;
            imageView.setTranslationX(f10);
            boolean z12 = org.telegram.messenger.dd.X;
            int L2 = org.telegram.messenger.i0.L(32.0f);
            if (!z12) {
                L2 = -L2;
            }
            float f12 = L2 + f10;
            org.telegram.ui.Components.ep epVar = this.f36138f;
            epVar.setTranslationX(f12);
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
            epVar.setVisibility(i11);
            epVar.setAlpha(1.0f);
            epVar.setScaleX(1.0f);
            epVar.setScaleY(1.0f);
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
        duration.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        duration.addUpdateListener(new eg(this, f10, 4));
        duration.addListener(new org.telegram.ui.Components.ha0(22, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (org.telegram.messenger.dd.X) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(20.0f);
        }
        float f7 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.dd.X) {
            i10 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.a30.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f36136b;
        if (z10) {
            if (this.e == null) {
                this.e = getResources().getDrawable(2131232622).mutate();
            }
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f36140r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.dd.X) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.tz tzVar) {
        String str;
        if (tzVar.f18325a.f10428a == 3) {
            str = a1.g.r(new StringBuilder(), tzVar.f18325a.f10429b, " (WEB)");
        } else {
            str = tzVar.f18325a.f10429b + ":" + tzVar.f18325a.f10430c;
        }
        this.f36135a.setText(str);
        this.d = tzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f36136b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f36136b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.t6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f36140r) {
                    this.f36140r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f36140r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
