package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
public class c5 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f23926a;
    public final org.telegram.ui.ActionBar.b6 f23927b;
    public final ImageView f23928c;
    public boolean d;
    public int e;

    public c5(Context context) {
        super(context);
        int i10;
        this.e = 0;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f23926a = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        addView(b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.f23927b = b6Var2;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.I6, null);
        b6Var2.setTextSize(16);
        b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(b6Var2);
        ImageView imageView = new ImageView(context);
        this.f23928c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23520m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f23926a;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i11, null);
        b6Var.setTag(Integer.valueOf(i11));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f23928c;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, null, mode);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z10) {
        this.f23926a.l(str, false);
        this.f23927b.setVisibility(4);
        int dp = AndroidUtilities.dp(i11);
        ImageView imageView = this.f23928c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.b6 getTextView() {
        return this.f23926a;
    }

    public org.telegram.ui.ActionBar.b6 getValueTextView() {
        return this.f23927b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.y6.f23498l0.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            float dp = AndroidUtilities.dp(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = org.telegram.ui.ActionBar.y6.f23498l0;
            } else {
                paint = org.telegram.ui.ActionBar.y6.f23478k0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int dp;
        int measuredWidth;
        int i15 = i13 - i11;
        int i16 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.f23927b;
        int textHeight = (i15 - b6Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i14 = AndroidUtilities.dp(24.0f);
        } else {
            i14 = 0;
        }
        b6Var.layout(i14, textHeight, b6Var.getMeasuredWidth() + i14, b6Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f23926a;
        int textHeight2 = (i15 - b6Var2.getTextHeight()) / 2;
        if (!LocaleController.isRTL) {
            dp = AndroidUtilities.dp(71.0f);
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        b6Var2.layout(dp, textHeight2, b6Var2.getMeasuredWidth() + dp, b6Var2.getMeasuredHeight() + textHeight2);
        int dp2 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f23928c;
        if (!z11) {
            measuredWidth = AndroidUtilities.dp(21.0f);
        } else {
            measuredWidth = (i16 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        }
        imageView.layout(measuredWidth, dp2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + dp2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(48.0f);
        this.f23927b.measure(vh.x(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23926a.measure(vh.x(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23928c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.e = i10;
    }

    public void setTextColor(int i10) {
        this.f23926a.setTextColor(i10);
    }
}
