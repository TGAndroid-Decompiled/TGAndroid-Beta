package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fl0 extends FrameLayout {
    public final int f38305a;
    public final org.telegram.ui.ActionBar.b6 f38306b;
    public final FrameLayout f38307c;
    public final org.telegram.ui.Components.o9 d;
    public final TextView f38308e;
    public final TextView f38309f;
    public final ImageView h;
    public boolean f38310n;
    public String f38311r;

    public fl0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f38305a = i9;
        this.f38306b = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38307c = frameLayout;
        addView(frameLayout, g7.e6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setImageResource(R.drawable.msg2_permissions);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        o9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(o9Var, g7.e6.e(36, 36, 17));
        TextView b10 = g7.i6.b(context, 15.0f, i10, true, null);
        this.f38308e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, g7.e6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        TextView b11 = g7.i6.b(context, 13.0f, i11, false, null);
        this.f38309f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, g7.e6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i11, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, -1));
        addView(imageView, g7.e6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f38310n) {
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", this.f38306b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint = T0;
            float f11 = 72.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
