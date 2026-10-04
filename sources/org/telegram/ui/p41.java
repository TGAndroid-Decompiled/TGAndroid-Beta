package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p41 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final Path f39345a;
    public ch.d f39346b;

    public p41(Activity activity) {
        super(activity);
        this.f39345a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f39345a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        ch.d dVar = this.f39346b;
        if (dVar != null) {
            dVar.k();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f39345a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f39346b = dVar;
        setBackground(dVar);
    }
}
