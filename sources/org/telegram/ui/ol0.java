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
public final class ol0 extends FrameLayout {
    public final int f36262a;
    public final org.telegram.ui.ActionBar.d6 f36263b;
    public final FrameLayout f36264c;
    public final org.telegram.ui.Components.w9 d;
    public final TextView e;
    public final TextView f36265f;
    public final ImageView h;
    public boolean f36266n;
    public String f36267r;

    public ol0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36262a = i10;
        this.f36263b = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36264c = frameLayout;
        addView(frameLayout, w7.y5.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.3f, org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        w9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(w9Var, w7.y5.e(36, 36, 17));
        TextView b10 = w7.c6.b(context, 15.0f, i11, true, null);
        this.e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.y5.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.h6.f19442y6;
        TextView b11 = w7.c6.b(context, 13.0f, i12, false, null);
        this.f36265f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.y5.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 1, -1));
        addView(imageView, w7.y5.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f36266n) {
            Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", this.f36263b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.h6.f19180k0;
            }
            Paint paint = T0;
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
