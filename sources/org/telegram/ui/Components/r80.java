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

public final class r80 extends View {

    public final Drawable f32104a;

    public final Paint f32105b;

    public final Paint f32106c;
    public final y5 d;

    public boolean f32107e;

    public r80(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f32105b = paint;
        Paint paint2 = new Paint(1);
        this.f32106c = paint2;
        this.d = new y5(this, 0L, 320L, er.h);
        h7.b6.a(this);
        this.f32104a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f32107e == z10) {
            return;
        }
        this.f32107e = z10;
        if (!z11) {
            this.d.a(z10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float fE = this.d.e(!this.f32107e);
        int width = getWidth();
        Drawable drawable = this.f32104a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float fWidth = (bounds.width() * 0.325f) + bounds.left;
        float fHeight = (bounds.height() * 0.152f) + bounds.top;
        float fHeight2 = bounds.bottom - (bounds.height() * 0.152f);
        float fWidth2 = bounds.right - (bounds.width() * 0.101f);
        if (fE > 0.0f) {
            float fDp = AndroidUtilities.dp(4.0f);
            Paint paint = this.f32106c;
            paint.setStrokeWidth(fDp);
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.f32107e) {
                canvas.drawLine(fWidth2 - AndroidUtilities.dp(4.0f), fHeight2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(fWidth2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + fWidth, fE), AndroidUtilities.lerp(fHeight2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + fHeight, fE), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(fWidth + AndroidUtilities.dp(4.0f), fHeight + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + fWidth, fWidth2 - AndroidUtilities.dp(4.0f), fE), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + fHeight, fHeight2 - AndroidUtilities.dp(4.0f), fE), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (fE > 0.0f) {
            float fDp2 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.f32105b;
            paint2.setStrokeWidth(fDp2);
            if (this.f32107e) {
                canvas2.drawLine(fWidth2, fHeight2, AndroidUtilities.lerp(fWidth2, fWidth, fE), AndroidUtilities.lerp(fHeight2, fHeight, fE), paint2);
            } else {
                canvas.drawLine(fWidth, fHeight, AndroidUtilities.lerp(fWidth, fWidth2, fE), AndroidUtilities.lerp(fHeight, fHeight2, fE), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }
}
