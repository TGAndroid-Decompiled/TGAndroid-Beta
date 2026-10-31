package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ww0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.p6 f32266a;
    public ShapeDrawable f32267b;
    public View f32268c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f32267b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, this.f32266a)), shapeDrawable);
                View view = this.f32268c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
