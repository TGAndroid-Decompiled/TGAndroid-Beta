package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qb1 extends View {
    public ImageReceiver f39091a;
    public ImageReceiver f39092b;
    public View f39093c;
    public org.telegram.ui.Components.uf0 d;
    public Path e;
    public Drawable f39094f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f39091a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f39092b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f39094f;
        drawable.setBounds(org.telegram.ui.Cells.c1.r(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.v(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.u(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f39093c != null) {
            CropAreaView cropAreaView = this.d.f29367b.f15559a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f22823a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f22825b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f22827c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f31949g4 = true;
            this.f39093c.draw(canvas);
            PhotoViewer.t1().f31949g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f39093c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39091a.onAttachedToWindow();
        this.f39092b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39091a.onDetachedFromWindow();
        this.f39092b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39091a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f39092b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
