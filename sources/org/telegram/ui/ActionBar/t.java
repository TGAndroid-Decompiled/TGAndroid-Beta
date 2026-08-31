package org.telegram.ui.ActionBar;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class t extends ViewOutlineProvider {
    public final Path f22285a = new Path();

    @Override
    public final void getOutline(View view, Outline outline) {
        float dp = AndroidUtilities.dp(29.0f);
        float dp2 = AndroidUtilities.dp(12.0f);
        Path path = this.f22285a;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{dp, dp, dp, dp, dp2, dp2, dp2, dp2}, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}
