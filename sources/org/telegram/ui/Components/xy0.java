package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
public final class xy0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.u6 f34883a;
    public ShapeDrawable f34884b;
    public View f34885c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f34884b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, this.f34883a)), shapeDrawable);
                View view = this.f34885c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
