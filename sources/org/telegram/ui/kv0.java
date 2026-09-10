package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kv0 extends org.telegram.ui.Components.vl0 {
    public final Drawable X2;
    public final Paint Y2;
    public final RectF Z2;

    public kv0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.Y2 = paint;
        this.Z2 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        jv0 jv0Var = new jv0(this);
        setItemAnimator(jv0Var);
        jv0Var.C = false;
        jv0Var.f41645m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.X2 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.X2;
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
                RectF rectF = this.Z2;
                rectF.set(i10 - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + i11, AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.Y2);
            }
        }
    }
}
