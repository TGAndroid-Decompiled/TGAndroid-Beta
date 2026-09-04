package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class kb1 extends View {
    public ImageReceiver f37995a;
    public ImageReceiver f37996b;
    public View f37997c;
    public org.telegram.ui.Components.ue0 d;
    public Path f37998e;
    public Drawable f37999f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f37995a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f37996b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f37999f;
        drawable.setBounds(org.telegram.messenger.wl.w(2, measuredWidth, drawable), org.telegram.messenger.wl.e(2, measuredHeight, drawable), org.telegram.messenger.wl.B(2, measuredWidth, drawable), org.telegram.messenger.wl.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f37998e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f37997c != null) {
            CropAreaView cropAreaView = this.d.f30869b.f16303a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f23941a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23943b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23945c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f33570g4 = true;
            this.f37997c.draw(canvas);
            PhotoViewer.t1().f33570g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f37997c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37995a.onAttachedToWindow();
        this.f37996b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37995a.onDetachedFromWindow();
        this.f37996b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37995a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f37996b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
