package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class mm0 extends ic {
    public final nm0 f28558c;

    public mm0(Activity activity, String str) {
        super(activity, null);
        this.f27235b.setText(str);
        this.f27235b.setTranslationY(-1.0f);
        ImageView imageView = this.f27234a;
        nm0 nm0Var = new nm0();
        this.f28558c = nm0Var;
        imageView.setImageDrawable(nm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        nm0 nm0Var = this.f28558c;
        nm0Var.getClass();
        nm0Var.f28853g = System.currentTimeMillis();
        nm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        nm0 nm0Var = this.f28558c;
        nm0Var.f28853g = -1L;
        nm0Var.invalidateSelf();
    }
}
