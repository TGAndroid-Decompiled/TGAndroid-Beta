package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends FrameLayout {
    public final Paint f31008a;
    public final lz f31009b;

    public zw(lz lzVar, Context context) {
        super(context);
        this.f31009b = lzVar;
        this.f31008a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lz lzVar = this.f31009b;
        yw ywVar = lzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * lzVar.f26290t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = lzVar.z(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.f31008a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ywVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ywVar.f28836s != null) {
            canvas.save();
            float f7 = ywVar.f28818c0 - ywVar.f28819d0;
            float f10 = ywVar.v;
            if (f10 > 0.0f) {
                f7 = ((ywVar.f28836s.getX() - ywVar.getScrollX()) * ywVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            ywVar.f28836s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f31009b.Y();
    }
}
