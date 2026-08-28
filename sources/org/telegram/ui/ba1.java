package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ba1 extends View {
    public ImageReceiver f36802a;
    public ImageReceiver f36803b;
    public View f36804c;
    public org.telegram.ui.Components.be0 d;
    public Path f36805e;
    public Drawable f36806f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f36802a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f36803b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f36806f;
        drawable.setBounds(org.telegram.messenger.ll.x(2, measuredWidth, drawable), org.telegram.messenger.ll.e(2, measuredHeight, drawable), org.telegram.messenger.ll.B(2, measuredWidth, drawable), org.telegram.messenger.ll.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f36805e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f36804c != null) {
            CropAreaView cropAreaView = this.d.f27183b.f47904a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f26347a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f26349b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f26351c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f35602c4 = true;
            this.f36804c.draw(canvas);
            PhotoViewer.t1().f35602c4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f36804c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36802a.onAttachedToWindow();
        this.f36803b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36802a.onDetachedFromWindow();
        this.f36803b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.f36802a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f36803b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
