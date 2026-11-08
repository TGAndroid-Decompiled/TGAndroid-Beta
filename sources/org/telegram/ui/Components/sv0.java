package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class sv0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public org.telegram.ui.ActionBar.f6 f38147a;
    public ShapeDrawable f38148b;
    public View f38149c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f38148b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, this.f38147a)), shapeDrawable);
                View view = this.f38149c;
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
