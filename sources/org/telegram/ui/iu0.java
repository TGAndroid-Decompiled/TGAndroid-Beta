package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class iu0 extends org.telegram.ui.Components.zk0 {
    public final Drawable T2;
    public final Paint U2;
    public final RectF V2;

    public iu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.U2 = paint;
        this.V2 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        hu0 hu0Var = new hu0(this);
        setItemAnimator(hu0Var);
        hu0Var.C = false;
        hu0Var.f5819m = false;
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
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                iMin = (int) Math.min(iMin, Math.floor(childAt.getX()));
                iMax = (int) Math.max(iMax, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (iMin == Integer.MAX_VALUE || iMax == Integer.MIN_VALUE) {
                return;
            }
            float fDp = iMin - AndroidUtilities.dp(6.0f);
            float fDp2 = AndroidUtilities.dp(6.0f);
            float fDp3 = AndroidUtilities.dp(6.0f) + iMax;
            float fDp4 = AndroidUtilities.dp(103.0f);
            RectF rectF = this.V2;
            rectF.set(fDp, fDp2, fDp3, fDp4);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.U2);
        }
    }
}
