package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class sv0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.h6 f38085a;
    public ShapeDrawable f38086b;
    public View f38087c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f38086b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, this.f38085a)), shapeDrawable);
                View view = this.f38087c;
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
