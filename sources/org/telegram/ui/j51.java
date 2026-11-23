package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class j51 extends View {
    public ImageReceiver f48992a;
    public ImageReceiver f48993b;
    public View f48994c;
    public org.telegram.ui.Components.qd0 d;
    public Path f48995e;
    public Drawable f48996f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f48992a;
        imageReceiver.z0((measuredWidth - org.telegram.messenger.g0.L(46.0f)) - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.f48993b.z0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f48996f;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, drawable), org.telegram.ui.Cells.c0.y(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.j(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f48995e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f48994c != null) {
            CropAreaView cropAreaView = this.d.f38811b.f21987a;
            float L2 = org.telegram.messenger.g0.L(60.0f) / cropAreaView.f32973a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f32975b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f32977c);
            canvas.translate((L - org.telegram.messenger.g0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / L2);
            PhotoViewer.p1().f43347g4 = true;
            this.f48994c.draw(canvas);
            PhotoViewer.p1().f43347g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f48994c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48992a.Q();
        this.f48993b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48992a.S();
        this.f48993b.S();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f48992a.K0(org.telegram.messenger.g0.L(30.0f));
        this.f48993b.K0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
    }
}
