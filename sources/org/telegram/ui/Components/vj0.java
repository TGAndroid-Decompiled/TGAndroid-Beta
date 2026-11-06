package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class vj0 extends ub {
    public final wj0 f38969c;

    public vj0(Activity activity, String str) {
        super(activity, null);
        this.f38581b.setText(str);
        this.f38581b.setTranslationY(-1.0f);
        ImageView imageView = this.f38580a;
        wj0 wj0Var = new wj0();
        this.f38969c = wj0Var;
        imageView.setImageDrawable(wj0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wj0 wj0Var = this.f38969c;
        wj0Var.getClass();
        wj0Var.f39985g = System.currentTimeMillis();
        wj0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wj0 wj0Var = this.f38969c;
        wj0Var.f39985g = -1L;
        wj0Var.invalidateSelf();
    }
}
