package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class n31 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final Path f41748a;
    public eh.d f41749b;

    public n31(Activity activity) {
        super(activity);
        this.f41748a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f41748a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f41748a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(eh.d dVar) {
        this.f41749b = dVar;
        setBackground(dVar);
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f41749b;
        if (dVar != null) {
            dVar.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
