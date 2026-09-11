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
public final class f90 extends View {
    public final Drawable f25977a;
    public final Paint f25978b;
    public final Paint f25979c;
    public final e6 d;
    public boolean f25980e;

    public f90(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25978b = paint;
        Paint paint2 = new Paint(1);
        this.f25979c = paint2;
        this.d = new e6(this, 0L, 320L, pr.h);
        w7.z5.a(this);
        this.f25977a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f25980e == z10) {
            return;
        }
        this.f25980e = z10;
        if (!z11) {
            this.d.a(z10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.d.e(!this.f25980e);
        int width = getWidth();
        Drawable drawable = this.f25977a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f25979c;
            paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.f25980e) {
                canvas.drawLine(width3 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(width3 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + width2, e7), AndroidUtilities.lerp(height2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + height, e7), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + AndroidUtilities.dp(4.0f), height + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + width2, width3 - AndroidUtilities.dp(4.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + height, height2 - AndroidUtilities.dp(4.0f), e7), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (i10 > 0) {
            Paint paint2 = this.f25978b;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (this.f25980e) {
                canvas2.drawLine(width3, height2, AndroidUtilities.lerp(width3, width2, e7), AndroidUtilities.lerp(height2, height, e7), paint2);
            } else {
                canvas.drawLine(width2, height, AndroidUtilities.lerp(width2, width3, e7), AndroidUtilities.lerp(height, height2, e7), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }
}
