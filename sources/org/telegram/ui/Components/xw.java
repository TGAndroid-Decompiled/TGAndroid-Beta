package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xw extends FrameLayout {
    public final Paint f30076a;
    public final kz f30077b;

    public xw(kz kzVar, Context context) {
        super(context);
        this.f30077b = kzVar;
        this.f30076a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.f30077b;
        ww wwVar = kzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.f25753t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = kzVar.z(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.f30076a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), wwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (wwVar.f25083s != null) {
            canvas.save();
            float f7 = wwVar.f25065c0 - wwVar.f25066d0;
            float f10 = wwVar.v;
            if (f10 > 0.0f) {
                f7 = ((wwVar.f25083s.getX() - wwVar.getScrollX()) * wwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            wwVar.f25083s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f30077b.Y();
    }
}
