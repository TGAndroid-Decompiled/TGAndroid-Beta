package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class al0 extends ob {
    public final bl0 f24439c;

    public al0(Activity activity, String str) {
        super(activity, null);
        this.f29084b.setText(str);
        this.f29084b.setTranslationY(-1.0f);
        ImageView imageView = this.f29083a;
        bl0 bl0Var = new bl0();
        this.f24439c = bl0Var;
        imageView.setImageDrawable(bl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        bl0 bl0Var = this.f24439c;
        bl0Var.getClass();
        bl0Var.f24885g = System.currentTimeMillis();
        bl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        bl0 bl0Var = this.f24439c;
        bl0Var.f24885g = -1L;
        bl0Var.invalidateSelf();
    }
}
