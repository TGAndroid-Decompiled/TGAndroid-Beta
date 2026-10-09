package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class tm0 extends lc {
    public final um0 f31233c;

    public tm0(Activity activity, String str) {
        super(activity, null);
        this.f28419b.setText(str);
        this.f28419b.setTranslationY(-1.0f);
        ImageView imageView = this.f28418a;
        um0 um0Var = new um0();
        this.f31233c = um0Var;
        imageView.setImageDrawable(um0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        um0 um0Var = this.f31233c;
        um0Var.getClass();
        um0Var.f31545g = System.currentTimeMillis();
        um0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        um0 um0Var = this.f31233c;
        um0Var.f31545g = -1L;
        um0Var.invalidateSelf();
    }
}
