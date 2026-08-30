package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Path f32457a;
    public pg.b f32458b;

    public a41(Activity activity) {
        super(activity);
        this.f32457a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f32457a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        pg.b bVar = this.f32458b;
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
        Path path = this.f32457a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(pg.b bVar) {
        this.f32458b = bVar;
        setBackground(bVar);
    }
}
