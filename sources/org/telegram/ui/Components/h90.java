package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class h90 extends View {
    public final Drawable f25339a;
    public final Paint f25340b;
    public final Paint f25341c;
    public final z5 d;
    public boolean e;

    public h90(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25340b = paint;
        Paint paint2 = new Paint(1);
        this.f25341c = paint2;
        this.d = new z5(this, 0L, 320L, mr.h);
        k7.d6.a(this);
        this.f25339a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z4, boolean z10) {
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        if (!z10) {
            this.d.a(z4);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.d.e(!this.e);
        int width = getWidth();
        Drawable drawable = this.f25339a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f25341c;
            paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(width3 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + width2, e), AndroidUtilities.lerp(height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + height, e), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + AndroidUtilities.dp(4.0f), height + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + width2, width3 - AndroidUtilities.dp(4.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + height, height2 - AndroidUtilities.dp(4.0f), e), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (i10 > 0) {
            Paint paint2 = this.f25340b;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (this.e) {
                canvas2.drawLine(width3, height2, AndroidUtilities.lerp(width3, width2, e), AndroidUtilities.lerp(height2, height, e), paint2);
            } else {
                canvas.drawLine(width2, height, AndroidUtilities.lerp(width2, width3, e), AndroidUtilities.lerp(height, height2, e), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }
}
