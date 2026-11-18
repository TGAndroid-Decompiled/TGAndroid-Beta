package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class ik0 extends yb {
    public final jk0 f36142c;

    public ik0(Activity activity, String str) {
        super(activity, null);
        this.f42447b.setText(str);
        this.f42447b.setTranslationY(-1.0f);
        ImageView imageView = this.f42446a;
        jk0 jk0Var = new jk0();
        this.f36142c = jk0Var;
        imageView.setImageDrawable(jk0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        jk0 jk0Var = this.f36142c;
        jk0Var.getClass();
        jk0Var.f36461g = System.currentTimeMillis();
        jk0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        jk0 jk0Var = this.f36142c;
        jk0Var.f36461g = -1L;
        jk0Var.invalidateSelf();
    }
}
