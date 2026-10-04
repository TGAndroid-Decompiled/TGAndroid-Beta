package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ev0 extends org.telegram.ui.Components.zl0 {
    public final Drawable f36100e3;
    public final Paint f36101f3;
    public final RectF f36102g3;

    public ev0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f36101f3 = paint;
        this.f36102g3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        dv0 dv0Var = new dv0(this);
        setItemAnimator(dv0Var);
        dv0Var.C = false;
        dv0Var.f46570m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.f36100e3 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.f36100e3;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                i10 = (int) Math.min(i10, Math.floor(childAt.getX()));
                i11 = (int) Math.max(i11, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i10 != Integer.MAX_VALUE && i11 != Integer.MIN_VALUE) {
                RectF rectF = this.f36102g3;
                rectF.set(i10 - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + i11, AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f36101f3);
            }
        }
    }
}
