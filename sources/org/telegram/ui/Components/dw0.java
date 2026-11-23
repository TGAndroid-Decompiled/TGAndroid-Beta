package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class dw0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.i6 f34468a;
    public ShapeDrawable f34469b;
    public View f34470c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f34469b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, this.f34468a)), shapeDrawable);
                View view = this.f34470c;
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
