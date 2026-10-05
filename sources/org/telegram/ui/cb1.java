package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cb1 extends View {
    public ImageReceiver f35387a;
    public ImageReceiver f35388b;
    public View f35389c;
    public org.telegram.ui.Components.gf0 d;
    public Path f35390e;
    public Drawable f35391f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f35387a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f35388b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f35391f;
        drawable.setBounds(org.telegram.ui.Cells.c1.t(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.e(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.x(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.w(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f35390e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f35389c != null) {
            CropAreaView cropAreaView = this.d.f26905b.f15576a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f24135a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f24137b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f24139c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f33935g4 = true;
            this.f35389c.draw(canvas);
            PhotoViewer.t1().f33935g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f35389c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35387a.onAttachedToWindow();
        this.f35388b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35387a.onDetachedFromWindow();
        this.f35388b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35387a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f35388b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
