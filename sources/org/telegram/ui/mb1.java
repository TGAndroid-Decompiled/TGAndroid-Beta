package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class mb1 extends View {
    public ImageReceiver f39989a;
    public ImageReceiver f39990b;
    public View f39991c;
    public org.telegram.ui.Components.zf0 d;
    public Path f39992e;
    public Drawable f39993f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f39989a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f39990b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f39993f;
        drawable.setBounds(org.telegram.messenger.am.z(2, measuredWidth, drawable), org.telegram.messenger.am.d(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.r(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f39992e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f39991c != null) {
            CropAreaView cropAreaView = this.d.f33350b.f15319a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f23909a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23911b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23913c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f33764g4 = true;
            this.f39991c.draw(canvas);
            PhotoViewer.t1().f33764g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f39991c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39989a.onAttachedToWindow();
        this.f39990b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39989a.onDetachedFromWindow();
        this.f39990b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39989a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f39990b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
