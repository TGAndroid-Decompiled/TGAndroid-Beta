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
import org.telegram.messenger.rl;

public final class t6 extends FrameLayout {

    public final TextView f25675a;

    public final TextView f25676b;

    public final ImageView f25677c;
    public boolean d;

    public int f25678e;

    public t6(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f25675a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 16.0f : 71.0f, 10.0f, z10 ? 71.0f : 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25676b = textView2;
        rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, z11 ? 5 : 3, z11 ? 16.0f : 71.0f, 33.0f, z11 ? 71.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25677c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.d(48, 48.0f, LocaleController.isRTL ? 5 : 3, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z10, boolean z11) {
        TextView textView = this.f25675a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.f25676b;
        if (z10) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new s6(drawableMutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
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
                        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), PorterDuff.Mode.MULTIPLY));
                        spannableStringBuilder2.setSpan(new s6(drawableMutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
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
        int iDp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = iDp;
        layoutParams.leftMargin = iDp;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int iDp2 = AndroidUtilities.dp(16.0f);
        layoutParams2.rightMargin = iDp2;
        layoutParams2.leftMargin = iDp2;
        this.f25677c.setVisibility(8);
        this.d = z11;
        setWillNotDraw(!z11);
        this.f25678e = 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i10, boolean z10) {
        TextView textView = this.f25675a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 71.0f);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 71.0f : 16.0f);
        TextView textView2 = this.f25676b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (i11 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new s6(drawableMutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i11]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 71.0f);
            layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 71.0f : 16.0f);
        } else {
            layoutParams.topMargin = AndroidUtilities.dp(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.f25677c;
        if (i10 != 0) {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f25678e = 69;
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.f25678e), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(this.f25678e) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
