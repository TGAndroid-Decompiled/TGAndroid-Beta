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
public final class cm0 extends FrameLayout {
    public final int f34967a;
    public final org.telegram.ui.ActionBar.c6 f34968b;
    public final FrameLayout f34969c;
    public final org.telegram.ui.Components.z9 d;
    public final TextView e;
    public final TextView f34970f;
    public final ImageView h;
    public boolean f34971n;
    public String f34972r;

    public cm0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34967a = i10;
        this.f34968b = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34969c = frameLayout;
        addView(frameLayout, w7.a6.a(36.0f, 18.5f, 0.0f, 0.0f, 0.0f, 36, 19));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.3f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        z9Var.setColorFilter(new PorterDuffColorFilter(m12, mode));
        frameLayout.addView(z9Var, w7.a6.e(36, 36, 17));
        TextView b10 = w7.e6.b(context, 15.0f, i11, true, null);
        this.e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.a6.a(-2.0f, 72.0f, 8.0f, 46.0f, 0.0f, -1, 55));
        int i12 = org.telegram.ui.ActionBar.g6.f20288y6;
        TextView b11 = w7.e6.b(context, 13.0f, i12, false, null);
        this.f34970f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.a6.a(-2.0f, 72.0f, 31.0f, 46.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, -1));
        addView(imageView, w7.a6.a(32.0f, 0.0f, 0.0f, 13.0f, 0.0f, 32, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f34971n) {
            Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", this.f34968b);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.g6.f20022k0;
            }
            Paint paint = U0;
            float f10 = 72.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 72.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
