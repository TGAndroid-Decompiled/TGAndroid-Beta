package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class a71 extends View {
    public ImageReceiver f35698a;
    public ImageReceiver f35699b;
    public View f35700c;
    public org.telegram.ui.Components.be0 d;
    public Path e;
    public Drawable f35701f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(30.0f);
        int L = org.telegram.messenger.i0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f35698a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.i0.L(46.0f)) - org.telegram.messenger.i0.L(30.0f), measuredHeight - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        this.f35699b.y0(L - org.telegram.messenger.i0.L(30.0f), measuredHeight - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        Drawable drawable = this.f35701f;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.i0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f35700c != null) {
            CropAreaView cropAreaView = this.d.f24715b.f6583a;
            float L2 = org.telegram.messenger.i0.L(60.0f) / cropAreaView.f23952a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23954b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23956c);
            canvas.translate((L - org.telegram.messenger.i0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.i0.L(30.0f)) / L2);
            PhotoViewer.v1().f33498g4 = true;
            this.f35700c.draw(canvas);
            PhotoViewer.v1().f33498g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f35700c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35698a.P();
        this.f35699b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35698a.R();
        this.f35699b.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35698a.J0(org.telegram.messenger.i0.L(30.0f));
        this.f35699b.J0(org.telegram.messenger.i0.L(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), 1073741824));
    }
}
