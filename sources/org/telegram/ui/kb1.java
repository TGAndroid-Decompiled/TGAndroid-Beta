package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class kb1 extends View {
    public ImageReceiver f35082a;
    public ImageReceiver f35083b;
    public View f35084c;
    public org.telegram.ui.Components.cf0 d;
    public Path e;
    public Drawable f35085f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f35082a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f35083b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f35085f;
        drawable.setBounds(org.telegram.messenger.rk.y(2, measuredWidth, drawable), org.telegram.messenger.rk.d(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.d(2, measuredWidth, drawable), org.telegram.messenger.rk.A(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f35084c != null) {
            CropAreaView cropAreaView = this.d.f23278b.f14292a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f22224a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f22226b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f22228c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f31242g4 = true;
            this.f35084c.draw(canvas);
            PhotoViewer.t1().f31242g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f35084c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35082a.onAttachedToWindow();
        this.f35083b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35082a.onDetachedFromWindow();
        this.f35083b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35082a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f35083b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
