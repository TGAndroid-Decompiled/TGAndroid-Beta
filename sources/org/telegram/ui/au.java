package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class au extends FrameLayout {
    public final ImageView f37899a;
    public final TextView f37900b;
    public final ImageView f37901c;
    public final TextView d;
    public boolean e;

    public au(lu luVar, Context context) {
        super(context);
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, this, null);
        ImageView imageView = new ImageView(context);
        this.f37899a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, org.telegram.ui.Components.gb1.h(28, 28.0f, i10 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(linearLayout, org.telegram.ui.Components.gb1.m(-1.0f, -2.0f, i11 | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.f37900b = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.f37901c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.f7.t(imageView2, i12, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(AndroidUtilities.dp(1.0f));
        imageView2.setVisibility(8);
        if (LocaleController.isRTL) {
            linearLayout2.addView(imageView2, org.telegram.ui.Components.gb1.x(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 16));
            linearLayout2.addView(imageView2, org.telegram.ui.Components.gb1.x(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23560o6, null);
        textView2.setGravity(LocaleController.isRTL ? 3 : 5);
        if (LocaleController.isRTL) {
            linearLayout.addView(textView2, org.telegram.ui.Components.gb1.u(-2, -2, 19));
            linearLayout.addView(linearLayout2, org.telegram.ui.Components.gb1.s(0, -2, 2.0f, 21));
            return;
        }
        linearLayout.addView(linearLayout2, org.telegram.ui.Components.gb1.s(0, -2, 2.0f, 16));
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.u(-2, -2, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(64.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
