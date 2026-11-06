package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
public final class v6 extends FrameLayout {
    public final TextView f30637a;
    public final TextView f30638b;
    public final ImageView f30639c;
    public boolean d;
    public int f30640e;

    public v6(Context context) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        TextView textView = new TextView(context);
        this.f30637a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        textView.setTextSize(1, 16.0f);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = hd.f22871a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z9) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        if (z9) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i10, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30638b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28258z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        if (hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        boolean z10 = hd.f22871a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z10) {
            f12 = 16.0f;
        } else {
            f12 = 71.0f;
        }
        if (z10) {
            f13 = 71.0f;
        } else {
            f13 = 16.0f;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i12, f12, 33.0f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30639c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28013m6, null, PorterDuff.Mode.MULTIPLY);
        if (hd.f22871a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i13, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z9, boolean z10) {
        TextView textView = this.f30637a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.f30638b;
        if (z9) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (i7 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232697).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new u6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i7]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (i10 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(2131232697).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.f28258z6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new u6(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i10]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
            } else {
                layoutParams.topMargin = org.telegram.messenger.g0.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = org.telegram.messenger.g0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(16.0f);
        layoutParams2.rightMargin = L2;
        layoutParams2.leftMargin = L2;
        this.f30639c.setVisibility(8);
        this.d = z10;
        setWillNotDraw(!z10);
        this.f30640e = 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i7, boolean z9) {
        float f10;
        float f11;
        float f12;
        TextView textView = this.f30637a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        float f13 = 71.0f;
        if (hd.f22871a0) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (hd.f22871a0) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        TextView textView2 = this.f30638b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232697).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28258z6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new u6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i10]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            if (hd.f22871a0) {
                f12 = 16.0f;
            } else {
                f12 = 71.0f;
            }
            layoutParams2.leftMargin = org.telegram.messenger.g0.L(f12);
            if (!hd.f22871a0) {
                f13 = 16.0f;
            }
            layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
        } else {
            layoutParams.topMargin = org.telegram.messenger.g0.L(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.f30639c;
        if (i7 != 0) {
            imageView.setImageResource(i7);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f30640e = 69;
        this.d = z9;
        setWillNotDraw(!z9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            if (hd.f22871a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(this.f30640e);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(this.f30640e);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
