package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class vm0 extends kc {
    public final wm0 f31849c;

    public vm0(Activity activity, String str) {
        super(activity, null);
        this.f27922b.setText(str);
        this.f27922b.setTranslationY(-1.0f);
        ImageView imageView = this.f27921a;
        wm0 wm0Var = new wm0();
        this.f31849c = wm0Var;
        imageView.setImageDrawable(wm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wm0 wm0Var = this.f31849c;
        wm0Var.getClass();
        wm0Var.f32686g = System.currentTimeMillis();
        wm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wm0 wm0Var = this.f31849c;
        wm0Var.f32686g = -1L;
        wm0Var.invalidateSelf();
    }
}
