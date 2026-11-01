package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class q01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path f40650a;
    public vg.f f40651b;

    public q01(Activity activity) {
        super(activity);
        this.f40650a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40650a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f40650a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), i10 - org.telegram.messenger.i0.L(9.0f), i11 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f40651b = fVar;
        setBackground(fVar);
    }

    @Override
    public final void updateColors() {
        vg.f fVar = this.f40651b;
        if (fVar != null) {
            fVar.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
