package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n31 extends FrameLayout {
    public final int f40705a;

    public n31(Context context, int i10) {
        super(context);
        this.f40705a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40705a) {
            case 7:
                org.telegram.ui.ActionBar.g6.f23149i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.g6.f23149i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.g6.f23149i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40705a) {
            case 6:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.g6.f23183k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40705a) {
            case 3:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f40705a) {
            case 1:
                super.onMeasure(i10, b.B(36.0f, View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, i11);
                return;
            case 3:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                int childCount = getChildCount();
                int i13 = 0;
                if (childCount > 0) {
                    i12 = getChildAt(0).getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > size) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i13 = AndroidUtilities.dp(16.0f) + i12 + i15;
                }
                setMeasuredDimension(measuredWidth, i13);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 6:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i11)));
                return;
        }
    }

    public n31(o31 o31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f40705a = 0;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, o31.Q(o31Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, i7.f6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, o31.R(o31Var)));
        th.n(14.0f, 1, textView);
        addView(textView, i7.f6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(getContext(), null);
        y80Var.setText(charSequence);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, o31.S(o31Var)));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, o31.T(o31Var)));
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(y80Var, i7.f6.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }
}
