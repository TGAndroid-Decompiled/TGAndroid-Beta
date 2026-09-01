package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qa1 extends View {
    public ImageReceiver f40423a;
    public ImageReceiver f40424b;
    public View f40425c;
    public org.telegram.ui.Components.af0 d;
    public Path f40426e;
    public Drawable f40427f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f40423a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f40424b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f40427f;
        drawable.setBounds(b.u(2, measuredWidth, drawable), b.f(2, measuredHeight, drawable), b.A(2, measuredWidth, drawable), b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f40426e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f40425c != null) {
            CropAreaView cropAreaView = this.d.f25248b.f51166a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f24843a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f24845b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f24847c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f34252d4 = true;
            this.f40425c.draw(canvas);
            PhotoViewer.t1().f34252d4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f40425c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40423a.onAttachedToWindow();
        this.f40424b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40423a.onDetachedFromWindow();
        this.f40424b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40423a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f40424b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
