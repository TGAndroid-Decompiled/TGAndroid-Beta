package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
public final class my0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.g6 f28719a;
    public ShapeDrawable f28720b;
    public View f28721c;

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f28720b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, this.f28719a)), shapeDrawable);
                View view = this.f28721c;
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
