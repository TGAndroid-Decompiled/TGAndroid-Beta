package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class cd0 extends FrameLayout {
    public final HashMap f32695a;
    public final fd0 f32696b;

    public cd0(fd0 fd0Var, Context context) {
        super(context);
        this.f32696b = fd0Var;
        this.f32695a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f32696b.I;
        if (iMap != null) {
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.f32695a.entrySet()) {
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(((IMapsProvider.IMarker) entry.getKey()).getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }
}
