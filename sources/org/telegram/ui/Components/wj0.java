package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class wj0 extends ub {
    public final xj0 f40064c;

    public wj0(Activity activity, String str) {
        super(activity, null);
        this.f38681b.setText(str);
        this.f38681b.setTranslationY(-1.0f);
        ImageView imageView = this.f38680a;
        xj0 xj0Var = new xj0();
        this.f40064c = xj0Var;
        imageView.setImageDrawable(xj0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        xj0 xj0Var = this.f40064c;
        xj0Var.getClass();
        xj0Var.f40402g = System.currentTimeMillis();
        xj0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        xj0 xj0Var = this.f40064c;
        xj0Var.f40402g = -1L;
        xj0Var.invalidateSelf();
    }
}
