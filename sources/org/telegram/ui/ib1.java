package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ib1 extends View {
    public ImageReceiver f34596a;
    public ImageReceiver f34597b;
    public View f34598c;
    public org.telegram.ui.Components.ue0 d;
    public Path e;
    public Drawable f34599f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f34596a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f34597b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f34599f;
        drawable.setBounds(org.telegram.messenger.vl.x(2, measuredWidth, drawable), org.telegram.messenger.vl.e(2, measuredHeight, drawable), org.telegram.messenger.vl.B(2, measuredWidth, drawable), org.telegram.messenger.vl.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f34598c != null) {
            CropAreaView cropAreaView = this.d.f28379b.f14098a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f22000a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f22002b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f22004c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f30955g4 = true;
            this.f34598c.draw(canvas);
            PhotoViewer.t1().f30955g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f34598c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34596a.onAttachedToWindow();
        this.f34597b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34596a.onDetachedFromWindow();
        this.f34597b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f34596a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f34597b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
