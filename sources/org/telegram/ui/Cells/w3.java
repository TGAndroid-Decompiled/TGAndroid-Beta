package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public abstract class w3 extends FrameLayout {
    public org.telegram.ui.Components.w9 f21789a;
    public org.telegram.ui.ActionBar.h5 f21790b;
    public org.telegram.ui.ActionBar.h5 f21791c;
    public ImageView d;
    public org.telegram.ui.Components.h9 e;
    public TLRPC.User f21792f;
    public Paint h;
    public int f21793n;
    public boolean f21794r;

    public final void a(int i10, int i11) {
        this.f21793n = i10;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f21791c.setTextColor(i11);
        org.telegram.ui.ActionBar.h6.B1(imageView.getDrawable(), i11 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float dp;
        int i10;
        if (this.f21794r) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.f21790b.getText();
    }

    public TLRPC.User getUser() {
        return this.f21792f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z10) {
        this.f21794r = z10;
        invalidate();
    }
}
