package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class uv0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.e6 f40169a;
    public ShapeDrawable f40170b;
    public View f40171c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f40170b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, this.f40169a)), shapeDrawable);
                View view = this.f40171c;
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
