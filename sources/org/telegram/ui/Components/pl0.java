package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class pl0 extends ic {
    public final ql0 f27083c;

    public pl0(Activity activity, String str) {
        super(activity, null);
        this.f24940b.setText(str);
        this.f24940b.setTranslationY(-1.0f);
        ImageView imageView = this.f24939a;
        ql0 ql0Var = new ql0();
        this.f27083c = ql0Var;
        imageView.setImageDrawable(ql0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        ql0 ql0Var = this.f27083c;
        ql0Var.getClass();
        ql0Var.f27388g = System.currentTimeMillis();
        ql0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        ql0 ql0Var = this.f27083c;
        ql0Var.f27388g = -1L;
        ql0Var.invalidateSelf();
    }
}
