package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class tv0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.g6 f38513a;
    public ShapeDrawable f38514b;
    public View f38515c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f38514b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Bf, this.f38513a)), shapeDrawable);
                View view = this.f38515c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
