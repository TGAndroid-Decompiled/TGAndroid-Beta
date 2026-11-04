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
import b8.mf;
import org.telegram.messenger.bd;
public final class u6 extends FrameLayout {
    public final TextView f30653a;
    public final TextView f30654b;
    public final ImageView f30655c;
    public boolean d;
    public int f30656e;

    public u6(Context context) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        TextView textView = new TextView(context);
        this.f30653a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        textView.setTextSize(1, 16.0f);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = bd.f21784a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        if (z10) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, mf.d(-2, -2.0f, i10, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30654b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z11) {
            f12 = 16.0f;
        } else {
            f12 = 71.0f;
        }
        if (z11) {
            f13 = 71.0f;
        } else {
            f13 = 16.0f;
        }
        addView(textView2, mf.d(-2, -2.0f, i12, f12, 33.0f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30655c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, null, PorterDuff.Mode.MULTIPLY);
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(imageView, mf.d(48, 48.0f, i13, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z10, boolean z11) {
        TextView textView = this.f30653a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.f30654b;
        if (z10) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232695).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new t6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i3]);
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
                        Drawable mutate2 = getContext().getResources().getDrawable(2131232695).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.f28290z6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new t6(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
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
        this.f30655c.setVisibility(8);
        this.d = z11;
        setWillNotDraw(!z11);
        this.f30656e = 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i3, boolean z10) {
        float f10;
        float f11;
        float f12;
        TextView textView = this.f30653a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        float f13 = 71.0f;
        if (bd.f21784a0) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (bd.f21784a0) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        TextView textView2 = this.f30654b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232695).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28290z6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new t6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i10]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            if (bd.f21784a0) {
                f12 = 16.0f;
            } else {
                f12 = 71.0f;
            }
            layoutParams2.leftMargin = org.telegram.messenger.g0.L(f12);
            if (!bd.f21784a0) {
                f13 = 16.0f;
            }
            layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
        } else {
            layoutParams.topMargin = org.telegram.messenger.g0.L(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.f30655c;
        if (i3 != 0) {
            imageView.setImageResource(i3);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f30656e = 69;
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.d) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(this.f30656e);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(this.f30656e);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
