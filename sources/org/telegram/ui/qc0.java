package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class qc0 extends FrameLayout {

    public final HashMap f41633a;

    public final tc0 f41634b;

    public qc0(tc0 tc0Var, Context context) {
        super(context);
        this.f41634b = tc0Var;
        this.f41633a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f41634b.E;
        if (iMap == null) {
            return;
        }
        IMapsProvider.IProjection projection = iMap.getProjection();
        for (Map.Entry entry : this.f41633a.entrySet()) {
            IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
            View view = (View) entry.getValue();
            Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
            view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
            view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
        }
    }
}
