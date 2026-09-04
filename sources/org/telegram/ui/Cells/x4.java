package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f23527a;
    public final org.telegram.ui.ActionBar.j5 f23528b;
    public final ImageView f23529c;
    public boolean d;
    public int f23530e;

    public x4(Context context) {
        super(context);
        int i10;
        this.f23530e = 0;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f23527a = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        j5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        addView(j5Var);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f23528b = j5Var2;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
        j5Var2.setTextSize(16);
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        ImageView imageView = new ImageView(context);
        this.f23529c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20827m6, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f23527a;
        j5Var.setTextColor(w02);
        j5Var.setTag(Integer.valueOf(i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f23529c;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z10) {
        this.f23527a.l(str, false);
        this.f23528b.setVisibility(4);
        int dp = AndroidUtilities.dp(i11);
        ImageView imageView = this.f23529c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.j5 getTextView() {
        return this.f23527a;
    }

    public org.telegram.ui.ActionBar.j5 getValueTextView() {
        return this.f23528b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i10 = this.f23530e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.j6.f20805l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            }
            float dp = AndroidUtilities.dp(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f23530e != 0) {
                paint = org.telegram.ui.ActionBar.j6.f20805l0;
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f23528b;
        int textHeight = (i15 - j5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i14 = AndroidUtilities.dp(24.0f);
        } else {
            i14 = 0;
        }
        j5Var.layout(i14, textHeight, j5Var.getMeasuredWidth() + i14, j5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f23527a;
        int textHeight2 = (i15 - j5Var2.getTextHeight()) / 2;
        if (!LocaleController.isRTL) {
            dp = AndroidUtilities.dp(71.0f);
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        j5Var2.layout(dp, textHeight2, j5Var2.getMeasuredWidth() + dp, j5Var2.getMeasuredHeight() + textHeight2);
        int dp2 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f23529c;
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
        this.f23528b.measure(wl.d(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23527a.measure(wl.d(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23529c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.f23530e = i10;
    }

    public void setTextColor(int i10) {
        this.f23527a.setTextColor(i10);
    }
}
