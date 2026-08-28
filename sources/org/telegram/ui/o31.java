package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o31 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final Path f40875a;
    public kg.d f40876b;

    public o31(Activity activity) {
        super(activity);
        this.f40875a = new Path();
    }

    @Override
    public final void d() {
        kg.d dVar = this.f40876b;
        if (dVar != null) {
            dVar.u();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40875a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.f40875a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i9 - AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f40876b = dVar;
        setBackground(dVar);
    }
}
