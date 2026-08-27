package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class n31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final Path f40656a;

    public lg.d f40657b;

    public n31(Activity activity) {
        super(activity);
        this.f40656a = new Path();
    }

    @Override
    public final void d() {
        lg.d dVar = this.f40657b;
        if (dVar != null) {
            dVar.u();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40656a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f40656a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f40657b = dVar;
        setBackground(dVar);
    }
}
