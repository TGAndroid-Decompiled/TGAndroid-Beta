package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final Path f41289a;
    public ng.d f41290b;

    public p31(Activity activity) {
        super(activity);
        this.f41289a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f41289a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        ng.d dVar = this.f41290b;
        if (dVar != null) {
            dVar.u();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f41289a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(ng.d dVar) {
        this.f41290b = dVar;
        setBackground(dVar);
    }
}
