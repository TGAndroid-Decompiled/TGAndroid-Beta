package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w6 extends FrameLayout {
    public final TextView f24363a;
    public final TextView f24364b;
    public final ImageView f24365c;
    public boolean d;
    public int f24366e;

    public w6(Context context) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        TextView textView = new TextView(context);
        this.f24363a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z4) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        if (z4) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, k7.c6.d(-2, -2.0f, i11, f10, 10.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24364b = textView2;
        org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
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
        addView(textView2, k7.c6.d(-2, -2.0f, i13, f12, 33.0f, f13, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24365c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21823m6, false), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(imageView, k7.c6.d(48, 48.0f, i14, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z4, boolean z10) {
        TextView textView = this.f24363a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.f24364b;
        if (z4) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new v6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i10]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    if (i11 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), PorterDuff.Mode.MULTIPLY));
                        spannableStringBuilder2.setSpan(new v6(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i11]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            } else {
                layoutParams.topMargin = AndroidUtilities.dp(21.0f);
                textView2.setVisibility(8);
            }
        }
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int dp2 = AndroidUtilities.dp(16.0f);
        layoutParams2.rightMargin = dp2;
        layoutParams2.leftMargin = dp2;
        this.f24365c.setVisibility(8);
        this.d = z10;
        setWillNotDraw(!z10);
        this.f24366e = 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i10, boolean z4) {
        float f10;
        float f11;
        float f12;
        TextView textView = this.f24363a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        float f13 = 71.0f;
        if (LocaleController.isRTL) {
            f10 = 16.0f;
        } else {
            f10 = 71.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = 71.0f;
        } else {
            f11 = 16.0f;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        TextView textView2 = this.f24364b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (i11 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new v6(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i11]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            if (LocaleController.isRTL) {
                f12 = 16.0f;
            } else {
                f12 = 71.0f;
            }
            layoutParams2.leftMargin = AndroidUtilities.dp(f12);
            if (!LocaleController.isRTL) {
                f13 = 16.0f;
            }
            layoutParams2.rightMargin = AndroidUtilities.dp(f13);
        } else {
            layoutParams.topMargin = AndroidUtilities.dp(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.f24365c;
        if (i10 != 0) {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f24366e = 69;
        this.d = z4;
        setWillNotDraw(!z4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(this.f24366e);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(this.f24366e);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
