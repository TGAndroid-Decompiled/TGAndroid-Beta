package org.telegram.ui.ActionBar;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class t extends ViewOutlineProvider {

    public final Path f23767a = new Path();

    @Override
    public final void getOutline(View view, Outline outline) {
        float fDp = AndroidUtilities.dp(29.0f);
        float fDp2 = AndroidUtilities.dp(12.0f);
        Path path = this.f23767a;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{fDp, fDp, fDp, fDp, fDp2, fDp2, fDp2, fDp2}, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}
