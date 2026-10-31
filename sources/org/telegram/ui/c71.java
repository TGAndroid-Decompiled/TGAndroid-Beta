package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class c71 extends View {
    public ImageReceiver f36408a;
    public ImageReceiver f36409b;
    public View f36410c;
    public org.telegram.ui.Components.be0 d;
    public Path e;
    public Drawable f36411f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(30.0f);
        int L = org.telegram.messenger.i0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f36408a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.i0.L(46.0f)) - org.telegram.messenger.i0.L(30.0f), measuredHeight - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        this.f36409b.y0(L - org.telegram.messenger.i0.L(30.0f), measuredHeight - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        Drawable drawable = this.f36411f;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.i0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f36410c != null) {
            CropAreaView cropAreaView = this.d.f24615b.f6583a;
            float L2 = org.telegram.messenger.i0.L(60.0f) / cropAreaView.f23951a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f23953b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f23955c);
            canvas.translate((L - org.telegram.messenger.i0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.i0.L(30.0f)) / L2);
            PhotoViewer.v1().f33491g4 = true;
            this.f36410c.draw(canvas);
            PhotoViewer.v1().f33491g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f36410c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36408a.P();
        this.f36409b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36408a.R();
        this.f36409b.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36408a.J0(org.telegram.messenger.i0.L(30.0f));
        this.f36409b.J0(org.telegram.messenger.i0.L(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), 1073741824));
    }
}
