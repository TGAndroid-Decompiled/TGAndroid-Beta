package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class hu0 extends org.telegram.ui.Components.wk0 {
    public final Drawable T2;
    public final Paint U2;
    public final RectF V2;

    public hu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.U2 = paint;
        this.V2 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        gu0 gu0Var = new gu0(this);
        setItemAnimator(gu0Var);
        gu0Var.C = false;
        gu0Var.f5532m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.T2 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.T2;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                i9 = (int) Math.min(i9, Math.floor(childAt.getX()));
                i10 = (int) Math.max(i10, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i9 != Integer.MAX_VALUE && i10 != Integer.MIN_VALUE) {
                RectF rectF = this.V2;
                rectF.set(i9 - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + i10, AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.U2);
            }
        }
    }
}
