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
public final class cl0 extends FrameLayout {
    public final int f37170a;
    public final org.telegram.ui.ActionBar.c6 f37171b;
    public final FrameLayout f37172c;
    public final org.telegram.ui.Components.t9 d;
    public final TextView f37173e;
    public final TextView f37174f;
    public final ImageView h;
    public boolean f37175n;
    public String f37176r;

    public cl0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37170a = i10;
        this.f37171b = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37172c = frameLayout;
        addView(frameLayout, i7.f6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(t9Var, i7.f6.e(36, 36, 17));
        TextView b10 = i7.j6.b(context, 15.0f, i11, true, null);
        this.f37173e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, i7.f6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        TextView b11 = i7.j6.b(context, 13.0f, i12, false, null);
        this.f37174f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, i7.f6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, -1));
        addView(imageView, i7.f6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        super.onDraw(canvas);
        if (this.f37175n) {
            Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.f37171b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint = T0;
            float f10 = 72.0f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 72.0f;
            }
            float dp = AndroidUtilities.dp(f9);
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
