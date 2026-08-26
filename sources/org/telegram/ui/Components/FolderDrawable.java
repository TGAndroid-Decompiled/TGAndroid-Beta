package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class FolderDrawable extends Drawable {
    public final Drawable drawable;
    public final Paint fillPaint;
    public final Path path;
    public boolean pathInvalidated = true;
    public final Paint strokePaint;

    public FolderDrawable(Context context, int i, int i2) {
        this.drawable = context.getResources().getDrawable(i);
        if (i2 < 0) {
            this.path = null;
            this.strokePaint = null;
            this.fillPaint = null;
            return;
        }
        this.path = new Path();
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = new Paint(1);
        this.fillPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        int[] iArr = Theme.keys_avatar_nameInMessage;
        paint2.setColor(Theme.getColor(null, iArr[i2 % iArr.length], false));
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.path;
        Drawable drawable = this.drawable;
        if (path == null) {
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        boolean z = this.pathInvalidated;
        Paint paint = this.strokePaint;
        if (z) {
            path.rewind();
            path.moveTo(AndroidUtilities.lerp(getBounds().left, getBounds().right, 0.4871f), AndroidUtilities.lerp(getBounds().top, getBounds().bottom, 0.6025f));
            path.lineTo(AndroidUtilities.lerp(getBounds().left, getBounds().right, 0.8974f), AndroidUtilities.lerp(getBounds().top, getBounds().bottom, 0.6025f));
            path.lineTo(AndroidUtilities.lerp(getBounds().left, getBounds().right, 1.0f), AndroidUtilities.lerp(getBounds().top, getBounds().bottom, 0.7564f));
            path.lineTo(AndroidUtilities.lerp(getBounds().left, getBounds().right, 0.8974f), AndroidUtilities.lerp(getBounds().top, getBounds().bottom, 0.9102f));
            path.lineTo(AndroidUtilities.lerp(getBounds().left, getBounds().right, 0.4871f), AndroidUtilities.lerp(getBounds().top, getBounds().bottom, 0.9102f));
            path.close();
            this.pathInvalidated = false;
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        }
        canvas.drawPath(path, paint);
        canvas.drawPath(path, this.fillPaint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.drawable.getOpacity();
    }

    @Override
    public final void setAlpha(int i) {
        this.drawable.setAlpha(i);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.pathInvalidated = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }
}
