package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends FrameLayout {
    public final wy f34009a;

    public vw(wy wyVar, Context context) {
        super(context);
        this.f34009a = wyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.f34009a;
        vv vvVar = wyVar.E;
        wv wvVar = wyVar.R;
        ww wwVar = wyVar.L;
        if (view != wwVar && view != wvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f;
        if (view == wwVar && wvVar != null) {
            y10 = Math.max(y10, wvVar.getY() + wvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * wyVar.f34386b.f47775e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
