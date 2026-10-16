package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class id0 extends FrameLayout {
    public final HashMap f36786a;
    public final ld0 f36787b;

    public id0(ld0 ld0Var, Context context) {
        super(context);
        this.f36787b = ld0Var;
        this.f36786a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f36787b.I;
        if (iMap != null) {
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.f36786a.entrySet()) {
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(((IMapsProvider.IMarker) entry.getKey()).getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }
}
