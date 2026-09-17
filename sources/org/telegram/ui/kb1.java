package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class kb1 extends View {
    public ImageReceiver f38023a;
    public ImageReceiver f38024b;
    public View f38025c;
    public org.telegram.ui.Components.ue0 d;
    public Path f38026e;
    public Drawable f38027f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f38023a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f38024b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f38027f;
        drawable.setBounds(org.telegram.messenger.vl.w(2, measuredWidth, drawable), org.telegram.messenger.vl.e(2, measuredHeight, drawable), org.telegram.messenger.vl.B(2, measuredWidth, drawable), org.telegram.messenger.vl.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f38026e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f38025c != null) {
            CropAreaView cropAreaView = this.d.f30897b.f16330a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f23969a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23971b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23973c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f33598g4 = true;
            this.f38025c.draw(canvas);
            PhotoViewer.t1().f33598g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f38025c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38023a.onAttachedToWindow();
        this.f38024b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38023a.onDetachedFromWindow();
        this.f38024b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38023a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f38024b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
