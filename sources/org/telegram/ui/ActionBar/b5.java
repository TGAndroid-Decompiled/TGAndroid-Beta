package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;
public interface b5 {
    boolean a(t0 t0Var, RectF rectF);

    boolean b();

    vg.f c(s5 s5Var);

    void d(s5 s5Var, t0 t0Var);

    int getButtonsGlassBackgroundColor();

    wg.a getButtonsGlassColorProvider();

    wg.a getMenuGlassColorProvider();

    View getMenuHostView();

    p6 getMenuResourcesProvider();

    int getMenuRise();

    View getMenuView();

    s5 getOpenMenuOverlay();

    void setMenuGlassFrostedProgress(float f7);
}
