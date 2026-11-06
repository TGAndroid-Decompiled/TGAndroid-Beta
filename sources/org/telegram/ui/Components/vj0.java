package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class vj0 extends ub {
    public final wj0 f38990c;

    public vj0(Activity activity, String str) {
        super(activity, null);
        this.f38577b.setText(str);
        this.f38577b.setTranslationY(-1.0f);
        ImageView imageView = this.f38576a;
        wj0 wj0Var = new wj0();
        this.f38990c = wj0Var;
        imageView.setImageDrawable(wj0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wj0 wj0Var = this.f38990c;
        wj0Var.getClass();
        wj0Var.f39993g = System.currentTimeMillis();
        wj0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wj0 wj0Var = this.f38990c;
        wj0Var.f39993g = -1L;
        wj0Var.invalidateSelf();
    }
}
