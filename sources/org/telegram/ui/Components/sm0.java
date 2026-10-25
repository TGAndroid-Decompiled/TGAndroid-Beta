package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class sm0 extends ic {
    public final tm0 f32647c;

    public sm0(Activity activity, String str) {
        super(activity, null);
        this.f29274b.setText(str);
        this.f29274b.setTranslationY(-1.0f);
        ImageView imageView = this.f29273a;
        tm0 tm0Var = new tm0();
        this.f32647c = tm0Var;
        imageView.setImageDrawable(tm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        tm0 tm0Var = this.f32647c;
        tm0Var.getClass();
        tm0Var.f33107g = System.currentTimeMillis();
        tm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        tm0 tm0Var = this.f32647c;
        tm0Var.f33107g = -1L;
        tm0Var.invalidateSelf();
    }
}
