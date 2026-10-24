package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ca1 extends View {
    public ImageReceiver f36284a;
    public ImageReceiver f36285b;
    public View f36286c;
    public org.telegram.ui.Components.qf0 d;
    public Path e;
    public Drawable f36287f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f36284a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f36285b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f36287f;
        drawable.setBounds(org.telegram.ui.Cells.b1.f(2, measuredWidth, drawable), org.telegram.messenger.tl.d(2, measuredHeight, drawable), org.telegram.ui.Cells.b1.y(2, measuredWidth, drawable), org.telegram.ui.Cells.b1.u(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f36286c != null) {
            CropAreaView cropAreaView = this.d.f29903b.f16980a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f24328a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f24330b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f24332c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.u1().f33603g4 = true;
            this.f36286c.draw(canvas);
            PhotoViewer.u1().f33603g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f36286c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36284a.onAttachedToWindow();
        this.f36285b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36284a.onDetachedFromWindow();
        this.f36285b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36284a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f36285b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
