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

public abstract class t3 extends FrameLayout {

    public org.telegram.ui.Components.n9 f25661a;

    public org.telegram.ui.ActionBar.h5 f25662b;

    public org.telegram.ui.ActionBar.h5 f25663c;
    public ImageView d;

    public org.telegram.ui.Components.y8 f25664e;

    public TLRPC.User f25665f;
    public Paint h;

    public int f25666n;

    public boolean f25667r;

    public final void a(int i10, int i11) {
        this.f25666n = i10;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.f25663c.setTextColor(i11);
        org.telegram.ui.ActionBar.g6.B1(imageView.getDrawable(), i11 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f25667r) {
            canvas2 = canvas;
            canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.f25662b.getText();
    }

    public TLRPC.User getUser() {
        return this.f25665f;
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
        this.f25667r = z10;
        invalidate();
    }
}
