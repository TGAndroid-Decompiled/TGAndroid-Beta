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
import org.telegram.messenger.sl;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f23948a;
    public final org.telegram.ui.ActionBar.n5 f23949b;
    public final ImageView f23950c;
    public boolean d;
    public int e;

    public x4(Context context) {
        super(context);
        int i10;
        this.e = 0;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f23948a = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f23949b = n5Var2;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.I6, null);
        n5Var2.setTextSize(16);
        n5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(n5Var2);
        ImageView imageView = new ImageView(context);
        this.f23950c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21346m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f23948a;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i11, null);
        n5Var.setTag(Integer.valueOf(i11));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f23950c;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, mode);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z10) {
        this.f23948a.l(str, false);
        this.f23949b.setVisibility(4);
        int dp = AndroidUtilities.dp(i11);
        ImageView imageView = this.f23950c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.f23948a;
    }

    public org.telegram.ui.ActionBar.n5 getValueTextView() {
        return this.f23949b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.k6.f21323l0.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
            float dp = AndroidUtilities.dp(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = org.telegram.ui.ActionBar.k6.f21323l0;
            } else {
                paint = org.telegram.ui.ActionBar.k6.f21304k0;
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f23949b;
        int textHeight = (i15 - n5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i14 = AndroidUtilities.dp(24.0f);
        } else {
            i14 = 0;
        }
        n5Var.layout(i14, textHeight, n5Var.getMeasuredWidth() + i14, n5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f23948a;
        int textHeight2 = (i15 - n5Var2.getTextHeight()) / 2;
        if (!LocaleController.isRTL) {
            dp = AndroidUtilities.dp(71.0f);
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        n5Var2.layout(dp, textHeight2, n5Var2.getMeasuredWidth() + dp, n5Var2.getMeasuredHeight() + textHeight2);
        int dp2 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f23950c;
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
        this.f23949b.measure(sl.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23948a.measure(sl.c(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23950c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.e = i10;
    }

    public void setTextColor(int i10) {
        this.f23948a.setTextColor(i10);
    }
}
