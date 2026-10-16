package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class ql extends FrameLayout {
    public final HashMap f28320a;
    public final tl f28321b;

    public ql(tl tlVar, Context context) {
        super(context);
        this.f28321b = tlVar;
        this.f28320a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f28321b.H;
        if (iMap != null) {
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.f28320a.entrySet()) {
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(((IMapsProvider.IMarker) entry.getKey()).getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }
}
