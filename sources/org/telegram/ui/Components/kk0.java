package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class kk0 extends yb {
    public final lk0 f36893c;

    public kk0(Activity activity, String str) {
        super(activity, null);
        this.f42352b.setText(str);
        this.f42352b.setTranslationY(-1.0f);
        ImageView imageView = this.f42351a;
        lk0 lk0Var = new lk0();
        this.f36893c = lk0Var;
        imageView.setImageDrawable(lk0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        lk0 lk0Var = this.f36893c;
        lk0Var.getClass();
        lk0Var.f37168g = System.currentTimeMillis();
        lk0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        lk0 lk0Var = this.f36893c;
        lk0Var.f37168g = -1L;
        lk0Var.invalidateSelf();
    }
}
