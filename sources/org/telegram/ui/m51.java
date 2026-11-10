package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class m51 extends View {
    public ImageReceiver f47797a;
    public ImageReceiver f47798b;
    public View f47799c;
    public org.telegram.ui.Components.fd0 d;
    public Path f47800e;
    public Drawable f47801f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f47797a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.g0.L(46.0f)) - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.f47798b.y0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f47801f;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f47800e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f47799c != null) {
            CropAreaView cropAreaView = this.d.f33527b.f21012a;
            float L2 = org.telegram.messenger.g0.L(60.0f) / cropAreaView.f31314a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f31316b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f31318c);
            canvas.translate((L - org.telegram.messenger.g0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / L2);
            PhotoViewer.p1().f41396f4 = true;
            this.f47799c.draw(canvas);
            PhotoViewer.p1().f41396f4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f47799c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47797a.P();
        this.f47798b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47797a.R();
        this.f47798b.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f47797a.J0(org.telegram.messenger.g0.L(30.0f));
        this.f47798b.J0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
    }
}
