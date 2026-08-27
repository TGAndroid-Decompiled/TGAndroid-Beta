package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;

public class v4 extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f25801a;

    public final org.telegram.ui.ActionBar.h5 f25802b;

    public final ImageView f25803c;
    public boolean d;

    public int f25804e;

    public v4(Context context) {
        super(context);
        this.f25804e = 0;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25801a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25802b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
        h5Var2.setTextSize(16);
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        ImageView imageView = new ImageView(context);
        this.f25803c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25801a;
        h5Var.setTextColor(iW0);
        h5Var.setTag(Integer.valueOf(i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f25803c;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z10) {
        this.f25801a.l(str, false);
        this.f25802b.setVisibility(4);
        int iDp = AndroidUtilities.dp(i11);
        ImageView imageView = this.f25803c;
        imageView.setPadding(0, iDp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f25801a;
    }

    public org.telegram.ui.ActionBar.h5 getValueTextView() {
        return this.f25802b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i10 = this.f25804e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.g6.f23193l0.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            }
            canvas.drawLine(AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.f25804e != 0 ? org.telegram.ui.ActionBar.g6.f23193l0 : org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25802b;
        int textHeight = (i14 - h5Var.getTextHeight()) / 2;
        int iDp = LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0;
        h5Var.layout(iDp, textHeight, h5Var.getMeasuredWidth() + iDp, h5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25801a;
        int textHeight2 = (i14 - h5Var2.getTextHeight()) / 2;
        int iDp2 = !LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(24.0f);
        h5Var2.layout(iDp2, textHeight2, h5Var2.getMeasuredWidth() + iDp2, h5Var2.getMeasuredHeight() + textHeight2);
        int iDp3 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f25803c;
        int iDp4 = !z11 ? AndroidUtilities.dp(21.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        imageView.layout(iDp4, iDp3, imageView.getMeasuredWidth() + iDp4, imageView.getMeasuredHeight() + iDp3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(48.0f);
        this.f25802b.measure(rl.d(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f25801a.measure(rl.d(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f25803c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.f25804e = i10;
    }

    public void setTextColor(int i10) {
        this.f25801a.setTextColor(i10);
    }
}
