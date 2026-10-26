package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class sm0 extends ic {
    public final tm0 f32649c;

    public sm0(Activity activity, String str) {
        super(activity, null);
        this.f29276b.setText(str);
        this.f29276b.setTranslationY(-1.0f);
        ImageView imageView = this.f29275a;
        tm0 tm0Var = new tm0();
        this.f32649c = tm0Var;
        imageView.setImageDrawable(tm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        tm0 tm0Var = this.f32649c;
        tm0Var.getClass();
        tm0Var.f33110g = System.currentTimeMillis();
        tm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        tm0 tm0Var = this.f32649c;
        tm0Var.f33110g = -1L;
        tm0Var.invalidateSelf();
    }
}
