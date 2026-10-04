package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.Components.bv;
import org.telegram.ui.t61;
public final class g1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f20644a;

    @Override
    public final void onScrollChanged() {
        switch (this.f20644a) {
            case 0:
                Method method = n1.f21406k;
                return;
            case 1:
                Field field = bv.f25063f;
                return;
            default:
                Field field2 = t61.f40702c;
                return;
        }
    }
}
