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
public final class m00 extends FrameLayout {
    public final TextView f38530a;
    public final ImageView f38531b;
    public boolean f38532c;

    public m00(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        TextView textView = new TextView(context);
        this.f38530a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.CreateNewLink));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = 0;
        } else {
            i12 = 16;
        }
        textView.setPadding(i11, 0, i12, 0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = 64.0f;
        }
        if (z11) {
            f10 = 64.0f;
        } else {
            f10 = 0.0f;
        }
        addView(textView, w7.x5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f38531b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20792k7, false), mode));
        imageView.setImageDrawable(new org.telegram.ui.Components.oq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = LocaleController.isRTL;
        int i13 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f11 = 0.0f;
        } else {
            f11 = 16.0f;
        }
        if (z12) {
            f12 = 16.0f;
        } else {
            f12 = 0.0f;
        }
        addView(imageView, w7.x5.d(32, 32.0f, i13, f11, 0.0f, f12, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38532c) {
            TextView textView = this.f38530a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        super.setEnabled(z10);
        float f10 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f38530a.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        }
        this.f38531b.setAlpha(f10);
    }
}
