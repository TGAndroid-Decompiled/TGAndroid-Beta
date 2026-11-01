package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
public final class yk extends FrameLayout {
    public final HashMap f32862a;
    public final bl f32863b;

    public yk(bl blVar, Context context) {
        super(context);
        this.f32863b = blVar;
        this.f32862a = new HashMap();
    }

    public final void a() {
        org.telegram.messenger.ha haVar = this.f32863b.F;
        if (haVar != null) {
            n2.u g10 = haVar.g();
            for (Map.Entry entry : this.f32862a.entrySet()) {
                View view = (View) entry.getValue();
                Point a02 = g10.a0(((org.telegram.messenger.ga) entry.getKey()).a());
                view.setTranslationX(a02.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(org.telegram.messenger.i0.L(22.0f) + (a02.y - view.getMeasuredHeight()));
            }
        }
    }
}
