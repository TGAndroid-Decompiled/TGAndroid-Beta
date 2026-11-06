package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class vj0 extends ub {
    public final wj0 f38972c;

    public vj0(Activity activity, String str) {
        super(activity, null);
        this.f38590b.setText(str);
        this.f38590b.setTranslationY(-1.0f);
        ImageView imageView = this.f38589a;
        wj0 wj0Var = new wj0();
        this.f38972c = wj0Var;
        imageView.setImageDrawable(wj0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wj0 wj0Var = this.f38972c;
        wj0Var.getClass();
        wj0Var.f39978g = System.currentTimeMillis();
        wj0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wj0 wj0Var = this.f38972c;
        wj0Var.f39978g = -1L;
        wj0Var.invalidateSelf();
    }
}
