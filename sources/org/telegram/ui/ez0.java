package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ez0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f47430a;
    public fh.g f47431b;

    public ez0(Activity activity) {
        super(activity);
        this.f47430a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f47430a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f47430a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f47431b = gVar;
        setBackground(gVar);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f47431b;
        if (gVar != null) {
            gVar.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
