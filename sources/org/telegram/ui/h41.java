package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f37220a;
    public qg.b f37221b;

    public h41(Activity activity) {
        super(activity);
        this.f37220a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f37220a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        qg.b bVar = this.f37221b;
        if (bVar != null) {
            bVar.u();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f37220a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(qg.b bVar) {
        this.f37221b = bVar;
        setBackground(bVar);
    }
}
