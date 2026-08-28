package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kw extends FrameLayout {
    public final Paint f30248a;
    public final wy f30249b;

    public kw(wy wyVar, Context context) {
        super(context);
        this.f30249b = wyVar;
        this.f30248a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wy wyVar = this.f30249b;
        jw jwVar = wyVar.f34459x0;
        float dp = AndroidUtilities.dp(50.0f) * wyVar.f34432p1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = wyVar.z(org.telegram.ui.ActionBar.f6.He);
        Paint paint = this.f30248a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), jwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (jwVar.f32514s != null) {
            canvas.save();
            float f10 = jwVar.V - jwVar.W;
            float f11 = jwVar.v;
            if (f11 > 0.0f) {
                f10 = ((jwVar.f32514s.getX() - jwVar.getScrollX()) * jwVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            jwVar.f32514s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f30249b.Z();
    }
}
