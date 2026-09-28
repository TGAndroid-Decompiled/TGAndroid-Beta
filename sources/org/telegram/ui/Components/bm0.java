package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class bm0 extends ic {
    public final cm0 f23050c;

    public bm0(Activity activity, String str) {
        super(activity, null);
        this.f25066b.setText(str);
        this.f25066b.setTranslationY(-1.0f);
        ImageView imageView = this.f25065a;
        cm0 cm0Var = new cm0();
        this.f23050c = cm0Var;
        imageView.setImageDrawable(cm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        cm0 cm0Var = this.f23050c;
        cm0Var.getClass();
        cm0Var.f23346g = System.currentTimeMillis();
        cm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        cm0 cm0Var = this.f23050c;
        cm0Var.f23346g = -1L;
        cm0Var.invalidateSelf();
    }
}
