package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k51 extends View {
    public ImageReceiver f49161a;
    public ImageReceiver f49162b;
    public View f49163c;
    public org.telegram.ui.Components.rd0 d;
    public Path f49164e;
    public Drawable f49165f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f49161a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.g0.L(46.0f)) - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.f49162b.y0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f49165f;
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, drawable), org.telegram.ui.Cells.c0.y(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.j(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f49164e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f49163c != null) {
            CropAreaView cropAreaView = this.d.f39118b.f21887a;
            float L2 = org.telegram.messenger.g0.L(60.0f) / cropAreaView.f32875a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f32877b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f32879c);
            canvas.translate((L - org.telegram.messenger.g0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / L2);
            PhotoViewer.p1().f43231g4 = true;
            this.f49163c.draw(canvas);
            PhotoViewer.p1().f43231g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f49163c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49161a.P();
        this.f49162b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49161a.R();
        this.f49162b.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f49161a.J0(org.telegram.messenger.g0.L(30.0f));
        this.f49162b.J0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
    }
}
