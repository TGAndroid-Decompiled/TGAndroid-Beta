package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class fz0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f45816a;
    public fh.g f45817b;

    public fz0(Activity activity) {
        super(activity);
        this.f45816a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f45816a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f45816a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f45817b = gVar;
        setBackground(gVar);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f45817b;
        if (gVar != null) {
            gVar.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
