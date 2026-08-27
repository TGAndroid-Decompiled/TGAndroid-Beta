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

    public final int f38157a;

    public final org.telegram.ui.ActionBar.c6 f38158b;

    public final FrameLayout f38159c;
    public final org.telegram.ui.Components.n9 d;

    public final TextView f38160e;

    public final TextView f38161f;
    public final ImageView h;

    public boolean f38162n;

    public String f38163r;

    public fl0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38157a = i10;
        this.f38158b = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38159c = frameLayout;
        addView(frameLayout, h7.z5.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        n9Var.setColorFilter(new PorterDuffColorFilter(iL1, mode));
        frameLayout.addView(n9Var, h7.z5.e(36, 36, 17));
        TextView textViewB = h7.d6.b(context, 15.0f, i11, true, null);
        this.f38160e = textViewB;
        textViewB.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewB.setEllipsize(truncateAt);
        addView(textViewB, h7.z5.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        TextView textViewB2 = h7.d6.b(context, 13.0f, i12, false, null);
        this.f38161f = textViewB2;
        textViewB2.setSingleLine();
        textViewB2.setEllipsize(truncateAt);
        addView(textViewB2, h7.z5.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, -1));
        addView(imageView, h7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38162n) {
            Paint paintT0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.f38158b);
            if (paintT0 == null) {
                paintT0 = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
