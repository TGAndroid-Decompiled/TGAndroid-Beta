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
public final class du extends FrameLayout {
    public final ImageView f36829a;
    public final TextView f36830b;
    public final ImageView f36831c;
    public final TextView d;
    public boolean e;

    public du(mu muVar, Context context) {
        super(context);
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this, null);
        ImageView imageView = new ImageView(context);
        this.f36829a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.b6.d(28, 28.0f, i10 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(linearLayout, w7.b6.i(-1.0f, -2.0f, i11 | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (org.telegram.messenger.cd.X) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.f36830b = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.f36831c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131230871);
        org.telegram.ui.ActionBar.a7.t(imageView2, i12, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(org.telegram.messenger.i0.L(1.0f));
        imageView2.setVisibility(8);
        if (org.telegram.messenger.cd.X) {
            linearLayout2.addView(imageView2, w7.b6.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, w7.b6.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, w7.b6.r(-2, -2, 16));
            linearLayout2.addView(imageView2, w7.b6.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21134o6, null);
        textView2.setGravity(org.telegram.messenger.cd.X ? 3 : 5);
        if (org.telegram.messenger.cd.X) {
            linearLayout.addView(textView2, w7.b6.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, w7.b6.p(0, -2, 2.0f, 21));
            return;
        }
        linearLayout.addView(linearLayout2, w7.b6.p(0, -2, 2.0f, 16));
        linearLayout.addView(textView2, w7.b6.r(-2, -2, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.e) {
            if (org.telegram.messenger.cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(64.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i10 = org.telegram.messenger.i0.L(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
