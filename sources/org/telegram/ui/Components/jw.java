package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class jw extends FrameLayout {

    public final Paint f29824a;

    public final yy f29825b;

    public jw(yy yyVar, Context context) {
        super(context);
        this.f29825b = yyVar;
        this.f29824a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yy yyVar = this.f29825b;
        iw iwVar = yyVar.f35052x0;
        float fDp = AndroidUtilities.dp(50.0f) * yyVar.f35025p1.p();
        if (fDp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (fDp != 0.0f) {
            canvas.clipRect(0.0f, fDp, getMeasuredWidth(), getMeasuredHeight());
        }
        int iB = yyVar.B(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.f29824a;
        paint.setColor(iB);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), iwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (iwVar.f33462s != null) {
            canvas.save();
            float x8 = iwVar.V - iwVar.W;
            float f10 = iwVar.v;
            if (f10 > 0.0f) {
                x8 = ((iwVar.f33462s.getX() - iwVar.getScrollX()) * iwVar.v) + ((1.0f - f10) * x8);
            }
            canvas.translate(x8, 0.0f);
            iwVar.f33462s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29825b.a0();
    }
}
