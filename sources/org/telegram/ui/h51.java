package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class h51 extends View {
    public ImageReceiver f47614a;
    public ImageReceiver f47615b;
    public View f47616c;
    public org.telegram.ui.Components.gd0 d;
    public Path f47617e;
    public Drawable f47618f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f47614a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.g0.L(46.0f)) - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.f47615b.y0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f47618f;
        drawable.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, measuredHeight, drawable), org.telegram.ui.Cells.y0.w(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.h(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f47617e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f47616c != null) {
            CropAreaView cropAreaView = this.d.f34907b.f21530a;
            float L2 = org.telegram.messenger.g0.L(60.0f) / cropAreaView.f32476a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f32478b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f32480c);
            canvas.translate((L - org.telegram.messenger.g0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / L2);
            PhotoViewer.p1().f42776g4 = true;
            this.f47616c.draw(canvas);
            PhotoViewer.p1().f42776g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f47616c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47614a.P();
        this.f47615b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47614a.R();
        this.f47615b.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f47614a.J0(org.telegram.messenger.g0.L(30.0f));
        this.f47615b.J0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
    }
}
