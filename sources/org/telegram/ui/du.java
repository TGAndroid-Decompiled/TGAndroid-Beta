package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class du extends FrameLayout {
    public final ImageView f37601a;
    public final TextView f37602b;
    public final ImageView f37603c;
    public final TextView d;
    public boolean f37604e;

    public du(ou ouVar, Context context) {
        super(context);
        int i9;
        int i10;
        setBackgroundColor(ouVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        ImageView imageView = new ImageView(context);
        this.f37601a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(imageView, g7.e6.d(28, 28.0f, i9 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(linearLayout, g7.e6.i(-1.0f, -2.0f, i10 | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.f37602b = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(ouVar.getThemedColor(i11));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.f37603c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        imageView2.setColorFilter(new PorterDuffColorFilter(ouVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        imageView2.setTranslationY(AndroidUtilities.dp(1.0f));
        imageView2.setVisibility(8);
        if (LocaleController.isRTL) {
            linearLayout2.addView(imageView2, g7.e6.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, g7.e6.q(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, g7.e6.q(-2, -2, 16));
            linearLayout2.addView(imageView2, g7.e6.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(ouVar.getThemedColor(org.telegram.ui.ActionBar.f6.o6));
        textView2.setGravity(LocaleController.isRTL ? 3 : 5);
        if (LocaleController.isRTL) {
            linearLayout.addView(textView2, g7.e6.q(-2, -2, 19));
            linearLayout.addView(linearLayout2, g7.e6.o(0, -2, 2.0f, 21));
            return;
        }
        linearLayout.addView(linearLayout2, g7.e6.o(0, -2, 2.0f, 16));
        linearLayout.addView(textView2, g7.e6.q(-2, -2, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.f37604e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(64.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
