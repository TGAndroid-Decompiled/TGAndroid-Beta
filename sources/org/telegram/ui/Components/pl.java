package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class pl extends FrameLayout {
    public final HashMap f31592a;
    public final sl f31593b;

    public pl(sl slVar, Context context) {
        super(context);
        this.f31593b = slVar;
        this.f31592a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f31593b.F;
        if (iMap != null) {
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.f31592a.entrySet()) {
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(((IMapsProvider.IMarker) entry.getKey()).getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }
}
