package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class qk extends FrameLayout {

    public final HashMap f31919a;

    public final tk f31920b;

    public qk(tk tkVar, Context context) {
        super(context);
        this.f31920b = tkVar;
        this.f31919a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f31920b.D;
        if (iMap == null) {
            return;
        }
        IMapsProvider.IProjection projection = iMap.getProjection();
        for (Map.Entry entry : this.f31919a.entrySet()) {
            IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
            View view = (View) entry.getValue();
            Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
            view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
            view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
        }
    }
}
