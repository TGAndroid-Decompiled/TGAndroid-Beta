package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qw extends FrameLayout {
    public final Paint f32117a;
    public final fz f32118b;

    public qw(fz fzVar, Context context) {
        super(context);
        this.f32118b = fzVar;
        this.f32117a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fz fzVar = this.f32118b;
        pw pwVar = fzVar.f28650x0;
        float dp = AndroidUtilities.dp(50.0f) * fzVar.f28623p1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = fzVar.A(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.f32117a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), pwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (pwVar.f28504s != null) {
            canvas.save();
            float f9 = pwVar.V - pwVar.W;
            float f10 = pwVar.v;
            if (f10 > 0.0f) {
                f9 = ((pwVar.f28504s.getX() - pwVar.getScrollX()) * pwVar.v) + ((1.0f - f10) * f9);
            }
            canvas.translate(f9, 0.0f);
            pwVar.f28504s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32118b.a0();
    }
}
