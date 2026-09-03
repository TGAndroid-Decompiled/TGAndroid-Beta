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
public final class nl0 extends FrameLayout {
    public final int f39394a;
    public final org.telegram.ui.ActionBar.g6 f39395b;
    public final FrameLayout f39396c;
    public final org.telegram.ui.Components.p9 d;
    public final TextView f39397e;
    public final TextView f39398f;
    public final ImageView h;
    public boolean f39399n;
    public String f39400r;

    public nl0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f39394a = i10;
        this.f39395b = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39396c = frameLayout;
        addView(frameLayout, k7.c6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        p9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(p9Var, k7.c6.e(36, 36, 17));
        TextView b10 = k7.g6.b(context, 15.0f, i11, true, null);
        this.f39397e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, k7.c6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f22038y6;
        TextView b11 = k7.g6.b(context, 13.0f, i12, false, null);
        this.f39398f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, k7.c6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 1, -1));
        addView(imageView, k7.c6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f39399n) {
            Paint T0 = org.telegram.ui.ActionBar.k6.T0("paintDivider", this.f39395b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.k6.f21781k0;
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
