package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qb1 extends View {
    public ImageReceiver f39372a;
    public ImageReceiver f39373b;
    public View f39374c;
    public org.telegram.ui.Components.tf0 d;
    public Path e;
    public Drawable f39375f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f39372a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f39373b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f39375f;
        drawable.setBounds(org.telegram.ui.Cells.d0.u(2, measuredWidth, drawable), org.telegram.ui.Cells.d0.d(2, measuredHeight, drawable), org.telegram.ui.Cells.d0.y(2, measuredWidth, drawable), org.telegram.ui.Cells.d0.x(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f39374c != null) {
            CropAreaView cropAreaView = this.d.f29369b.f15824a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f23123a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23125b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23127c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f32247g4 = true;
            this.f39374c.draw(canvas);
            PhotoViewer.t1().f32247g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f39374c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39372a.onAttachedToWindow();
        this.f39373b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39372a.onDetachedFromWindow();
        this.f39373b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39372a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f39373b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
