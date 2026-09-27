package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class bm0 extends ic {
    public final cm0 f23072c;

    public bm0(Activity activity, String str) {
        super(activity, null);
        this.f25084b.setText(str);
        this.f25084b.setTranslationY(-1.0f);
        ImageView imageView = this.f25083a;
        cm0 cm0Var = new cm0();
        this.f23072c = cm0Var;
        imageView.setImageDrawable(cm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        cm0 cm0Var = this.f23072c;
        cm0Var.getClass();
        cm0Var.f23365g = System.currentTimeMillis();
        cm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        cm0 cm0Var = this.f23072c;
        cm0Var.f23365g = -1L;
        cm0Var.invalidateSelf();
    }
}
