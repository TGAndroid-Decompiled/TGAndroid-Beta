package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ca1 extends View {
    public ImageReceiver f37063a;
    public ImageReceiver f37064b;
    public View f37065c;
    public org.telegram.ui.Components.pe0 d;
    public Path f37066e;
    public Drawable f37067f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f37063a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f37064b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f37067f;
        drawable.setBounds(b.v(2, measuredWidth, drawable), b.f(2, measuredHeight, drawable), b.A(2, measuredWidth, drawable), b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f37066e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f37065c != null) {
            CropAreaView cropAreaView = this.d.f31657b.f49953a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f26358a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f26360b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f26362c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f35669c4 = true;
            this.f37065c.draw(canvas);
            PhotoViewer.t1().f35669c4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f37065c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37063a.onAttachedToWindow();
        this.f37064b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37063a.onDetachedFromWindow();
        this.f37064b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37063a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f37064b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
