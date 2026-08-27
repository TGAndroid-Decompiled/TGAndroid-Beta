package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;

public final class cl0 extends wb {

    public final dl0 f27482c;

    public cl0(Activity activity, String str) {
        super(activity, null);
        this.f34154b.setText(str);
        this.f34154b.setTranslationY(-1.0f);
        ImageView imageView = this.f34153a;
        dl0 dl0Var = new dl0();
        this.f27482c = dl0Var;
        imageView.setImageDrawable(dl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        dl0 dl0Var = this.f27482c;
        dl0Var.getClass();
        dl0Var.f27796g = System.currentTimeMillis();
        dl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        dl0 dl0Var = this.f27482c;
        dl0Var.f27796g = -1L;
        dl0Var.invalidateSelf();
    }
}
