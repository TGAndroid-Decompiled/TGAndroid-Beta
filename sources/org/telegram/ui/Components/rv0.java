package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class rv0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.e6 f37810a;
    public ShapeDrawable f37811b;
    public View f37812c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f37811b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, this.f37810a)), shapeDrawable);
                View view = this.f37812c;
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
