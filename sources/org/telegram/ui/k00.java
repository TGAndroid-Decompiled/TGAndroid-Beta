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
import org.telegram.messenger.R;
public final class k00 extends FrameLayout {
    public final TextView f35395a;
    public final ImageView f35396b;
    public boolean f35397c;

    public k00(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f35395a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.CreateNewLink));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        if (z4) {
            i12 = 0;
        } else {
            i12 = 16;
        }
        textView.setPadding(i11, 0, i12, 0);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(textView, k7.b6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f35396b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20007k7, false), mode));
        imageView.setImageDrawable(new org.telegram.ui.Components.mq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z11 = LocaleController.isRTL;
        int i13 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 16.0f;
        }
        if (z11) {
            f13 = 16.0f;
        } else {
            f13 = 0.0f;
        }
        addView(imageView, k7.b6.d(32, 32.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f35397c) {
            TextView textView = this.f35395a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z4) {
        float f10;
        super.setEnabled(z4);
        float f11 = 0.5f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f35395a.setAlpha(f10);
        if (z4) {
            f11 = 1.0f;
        }
        this.f35396b.setAlpha(f11);
    }
}
