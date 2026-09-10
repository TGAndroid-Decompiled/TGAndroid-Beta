package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ob1 extends View {
    public ImageReceiver f35453a;
    public ImageReceiver f35454b;
    public View f35455c;
    public org.telegram.ui.Components.df0 d;
    public Path e;
    public Drawable f35456f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f35453a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f35454b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f35456f;
        drawable.setBounds(org.telegram.messenger.em.w(2, measuredWidth, drawable), org.telegram.messenger.em.e(2, measuredHeight, drawable), org.telegram.messenger.em.B(2, measuredWidth, drawable), org.telegram.messenger.em.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f35455c != null) {
            CropAreaView cropAreaView = this.d.f22405b.f12495a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f21088a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f21090b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f21092c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f30070g4 = true;
            this.f35455c.draw(canvas);
            PhotoViewer.t1().f30070g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f35455c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35453a.onAttachedToWindow();
        this.f35454b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35453a.onDetachedFromWindow();
        this.f35454b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35453a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f35454b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
