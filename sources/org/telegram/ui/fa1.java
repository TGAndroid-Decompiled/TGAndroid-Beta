package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class fa1 extends View {
    public ImageReceiver f39323a;
    public ImageReceiver f39324b;
    public View f39325c;
    public org.telegram.ui.Components.of0 d;
    public Path e;
    public Drawable f39326f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f39323a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f39324b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f39326f;
        drawable.setBounds(d3.x(2, measuredWidth, drawable), d3.i(2, measuredHeight, drawable), d3.C(2, measuredWidth, drawable), d3.B(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f39325c != null) {
            CropAreaView cropAreaView = this.d.f31283b.f18843a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f26118a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f26120b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f26122c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.u1().f35665g4 = true;
            this.f39325c.draw(canvas);
            PhotoViewer.u1().f35665g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f39325c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39323a.onAttachedToWindow();
        this.f39324b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39323a.onDetachedFromWindow();
        this.f39324b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39323a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f39324b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
