package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class om0 extends gc {
    public final pm0 f29325c;

    public om0(Activity activity, String str) {
        super(activity, null);
        this.f26619b.setText(str);
        this.f26619b.setTranslationY(-1.0f);
        ImageView imageView = this.f26618a;
        pm0 pm0Var = new pm0();
        this.f29325c = pm0Var;
        imageView.setImageDrawable(pm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        pm0 pm0Var = this.f29325c;
        pm0Var.getClass();
        pm0Var.f29626g = System.currentTimeMillis();
        pm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        pm0 pm0Var = this.f29325c;
        pm0Var.f29626g = -1L;
        pm0Var.invalidateSelf();
    }
}
