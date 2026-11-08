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
public final class at extends FrameLayout {
    public final ImageView f44086a;
    public final TextView f44087b;
    public final ImageView f44088c;
    public final TextView d;
    public boolean f44089e;

    public at(kt ktVar, Context context) {
        super(context);
        int i7;
        int i10;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this, null);
        ImageView imageView = new ImageView(context);
        this.f44086a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ha.d(28, 28.0f, i7 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(linearLayout, c8.ha.i(-1.0f, -2.0f, i10 | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (org.telegram.messenger.id.f23157a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.f44087b = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.f44088c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131230871);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        imageView2.setVisibility(8);
        if (org.telegram.messenger.id.f23157a0) {
            linearLayout2.addView(imageView2, c8.ha.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, c8.ha.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, c8.ha.r(-2, -2, 16));
            linearLayout2.addView(imageView2, c8.ha.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28052o6, null);
        textView2.setGravity(org.telegram.messenger.id.f23157a0 ? 3 : 5);
        if (org.telegram.messenger.id.f23157a0) {
            linearLayout.addView(textView2, c8.ha.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 2.0f, 21));
            return;
        }
        linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 2.0f, 16));
        linearLayout.addView(textView2, c8.ha.r(-2, -2, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f44089e) {
            if (org.telegram.messenger.id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
