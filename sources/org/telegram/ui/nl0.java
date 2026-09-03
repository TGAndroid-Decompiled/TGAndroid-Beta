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
    public final int f36531a;
    public final org.telegram.ui.ActionBar.f6 f36532b;
    public final FrameLayout f36533c;
    public final org.telegram.ui.Components.p9 d;
    public final TextView e;
    public final TextView f36534f;
    public final ImageView h;
    public boolean f36535n;
    public String f36536r;

    public nl0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36531a = i10;
        this.f36532b = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36533c = frameLayout;
        addView(frameLayout, k7.b6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        p9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(p9Var, k7.b6.e(36, 36, 17));
        TextView b10 = k7.f6.b(context, 15.0f, i11, true, null);
        this.e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, k7.b6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
        TextView b11 = k7.f6.b(context, 13.0f, i12, false, null);
        this.f36534f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, k7.b6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 1, -1));
        addView(imageView, k7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f36535n) {
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f36532b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f20000k0;
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
